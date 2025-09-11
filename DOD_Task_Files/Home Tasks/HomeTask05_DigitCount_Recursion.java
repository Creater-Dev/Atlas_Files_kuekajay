public class HomeTask05_DigitCount_Recursion {

    // Recursive function to count digits
    public static int countDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + countDigits(num / 10);
    }

    // Recursive function to sum digits
    public static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumDigits(num / 10);
    }

    public static void main(String[] args) {
        int number = 949031;

        int digitCount = countDigits(number);
        int digitSum = sumDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Total digits: " + digitCount);
        System.out.println("Sum of digits: " + digitSum);
    }
}
