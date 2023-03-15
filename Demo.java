/*class Demo{
    public static void main(String[] args) {
        int A = 50;
        int B = 20;
        int c = A<<2;
        System.out.println(c);
        System.out.println(A & B);
    }
}*/


class Parent{
    private void show(){
        System.out.println("Parents show");
    }
}
class child extends Parent{
    void show(){
        System.out.println("Child show");
    }
}
class Demo{
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();
        Parent obj2 = new child();
        obj2.show();

    }
}
