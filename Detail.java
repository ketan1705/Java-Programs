class Student{
    String name;
    int roll_no;
}

class Detail{

    public static void main(String[] args) {
    
    Student s = new Student();

    s.name = "John";
    s.roll_no = 12;

    System.out.println("name of student is " + s.name + "and roll no is" + s.roll_no);

    }
    }