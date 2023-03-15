import java.util.Scanner;
public class InputHour {
    public static void main(String[] args) {
        float H;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        H = scan.nextFloat();
        if(H>=0 && H<12){
            System.out.println("Good Morning");
        }
        else if(H>=12 && H<18){
            System.out.println("Good afternoon");
        }
        else if(H>=18 && H<24){
            System.out.println("Good Evening");
        }
        else{
            System.out.println("Time is out of range");
        }
    }
}