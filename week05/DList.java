package week05;

import java.util.NoSuchElementException;

public class DList<E> {
	protected DNode head, tail;
	protected int size;

	public DList() {
		head = new DNode(null, null, null);
		tail = new DNode(null, head, null);
		head.setNext(tail);
		size = 0;
	}

	public void insertBefore(DNode p, E newItem) {
		DNode t = p.getPrevious();
		DNode newNode = new DNode(newItem, t, p);
		p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}

	public void insertAfter(DNode p, E newItem) {
		DNode t = p.getNext();
		DNode newNode = new DNode(newItem, p, t);

		t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}

	public void delete(DNode x) {
		if (x == null)
			throw new NoSuchElementException();
		if (size <= 0)
			throw new NoSuchElementException();
		DNode f = x.getPrevious();
		DNode r = x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
	}

	public void print() {
		DNode node = head.getNext();
		while (true) {
			if (node.getItem() == null) {
				System.out.println("리스트 비어있음");
				return;
			}
			System.out.print(node.getItem() + "\t");

			if (node.getNext().getNext() == null) {
				break;
			}
			node = node.getNext();
		}
		System.out.println();
	}

	public int add(DList dl2) {
		return list_to_num(this) + list_to_num(dl2);
	}

	public int list_to_num(DList dlist) {
		int num = 0;
		DNode node = dlist.head.getNext();
		for (int i = dlist.size; i > 0; i--) {
			num += (int) node.getItem() * Math.pow(10, i - 1);
			node = node.getNext();
		}
		return num;
	}
}
