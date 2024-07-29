//Topological Sort -->  (kahn's algorithm)
//- not a sorting algorithm
//- used in os to remove dependencies/resolve multiple dependencies
//- advanced algo for graph
//- tells work in order, resolving dependency
//- Used in - DAG (Directed Acyclic Graph)
//          - detect cycle in directed graph
//- BFS / DFS detects cycle in Undirected graph.
//

//Steps --> DAG --> Indegree --> Outdegree --> Topological sort --> cycle detection
//
//Indegree - incoming edges
//Outdegree - outgoing edges
//



//Topological sort -->
// 1. Make graph
// 2. Then find indegree for each vertex.Use a array to store indegrees of vertexes.
// 3. Now in topological sort Jiski indgree zero usko queue me daal do , and then jo neighbour uski indegree 1 se kam
// 4. If the indegree of neighbour becomes zero, we will again add then inisde our queue.
// 5. While taking vertexes out of queue, we get correct order to sort vertexes resolving dependencies.

// In case of cycle detection -->
// 1. if number of elements poped out of queue are equal to size of map, then there is no cycle. Each is traversed vertex ones else we got a cycle. 








package TopologicalSort;
import java.util.*;

public class TopologicalSort {

	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
	TopologicalSort(int v){
		for(int i = 1;i < v;i++) {
			map.put(i,  new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2) {
		map.get(v1).put(v2,  0);  //v1 --> v2
	}
	
	public int[] Indegree() {
		int v = map.size();
		int arr[] = new int[v+1];
		
		for(int key:map.keySet()) {
			for(int neighbour : map.get(key).keySet()) {
				arr[neighbour]++;
			}
		}
		
		return arr;
	}
	
	public void Topological() {
		int in[] = Indegree();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i =1;i < in.length;i++) {
			if( in[i] == 0) {
				queue.add(i);
			}
		}
		while( !queue.isEmpty()) {
			int v = queue.poll();
			System.out.print(v+" ");
			for(int neighbour : map.get(v).keySet()) {
				in[neighbour]--;
				if(in[neighbour] == 0) {					
					queue.add(neighbour);
				}
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TopologicalSort ts = new TopologicalSort(8);
		ts.addEdge(1, 2);
		ts.addEdge(1, 4);
		ts.addEdge(4, 3);
		ts.addEdge(3, 2);
		ts.addEdge(4, 5);
		ts.addEdge(5, 7);
		ts.addEdge(6, 3);
		ts.addEdge(6, 7);
		ts.Topological();
	}
}
