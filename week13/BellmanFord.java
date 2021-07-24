package week13;

import java.util.LinkedList;
import java.util.List;

public class BellmanFord {
	public static final int INF = Integer.MAX_VALUE;
	private int D[];
	private int previous[];
	private int N;

	public BellmanFord(int numOfVertices) {
		N = numOfVertices;
		D = new int[N];
		previous = new int[N];
	}

	public void shortestPath(int s, int adjMatrix[][]) {
		for (int i = 0; i < N; i++) {
			D[i] = INF;
		}
		D[s] = 0;
		previous[s] = 0;
		for (int k = 0; k < N - 1; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (adjMatrix[i][j] != INF) {
						if (D[j] > D[i] + adjMatrix[i][j]) {
							D[j] = D[i] + adjMatrix[i][j];
							previous[j] = i;
						}
					}
				}
			}
		}
	}

	public void printPaths(int s) {
		System.out.println("정점 " + s + "으로부터의 최단거리");
		for (int i = 1; i < N; i++) {
			System.out.printf("[%d,%d] = %2d\n", s, i, D[i]);
		}
		
		
		System.out.println("\n정점 0으로부터의 최단경로");
		for (int i = 1; i < N; i++) {
			System.out.print(i);
			int a = i;
			while (true) {
				System.out.print("<-" + previous[a]);
				a = previous[a];
				if (a == 0)
					break;
			}
			System.out.println();
		}
	}

}
