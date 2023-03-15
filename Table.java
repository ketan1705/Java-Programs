public class Table {
    public static void main(String[] args) {
        int m;
        int n = Integer.parseInt(args[0]);
        for(int i=1;i<=10;i++){
            m = n * i;
            System.out.print(n + " * " + i + " = " + m + "\n");
        }
    }
}