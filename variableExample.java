
import java.util.Scanner;
public class variableExample{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("ENter Your Age");
        int age = sc.nextInt();
        System.out.println("Enter Your MArks");
        Float marks = sc.nextFloat();
        
        System.out.println("****User Details****");
        System.out.println("User Name : " + name);
        System.out.println("User Age : " + age);
        System.out.println("User Marks : " + marks);
    }
}
