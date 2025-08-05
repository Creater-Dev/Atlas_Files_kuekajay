import java.util.Scanner;

public class Task03_Dis_No_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Convert negative numbers to positive
        if (number < 0) {
            number = -number;
        }

        // Count digits using loop
        int count = 0;
        if (number == 0) {
            count = 1;  // Edge case for input 0
        } else {
            while (number > 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("Number of digits is: " + count);

        sc.close();
    }
}
