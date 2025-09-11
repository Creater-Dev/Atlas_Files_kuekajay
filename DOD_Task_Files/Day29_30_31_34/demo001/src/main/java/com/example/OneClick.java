package com.example;

import java.io.*;
import java.util.*;

public class OneClick {
    private static final String ENDPOINT = "http://localhost:8000";
    private static String activeTable = null; // store selected table

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= DynamoDB CLI Java Tool =========");
            System.out.println("Active Table: " + (activeTable == null ? "None" : activeTable));
            System.out.println("1. Choose Active Table");
            System.out.println("2. Create Custom Table");
            System.out.println("3. Insert Item");
            System.out.println("4. Scan Items");
            System.out.println("5. Get Item");
            System.out.println("6. Update Item");
            System.out.println("7. Delete Item");
            System.out.println("8. Delete Table");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            if (!sc.hasNextInt()) {
                System.out.println("⚠ Invalid input, please enter a number.");
                sc.nextLine(); // discard invalid input
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // ✅ consume newline

            switch (choice) {
                case 1:
                    chooseTable(sc);
                    break;

                case 2:
                    createCustomTable(sc);
                    break;

                case 3:
                    if (!checkTable())
                        break;

                    System.out.print("Enter Partition Key Name: ");
                    String pkName = sc.nextLine();
                    System.out.print("Enter Partition Key Type (S/N): ");
                    String pkType = sc.nextLine();
                    System.out.print("Enter Partition Key Value: ");
                    String pkValue = sc.nextLine();

                    String itemJson = "{\"" + pkName + "\":{\"" + pkType + "\":\"" + pkValue + "\"}";
                    while (true) {
                        System.out.print("Add another attribute? (y/n): ");
                        String more = sc.nextLine();
                        if (!more.equalsIgnoreCase("y"))
                            break;

                        System.out.print("Attribute Name: ");
                        String attrName = sc.nextLine();
                        System.out.print("Type (S=String, N=Number): ");
                        String attrType = sc.nextLine();
                        System.out.print("Value: ");
                        String attrValue = sc.nextLine();

                        itemJson += ",\"" + attrName + "\":{\"" + attrType + "\":\"" + attrValue + "\"}";
                    }
                    itemJson += "}";

                    runCommand("aws dynamodb put-item --table-name " + activeTable +
                            " --item '" + itemJson + "' --endpoint-url " + ENDPOINT);
                    break;

                case 4:
                    if (!checkTable())
                        break;
                    runCommand("aws dynamodb scan --table-name " + activeTable + " --endpoint-url " + ENDPOINT);
                    break;

                case 5:
                    if (!checkTable())
                        break;
                    System.out.print("Enter Partition Key Name: ");
                    String gpkName = sc.nextLine();
                    System.out.print("Enter Partition Key Type (S/N): ");
                    String gpkType = sc.nextLine();
                    System.out.print("Enter Partition Key Value: ");
                    String gpkValue = sc.nextLine();

                    String gkeyJson = "{\"" + gpkName + "\":{\"" + gpkType + "\":\"" + gpkValue + "\"}}";

                    System.out.print("Do you have a Sort Key? (y/n): ");
                    String gHasSort = sc.nextLine();
                    if (gHasSort.equalsIgnoreCase("y")) {
                        System.out.print("Enter Sort Key Name: ");
                        String gskName = sc.nextLine();
                        System.out.print("Enter Sort Key Type (S/N): ");
                        String gskType = sc.nextLine();
                        System.out.print("Enter Sort Key Value: ");
                        String gskValue = sc.nextLine();
                        gkeyJson = "{\"" + gpkName + "\":{\"" + gpkType + "\":\"" + gpkValue +
                                "\"},\"" + gskName + "\":{\"" + gskType + "\":\"" + gskValue + "\"}}";
                    }

                    runCommand("aws dynamodb get-item --table-name " + activeTable +
                            " --key '" + gkeyJson + "' --endpoint-url " + ENDPOINT);
                    break;

                case 6:
                    if (!checkTable())
                        break;
                    System.out.print("Enter Partition Key Name: ");
                    String pkNameU = sc.nextLine();
                    System.out.print("Enter Partition Key Type (S/N): ");
                    String pkTypeU = sc.nextLine();
                    System.out.print("Enter Partition Key Value: ");
                    String pkValueU = sc.nextLine();

                    String keyJson = "{\"" + pkNameU + "\":{\"" + pkTypeU + "\":\"" + pkValueU + "\"}}";

                    System.out.print("Enter Attribute Name to Update: ");
                    String attrNameU = sc.nextLine();
                    System.out.print("Enter Attribute Type (S/N): ");
                    String attrTypeU = sc.nextLine();
                    System.out.print("Enter New Value: ");
                    String attrValueU = sc.nextLine();

                    String updateExpr;
                    String exprAttrValues;
                    String exprAttrNames = "";

                    if (attrNameU.equalsIgnoreCase("Name")) {
                        updateExpr = "SET #N = :val";
                        exprAttrNames = " --expression-attribute-names '{\"#N\":\"Name\"}'";
                    } else {
                        updateExpr = "SET " + attrNameU + " = :val";
                    }

                    exprAttrValues = " --expression-attribute-values '{\":val\":{\"" + attrTypeU + "\":\"" + attrValueU
                            + "\"}}'";

                    String cmd = "aws dynamodb update-item --table-name " + activeTable +
                            " --key '" + keyJson + "'" +
                            " --update-expression \"" + updateExpr + "\"" +
                            exprAttrNames +
                            exprAttrValues +
                            " --endpoint-url " + ENDPOINT;

                    runCommand(cmd);
                    break;

                case 7:
                    if (!checkTable())
                        break;
                    System.out.print("Enter Partition Key Name: ");
                    String dpkName = sc.nextLine();
                    System.out.print("Enter Partition Key Type (S/N): ");
                    String dpkType = sc.nextLine();
                    System.out.print("Enter Partition Key Value: ");
                    String dpkValue = sc.nextLine();

                    String dkeyJson = "{\"" + dpkName + "\":{\"" + dpkType + "\":\"" + dpkValue + "\"}}";

                    System.out.print("Do you have a Sort Key? (y/n): ");
                    String dHasSort = sc.nextLine();
                    if (dHasSort.equalsIgnoreCase("y")) {
                        System.out.print("Enter Sort Key Name: ");
                        String dskName = sc.nextLine();
                        System.out.print("Enter Sort Key Type (S/N): ");
                        String dskType = sc.nextLine();
                        System.out.print("Enter Sort Key Value: ");
                        String dskValue = sc.nextLine();
                        dkeyJson = "{\"" + dpkName + "\":{\"" + dpkType + "\":\"" + dpkValue +
                                "\"},\"" + dskName + "\":{\"" + dskType + "\":\"" + dskValue + "\"}}";
                    }

                    runCommand("aws dynamodb delete-item --table-name " + activeTable +
                            " --key '" + dkeyJson + "' --endpoint-url " + ENDPOINT);
                    break;

                case 8:
                    if (!checkTable())
                        break;
                    runCommand("aws dynamodb delete-table --table-name " + activeTable + " --endpoint-url " + ENDPOINT);
                    activeTable = null;
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private static void chooseTable(Scanner sc) {
        try {
            System.out.println("\nAvailable Tables:");
            ProcessBuilder pb = new ProcessBuilder("powershell.exe", "-Command",
                    "aws dynamodb list-tables --endpoint-url " + ENDPOINT);
            pb.redirectErrorStream(true);
            Process process = pb.start();

            List<String> tables = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    if (line.contains("\"")) {
                        for (String part : line.split("\"")) {
                            if (!part.equals("TableNames") && part.trim().length() > 0 && !part.equals(":")
                                    && !part.equals("[") && !part.equals("]") && !part.equals(",")) {
                                tables.add(part.trim());
                            }
                        }
                    }
                }
            }
            process.waitFor();

            if (tables.isEmpty()) {
                System.out.println("No tables found!");
                return;
            }

            System.out.print("\nEnter table name to use: ");
            String tname = sc.nextLine();
            if (tables.contains(tname)) {
                activeTable = tname;
                System.out.println("Active table set to: " + activeTable);
            } else {
                System.out.println("Table not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createCustomTable(Scanner sc) {
        try {
            System.out.print("Enter Table Name: ");
            String table = sc.nextLine();

            System.out.print("Enter Partition Key Name: ");
            String pk = sc.nextLine();
            System.out.print("Enter Partition Key Type (S/N/B): ");
            String pkType = sc.nextLine();

            System.out.print("Do you want a Sort Key? (y/n): ");
            String hasSort = sc.nextLine();

            String sortKeyDef = "";
            String sortKeySchema = "";
            if (hasSort.equalsIgnoreCase("y")) {
                System.out.print("Enter Sort Key Name: ");
                String sk = sc.nextLine();
                System.out.print("Enter Sort Key Type (S/N/B): ");
                String skType = sc.nextLine();
                sortKeyDef = " AttributeName=" + sk + ",AttributeType=" + skType;
                sortKeySchema = " AttributeName=" + sk + ",KeyType=RANGE";
            }

            System.out.print("Enter Read Capacity Units: ");
            String rcu = sc.nextLine();
            System.out.print("Enter Write Capacity Units: ");
            String wcu = sc.nextLine();

            String command = "aws dynamodb create-table "
                    + "--table-name " + table + " "
                    + "--attribute-definitions AttributeName=" + pk + ",AttributeType=" + pkType + sortKeyDef + " "
                    + "--key-schema AttributeName=" + pk + ",KeyType=HASH" + sortKeySchema + " "
                    + "--provisioned-throughput ReadCapacityUnits=" + rcu + ",WriteCapacityUnits=" + wcu + " "
                    + "--endpoint-url " + ENDPOINT;

            runCommand(command);
            activeTable = table;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean checkTable() {
        if (activeTable == null) {
            System.out.println("⚠ No active table. Choose option 1 first!");
            return false;
        }
        return true;
    }

    private static void runCommand(String command) {
        try {
            System.out.println("\n>>> Running: " + command);
            ProcessBuilder pb = new ProcessBuilder("powershell.exe", "-Command", command);
            pb.redirectErrorStream(true);
            Process process = pb.start();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
