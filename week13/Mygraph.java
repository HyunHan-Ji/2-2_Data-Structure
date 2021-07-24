package week13;

import java.util.LinkedList;
import java.util.List;

public class Mygraph {
	List<Edge>[] adjList;
	int[][] matrix;

	public int[][] getAdjMatrixFromAdjList(List<Edge>[] l) {
		matrix = new int[l.length][l.length];
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l[i].size(); j++) {
				matrix[i][l[i].get(j).adjvertex] = l[i].get(j).weight;
			}
		}
		return matrix;
	}

	public List<Edge>[] getAdjListFromAdjMatrix(int[][] m) {
		int N = m.length;

		adjList = new List[N];

		for (int i = 0; i < N; i++) {
			adjList[i] = new LinkedList<>();
			for (int j = 0; j < N; j++) {
				if (m[i][j] != 0) {
					Edge e = new Edge(j, m[i][j]);
					adjList[i].add(e);
				}
			}
		}
		return adjList;
	}

	public void print(int[][] m) {
		System.out.println("AdjMatrix : ");
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length-1;j++) {
				System.out.print(m[i][j]+", ");
			}
			System.out.println(m[i][m[i].length-1]);
		}
	}

	public void print(List<Edge>[] l) {
		System.out.println("AdjList : ");
		for (int i = 0; i < l.length; i++) {
			System.out.printf("[%d]", i);
			for (int j = 0; j < l[i].size(); j++) {
				System.out.printf(" => %d(%d)", l[i].get(j).adjvertex, l[i].get(j).weight);
			}
			System.out.println();
		}
	}
}
