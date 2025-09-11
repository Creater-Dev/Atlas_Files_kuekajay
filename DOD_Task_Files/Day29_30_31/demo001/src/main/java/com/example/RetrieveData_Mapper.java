package com.example;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.util.List;

public class RetrieveData_Mapper {

    // Model class (mapped to DynamoDB table)
    @DynamoDBTable(tableName = "Test02")
    public static class Employee {
        private int id;
        private String no;
        private String name;
        private String department;
        private int salary;

        @DynamoDBHashKey(attributeName = "ID")
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        @DynamoDBRangeKey(attributeName = "No")
        public String getNo() {
            return no;
        }
        public void setNo(String no) {
            this.no = no;
        }

        @DynamoDBAttribute(attributeName = "Name")
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        @DynamoDBAttribute(attributeName = "Department")
        public String getDepartment() {
            return department;
        }
        public void setDepartment(String department) {
            this.department = department;
        }

        @DynamoDBAttribute(attributeName = "Salary")
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2"))
                .build();

        DynamoDBMapper mapper = new DynamoDBMapper(client);

        try {
            // Scan all employees (equivalent to table.scan())
            DynamoDBScanExpression scanExpression = new DynamoDBScanExpression();
            List<Employee> employees = mapper.scan(Employee.class, scanExpression);

            System.out.println("Retrieving data from table: Test02");
            System.out.println("------------------------------------------------------------");
            System.out.printf("%-5s %-8s %-10s %-12s %-10s%n",
                    "ID", "No", "Name", "Department", "Salary");
            System.out.println("------------------------------------------------------------");

            for (Employee emp : employees) {
                System.out.printf("%-5d %-8s %-10s %-12s %-10d%n",
                        emp.getId(), emp.getNo(), emp.getName(),
                        emp.getDepartment(), emp.getSalary());
            }

            System.out.println("------------------------------------------------------------");

        } catch (Exception ex) {
            System.err.println("Error retrieving data: " + ex.getMessage());
        }
    }
}
