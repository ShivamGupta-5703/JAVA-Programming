package ArrayList;

import java.util.*;

public class Arraylist_Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		
		
		// Add   --> last me add karega
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		
		// Add at particular index  // range 0 to size
		list.add(2,60);
		System.out.println(list);
		
		
		// check size
		System.out.println(list.size());
		
		
		//delete                   // range 0 to size-1
		System.out.println(list.remove(2));
		
		
		//get                     // range 0 to size-1
		System.out.println(list.get(2));
		 
		
		//set  --> update element 
		list.set(0,60);
		System.out.println(list);
		 
		
		//printing using loop
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		
		// Enhance For loop  [for-each loop] (directly read value)
		// it is always forward moving loop   // reverse me kabhi nhi chla skte.
		for(int val : list) {                  // for(type var : variable name)
			System.out.print(val+" ");
		}
		System.out.println();
		
		
		// sort arraylist
		Collections.sort(list);
		System.out.print(list);
	}

}















































