package week12;

import java.util.LinkedList;
import java.util.List;

public class Matrix2List {
	int N;
	List<Edge>[] adjList;

	public Matrix2List(int[][] matrix) {
		N = matrix.length;

		adjList = new List[N];

		for (int i = 0; i < N; i++) {
			adjList[i] = new LinkedList<>();
			for (int j = 0; j < N; j++) {
				if (matrix[i][j] == 1) {
					Edge e = new Edge(j);
					adjList[i].add(e);
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < N; i++) {
			System.out.printf("[%d]",i);
			for (int j = 0; j < adjList[i].size(); j++) {
				System.out.print(" => "+adjList[i].get(j).getAdjvertex());
			}
			System.out.println();
		}
	}
}
