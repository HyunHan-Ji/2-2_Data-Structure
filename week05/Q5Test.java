package week05;

public class Q5Test {

	public static void main(String[] args) {
		System.out.println("[Task 1]");
		SList s = new SList();
		for (int i = 5; i > 0; i--) {
			s.insertFront(i);
		}
		s.print();
		System.out.println();
		
		System.out.println("[Task 2]");
		s.reverse();
		s.print();
	}

}
