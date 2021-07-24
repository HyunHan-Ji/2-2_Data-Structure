package week05;

import java.util.NoSuchElementException;

public class CList<E> {
	private Node last;
	private int size;

	public CList() {
		last = null;
		size = 0;
	}

	public void insert(E newItem) {
		Node newNode = new Node(newItem, null);
		if (last == null) {
			newNode.setNext(newNode);
			last = newNode;
		} else {
			newNode.setNext(last.getNext());
			last.setNext(newNode);
		}
		size++;
	}

	public Node delete() {
		if (isEmpty())
			throw new NoSuchElementException();
		Node x = last.getNext();
		if (x == last)
			last = null;
		else {
			last.setNext(x.getNext());
			x.setNext(null);
		}
		size--;
		return x;
	}

	public void print() {
		Node node = last.getNext();
		while (true) {
			System.out.print(node.getItem() + "\t");

			if (node == last) {
				break;
			}
			node = node.getNext();
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (last == null)
			return true;
		return false;
	}

	public void rotateLeft(int n) {
		for (int i = 0; i < n; i++)
			last = last.getNext();
	}

	public void rotateRight(int n) {
		for (int i = 0; i < n; i++) {
			Node node = last;
			while (true) {
				if (node.getNext() == last) {
					last = node;
					break;
				}
				node = node.getNext();
			}
		}

	}
}
