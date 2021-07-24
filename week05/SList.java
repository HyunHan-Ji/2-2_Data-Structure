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
				if (arr[i] > (int) node.getItem() && node.getNext() == null) { // 마지막 노드보다 클때
					insertAfter(arr[i], node);
				} else if (arr[i] > (int) node.getItem() && arr[i] <= (int) node.getNext().getItem()) {// 노드의 아이템과 다음노드의
																										// 아이템의 사이일때
					insertAfter(arr[i], node);
				} else if (arr[i] < (int) head.getItem()) { // 첫노드보다 작을때
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
				if ((int) node2.getItem() > (int) node.getItem() && node.getNext() == null) { // 마지막 노드보다 클때
					insertAfter((int) node2.getItem(), node);
				} else if ((int) node2.getItem() > (int) node.getItem()
						&& (int) node2.getItem() <= (int) node.getNext().getItem()) {// 노드의 아이템과 다음노드의 아이템의 사이일때
					insertAfter((int) node2.getItem(), node);
				} else if ((int) node2.getItem() < (int) head.getItem()) { // 첫노드보다 작을때
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
		for (int i = 0; i < size; i++) { // 기존 리스트를 배열에 저장
			arr[i] = (int) node.getItem();
			node = node.getNext();
		}

		while (true) { // 리스트삭제
			if (head == null) {
				break;
			}
			deleteFront();
		}

		for (int i = 0; i < arr.length; i++) { // 역으로 리스트 생성
			insertFront(arr[i]);
		}
	}
}
