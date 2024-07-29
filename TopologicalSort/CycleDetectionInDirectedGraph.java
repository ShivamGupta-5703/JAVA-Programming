package TopologicalSort;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionInDirectedGraph {

	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
	CycleDetectionInDirectedGraph(int v){
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
	
	public boolean Topological() {
		int in[] = Indegree();
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i =1;i < in.length;i++) {
			if( in[i] == 0) {
				queue.add(i);
			}
		}
		int count = 0;
		while( !queue.isEmpty()) {
			int v = queue.poll();
            count++;
            for(int neighbour : map.get(v).keySet()) {
				in[neighbour]--;
				if(in[neighbour] == 0) {					
					queue.add(neighbour);
				}
			}
		}
		return count < map.size();   // < - cycle h,  == - cycle nhi h
  	}
	
	public static void main(String[] args) {
		CycleDetectionInDirectedGraph ts = new CycleDetectionInDirectedGraph(8);
		ts.addEdge(1, 2);
		ts.addEdge(1, 4);
		ts.addEdge(4, 3);
		ts.addEdge(3, 2);
		ts.addEdge(4, 5);
		ts.addEdge(5, 7);
		ts.addEdge(6, 3);
		ts.addEdge(6, 7);
		System.out.println(ts.Topological());
	}
}
