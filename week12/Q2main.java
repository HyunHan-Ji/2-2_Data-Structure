package week12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q2main {
	public static void main(String[] args) {
		
	List<Edge>[] list=new List[10];
	
	for(int i=0;i<10;i++) {
		list[i]=new LinkedList<>();
	}
	
	list[0].add(new Edge(2));
	list[0].add(new Edge(1));

	list[1].add(new Edge(3));
	list[1].add(new Edge(0));
	
	list[2].add(new Edge(3));
	list[2].add(new Edge(0));
	
	list[3].add(new Edge(9));
	list[3].add(new Edge(8));
	list[3].add(new Edge(2));
	list[3].add(new Edge(1));

	list[4].add(new Edge(5));
	
	list[5].add(new Edge(7));
	list[5].add(new Edge(6));
	list[5].add(new Edge(4));
	
	list[6].add(new Edge(7));	
	list[6].add(new Edge(5));

	list[7].add(new Edge(6));	
	list[7].add(new Edge(5));
	
	list[8].add(new Edge(3));
	
	list[9].add(new Edge(3));
	
	System.out.println("DFS 방문 순서:");
	DFS dfs=new DFS(list);
	
	}
}
