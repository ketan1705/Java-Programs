/*public class ExceptionDemo {
    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        try {
         
        System.out.println(num[5]);
   
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

        System.out.println("hello");
    }
}*/

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int data = 50/0;    
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}




// e is the reference variable
// when we print reference variable then "toString()" method called by default this method is in String class.