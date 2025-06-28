import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();  // Array ka size

        int[] numbers = new int[size];  // Array banaya

        // Array ke elements user se input lena
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Array ke elements print karna
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }

        scanner.close();
    }
}
