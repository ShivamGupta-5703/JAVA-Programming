package ArrayList;
import java.util.*;
public class Arraylist_Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		//input
		Scanner sc  = new Scanner(System.in);
//		for(int i=0;i<6;i++) {
//			list.add(sc.nextInt());
//		}
		list.set(6,4);
		
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		
		
		

	}

}
