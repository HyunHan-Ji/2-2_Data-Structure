package week12;

import java.util.LinkedList;
import java.util.List;

public class Q5main {
	public static void main(String[] args) {
		List<Integer>[] graph = new List[10];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new LinkedList<>();
		}

		graph[0].add(1);
		graph[0].add(3);
		
		graph[1].add(7);

		graph[2].add(8);

		graph[3].add(5);
		graph[3].add(6);

		graph[4].add(1);

		graph[5].add(1);
		graph[5].add(4);

		graph[6].add(0);

		graph[7].add(4);
		
		graph[8].add(6);
		graph[8].add(7);
		graph[8].add(9);
		
		graph[9].add(2);

		Kosaraju t = new Kosaraju(graph);
		System.out.println("강 연결 성분 출력:");
		t.print();
	}
}

