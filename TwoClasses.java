import java.util.Scanner;
class SimpleInterest {
    int principle,rate,time,simple_interest;
    void display()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principle:");
        principle = scanner.nextInt();
        System.out.println("Enter the rate:");
        rate = scanner.nextInt();
        System.out.println("Enter the time:");
        time = scanner.nextInt();out
    }
    void simpleInterest(){
        simple_interest = (principle*rate*time)/100;
        System.out.println("Simple Interest: "+simple_interest);
    }
}

public class TwoClasses{
    public static void main(String[] args) {
        SimpleInterest simpleI = new SimpleInterest();
        simpleI.display();
        simpleI.simpleInterest();
    }
}
