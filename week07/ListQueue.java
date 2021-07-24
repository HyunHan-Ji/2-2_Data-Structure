package week07;

import java.util.NoSuchElementException;

public class ListQueue<E> {
	private Node<E> front, rear;
	private int size;

	public ListQueue() {
		front = rear = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if (isEmpty())
			front = newNode;
		else
			rear.setNext(newNode);
		rear = newNode;
		size++;
	}
	
	public void add(int temp) {
		Node newNode = new Node(temp, null);
		if (isEmpty())
			front = newNode;
		else
			rear.setNext(newNode);
		rear = newNode;
		size++;
	}

	public E remove() {
		if (isEmpty())
			throw new NoSuchElementException();
		E frontItem = front.getItem();
		front = front.getNext();
		size--;
		if (isEmpty())
			rear = null;
		return frontItem;
	}

	public void print() {
		Node node = front;
		while (true) {
			System.out.print(node.getItem() + "\t");
			if (node == rear)
				break;
			node = node.getNext();
		}
		System.out.println();
	}

	
	public double avg() {
		double sum = 0;
		int temp;
		for (int i = 0; i < size; i++) {
			sum += temp = (int) remove();
			add(temp);
		}
		return sum / size;
	}

	public void reverse() {
		ListStack<E> stack = new ListStack<E>();

		while (true) {
			if (isEmpty())
				break;
			stack.push(remove());
		}

		while (true) {
			if (stack.isEmpty())
				break;
			add(stack.pop());
		}

	}

	public Node<E> getFront() {
		return front;
	}

	public Node<E> getRear() {
		return rear;
	}
}
