package OOPs;

public class Student {
	//variables   
	String name;   //student class ka data member   
	int age;
	
	//non static method 
	public void Intorduce_yourself() {
		System.out.println("My name is "+name+" and age is "+age);
	}
	
	public void Sayname(String name) {
		System.out.println(name + " is my name");
		System.out.println(name + " say hi "+this.name);
		System.out.println(name + " is my name");
	}
	public static void fun() {
		System.out.println("I am in fun");
	}
}
