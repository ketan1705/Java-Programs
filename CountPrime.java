import java.util.Scanner;
public class CountPrime {
    public static void main(String a[]) {
        int x,y,m = 0,flag =0,n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        for(int i =x;i<=y;i++){
        for (int j =2;j<=i/2;j++){
                if(i % j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i);
            }
        }
    }
}    