package week12;

import java.util.*;
public class Q4main {

	public static void main(String[] args) {
		List<Integer>[] graph= new List[9];
		
		for (int i = 0; i < 9; i++) {
			graph[i] = new LinkedList<>();
		}
		
		graph[0].add(1);
		
		graph[1].add(3);
		graph[1].add(4);
		
		graph[2].add(0);
		graph[2].add(1);
		
		graph[3].add(6);
		
		graph[4].add(5);
		
		graph[5].add(4);
		graph[5].add(7);
		
		graph[6].add(7);

		graph[7].add(8);
			
		TopologicalSort t = new TopologicalSort(graph);
		t.tsort();
		
		System.out.println("위상 정렬:");
		t.print();
	}

}

