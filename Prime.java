/*public class Prime {
    public static void main(String a[]) {
        int n,i,m = 0,flag =0;
        n = Integer.parseInt(a[0]);
        m = n/2;

        if(n==0||n==1){
            System.out.print("Number is not prime");
        }
        else{
            for (i =2;i<m;i++){
                if(n % i == 0){
                    System.out.print("Number is not prime");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.print("Number is prime");
            }
        }
    }
}*/

import java.util.Scanner;
public class Prime {
    public static void main(String a[]) {
        int n,i,m = 0,flag =0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        m = n/2;

        if(n==0||n==1){
            System.out.print("Number is not prime");
        }
        else{
            for (i =2;i<m;i++){
                if(n % i == 0){
                    System.out.print("Number is not prime");
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.print("Number is prime");
            }
        }
    }
}