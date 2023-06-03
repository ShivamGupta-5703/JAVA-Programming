package LinkedList;
import java.util.LinkedList;
import java.util.Queue;
public class Queue_Using_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		LinkedList<Integer> q1 = new LinkedList<>();
		
		q1.add(10);   //add last
		q1.add(20);
		q1.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		System.out.println(q);
		System.out.println(q1);
		System.out.println(q1.remove());  //remove first
	}

}
