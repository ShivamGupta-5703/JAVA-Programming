package TopologicalSort;

//Intuition -->
// Input:
//[
// "wrt",
// "wrf",
// "er",
// "ett",
// "rftt"
//]
//
//Output: "wertf"
// 1. here, take "wrt" and "wrf" - w match, r match, t,f mismatch, now string with t comes before means in answer t will come before f  --> t < f.
// 2. take "wrf" and "er" - w,e mismatch , now string with w comes before so w will come before  e in answer --> w < e .
// 3. take "er" and "ett" - e match, r and t mismatch --> r < t.
// 4. tale "ett" and "rftt" - e and r mismatch --> e < r.
// Now, w < e < r < t < f --> Answer = "wertf". 


// 1. Make graph using strings
// 2. Make unique vertex from every unique character
// 3. Make Empty list corresponding to each vertex.
// 4. fill list by - take 2 string - take one with minimum length iterate on both jaha character mismatch waha pe, edge add list me krke and break  
// 5. We also need to check that given array of strings is sorted, Ex. abc and ab , if abc comes before ab that means given array of string is not 
//    lexicographically sorted so we return an empty string.
// 6. Then find indegress
// 7. Topological sort
// 8. In topological sort we also need to check for cycle -Ex. [x, y, x] .If we make graph we will get a cycle and also given array of strings is 
//    not sorted so we keep track of count.


import java.util.*;
public class LC269_AlienDictionary {

	public String alienOrder(String[] words) {
		
		// Graph formation
		HashMap<Character , List<Character>> map = new HashMap<>();
	    for(int i = 0;i < words.length;i++) {
	    	String w = words[i];
	    	for(char ch : w.toCharArray()) {
	    		if(!map.containsKey(ch)) {
	    			map.put(ch, new ArrayList<>());
	    		}
	    	}
	    }
	    for(int i = 0;i < words.length - 1;i++) {
	    	String s1 = words[i];
	    	String s2 = words[i+1];
	    	if(s1.startsWith(s2) && s1.length() > s2.length()) { // if abc comes before ab that means given array of string is not 
//	    	    lexicographically sorted
    			return "";	    		
    		}
	    	for(int j = 0;j < Math.min(s1.length(), s2.length());j++) {
	    		if(s1.charAt(j) != s2.charAt(j)) {
	    			map.get(s1.charAt(j)).add(s2.charAt(j));
	    			break;
	    		}
	    	}
	    }
	    
	    // Finding Indegree
	    int in[] = new int[26];  // 26 alphabets
		for(char key:map.keySet()) {
			for(char neighbour : map.get(key)) {
				in[neighbour - 'a']++;     // for char 'a' we have index 0, so subtract 'a' 
			}
		}
		
		// Topological Sort
		Queue<Character> queue = new LinkedList<>();
		for(char ch : map.keySet()) {
			if( in[ch - 'a'] == 0) {
				queue.add(ch);
			}
		}
		StringBuilder sb = new StringBuilder();
		int count = 0;
		while( !queue.isEmpty()) {
			char v = queue.poll();
			sb.append(v);
			count ++;
			for(char neighbour : map.get(v)) {
				in[neighbour - 'a']--;
				if(in[neighbour - 'a'] == 0) {					
					queue.add(neighbour);
				}
			}
		}
		return count == map.size() ? sb.toString() : "" ; //check for cycle
	}
}
