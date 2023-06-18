package Recursion;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		System.out.println("\n"+Boardpath(n,0,""));

	}
	public static int Boardpath(int end, int current , String ans) {
		
		if(current == end) {
			System.out.print(ans+" ");
			return 1; //count
		}
		if(current>end) {
			return 0;
		}
		
		//Method 1 -->
//		int firstpossiblity = BoardPath1(end,current+1,ans+1);
//		int secondpossiblity = BoardPath1(end,current+2,ans+2);
//		int thirdpossiblity = BoardPath1(end,current+3,ans+3);
//		return firstpossiblity+secondpossiblity+thirdpossiblity;
		
		
		//Method2 -->
		int count=0;
		for(int step=1;step<=3;step++) {     //step 1 or 2 or 3
			count = count +Boardpath(end, current+step ,ans+step);
		}
		return count;
		
	}

}
