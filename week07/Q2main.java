package week07;

public class Q2main {
	public static void main(String[] args) {
		ListQueue<String> queue = new ListQueue<String>();
		queue.add("apple");		queue.add("orange");	
		queue.add("cherry");	queue.add("pear");		queue.print();
		queue.remove();			queue.print();
		queue.add("grape");		queue.print();
		queue.remove();			queue.print();
		queue.add("lemon");		queue.print();
		queue.add("mango");		queue.print();
		queue.add("lime");		queue.print();
		queue.add("kiwi");		queue.print();
		queue.remove();			queue.print();
	}
}
