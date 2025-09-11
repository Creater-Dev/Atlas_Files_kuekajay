package com.example;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.UpdateItemOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.UpdateItemSpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;

public class UpdateData {
    public static void main(String[] args) {

        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration(
                                "http://localhost:8000", "us-west-2"))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);
        String tableName = "Test03";

        try {
            Table table = dynamoDB.getTable(tableName);

            // Example: Update Salary and Department for ID=1 and No=A101
            UpdateItemSpec updateItemSpec = new UpdateItemSpec()
                    .withPrimaryKey("ID", 1, "No", "A101")
                    .withUpdateExpression("set Salary = :s, Department = :d")
                    .withValueMap(new ValueMap()
                            .withNumber(":s", 70000)
                            .withString(":d", "Operations"))
                    .withReturnValues("UPDATED_NEW");

            UpdateItemOutcome outcome = table.updateItem(updateItemSpec);

            System.out.println("Item updated successfully. Updated values: " 
                    + outcome.getItem().toJSONPretty());

        } catch (Exception ex) {
            System.err.println("Error updating item: " + ex.getMessage());
        }
    }
}
