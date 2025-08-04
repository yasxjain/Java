import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Input
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Step 2: Preprocess (optional: remove spaces, make lowercase)
        String original = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 3: Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // Step 4: Check and output
        if (original.equals(reversed)) {
            System.out.println("✅ It's a palindrome!");
        } else {
            System.out.println("❌ It's not a palindrome.");
        }

        scanner.close();
    }
}
