class Student{
	int roll_no;
	String name;
	static String college = "GLA";
	
	Student(int i,String n){
		roll_no = i;
		name =n;
	}
	void display(){
		System.out.println("roll_no: "+roll_no+"\tname:"+name+"\tCollege:"+college);
	}
}
public class StaticVariable{
	public static void main(String[] args){
		Student s1 = new Student(111,"RAJ");
		Student s2 = new Student(112,"ABHI");
		s1.display();
		s2.display();
	}
	
}