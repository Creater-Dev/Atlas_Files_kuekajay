public class HomeTask08_Palindrome_Recursion {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: one or zero characters
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Move inward
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "Ajay";

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
