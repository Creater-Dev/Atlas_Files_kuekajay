// Parent class
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

// Customer class inherits from Person
class Customer extends Person {
    private String customerId;
    private String purchaseHistory;

    public Customer(String name, int age, String customerId, String purchaseHistory) {
        super(name, age);
        this.customerId = customerId;
        this.purchaseHistory = purchaseHistory;
    }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getPurchaseHistory() { return purchaseHistory; }
    public void setPurchaseHistory(String purchaseHistory) { this.purchaseHistory = purchaseHistory; }

    public String toString() {
        return super.toString() + ", Customer ID: " + customerId + ", Purchase History: " + purchaseHistory;
    }
}

// Employee class inherits from Person
class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String name, int age, String employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String toString() {
        return super.toString() + ", Employee ID: " + employeeId + ", Salary: " + salary;
    }
}

// Manager class inherits from Employee
class Manager extends Employee {
    private String department;
    private int teamSize;

    public Manager(String name, int age, String employeeId, double salary, String department, int teamSize) {
        super(name, age, employeeId, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    public String toString() {
        return super.toString() + ", Department: " + department + ", Team Size: " + teamSize;
    }
}

// Driver class to display variables
public class Task014 {
    public static void main(String[] args) {
        Customer customer = new Customer("Ajay", 25, "C123", "Electronics");
        Employee employee = new Employee("Ravi", 30, "E456", 50000);
        Manager manager = new Manager("Sneha", 35, "M789", 70000, "IT", 10);

        System.out.println("Customer Details: " + customer);
        System.out.println("Employee Details: " + employee);
        System.out.println("Manager Details: " + manager);
    }
}