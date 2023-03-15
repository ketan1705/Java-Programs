import java.util.Scanner;

class TakingInput{

    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        int obj;

        System.out.println("enter the number");

        obj = scan.nextInt();
        System.out.println(obj*obj);

    }  
}