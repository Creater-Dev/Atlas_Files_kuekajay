package com.example;

import java.util.Iterator;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

public class RetrieveData {
    public static void main(String[] args) {

        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration(
                                "http://localhost:8000", "us-west-2"))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);
        String tableName = "Test02";

        try {
            Table table = dynamoDB.getTable(tableName);

            System.out.println("Retrieving data from table: " + tableName);
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-5s %-8s %-10s %-12s %-10s%n",
                    "ID", "No", "Name", "Department", "Salary");
            System.out.println("------------------------------------------------------------");

            ItemCollection<ScanOutcome> items = table.scan();
            Iterator<Item> iterator = items.iterator();

            while (iterator.hasNext()) {
                Item item = iterator.next();
                int id = item.getInt("ID");
                String no = item.getString("No");
                String name = item.getString("Name");
                String dept = item.getString("Department");
                int salary = item.getInt("Salary");

                System.out.printf("%-5d %-8s %-10s %-12s %-10d%n",
                        id, no, name, dept, salary);
            }

            System.out.println("------------------------------------------------------------");

        } catch (Exception ex) {
            System.err.println("Error retrieving data: " + ex.getMessage());
        }
    }
}
