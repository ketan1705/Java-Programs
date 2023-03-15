/*public class Armstrong {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r,sum=0;
        int t = n;
        while(t!=0){
            r = t % 10;
            sum = sum + (r*r*r);
            t = t / 10;
        }
        if(sum==n){
            System.out.print("Number is armstrong");
        }
        else{
            System.out.print("Number is not armstrong");
        }
    } 
}*/

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r,sum=0;
        int t = n;
        while(t!=0){
            r = t % 10;
            sum = sum + (r*r*r);
            t = t / 10;
        }
        if(sum==n){
            System.out.print("Number is armstrong");
        }
        else{
            System.out.print("Number is not armstrong");
        }
    } 
}