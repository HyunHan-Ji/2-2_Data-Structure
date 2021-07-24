package week09;

public class Node<Key extends Comparable<Key>> {
	private Key item;
	private Node<Key> left;
	private Node<Key> right;

	public Node(Key newItem, Node lt, Node rt) {
		item = newItem;
		left = lt;
		right = rt;
	}

	public Key getKey() {
		return item;
	}

	public void setKey(Key item) {
		this.item = item;
	}

	public Node<Key> getLeft() {
		return left;
	}

	public void setLeft(Node<Key> left) {
		this.left = left;
	}

	public Node<Key> getRight() {
		return right;
	}

	public void setRight(Node<Key> right) {
		this.right = right;
	}

}
