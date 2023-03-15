/*class Fabonacci{
    public static void main(String[] args) {
        int i,a=0,b=1,temp;
        int n = Integer.parseInt(args[0]);
        for(i=1;i<=n;i++){
            temp = a ;
            a = b;
            b = temp + a;
            System.out.print(" " + temp);
        }
    }
}*/

import java.util.Scanner;
class Fabonacci{
    public static void main(String[] args) {
        int i,a=0,b=1,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        for(i=1;i<=n;i++){
            temp = a ;
            a = b;
            b = temp + a;
            System.out.print(" " + temp);
        }
    }
}