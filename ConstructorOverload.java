class ConstructorOver{
    ConstructorOver(){
        System.out.println("Hello");
    }   
    ConstructorOver(String name){
        System.out.println("name: "+ name);
    }
    ConstructorOver(int id,String name){
        System.out.println("id: " + id + " " + "name: " + name);

    }
}
class ConstructorOverload{
    public static void main(String[] args) {
        ConstructorOver a = new ConstructorOver("ken");
        ConstructorOver a1 = new ConstructorOver(10,"ken");
    }
}