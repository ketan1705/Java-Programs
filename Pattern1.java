/*public class Pattern1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}*/

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}


