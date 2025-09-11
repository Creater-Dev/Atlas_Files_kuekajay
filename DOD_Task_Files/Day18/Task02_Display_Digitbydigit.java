import java.util.Scanner;

public class Task02_Display_Digitbydigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 6-digit number: ");
        int number = sc.nextInt();

        if (number < 100000 || number > 999999) {
            System.out.println("Please enter a valid 6-digit number.");
            sc.close();
            return;
        }

        int units = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;
        int thousands = (number / 1000) % 10;
        int tenThousands = (number / 10000) % 10;
        int lakhs = number / 100000;

        System.out.println("Units digit is " + units);
        System.out.println("Ones digit is " + tens);
        System.out.println("Hundreds digit is " + hundreds);
        System.out.println("Thousands digit is " + thousands);
        System.out.println("10 Thousands digit is " + tenThousands);
        System.out.println("Lakhs digit is " + lakhs);

        sc.close();
    }
}
