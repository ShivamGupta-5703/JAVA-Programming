//Deepak and Gautam are having a discussion on a new type of number that they call Coding Blocks Number or CB Number. They use following criteria to define a CB Number.
//1.0 and 1 are not a CB number.
//2. 2,3,5,7,11,13,17,19,23,29 are CB numbers.
//3. Any number not divisible by the numbers in point 2( Given above) are also CB numbers.
//Deepak said he loved CB numbers. Hearing it, Gautam throws a challenge to him.
//Gautam will give Deepak a string of digits. Deepak's task is to find the number of CB numbers in the string.
//⚫ CB number once detected should not be sub-string or super-string of any other CB number.
//Ex-In 4991, both 499 and 991 are CB numbers but you can choose either 499 or 991, not both.

//Further, the CB number formed can only be a sub-string of the string. Ex-In 481, you can not take 41 as CB number because 41 is not a sub-string of 481.
//As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB numbers that can be formed from the given
//string.

package String;

public class cbnumber {

	public static void main(String[] args) {
		String str1 = "23572";
		String str = "61";
		printString(str1);

	}

	public static void printString(String str) {

//		 printing substring in increasing order of length to find maximum substring.
//		 kyuki agar hum pehle longest substring se start karenge toh minimum number of good substring generate hongi becoz it will contain maximum character of string and characters cannot be reused.
//		 len 1 se start karenge becoz empty substring doesnot have cb number.
//		 si(start index), ei(end index)  
//		 we know ei -si = length of substring. 
//		 
		int count =0;             // to count occurence of cb numbers 
		
		boolean visited[] = new boolean[str.length()];   
		// we are creating this array because if a number is cbnumber it cannot contribute to form any other cb number .
		// in this we create array equal to length of str , and mark true at every index of which element has formed a cb number . 
		// Now if further , cb number are formed we will check each element of that number in visited array if that index has true means that element has already formed cb number we cannot use it again and hence discard it.
		
		for (int len = 1; len <=str.length(); len++) {
			for (int ei = len; ei <= str.length(); ei++) {
				int si = ei - len;
				String s = str.substring(si, ei);
				
				// String to int --> Integer.parseInt(s);
				// String to long --> Long.parseLong(s);
				
				//check if cb_number then increase count -->
				// passing ei -1 in isvisited because substring take actual index +1.
				if(isCbnumber(Long.parseLong(s))  &&  isVisited(visited , si ,ei -1)) {    
					
					//jo elements visit ho chuke h unhe true mark kar diya visited array me.
					for(int i = si;i<=ei-1;i++) {
						visited[i] = true;
					}
					
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static boolean isVisited(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub
		for(int i = si;i<ei;i++) {
			if(visited[i] == true) {
				return false;
			}
		}
		return true;
	}

	public static boolean isCbnumber(long n) {
		int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		// point 1.
		if (n == 0 || n == 1) {
			return false;
		}
		// point 2.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		// point 3.
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}
}
