import java.util.Scanner;
public class operators{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number :");
        int num1 = sc.nextInt();
        
        System.out.println("Enter The Second Number :");
        int num2 = sc.nextInt();
        
        int add = num1 + num2;
        int sum = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        
        System.out.println("Results");
        System.out.println("Addition is = " + (add));
        System.out.println("Substraction is = " + (sum));
        System.out.println("Multiplication is = " + (mul));
        System.out.println("Division is = " + (div));
        }
    }
