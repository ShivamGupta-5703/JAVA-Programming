package Inheritance;

public class Student {
	String name = "Shivam";
	int age=30;
	
	@Override  
	//humne override kiya object class ke toString() ko. Isliye object  s print karwane me student class me hey print hoga.
	public String toString() {
		return "hey";
	}
}
