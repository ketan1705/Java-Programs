class Test {

    int a ,b;
    Test(){
        System.out.println("Default Constructor");

        a = 140;
        b = 461;
    }

    void disp(){
        System.out.println("Value of A : " + a);
        System.out.println("Value of B : " + b);

    }
}

   public class Main{
        public static void main(String args[]){

            Test obj = new Test();
            obj.disp();
        }
    }