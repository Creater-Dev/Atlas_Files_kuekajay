package com.example;

import java.io.File;
import java.util.Iterator;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class EmployeeLoadingData {
    public static void main(String[] args) throws Exception {

        // DynamoDB client (Local DynamoDB on port 8000)
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2"))
                .withCredentials(new AWSStaticCredentialsProvider(
                        new BasicAWSCredentials("dummyKey", "dummySecret")))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);
        Table table = dynamoDB.getTable("Employee01");

        // absolute path for Employee.json
        File file = new File("C:\\Users\\creat\\Desktop\\Backup\\Day29\\demo001\\src\\main\\resources\\Employee.json");

        if (!file.exists()) {
            System.err.println("JSON file not found at: " + file.getAbsolutePath());
            return;
        }

        // Parse JSON file
        JsonParser parser = new JsonFactory().createParser(file);
        JsonNode rootNode = new ObjectMapper().readTree(parser);

        Iterator<JsonNode> iterator = rootNode.iterator();
        while (iterator.hasNext()) {
            ObjectNode currentNode = (ObjectNode) iterator.next();
            int ID = currentNode.path("ID").asInt();
            String nomenClature = currentNode.path("NomenClature").asText();

            // Additional attributes from JSON
            String name = currentNode.path("Name").asText(null);
            int age = currentNode.path("Age").asInt(0);
            String location = currentNode.path("Location").asText(null);

            try {
                table.putItem(new Item()
                        .withPrimaryKey("ID", ID, "No", nomenClature)
                        .withString("Name", name)
                        .withNumber("Age", age)
                        .withString("Location", location));

                System.out.println("Inserted: " + ID + " - " + nomenClature + " - " + name);
            } catch (Exception ex) {
                System.err.println("Error inserting item: " + ex.getMessage());
            }
        }
        parser.close();

        System.out.println("Data load completed!");
    }
}
