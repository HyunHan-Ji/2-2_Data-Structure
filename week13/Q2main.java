package week13;

import java.util.LinkedList;
import java.util.List;

public class Q2main {
	public static void main(String[] args) {
		CheckGraph checkgraph = new CheckGraph();
		//Task 1
		int[][] adjmat1 = { { 0, 2, 3, 0 }, 
							{ 7, 0, 0, 4 }, 
							{ 6, 0, 0, 9 }, 
							{ 0, 1, 3, 0 } };

		List<Edge>[] adjlist1 = new List[4];
		for (int i = 0; i < adjlist1.length; i++)
			adjlist1[i] = new LinkedList<>();

		adjlist1[0].add(new Edge(1, 2));
		adjlist1[0].add(new Edge(2, 3));

		adjlist1[1].add(new Edge(0, 7));
		adjlist1[1].add(new Edge(3, 4));

		adjlist1[2].add(new Edge(0, 6));
		adjlist1[2].add(new Edge(3, 9));

		adjlist1[3].add(new Edge(1, 1));
		adjlist1[3].add(new Edge(2, 3));

		System.out.println("[Task 1]");
		System.out.println("isReverseSame adjmat1: " + checkgraph.isReverseSame(adjmat1));
		System.out.println("isReverseSame: adjlist1: " + checkgraph.isReverseSame(adjlist1));

		// Task 2
		int[][] adjmat2 = { { 0, 2, 3, 0 }, 
							{ 7, 0, 0, 4 }, 
							{ 6, 0, 0, 9 }, 
							{ 0, 0, 3, 0 } };

		List<Edge>[] adjlist2 = new List[4];
		for (int i = 0; i < adjlist2.length; i++)
			adjlist2[i] = new LinkedList<>();

		adjlist2[0].add(new Edge(1, 2));
		adjlist2[0].add(new Edge(2, 3));

		adjlist2[1].add(new Edge(0, 7));
		adjlist2[1].add(new Edge(3, 4));

		adjlist2[2].add(new Edge(0, 6));
		adjlist2[2].add(new Edge(3, 9));

		adjlist2[3].add(new Edge(2, 3));

		System.out.println("[Task 2]");
		System.out.println("isReverseSame adjmat2: " + checkgraph.isReverseSame(adjmat2));
		System.out.println("isReverseSame: adjlist2: " + checkgraph.isReverseSame(adjlist2));

		// Task 3
		int[][] adjmat3 = { { 0, 1, 4, 0 }, 
							{ 1, 0, 0, 2 }, 
							{ 4, 0, 0, 3 }, 
							{ 0, 2, 3, 0 } };

		List<Edge>[] adjlist3 = new List[4];
		for (int i = 0; i < adjlist3.length; i++)
			adjlist3[i] = new LinkedList<>();

		adjlist3[0].add(new Edge(1, 1));
		adjlist3[0].add(new Edge(2, 4));

		adjlist3[1].add(new Edge(0, 1));
		adjlist3[1].add(new Edge(3, 2));

		adjlist3[2].add(new Edge(0, 4));
		adjlist3[2].add(new Edge(3, 3));

		adjlist3[3].add(new Edge(1, 2));
		adjlist3[3].add(new Edge(2, 3));

		System.out.println("[Task 3]");
		System.out.println("isReverseSame adjmat3: " + checkgraph.isReverseSame(adjmat3));
		System.out.println("isReverseSame: adjlist3: " + checkgraph.isReverseSame(adjlist3));

		// Task 4
		int[][] adjmat4 = { { 0, 1, 4, 0 }, 
							{ 1, 0, 0, 2 }, 
							{ 4, 0, 0, 3 }, 
							{ 0, 2, 3, 0 } };

		List<Edge>[] adjlist4 = new List[4];
		for (int i = 0; i < adjlist4.length; i++)
			adjlist4[i] = new LinkedList<>();

		adjlist4[0].add(new Edge(1, 1));
		adjlist4[0].add(new Edge(2, 4));

		adjlist4[1].add(new Edge(0, 1));
		adjlist4[1].add(new Edge(3, 2));

		adjlist4[2].add(new Edge(0, 4));
		adjlist4[2].add(new Edge(3, 3));

		adjlist4[3].add(new Edge(1, 2));
		adjlist4[3].add(new Edge(2, 3));

		System.out.println("[Task 4]");
		System.out.println("isReverseSame adjmat1: " + checkgraph.isReverseSame(adjmat4));
		System.out.println("isReverseSame: adjlist1: " + checkgraph.isReverseSame(adjlist4));

	}
}
