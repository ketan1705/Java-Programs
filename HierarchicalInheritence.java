class HierarInheritence{
    void display(){
        System.out.println("Class A");
    }
}
class HierarInheritence1 extends HierarInheritence{
    void printf(){
        System.out.println("Class B");
    }
}
public class HierarchicalInheritence extends HierarInheritence{
    void show(){
        System.out.println("Class C");
    }
    public static void main(String[] args) {
        HierarchicalInheritence c1 = new HierarchicalInheritence();
        c1.display();
        c1.show();
    }
}