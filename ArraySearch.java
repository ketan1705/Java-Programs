import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) {
        int a[];
        int n=0;
        int p = 0;
        a = new int[5];
        /*a[0] = 5;
        a[1] = 10;
        a[2] = 25;
        a[3] = 30;
        a[4] = 40;*/
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the " + a.length + " number: ");
       for(int i=0;i<a.length;i++){
           a[i] = scan.nextInt();
       }
       System.out.println("Enter the number: ");
        int c = scan.nextInt();
       
        for(int i=0;i<a.length;i++){   
            if(c == a[i]){
                p = i+1;
            System.out.println("Index of "+ a[i] +" is: "+i);
            System.out.println("Position is:" + p);
            n++;
            break;
            }
        }
        if(n==0){
            System.out.println("Invalid !..");
        }
    }
}