package TopologicalSort;

import java.util.*;

public class LC207_CourseSchedule {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		for(int i = 1;i < numCourses;i++) {
			map.put(i,  new ArrayList<>());
		}
		for(int i = 0;i < prerequisites.length;i++) {
			int a1 = prerequisites[i][0];
			int b1 = prerequisites[i][1];
			map.get(b1).add(a1);
		}
		return Topological(map);
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
	
	public boolean Topological(HashMap<Integer, List<Integer>> map) {
		int in[] = Indegree(map);
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
            for(int neighbour : map.get(v)) {
				in[neighbour]--;
				if(in[neighbour] == 0) {					
					queue.add(neighbour);
				}
			}
		}
		return count == map.size();    //cycle h course complete nhi kar skte hence false.
	}	
}
