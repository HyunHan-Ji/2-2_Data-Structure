package week13;

public class Q5main {
	public static final int INF = Integer.MAX_VALUE;

	public static void main(String[] args) {
		int[][] weight= {{INF,1,INF,2,INF,INF,INF,INF},
						 {INF,INF,4,-2,INF,6,INF,INF},
						 {INF,INF,INF,INF,INF,INF,INF,2},
						 {INF,INF,INF,INF,-1,INF,INF,INF},
						 {INF,INF,INF,INF,INF,INF,4,INF},
						 {INF,INF,1,INF,INF,INF,INF,INF},
						 {INF,INF,-1,INF,INF,INF,INF,1},
						 {INF,INF,INF,INF,INF,3,INF,INF}};
				
		int N=weight.length;
		
		int s=0;
		BellmanFord bf = new BellmanFord(N);
		bf.shortestPath(s, weight);
		bf.printPaths(s);
	}
}
