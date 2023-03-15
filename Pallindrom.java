import java.util.Scanner;

public class Pallindrom {
    
    public static void main(String args[]) {

        int n,r,t,s=0;
        

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number");

        n = scan.nextInt();
        t=n;
        while(n>0)
        {
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
        }
    
            
        if(t==s){
            System.out.println("number is pallindrom");

            }

            else
            {
                System.out.println("number is not pallindrom");
            }
    }
}    