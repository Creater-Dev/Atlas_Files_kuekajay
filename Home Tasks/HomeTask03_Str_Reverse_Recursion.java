public class HomeTask03_Str_Reverse_Recursion {
    public static String reverse(String str) {
        if (str.length() == 0) {
            return ""; // base case
        }
        return reverse(str.substring(1)) + str.charAt(0); // recursive step
    }

    public static void main(String[] args) {
        String input = "Hello";
        String result = reverse(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + result);
    }
}
