class SingInheritence{
    void display(){
        System.out.println("Class A");
    }
}

public class SingleInheritence extends SingInheritence {
    void printf(){
        System.out.println("Class B");
    }
    public static void main(String[] args) {
        SingleInheritence b1 = new SingleInheritence();
        b1.display();
        b1.printf();
    }
}