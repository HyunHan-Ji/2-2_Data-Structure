package week13;

import java.util.LinkedList;
import java.util.List;

public class Q3main {

	public static void main(String[] args) {
		List<Edge>[] adjlist = new List[7];
		for (int i = 0; i < adjlist.length; i++)
			adjlist[i] = new LinkedList<>();

		adjlist[0].add(new Edge(1, 9));
		adjlist[0].add(new Edge(2, 10));

		adjlist[1].add(new Edge(0, 9));
		adjlist[1].add(new Edge(3, 10));
		adjlist[1].add(new Edge(4, 5));
		adjlist[1].add(new Edge(6, 3));

		adjlist[2].add(new Edge(0, 10));
		adjlist[2].add(new Edge(3, 9));
		adjlist[2].add(new Edge(4, 7));
		adjlist[2].add(new Edge(5, 2));

		adjlist[3].add(new Edge(1, 10));
		adjlist[3].add(new Edge(2, 9));
		adjlist[3].add(new Edge(5, 4));
		adjlist[3].add(new Edge(6, 8));

		adjlist[4].add(new Edge(1, 5));
		adjlist[4].add(new Edge(2, 7));
		adjlist[4].add(new Edge(6, 1));

		adjlist[5].add(new Edge(2, 2));
		adjlist[5].add(new Edge(3, 4));
		adjlist[5].add(new Edge(6, 6));

		adjlist[6].add(new Edge(1, 3));
		adjlist[6].add(new Edge(3, 8));
		adjlist[6].add(new Edge(4, 1));
		adjlist[6].add(new Edge(5, 6));

		PrimMST primMst = new PrimMST(adjlist);
		int[] in = primMst.mst(0);
		int sum = 0;

		System.out.println("최소신장트리 간선: ");
		for (int i = 1; i < in.length; i++) {
			System.out.printf("(%d,%d) ", i, in[i]);

			for (int j = 0; j < adjlist[i].size(); j++) // 가중치 합구하는 부분
				if (adjlist[i].get(j).adjvertex == in[i])
					sum += adjlist[i].get(j).weight;

		}
		System.out.println("\n\n최소신장트리의 간선 가중치 합 = " + sum);
	}

}
