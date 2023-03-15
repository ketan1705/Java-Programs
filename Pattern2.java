/*public class Pattern2 {
    public static void main(String[] args) {
        int i,j,k =1;
        int n = Integer.parseInt(args[0]);
        for(i=0;i<n;i++){
            for(j = 0;j<=i;j++){
                System.out.print(k + " ");
                k = k+1;
            }
            System.out.print("\n");
        }
    }
}*/
import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        int i,j,k =1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int n = scanner.nextInt();
        for(i=0;i<n;i++){
            for(j = 0;j<=i;j++){
                System.out.print(k + " ");
                k = k+1;
            }
            System.out.print("\n");
        }
    }
}