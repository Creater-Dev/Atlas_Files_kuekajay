package com.example;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.*;

public class UpdateData_mapper {

    // POJO mapped to table Test03
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
            // Load employee with ID=1 and No=A101
            Employee emp = mapper.load(Employee.class, 1, "A101");

            if (emp != null) {
                // Update fields
                emp.setSalary(70000);
                emp.setDepartment("Operations");

                // Save updated item
                mapper.save(emp);

                System.out.println("Item updated successfully. New values:");
                System.out.println("ID: " + emp.getId());
                System.out.println("No: " + emp.getNo());
                System.out.println("Name: " + emp.getName());
                System.out.println("Department: " + emp.getDepartment());
                System.out.println("Salary: " + emp.getSalary());
            } else {
                System.out.println("Employee not found.");
            }

        } catch (Exception ex) {
            System.err.println("Error updating item: " + ex.getMessage());
        }
    }
}
