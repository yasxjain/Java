import java.util.Scanner;

class calculate
{
    public static void main(int a, int b)
    {
        int choice;
        double result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Choice : ");
        System.out.println("1. Addition : ");
        System.out.println("2. Substraction : ");
        System.out.println("3. Multiplication : ");
        System.out.println("4. Division : ");
        choice = sc.nextInt();

        System.out.println("Enter The First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result = " +result);

                break;
            case 2:
            result = num1 - num2;
            System.out.println("Result = " +result);

                break;
            
            case 3:
            result = num1 * num2;
            System.out.println("Result = " +result);

                break;

            case 4: 
            result = num1 % num2;
            System.out.println("Result = " +result);    
            default:
                break;
        }


    }
}
