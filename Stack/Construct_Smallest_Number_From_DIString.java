package Stack;
import java.util.Stack;
//LeetCode - 2375
public class Construct_Smallest_Number_From_DIString {

	//Complexity -> O(2n) = O(n)  //loop 2n times se zyada nhi chalega in any case.
	//Complexity --> n^2 isliye nhi hoga kyuki for loop ke under while loop use kiya h but vo unhi elements ko nikalega jo stack ke andar h na ki saare elements ko hence complexity is 2n ,i.e. n; 
	
	
	public static String smallestNumber(String pattern) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[pattern.length()+1];
        int count=1;  //number filling in ans array.
        
        for(int i=0;i<=pattern.length();i++) {   //pattern string pe loop lagao
        	if(i==pattern.length() || pattern.charAt(i)=='I') {  //agar character I ke barabar h ya phir pattern string ku length ke barabar toh ans array me number place karo uske baad decreading D ke bache huye spaces me number fill karo. 
        		ans[i] = count;
        		count++;
        		while(!st.isEmpty()) {
        			ans[st.pop()] = count;
        			count++;
        		}
        	}else {//agar D aaya toh uska index stack me push karo.
        		st.push(i);
        	}
        }
        String num = "";
        for(int i=0;i<ans.length;i++) {
        	num+= ans[i];
        }
        
        return num;
        
    }
	public static void main(String[] args) {
		String pattern = "DDIIDDI";
		System.out.println(smallestNumber(pattern));
	}

}
