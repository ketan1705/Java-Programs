import java.util.Scanner;
interface arithmetic{
    void sum();
    void multiplication();
    void division();
    void subtraction();
    void percentage();

}

class LabInterface implements arithmetic{
    private static int a,b;
    
    public void sum(){
        int sumResult = a+b;
        System.out.println("Sum of two numbers: " + sumResult);
    }
    public void multiplication(){
        int multiplicationResult = a * b;
        System.out.println("Multiplication of two numbers: " +multiplicationResult);
    }
    public void division(){
        float divisionResult = ((float) a / b);
        System.out.println("Division of two numbers: " + divisionResult);
    }
    public void subtraction(){
        int subtractionResult = a - b;
        System.out.println("Subtract of two numbers: " + subtractionResult);
    }
    public void percentage(){
        float percentageResult = (float)(a/(a+b)) * 100;
        System.out.println("" + percentageResult);
    }
    
    public static void main(String d[]){
        System.out.println("Enter two numbers: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();


        arithmetic obj = new LabInterface();

        obj.sum();
        obj.multiplication();
        obj.subtraction();
        obj.division();
        obj.percentage();
        
    }
}