package OOPs.Encapsulation;

public class Car_Class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Car c = new Car("Black",20000,25);
		Car c1 = new Car("Red",2000,285);
	 	c.DisplayCar();
		c1.DisplayCar();
		
//		c.price=3456;     //now like this anyone can set any price he wants but this wrong,so restrict user such that he cannot directly access the variables
//		//we limit the user for privacy,So we use Encapsulation 
//		c.DisplayCar();
		
		c.Setcolor("green");
		c.Setprice(10000);
		c.DisplayCar();
	 	System.out.println(c.Getcolor());
		System.out.println(c.Getprice());
		c.Setprice(-10000);
		c.DisplayCar();
	} 
}
