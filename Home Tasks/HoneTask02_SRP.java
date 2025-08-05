import java.io.FileWriter;
import java.io.IOException;

// 1. Customer class (only stores data)
class Customer {
    private String name;
    private String custID;

    public Customer(String name, String custID) {
        this.name = name;
        this.custID = custID;
    }

    public String getName() {
        return name;
    }

    public String getCustID() {
        return custID;
    }
}

// 2. ManagingFiles class (only handles file operations)
class ManagingFiles {
    public void saveData(Customer customer) {
        try {
            FileWriter fw = new FileWriter(customer.getName().trim() + ".txt");
            fw.write("The customer name is " + customer.getName() + "\t");
            fw.write("The customer ID is " + customer.getCustID() + "\t");
            fw.close();
            System.out.println("The data is saved in the file with your name.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

// 3. Main class (drives the program)
public class HoneTask02_SRP {
    public static void main(String[] args) {
        Customer cobj = new Customer("Kadiyala Ajay Kumar", "C001");
        ManagingFiles mobj = new ManagingFiles();
        mobj.saveData(cobj);
    }
}
