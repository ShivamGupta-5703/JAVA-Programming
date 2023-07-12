
public class Global_Variable {
	static int val = 100; // global static ke saath bnate h
	//stored in heap memory.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(("hey"));
		int x = 90; // local
		fun(x);
		fun1(x);
		fun2(x);                 //here val is updated to 40.
		System.out.println(val);      //prints 40.
	}

	public static void fun(int x) {
		int a = 90;
		System.out.println(x);
		int val = 80;       //variable of same name as global variable is created.
		System.out.println(val); // preference to local variable is given.
	}

	public static void fun1(int x) {
		int a = 90;
		System.out.println(x);
		System.out.println(val); //here global variable is called becoz no local variable of same name exist
	}
	
	public static void fun2(int x) {
		int a = 90;
		System.out.println(x);
		val = 40;       //here since val is not redeclared its value is updated.
		//here,when val is redeclared it is updated in heap memory when block of fun3 is created and then,
		System.out.println(val); //here it fetched updated val from heap memory.
	}
}
