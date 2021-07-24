package week05;

public class Q4Test {

	public static void main(String[] args) {
		System.out.println("[Task 1]");
		SList slist1 = new SList();
		int[] task1 = { 7, 11, 4, 1, 8 };
		slist1.setAndOrderNodes(task1);
		slist1.print();
		System.out.println();

		System.out.println("[Task 2]");
		SList slist2 = new SList();
		int[] task2 = { 5, 2, 8, 7, 13 };
		slist2.setAndOrderNodes(task2);
		slist2.print();
		System.out.println();
		
		System.out.println("[Task 3]");
		slist1.join(slist2);
		slist1.print();
	}

}
