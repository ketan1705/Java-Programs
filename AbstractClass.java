abstract class A{
    abstract void run();
    void display(){
        System.out.println("JAVA");
    }
}
public class AbstractClass extends A
{
    void run(){
        System.out.println("PYTHON");
    }
    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass();
        obj.run();
        obj.display();
    }   
}