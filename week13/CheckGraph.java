package week13;

import java.util.List;

public class CheckGraph {
	public boolean isReverseSame(int[][] G) {
		for(int i=0;i<G.length;i++) {
			for(int j=0;j<G[i].length;j++) {
				if(G[j][i] != G[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	public boolean isReverseSame(List<Edge>[] G) {
		return isReverseSame(getAdjMatrixFromAdjList(G));
	}
	//Mygraph의 메소드
	public int[][] getAdjMatrixFromAdjList(List<Edge>[] l) {
		int[][] matrix = new int[l.length][l.length];
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l[i].size(); j++) {
				matrix[i][l[i].get(j).adjvertex] = l[i].get(j).weight;
			}
		}
		return matrix;
	}
}
