interface A{
    void printf();
}
class Rectangle implements A{
    public void printf(){
        System.out.println("drawing rectangle......");
    }
}
class cirlce implements A{
    public void printf(){
        System.out.println("drawing cirlce.....");
    }
}
public class InterafaceClass{
    public static void main(String args[]){
        A obj = new cirlce();
        obj.printf();
    }
}