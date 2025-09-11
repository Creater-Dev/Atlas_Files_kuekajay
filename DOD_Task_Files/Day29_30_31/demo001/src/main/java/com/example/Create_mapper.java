package com.example;

import java.util.Arrays;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

public class Create_mapper {
    public static void main(String[] args) {

        // Connect to DynamoDB Local
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration(
                                "http://localhost:8000", "us-west-2"))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);
        String tableName = "Test02";

        try {
            // Create table with Partition Key(ID) and Sort Key(No)
            Table table = dynamoDB.createTable(
                    tableName,
                    Arrays.asList(
                            new KeySchemaElement("ID", KeyType.HASH),
                            new KeySchemaElement("No", KeyType.RANGE)
                    ),
                    Arrays.asList(
                            new AttributeDefinition("ID", ScalarAttributeType.N),
                            new AttributeDefinition("No", ScalarAttributeType.S)
                    ),
                    new ProvisionedThroughput(5L, 5L));

            table.waitForActive();
            System.out.println("Table created: " + table.getDescription().getTableStatus());

            // Insert first item
            Item item1 = new Item()
                    .withPrimaryKey("ID", 1, "No", "A101")
                    .withString("Name", "Alice")
                    .withString("Department", "HR")
                    .withNumber("Salary", 50000);
            table.putItem(item1);

            // Insert second item
            Item item2 = new Item()
                    .withPrimaryKey("ID", 2, "No", "A102")
                    .withString("Name", "Bob")
                    .withString("Department", "IT")
                    .withNumber("Salary", 60000);
            table.putItem(item2);

            System.out.println("Two items inserted successfully into table: " + tableName);

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
