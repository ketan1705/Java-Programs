import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter the choice to perform operations:");
        char choice = scanner.next().charAt(0);
        switch (choice) {
            case '+':
                num3 = num1 + num2;
                System.out.println(num3);
                break;
            case '-':
                num3 = num1 - num2;
                System.out.println(num3);
                break;
            case '*':
                num3 = num1 * num2;
                System.out.println(num3);
                break;
            case '/':
                float num4 = num1 / num2;
                System.out.println(num4);
                break;
            case '%':
                num3 = num1 % num2;
                System.out.println(num3);
                break;
            default:
            System.out.println("Wrong Choice!! Try Again.");
                break;
        }
    }
}
