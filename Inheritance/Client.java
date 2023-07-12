package Inheritance;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Case 1-> 
//		Parent obj = new Parent();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		obj.fun();
//		obj.fun1();
		
		
//		//Case 2->
//		Parent obj = new Child();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		System.out.println(((Child)(obj)).d2);
//		System.out.println(((Child)(obj)).d);
//		
//		obj.fun();
//		obj.fun1();
//		((Child)(obj)).fun2();
		
//		//Case 3->
//		Child obj = new Parent();
//		//invalid
		
		
		//Case 4->
		Child obj = new Child();
		System.out.println(obj.d);
		System.out.println(((Parent)(obj)).d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		
		obj.fun();
		obj.fun2();
		obj.fun1();
	}

}
