package week13;

import java.util.*;

public class Edge {
	int vertex;
	int adjvertex;
	int weight;

	public Edge(int v, int wt) {
		adjvertex = v;
		weight = wt;
	}

	public Edge(int u, int v, int wt) {
		vertex = u;
		adjvertex = v;
		weight = wt;
	}
}
