import java.util.Scanner;
class StringPallindrom{
	public static void main(String[] args){
		       StringBuffer rev;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the String;");
       String name = scan.nextLine();
       StringBuffer name1 = new StringBuffer(name);
       StringBuffer sBuffer = new StringBuffer(name);
       rev = sBuffer.reverse();
       System.out.println(rev);
       if(rev.toString().equals(name1.toString())){
           System.out.println("String is pallindrom");
       }
       else{
           System.out.println("String not pallindrom");
       }
	}
}