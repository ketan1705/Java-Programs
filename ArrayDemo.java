// WAP to store the value in an array and print the value

//import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        int a[];
        a = new int[5];
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[3] = 20;
        a[4] = 25;
       // Scanner scan = new Scanner(System.in);
        
        System.out.println("Values of array are: ");
        for(int i=0;i<a.length;i++){   
        
            System.out.println("Value of index " + i +  " is: " + a[i]);
        }
    }
}