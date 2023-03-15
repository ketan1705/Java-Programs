/*public class Factorial {
    public static void main(String a[]) {
        int i,fact = 1;
        int n = Integer.parseInt(a[0]);
        for(i=1;i<=n;i++){
            fact= fact*i;
        }
        System.out.print(fact);
    }
}*/
import java.util.Scanner;
public class Factorial {
    public static void main(String a[]) {
        int i,fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int n = scanner.nextInt();
        for(i=1;i<=n;i++){
            fact= fact*i;
        }
        System.out.print(fact);
    }
}
