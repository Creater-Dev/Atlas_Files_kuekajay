// Class responsible for holding employee data
class Employee {
    private String name;
    private String email;
    private double salary;

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public double getSalary() { return salary; }
}
// Class responsible for generating PDF reports
class PdfReportGenerator {
    public void generateReport(Employee employee) {
        // Logic to generate PDF using employee data
        System.out.println("PDF report generated for " + employee.getName());
    }
}
// Class responsible for sending emails
class EmailService {
    public void sendEmail(Employee employee) {
        // Logic to send email using employee data
        System.out.println("Email sent to " + employee.getEmail());
    }
}
// Main class to demonstrate the functionality
public class Task02_Employee {
    public static void main(String[] args) {
        // Create an employee object
        Employee employee = new Employee("Ajay Kumar", "kuekajay" + "@amazon.com", 50000.00);
        // Generate PDF report
        PdfReportGenerator pdfReportGenerator = new PdfReportGenerator();
        pdfReportGenerator.generateReport(employee);
        // Send email
        EmailService emailService = new EmailService();
        emailService.sendEmail(employee);
        // Display employee details
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Email: " + employee.getEmail());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}