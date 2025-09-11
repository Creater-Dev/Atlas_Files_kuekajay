package com.example;

import java.util.List;
import java.util.Scanner;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;

// Data Model Class
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "TestTable") // Default name (will be overridden by setActiveTable)
class Employee {
    private int id;
    private String no;
    private String name;
    private String department;
    private int salary;

    @DynamoDBHashKey(attributeName = "ID")
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    @DynamoDBRangeKey(attributeName = "No")
    public String getNo() { return no; }
    public void setNo(String no) { this.no = no; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }
}

public class OneclickMapper {

    private static final String ENDPOINT = "http://localhost:8000";
    private static final String REGION = "us-west-2";

    private static AmazonDynamoDB client;
    private static DynamoDBMapper mapper;
    private static String activeTable = null;

    public static void main(String[] args) {
        client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(ENDPOINT, REGION))
                .build();
        mapper = new DynamoDBMapper(client);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= DynamoDB Mapper CLI =========");
            System.out.println("Active Table: " + (activeTable == null ? "None" : activeTable));
            System.out.println("1. Choose Active Table");
            System.out.println("2. Create Table (manual via CLI/AWS SDK)");
            System.out.println("3. Insert Item");
            System.out.println("4. Scan Items");
            System.out.println("5. Get Item");
            System.out.println("6. Update Item");
            System.out.println("7. Delete Item");
            System.out.println("8. Delete Table (manual via CLI/AWS SDK)");
            System.out.println("9. List Tables");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            if (!sc.hasNextInt()) {
                System.out.println("⚠ Invalid input, enter a number!");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    setActiveTable(sc);
                    break;
                case 2:
                    System.out.println("⚠ Table creation not supported in Mapper directly. Use AWS SDK/CLI.");
                    break;
                case 3:
                    insertItem(sc);
                    break;
                case 4:
                    scanItems();
                    break;
                case 5:
                    getItem(sc);
                    break;
                case 6:
                    updateItem(sc);
                    break;
                case 7:
                    deleteItem(sc);
                    break;
                case 8:
                    System.out.println("⚠ Table deletion not supported in Mapper directly. Use AWS SDK/CLI.");
                    break;
                case 9:
                    listTables();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("⚠ Invalid choice!");
            }
        }
    }

    // --------------------- Menu Methods ---------------------

    private static void setActiveTable(Scanner sc) {
        listTables();
        System.out.print("Enter table name to set active: ");
        String table = sc.nextLine().trim();
        activeTable = table;
        System.out.println("✅ Active table set to: " + activeTable);
    }

    private static void insertItem(Scanner sc) {
        if (!checkTable()) return;

        Employee emp = new Employee();

        System.out.print("Enter ID (number): ");
        emp.setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter No (string): ");
        emp.setNo(sc.nextLine());

        System.out.print("Enter Name: ");
        emp.setName(sc.nextLine());

        System.out.print("Enter Department: ");
        emp.setDepartment(sc.nextLine());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextInt());
        sc.nextLine();

        mapper.save(emp);
        System.out.println("✅ Item inserted successfully!");
    }

    private static void scanItems() {
        if (!checkTable()) return;

        List<Employee> employees = mapper.scan(Employee.class, new com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression());
        System.out.println("\n========= Scan Results =========");
        for (Employee emp : employees) {
            System.out.printf("ID=%d, No=%s, Name=%s, Dept=%s, Salary=%d%n",
                    emp.getId(), emp.getNo(), emp.getName(), emp.getDepartment(), emp.getSalary());
        }
    }

    private static void getItem(Scanner sc) {
        if (!checkTable()) return;

        System.out.print("Enter ID (number): ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter No (string): ");
        String no = sc.nextLine();

        Employee emp = mapper.load(Employee.class, id, no);
        if (emp != null) {
            System.out.println("✅ Item Found: " + emp.getName() + " (" + emp.getDepartment() + ")");
        } else {
            System.out.println("⚠ Item not found!");
        }
    }

    private static void updateItem(Scanner sc) {
        if (!checkTable()) return;

        System.out.print("Enter ID (number): ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter No (string): ");
        String no = sc.nextLine();

        Employee emp = mapper.load(Employee.class, id, no);
        if (emp == null) {
            System.out.println("⚠ Item not found!");
            return;
        }

        System.out.print("Enter new Department: ");
        emp.setDepartment(sc.nextLine());
        System.out.print("Enter new Salary: ");
        emp.setSalary(sc.nextInt());
        sc.nextLine();

        mapper.save(emp);
        System.out.println("✅ Item updated successfully!");
    }

    private static void deleteItem(Scanner sc) {
        if (!checkTable()) return;

        System.out.print("Enter ID (number): ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter No (string): ");
        String no = sc.nextLine();

        Employee emp = mapper.load(Employee.class, id, no);
        if (emp != null) {
            mapper.delete(emp);
            System.out.println("✅ Item deleted successfully!");
        } else {
            System.out.println("⚠ Item not found!");
        }
    }

    private static void listTables() {
        ListTablesResult result = client.listTables();
        List<String> tables = result.getTableNames();

        if (tables.isEmpty()) {
            System.out.println("⚠ No tables found in DynamoDB!");
            return;
        }

        System.out.println("\n========= Available Tables =========");
        for (String table : tables) {
            if (activeTable != null && activeTable.equals(table)) {
                System.out.println("👉 " + table + "  (ACTIVE)");
            } else {
                System.out.println("   " + table);
            }
        }
        System.out.println("====================================");
    }

    // --------------------- Helpers ---------------------
    private static boolean checkTable() {
        if (activeTable == null) {
            System.out.println("⚠ No active table set! Choose option 1 first.");
            return false;
        }
        return true;
    }
}
