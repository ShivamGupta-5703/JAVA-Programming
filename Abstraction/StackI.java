package Abstraction;

//Interface me by default methods "abstract" hote h.(likho chahe na likho) and access modifier by default "public".(likho chahe na likho)


public interface StackI {
	int x = 10;  // [ public static final ]  by default these are set.
	//kisi method ke aage final - cannot be override
	//kisi class ke aage final - cannot be inherit
	//kisi object ke aage final - cannot be updated


	public void push(int item);

	public int pop();

	public int peek();

//	static void fun1() {
//		
//	}
//
//	default void fun() {
//
//	}
	//from java 9, we can make private methods
//	private  static int fun2() {
//		return 0;
//		
//	}
//
}
