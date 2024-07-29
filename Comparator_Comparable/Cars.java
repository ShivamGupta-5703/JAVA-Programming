<<<<<<< HEAD
package Comparator_Comparable;

public class Cars {// implements Comparable<Cars> {
	int speed;
	int price;
	String color;
	public Cars() {};

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "P " + this.price + " S " + this.speed + " C " + this.color;
	}
	
	//ek baar me ek hi type sort hoga , hence not used.Humko har type ka ek code likhna h .
//	@Override
//	public int compareTo(Cars o) {
//		// TODO Auto-generated method stub
//		return o.price - this.price;
//		// return this.speed - o.speed;
//		//return this.color.compareTo(o.color);
//	}

=======
package Comparator_Comparable;

public class Cars {// implements Comparable<Cars> {
	int speed;
	int price;
	String color;

	public Cars(int price, int speed, String color) {
		// TODO Auto-generated constructor stub
		this.price = price;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "P " + this.price + " S " + this.speed + " C " + this.color;
	}

//	@Override
//	public int compareTo(Cars o) {
//		// TODO Auto-generated method stub
//		return o.price - this.price;
//		// return this.speed - o.speed;
//		//return this.color.compareTo(o.color);
//	}

>>>>>>> 9265cfa644a9e9f746adec26738ce8d105dde8ba
}