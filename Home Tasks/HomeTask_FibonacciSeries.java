public class HomeTask_FibonacciSeries {
    public static void main(String[] args) {
        int count = 10; // Change this value to get more terms
        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + count + " terms: ");

        for (int i = 1; i <= count; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
