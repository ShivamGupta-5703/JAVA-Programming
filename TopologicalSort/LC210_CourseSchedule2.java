package TopologicalSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC210_CourseSchedule2 {

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for(int i = 1;i < numCourses;i++) {
			map.put(i,  new ArrayList<>());
		}
		for(int i = 0;i < prerequisites.length;i++) {
			int a1 = prerequisites[i][0];
			int b1 = prerequisites[i][1];
			map.get(b1).add(a1);
		}
		
		int ans[] = Topological(map);
		return ans;
        
    }
	
	public int[] Indegree(HashMap<Integer, List<Integer>> map) {
		int v = map.size();
		int arr[] = new int[v+1];
		
		for(int key:map.keySet()) {
			for(int neighbour : map.get(key)) {
				arr[neighbour]++;
			}
		}
		
		return arr;
	}
	
	public int[] Topological(HashMap<Integer, List<Integer>> map) {
		int in[] = Indegree(map);
		Queue<Integer> queue = new LinkedList<>();
		int ans[] = new int[map.size()];
		
		for(int i =1;i < in.length;i++) {
			if( in[i] == 0) {
				queue.add(i);
			}
		}
		int idx = 0;
		int count = 0;
		while( !queue.isEmpty()) {
			int v = queue.poll();
			ans[idx] = v;
			idx++;
            count++;
            for(int neighbour : map.get(v)) {
				in[neighbour]--;
				if(in[neighbour] == 0) {					
					queue.add(neighbour);
				}
			}
		}
		return count == map.size() ? ans : new int[0];
	}	 	
}
