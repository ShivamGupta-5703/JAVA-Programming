package OOPs.Encapsulation;

public class Car {
	//public String color;   //can be accessed in an folder by just creating object of car class.
	//private String color;    //can be accessed in only this class,even by creating object of that class. //iss file ke bahar use nhi hoga.
	//int price;   //default can be accessed only in same package
	
	private String color;
	private int price;   
	private int speed; 
	
	//change through constructor
	public Car(String color,int price,int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	//change independently
	//setter methods
	public void Setcolor(String color) {
		this.color=color;
	}
	public void Setprice(int price) throws Exception { 
//		if(price<0) {
//			System.out.println("Price -ve nhi hota baklol.");
//			return ;
//		}
//		if(price<0) {
//			throw new Exception("Price -ve nhi hota baklol.");
//		}
//		this.price=price;
		try {
			if(price<0)
				throw new Exception("Price -ve nhi hota baklol.");
			this.price=price;
		}
		catch(Exception e){
			e.printStackTrace();   //tells lin enumber jaha exception h.
		}
		finally {   //used after try and catch block  // always gets executed.
			 System.out.println("I am a disco dancer");
		}
	}
	public void Setspeed(int speed) {
		this.speed=speed;
	}
	
	
	//getter methods
	//jitna dekhna h utna hi show hoga like filter
	public String Getcolor() {
		return this.color;
	}
	public int Getprice() {
		return this.price;
	}
	public int Getspeed() {
		return this.speed;
	}
	
	public void DisplayCar() {
		System.out.println("c "+color+" P "+price+" s "+speed);
	}
	
}
