import java.util.Scanner;
class Triangle{
    void triangle(int base,int height){
        double areaT = 0.5 * base * height;
        System.out.println("Area of triangle: " + areaT);
}
    public static void main(String[] args) {
        System.out.print("Enter the length and width: ");
        Scanner scanner = new Scanner(System.in);
        int base1 = scanner.nextInt();
        int height1 = scanner.nextInt();

        Triangle obj = new Triangle();
        obj.triangle(base1,height1);
        
    }
}