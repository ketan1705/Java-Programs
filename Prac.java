//import jdk.internal.util.xml.impl.Input;

/*class Prac{
	Prac(){
		System.out.println("Constructor is created");
	}
	public static void main(String[] args){
		Prac p = new Prac();
	}
}*/
/*class Prac{  
int id;  
String name;
	Prac(int i,String n){
		id = i;
		name = n;	
	}  
void display(){System.out.println(id+" "+name);}  
  
public static void main(String args[]){  
//creating objects  
Prac s1=new Prac(10,"ketan");  
Prac s2=new Prac(12,"herry");  
//displaying values of the object  
s1.display();  
s2.display();  
}  
}*/  

/*
class Prac{
	static{
		System.out.println("Static method is invoked");
		System.exit(0);
	}
}*/



// Wap to find out the sum of each digit of any number.
// Wap to check a number is armstrong number or not.
// Wap to find out the sum of two number by using scanner class.
/* Wap using if else ladder except an hour from the user and output the following as integrated below
 	hour>=0 and hour<12
	print("good morning")
	hour>=12 and hour <18
	print("good after nooon")
	hour>=18 and hpur<24
	print("good evening")
	any oher Input
	print("time out of range")*/


// Wap using switch case statement to identify the day of week
// wap to search an element in an array

/* create a class with two method for calculating area and perimeter of a triangle 
and create another class and initiliaze the instance of the formal class and calculate the area of perimeter.*/

/*Define a class Student in that class data members are name, age, m1, m2, m3, maximum and average
members method 
1) two accept the details of the student
2) to compute the average and maximum out of three marks and
3) to display the name, age, marks in here subjects, maximum,and average.
*/

//wap to input two numbers x,y and count total numbres of prime numbers between two numbers.

//wap to find gretest and smallest element in an array.

/* wap to create a class and that class contain three methods
1) will we use for find out the area of a rectangle 
2) area of triangle 
3) find out the perimeter of a rectangle.
call these methods and print the output of these methods.
*/

/*
class Prac{
	public static void main(String[] args) {
		Boolean b1 = "TRUE";
		Boolean b2 = "FALSE";
		boolean b = b1 && b2;
		System.out.print(b);

	}
}*/


//Wap to perform arithmetic operations by using switch case.
//wap to find the number between 100 to 200 that are divisible by 7.
/*wap to create a class that class contain two methods first method will be use for print any message 
and second message will be for calculating simple interest .
 create another class and that class will use the method of previous class.*/

 //create a class with constructor which initializes all the class level variable and display the values of variable.
 //with no arguments and with parametrized constructor.

/*class A{
	void m(){System.out.println("hello m");}  
	void n(){  
	System.out.println("hello n");  
	//m();//same as this.m()  
	this.m();  
	}  
	}  
	class prac{  
	public static void main(String args[]){  
	A a=new A();  
	a.n();  
	} 
 }*/

/*
class prac{
	public static void main(String[] args) {
		for (int i =1;i<=5;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j + " ");
			}
			for(int k = i-1 ; k >= i; k--){
				System.out.println(k + " ");
			}
			System.out.println();
		}*/
		
	/*	int i = 1;
		int a;
		a = i * i;
		System.out.println(a);
		for (i =1;i<=100;i++){
			if(i%5 == 0){
				a = i * i;
		System.out.println(a);
			}
		}
	}
}*/


/*
class prac{
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i-1; j++) {
			   System.out.print(" ");
			}
			for (int j = 1; j <= 6; j++) {
			   System.out.print("*");
			}
			System.out.println();
		 }
	}
}*/

// write a program to show the concept of abstract class.
/* 
create an interface called arithmetic which define method for sum(), division(), subtraction(),
multiplication() and implement of them. 

*/




/*interface arithmetic{
    void sum();
    void multiplication();
    void division();
    void subtraction();

}

class interfaceDemo implements arithmetic{
    int a = 10,b = 5;
	int result;
    
    public void sum(){
        result = a+b;
        System.out.println("Sum of two numbers: " + result);
    }
    public void multiplication(){
        result = a * b;
        System.out.println("Multiplication of two numbers: " +result);
    }
    public void division(){
        result = (a / b);
        System.out.println("Division of two numbers: " + result);
    }
    public void subtraction(){
        result = a - b;
        System.out.println("Subtract of two numbers: " + result);
    }
    
    public static void main(String d[]){
    
        arithmetic obj = new interfaceDemo();

        obj.sum();
        obj.multiplication();
        obj.subtraction();
        
}

}*/


/*interface A{
	public void display();
}
interface B{
	public void printf();
}
class Prac implements A,B{
	public void display(){
		System.out.println("Hello");
	}
	
	public void printf(){
		System.out.println("World");
	}
	public static void main(String[] args) {
		Prac obj =  new Prac();
		obj.display();
		obj.printf();
	}
}*/


// public class Prac{
// public static void main(String[] args) {
// 	int i = 010;
// 	int j = 07;
// 	System.out.println(i);
// 	System.out.println(j);
// }
// }