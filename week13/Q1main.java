package week13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q1main {

	public static void main(String[] args) {
		List<Edge>[] AdjList = new List[8];
		for (int i = 0; i < AdjList.length; i++)
			AdjList[i] = new LinkedList<>();

		AdjList[0].add(new Edge(1, 1));
		AdjList[0].add(new Edge(3, 2));

		AdjList[1].add(new Edge(0, 1));
		AdjList[1].add(new Edge(2, 4));
		AdjList[1].add(new Edge(3, 3));
		AdjList[1].add(new Edge(4, 1));
		AdjList[1].add(new Edge(5, 7));

		AdjList[2].add(new Edge(1, 4));
		AdjList[2].add(new Edge(5, 1));
		AdjList[2].add(new Edge(6, 1));
		AdjList[2].add(new Edge(7, 2));

		AdjList[3].add(new Edge(0, 2));
		AdjList[3].add(new Edge(1, 3));
		AdjList[3].add(new Edge(4, 5));

		AdjList[4].add(new Edge(1, 1));
		AdjList[4].add(new Edge(3, 5));
		AdjList[4].add(new Edge(6, 2));

		AdjList[5].add(new Edge(1, 6));
		AdjList[5].add(new Edge(2, 1));
		AdjList[5].add(new Edge(7, 9));

		AdjList[6].add(new Edge(2, 1));
		AdjList[6].add(new Edge(4, 2));
		AdjList[6].add(new Edge(7, 1));

		AdjList[7].add(new Edge(2, 2));
		AdjList[7].add(new Edge(5, 9));
		AdjList[7].add(new Edge(6, 1));
		Mygraph mygraph1 = new Mygraph();
		mygraph1.print(mygraph1.getAdjMatrixFromAdjList(AdjList));

		int[][] AdjMatrix = { { 0, 1, 0, 2, 0, 0, 0, 0 }, { 1, 0, 4, 3, 1, 6, 0, 0 }, { 0, 4, 0, 0, 0, 1, 1, 2 },
				{ 2, 3, 0, 0, 5, 0, 0, 0 }, { 0, 1, 0, 5, 0, 0, 2, 0 }, { 0, 6, 1, 0, 0, 0, 0, 9 },
				{ 0, 0, 1, 0, 2, 0, 0, 1 }, { 0, 0, 2, 0, 0, 9, 1, 0 } };
		Mygraph mygraph2 = new Mygraph();
		mygraph2.print(mygraph2.getAdjListFromAdjMatrix(AdjMatrix));

	}

}
