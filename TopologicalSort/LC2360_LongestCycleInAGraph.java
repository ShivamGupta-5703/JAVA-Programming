package TopologicalSort;

import java.util.LinkedList;
import java.util.Queue;

//Intuition -->
//Input: edges = [3,3,4,2,3]
//Output: 3
//Explanation: The longest cycle in the graph is the cycle: 2 -> 4 -> 3 -> 2.
//The length of this cycle is 3, so 3 is returned.

// 1. One atmost one outgoing edge so only one neighbour, no need to make graph
// 2. Make indegree array, in given list if we encounter -1, means no outgoing edge
// 3. Then topological sort, jiski indegree zero usko queue me add.
// 4. we need to isolate the cycle, so after the queue is empty, still we will have some vertexes with indegrees not zero.
// 5. So, we will keep track of vertexes using a visited array.
// 6. For every non visited vertex, we calculate length of cycle.



public class LC2360_LongestCycleInAGraph {

	public int longestCycle(int[] edges) {
		
		// Indegree
		int in[] = new int[edges.length];
		for(int i = 0;i < edges.length;i++) {
			if(edges[i] != -1) {
				in[edges[i]]++;
			}
		}
		
		// Topological Sort
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0;i < in.length;i++) {
			if( in[i] == 0) {
				queue.add(i);
			}
		}
		int visited[] = new int[edges.length];
		while( !queue.isEmpty()) {
			int v = queue.poll();
			visited[v] = 1;
			int neighbour = edges[v];
			if(neighbour != -1) {				
				in[neighbour]--;
				if(in[neighbour] == 0) {					
					queue.add(neighbour);
				}	
			}
		}
		
		//Get length of cycle
		int ans = -1;
		for(int i = 0;i < visited.length;i++) {
			if(visited[i] == 0) {
				int count = 1;
				visited[i] = 1;
				int neighbour = edges[i];
				while(neighbour != i) {
					visited[neighbour] = 1;
					neighbour = edges[neighbour];
					count++;
				}
				ans = Math.max(ans, count);
			}
		}
		return ans;
    }
}
