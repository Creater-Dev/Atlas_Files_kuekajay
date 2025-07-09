public class HomeTask06_Reverse_NullTerminatedStr {
    public static void main(String[] args) {
        // Input string with null-terminator
        char[] str = {'H', 'e', 'l', 'l', 'o', '\0'};

        // Find length excluding the null-terminator
        int length = 0;
        while (str[length] != '\0') {
            length++;
        }

        // Reverse using a loop
        System.out.print("Reversed: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(str[i]);
        }
        System.out.println();
    }
}
