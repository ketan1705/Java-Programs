import java.util.Scanner;
class AreaMethods {
    void Rectangle(int length , int width){
        int areaR = length * width;
        System.out.println("Area of rectangle: " + areaR);
    }
    void Triangle(int base,int height){
            double areaT = 0.5 * base * height;
            System.out.println("Area of triangle: " + areaT);
    }
    void Perimeter(int l,int b){ 
        int perimeter = 2 *(l+ b);
        System.out.println("Perimeter of perimeter: " + perimeter);
    }
}
class AreaRTPMethod{
    public static void main(String[] args) {
        System.out.print("Enter the length and width: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        AreaMethods areaMethod  = new AreaMethods();
        areaMethod.Rectangle(a,b);
        areaMethod.Triangle(a,b);
        areaMethod.Perimeter(a,b);        
    }
}