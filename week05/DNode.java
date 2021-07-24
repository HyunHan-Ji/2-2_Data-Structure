package week05;

public class DNode<E> {
	private E item;
	private DNode Previous;
	private DNode next;

	public DNode(E newItem, DNode p, DNode q) {
		item = newItem;
		Previous = p;
		next = q;
	}

	public E getItem() {
		return item;
	}

	public DNode getPrevious() {
		return Previous;
	}

	public DNode getNext() {
		return next;
	}

	public void setItem(E newItem) {
		this.item = newItem;
	}

	public void setPrevious(DNode p) {
		Previous = p;
	}

	public void setNext(DNode q) {
		this.next = q;
	}

}
