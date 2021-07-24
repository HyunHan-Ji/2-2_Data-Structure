package week09;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<Key extends Comparable<Key>> {
	private Node root;

	public BinaryTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node newRoot) {
		root = newRoot;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void preorder(Node n) {
		if (n != null) {
			System.out.print(n.getKey() + " ");
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}

	public void inorder(Node n) {
		if (n != null) {
			inorder(n.getLeft());
			System.out.print(n.getKey() + " ");
			inorder(n.getRight());
		}
	}

	public void postorder(Node n) {
		if (n != null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.print(n.getKey() + " ");
		}
	}

	public void levelorder(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Node t;
		q.add(root);
		while (!q.isEmpty()) {
			t = q.remove();
			System.out.print(t.getKey() + " ");
			if (t.getLeft() != null)
				q.add(t.getLeft());
			if (t.getRight() != null)
				q.add(t.getRight());
		}
	}

	public int size(Node n) {
		if (n == null)
			return 0;
		else
			return (1 + size(n.getLeft()) + size(n.getRight()));
	}

	public int height(Node n) {
		if (n == null)
			return 0;
		else
			return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
	}

	public static boolean isEqual(Node n, Node m) {
		if (n == null || m == null)
			return n == m;

		if (n.getKey().compareTo(m.getKey()) != 0)
			return false;

		return (isEqual(n.getLeft(), m.getLeft()) && isEqual(n.getRight(), m.getRight()));
	}

	// Q2 Task1
	int[] arr;

	public int[] btree2intarr() { // 레벨순회와 유사하게 함
		arr = new int[(int) (Math.pow(2, height(root)))]; // 배열 초기화

		Queue<Node> q = new LinkedList<Node>();
		Node t;
		q.add(root);
		while (!q.isEmpty()) {
			t = q.remove();
			arradd((int) t.getKey());
			if (t.getLeft() != null)
				q.add(t.getLeft());
			if (t.getRight() != null)
				q.add(t.getRight());
		}

		return arr;
	}

	public void arradd(int num) { // 비어있는 제일 앞칸에 데이터를 넣음
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = num;
				return;
			}
		}
	}

	// Q2 Task2
	public void intarr2btree(int[] arr) {
		root = null;

		root = new Node(arr[1], null, null);
		intarr2btreefunc(root, arr, 1);
	}

	public void intarr2btreefunc(Node node, int[] arr, int i) {
		if (i * 2 + 1 < arr.length) {
			if (arr[i * 2] != 0) {
				node.setLeft(new Node(arr[i * 2], null, null));
				intarr2btreefunc(node.getLeft(), arr, i * 2);
			}
			if (arr[i * 2 + 1] != 0) {
				node.setRight(new Node(arr[i * 2 + 1], null, null));
				intarr2btreefunc(node.getRight(), arr, i * 2 + 1);
			}
		}
	}

	// Q3
	private LinkedList<Node> subtreelist = new LinkedList<Node>();

	public LinkedList<Node> subTreeCompare(BinaryTree t) {
		subTreeCompareFunc1(this.root, t.getRoot());
		return subtreelist;
	}

	public void subTreeCompareFunc1(Node root1, Node root2) { // root1이 작아지면서 subTreeCompareFunc2호출
		if (root1 != null) {
			subTreeCompareFunc2(root1, root2);
			subTreeCompareFunc1(root1.getLeft(), root2);
			subTreeCompareFunc1(root1.getRight(), root2);

		}
	}

	public void subTreeCompareFunc2(Node root1, Node root2) { // root2이 작아지면서 root1이랑 같으면 리스트에 추가
		if (root2 != null) {
			if (isEqual(root1, root2)) {
				subtreelist.add(root2);
			} else {
				subTreeCompareFunc2(root1, root2.getLeft());
				subTreeCompareFunc2(root1, root2.getRight());
			}
		}
	}

}
