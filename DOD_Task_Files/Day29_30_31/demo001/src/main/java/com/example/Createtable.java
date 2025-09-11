package com.example;

import java.util.Arrays;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

public class Createtable {
    public static void main(String[] args) {
        // Use local DynamoDB endpoint
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration(
                                "http://localhost:8000", "us-west-2"))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);
        String tableName = "Employee01";

        try {
            Table table = dynamoDB.createTable(
                    tableName,
                    Arrays.asList(new KeySchemaElement("ID", KeyType.HASH),
                            new KeySchemaElement("No", KeyType.RANGE)),
                    Arrays.asList(new AttributeDefinition("ID", ScalarAttributeType.N),
                            new AttributeDefinition("No", ScalarAttributeType.S)),
                    new ProvisionedThroughput(5L, 5L));

            table.waitForActive();
            System.out.println("Table created successfully: " + table.getDescription().getTableStatus());
        } catch (Exception ex) {
            System.err.println("Error creating table: " + ex.getMessage());
        }
    }
}
