package week12;

import java.util.*;

public class Kosaraju {
	int N;
	boolean[] visited;
	List<Integer>[] adjList;
	List<Integer> TS;
	List<Integer> sequence;
	List<Integer>[] GR;

	public Kosaraju(List<Integer>[] graph) {
		N = graph.length;
		visited = new boolean[N];
		adjList = graph;
		sequence = new ArrayList<>();
		GR = new LinkedList[N];

		TopologicalSort t = new TopologicalSort(adjList);
		TS = t.tsort();
	}

	public void GRmake() {
		for (int i = 0; i < N; i++) {
			GR[i] = new LinkedList<>();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < adjList[i].size(); j++) {
				GR[adjList[i].get(j)].add(i);
			}
		}

	}

	public void dfs(int i) {
		visited[i] = true;
		for (int v : GR[i]) {
			if (!visited[v])
				dfs(v);
		}
		sequence.add(i);
	}

	public void print() {
		GRmake();
		for (int i = 0; i < N; i++) {
			if (!visited[TS.get(i)]) {
				dfs(TS.get(i));
				System.out.print(sequence+" ");
				sequence.clear();
			}
		}

	}
}
