package week10;

public class BST<Key extends Comparable<Key>, Value> {
	public Node root;

	public Node getRoot() {
		return root;
	}

	public BST(Key newId, Value newName) {
		root = new Node(newId, newName);
	}

	public Value get(Key k) {
		return get(root, k);
	}

	public Value get(Node n, Key k) {
		if (n == null)
			return null;
		int t = n.getKey().compareTo(k);
		if (t > 0)
			return get(n.getLeft(), k);
		else if (t < 0)
			return get(n.getRight(), k);
		else
			return (Value) n.getValue();
	}

	public void put(Key k, Value v) {
		root = put(root, k, v);
	}

	public Node put(Node n, Key k, Value v) {
		if (n == null)
			return new Node(k, v);
		int t = n.getKey().compareTo(k);
		if (t > 0)
			n.setLeft(put(n.getLeft(), k, v));
		else if (t < 0)
			n.setRight(put(n.getRight(), k, v));
		else
			n.setValue(v);
		return n;
	}

	public Key min() {
		if (root == null)
			return null;
		return (Key) min(root).getKey();
	}

	private Node min(Node n) {
		if (n.getLeft() == null)
			return n;
		return min(n.getLeft());
	}

	public void deleteMin() {
		if (root == null)
			System.out.println("empty Ʈ��");
		else
			root = deleteMin(root);

	}

	private Node deleteMin(Node n) {
		if (n.getLeft() == null)
			return n.getRight();
		n.setLeft(deleteMin(n.getLeft()));
		return n;
	}

	public void delete(Key k) {
		root = delete(root, k);
	}

	public Node delete(Node n, Key k) {
		if (n == null)
			return null;
		int t = n.getKey().compareTo(k);
		if (t > 0)
			n.setLeft(delete(n.getLeft(), k));
		else if (t < 0)
			n.setRight(delete(n.getRight(), k));
		else {
			if (n.getRight() == null)
				return n.getLeft();
			if (n.getLeft() == null)
				return n.getRight();
			Node target = n;
			n = min(target.getRight());
			n.setRight(deleteMin(target.getRight()));
			n.setLeft(target.getLeft());
		}
		return n;
	}

	public void print() {
		print(root);
		System.out.println();
	}

	private void print(Node n) {
		if (n != null) {
			print(n.getLeft());
			System.out.print(n.getValue() + " ");
			print(n.getRight());
		}
	}

	// Q2
	public void deleteMax() {
		if (root == null)
			System.out.println("empty Ʈ��");
		else
			root = deleteMax(root);

	}

	private Node deleteMax(Node n) {
		if (n.getRight() == null)
			return n.getLeft();
		n.setRight(deleteMax(n.getRight()));
		return n;
	}

	// Q3
	private int[] b2a; // Ʈ���� ����� �迭
	private int size = 0;// Ʈ���� ������ ����

	public int size() { // Ʈ���� ����� �����ϴ� �޼ҵ�
		size(root);
		return size;
	}

	private void size(Node n) { // Ʈ���� ����� ���� �޼ҵ�
		if (n != null) {
			size++;
			size(n.getLeft());
			size(n.getRight());
		}
	}

	public Key kthSmallest(int k) {
		b2a = new int[size()]; // Ʈ���� �����ŭ �迭�� �ʱ�ȭ
		BST2arr(root); // �迭�� Ʈ���� ����
		return (Key) (Object) (b2a[k]);
	}

	private void BST2arr(Node n) { // �迭���ٰ� Ʈ���� �ִ� �޼ҵ�
		if (n != null) {
			BST2arr(n.getLeft());
			add((int) n.getKey());
			BST2arr(n.getRight());
		}
	}

	private void add(int a) { // �迭�� ���� ���ʴ�� �ִ� �޼ҵ�
		for (int i = 0; i < b2a.length; i++) {
			if (b2a[i] == 0) {
				b2a[i] = a;
				break;
			}
		}
	}

	// Q4
	BST() {
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	boolean booleanBST = true; // ����Ž��Ʈ���� �Ӽ��� �������� ������ false�� ����

	public boolean checkBST() {
		checkBST(root);
		return booleanBST;
	}

	private void checkBST(Node n) {
		if (n.getLeft() != null) {
			if (n.getLeft().getKey().compareTo(n.getKey()) == 1) { // n�� key���� n�� ������ key�� ū���
				booleanBST = false;
			} else {
				checkBST(n.getLeft());
			}
		}
		if (n.getRight() != null) {
			if (n.getRight().getKey().compareTo(n.getKey()) == -1) { // n�� key���� n�� �������� key�� �������
				booleanBST = false;
			} else {
				checkBST(n.getRight());
			}
		}
	}
}
