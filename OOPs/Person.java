package OOPs;

public class Person {

	String name = "Anish";
	int age = 22;
	
	public void Intro_yourself() {
		System.out.println("My name is "+ name +" and age is "+age);
	}
	//constructor
	public Person() {   //Non - Parametrized constructor
	
	}
	//or
	public Person(int age,String name) {   //Parametrized constructor
		this.age = age;
		this.name = name;
	}
}