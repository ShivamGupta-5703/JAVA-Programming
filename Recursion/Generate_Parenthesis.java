package Recursion;

import java.util.*;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =2;
		//generatep(n,0,0,"");
		List<String> list = new ArrayList<>();
		generatep(n,0,0,"",list);
		System.out.println(list);

	}
	
	public static void generatep(int n,int opening,int closing,String str,List<String> list){
		if(opening==n && closing==n) {
			//System.out.println(str);
			list.add(str);
			return;
		}
		
		if(opening<n) {
			generatep(n,opening+1,closing,str+"(",list);
		}
		if(closing<opening) {
			generatep(n,opening,closing+1,str+")",list);
		}
		
	}

}
