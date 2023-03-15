//Using method Overloading

/*class LabPrograms{
    public int sum(int x,int y){
        return (x+y);
    }
    public int sum(int x, int y, int z){
        return (x+y+z);
    }
    public double sum(double x,double y){
        return (x+y);
    }

    public static void main(String[] args) {

        LabPrograms obj = new LabPrograms();


        System.out.println(obj.sum(15,36));
        System.out.println(obj.sum(15,36,25));
        System.out.println(obj.sum(15.5,36.4));
        
        
    }
}*/

// Using Method Overriding

/*class MethodOverriding{
    void display(){
        System.out.println("Method Overriding...");
    }
}

class LabPrograms extends MethodOverriding{
    void display(){
        System.out.println("Method Overriding...");
    }
    public static void main(String[] args) {
        LabPrograms obj = new LabPrograms();
        obj.display();
    }
}*/


// Using Super Keyword

/*class MethodOverriding{
    void display(){
        System.out.println("Method Overriding...");
    }
}

class LabPrograms extends MethodOverriding{
    void display(){
        super.display();
        System.out.println("Displaying Method Overriding...");
    }
    public static void main(String[] args) {
        LabPrograms obj = new LabPrograms();
        obj.display();
    }
}*/

/*
class MethodOverriding{
    void display(){
        System.out.println("Method Overriding...");
    }
}

class A extends MethodOverriding{

}
class LabPrograms extends A{
    void display(){
        super.display();
        System.out.println("Displaying Method Overriding...");
    }
    public static void main(String[] args) {
        LabPrograms obj = new LabPrograms();
        obj.display();
    }
}
*/


/*class DynamicMethod{
    public void type(){
        System.out.println("Indoor and Outdoor");
    }
}
class LabPrograms extends DynamicMethod{
    public void type(){
        System.out.println("Indoor and Outdoor");
    }
    public static void main(String[] args) {
        // DynamicMethod obj = new LabPrograms();
        LabPrograms obj1 =  new DynamicMethod();
        obj1.type();
    }
}*/


// Exception Handling

/*class LabPrograms{
    public static void main(String[] args) {
        
        int a = 6;
        int b = 0;

        try{
        System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("\n***Success***");
    }
}*/

//ArrayIndexOutOfBoundException

/*class LabPrograms{
    public static void main(String[] args) {
        try  
        {  
        int arr[]= {5,10,25,60,70};  
        System.out.println(arr[8]); 
        }    
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("\n***Success***");
    }
}*/


// Runnable Interface
class LabPrograms implements Runnable{  
    public void run(){  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    LabPrograms obj=new LabPrograms();  
    Thread t1 =new Thread(obj);  
    t1.start();  
     }  
    }  