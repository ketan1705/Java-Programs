class Rectangle{

    int lenght,width,result;

    Rectangle(int x,int y){
        lenght = x;
        width = y;
    }
    void rectArea(){
            result = lenght * width;
            System.out.println("Area of rectangle: " + result);
    }
}



public class ParametrizedCons {

    public static void main(String args[]){

        Rectangle obj = new Rectangle(10,20);
        obj.rectArea();
        

    }

}