package week05;

import java.util.NoSuchElementException;

public class SList<E> {
	protected Node head;
	private int size;

	public SList() {
		head = null;
		size = 0;
	}

	public int search(E target) {
		Node p = head;
		for (int k = 0; k < size; k++) {
			if (target == p.getItem())
				return k;
			p = p.getNext();
		}
		return -1;
	}

	public void insertFront(E newItem) {
		head = new Node(newItem, head);
		size++;
	}

	public void insertFront(int newItem) {
		head = new Node(newItem, head);
		size++;
	}

	public void insertAfter(E newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}

	public void insertAfter(int newItem, Node p) {
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}

	public void deleteFront() {
		if (size == 0)
			throw new NoSuchElementException();
		head = head.getNext();
		size--;
	}

	public void deleteAfter(Node p) {
		if (p == null)
			throw new NoSuchElementException();
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
	}

	public void print() {
		Node node = head;
		while (true) {
			System.out.print(node.getItem() + "\t");

			if (node.getNext() == null) {
				break;
			}
			node = node.getNext();
		}

	}

	public int size() {
		return size;
	}

	public void setAndOrderNodes(int[] arr) {
		if (arr != null) {
			while (true) {
				if (head == null) {
					break;
				}
				deleteFront();
			}
		}

		insertFront(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			Node node = head;
			for (int j = 0; j < size; j++) {
				if (arr[i] > (int) node.getItem() && node.getNext() == null) { // ������ ��庸�� Ŭ��
					insertAfter(arr[i], node);
				} else if (arr[i] > (int) node.getItem() && arr[i] <= (int) node.getNext().getItem()) {// ����� �����۰� ���������
																										// �������� �����϶�
					insertAfter(arr[i], node);
				} else if (arr[i] < (int) head.getItem()) { // ù��庸�� ������
					insertFront(arr[i]);
				}

				if (node.getNext() != null) {
					node = node.getNext();
				}
			}

		}

	}

	public void join(SList slist2) {
		Node node2 = slist2.head;
		for (int i = 0; i < slist2.size; i++) {
			Node node = head;
			for (int j = 0; j < size; j++) {
				if ((int) node2.getItem() > (int) node.getItem() && node.getNext() == null) { // ������ ��庸�� Ŭ��
					insertAfter((int) node2.getItem(), node);
				} else if ((int) node2.getItem() > (int) node.getItem()
						&& (int) node2.getItem() <= (int) node.getNext().getItem()) {// ����� �����۰� ��������� �������� �����϶�
					insertAfter((int) node2.getItem(), node);
				} else if ((int) node2.getItem() < (int) head.getItem()) { // ù��庸�� ������
					insertFront((int) node2.getItem());
				}

				if (node.getNext() != null) {
					node = node.getNext();
				}
			}
			node2 = node2.getNext();
		}
	}

	public void reverse() {
		int arr[] = new int[size];
		Node node = head;
		for (int i = 0; i < size; i++) { // ���� ����Ʈ�� �迭�� ����
			arr[i] = (int) node.getItem();
			node = node.getNext();
		}

		while (true) { // ����Ʈ����
			if (head == null) {
				break;
			}
			deleteFront();
		}

		for (int i = 0; i < arr.length; i++) { // ������ ����Ʈ ����
			insertFront(arr[i]);
		}
	}
}
