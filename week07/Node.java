package week07;

public class Node<E> {
	private E item;
	private Node<E> next;

	public Node(E newitem, Node<E> node) {
		item = newitem;
		next = node;
	}

	public E getItem() {
		return item;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setItem(E newitem) {
		this.item = newitem;
	}

	public void setNext(Node<E> newnext) {
		this.next = newnext;
	}

}