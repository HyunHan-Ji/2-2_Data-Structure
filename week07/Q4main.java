package week07;

public class Q4main {

	public static void main(String[] args) {
		System.out.println("[Task 1]");
		ListQueue<Character> queue = new ListQueue<Character>();
		queue.add('E');
		queue.add('D');
		queue.add('C');
		queue.add('B');
		queue.add('A');
		queue.print();

		queue.reverse();
		queue.print();
		
		
		System.out.println("[Task 2]");
		ListQueue<Integer> queue2 = new ListQueue<Integer>();
		queue2.add(1);
		queue2.add(2);
		queue2.add(3);
		queue2.add(4);
		queue2.add(5);
		queue2.print();

		queue2.reverse();
		queue2.print();
	}
}
