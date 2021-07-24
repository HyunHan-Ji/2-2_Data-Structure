package week09;

import java.util.LinkedList;

public class Q3main {

	public static void main(String[] args) {
		BinaryTree<Integer> tA = new BinaryTree<Integer>();
		tA.setRoot(
				new Node(100,
						new Node(200,
								new Node(400,
										new Node(800, null, null), null),
								new Node(500, null, null)),
						new Node(300,
								new Node(600, null, null),
								new Node(700, null, null))));

		BinaryTree<Integer> tB = new BinaryTree<Integer>();
		tB.setRoot(
				new Node(1,
						new Node(2,
								new Node(300,
										new Node(600, null, null),
										new Node(700, null, null)),
								new Node(7, null, null)),
						new Node(3,
								new Node(9, null, null),
								new Node(70, null, null))));

		LinkedList<Node> subtreelist = tA.subTreeCompare(tB);

		for (int i = 0; i < subtreelist.size(); i++) {
			System.out.printf("Found a matching subtree %d :\n", i + 1);
			tA.levelorder(subtreelist.get(i));
			System.out.println();
		}

	}

}
