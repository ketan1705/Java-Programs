class Students{
    String name,addr;
    int roll_no;
    long phone_no;
}

public class TwoStudentClasses {
    
    public static void main(String args[]) {

        Students j = new Students();
        Students s = new Students();

        j.name = "John";
        j.roll_no = 125;
        j.addr = "delhi";
        j.phone_no = 9456781964L;

        s.name = "sam";
        s.roll_no = 12545;
        s.addr = "agra";
        s.phone_no = 9421356714L;

        System.out.println(j.name +" " +j.addr + " " + j.phone_no +" "+ j.roll_no);
        System.out.println(s.name +" " +s.addr + " " + s.phone_no +" "+ s.roll_no);

 

        
    }
}