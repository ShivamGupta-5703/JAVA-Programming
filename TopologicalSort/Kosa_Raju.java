// StronglyConnectedComponent is only present in directed graph.
// If a path exist between a to b, then there must exist a path between b to a - then it is a Strongly Connected Component.
// Now, we need to find edges jinki wagah se SCC connected h. Usme +1 and we get number of StronglyConnectedComponent.
// **Kosa Raju ** algorithm is used for this purpose.


package TopologicalSort;
import java.util.*;
public class Kosa_Raju {

	HashMap<Integer, Map<Integer, Integer>> map = new HashMap<>();
	public  Kosa_Raju(int v) {
		for(int i = 0;i < v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2) {
		map.get(v1).put(v2, 5);
	}
	
	public void KosaRajuAlgo() {
		HashSet<Integer> visited = new HashSet<>();
		Stack<Integer> stack = new Stack<>();
		// dfs all vertex stack me put kar do
		dfs(visited, stack, 0);
		
		// transpose
		HashMap<Integer, Map<Integer, Integer>> map1 = new HashMap<>();
		Transpose(map1);
		
		// dfs component count
		int count = 0;
		while( ! stack.isEmpty()) {
			int pop = stack.pop();
			if(!visited.contains(pop)) {
				count++;
				dfs(map1 , visited , pop);
			}
		}
		System.out.println(count);
	}
	
	public void dfs(HashSet<Integer> visited, Stack<Integer> st, int vertex) {
		visited.add(vertex);
		for(int neighbours : map.get(vertex).keySet()) {
			if(!visited.contains(neighbours)) {
				dfs(visited, st, neighbours);
			}
		}
		st.push(vertex);
	}
	
	// Transpose of Graph -->
	public void Transpose(HashMap<Integer, Map<Integer, Integer>> map1) {
		for(int v1 : map.keySet()) {
			for(int v2 : map.get(v1).keySet()) {
				if( ! map1.containsKey(v2)) {
					map1.put(v2,  new HashMap<>());
				}
				map1.get(v2).put(v1, 5);
			}
		}
		for(int v1 : map.keySet()) {
			if(!map1.containsKey(v1)) {
				map1.put(v1 ,  new HashMap<>());
			}
		}
	}
	
	public void dfs(HashMap<Integer, Map<Integer, Integer>> map1, HashSet<Integer> visited, int pop) {
		visited.add(pop);
		for(int neighbours : map.get(pop).keySet()) {
			if(!visited.contains(neighbours)) {
				dfs(map1, visited, neighbours);
			}
		}
	}
}
















