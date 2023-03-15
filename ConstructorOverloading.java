class ConstructorOverloading{
	int id;
	String name;
	int age;
	ConstructorOverloading(int i1,String name1){
		id = i1;
		name = name1;
	}
	ConstructorOverloading(int i2,String name2,int a){
		id=i2;
		name=name2;
		age = a;
	}
	void display(){
		System.out.println("id: "+id+" "+"name: "+name+" "+"age: "+age);
	}
	public static void main(String[] args){
		ConstructorOverloading co1 = new ConstructorOverloading(12,"raj");
		ConstructorOverloading co2 = new ConstructorOverloading(15,"herry",25);
		co1.display();
		co2.display();
	}
}