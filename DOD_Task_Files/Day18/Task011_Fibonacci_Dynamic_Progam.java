public class Task011_Fibonacci_Dynamic_Progam {
    public static void main(String[] args) {
        int n = 10; // Number of terms you want in the series
        int[] dp = new int[n];

        // Base cases
        dp[0] = 0;
        if (n > 1) dp[1] = 1;

        // Fill the array using DP
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // Print the series
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int num : dp) {
            System.out.print(num + " ");
        }
    }
}
