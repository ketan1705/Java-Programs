class class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void barking(){
        System.out.println("Barking...");
    }
}
public class MultilevelInheritence extends Dog{
    void show(){
        System.out.println("Class C");
    }
    public static void main(String[] args) {
        MultilevelInheritence c1 = new MultilevelInheritence();
        c1.eat();
        c1.barking();
        c1.show();
    }    
}
