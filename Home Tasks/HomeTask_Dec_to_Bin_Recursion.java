public class HomeTask_Dec_to_Bin_Recursion {

    // Recursive function to print binary of n
    public static void convertToBinary(int n) {
        if (n == 0) {
            return;
        }
        convertToBinary(n / 2);     // Recursive call
        System.out.print(n % 2);    // Print remainder (binary digit)
    }

    public static void main(String[] args) {
        int decimal = 13;

        System.out.print("Binary of " + decimal + " is: ");
        if (decimal == 0) {
            System.out.print("0"); // Handle 0 as a special case
        } else {
            convertToBinary(decimal);
        }
        System.out.println();
    }
}
