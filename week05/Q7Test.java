package week05;

public class Q7Test {

	public static void main(String[] args) {
		System.out.println("[Task 1]");
		CList cl1 = new CList();
		cl1.insert(4);
		cl1.insert(3);
		cl1.insert(2);
		cl1.insert(1);
		cl1.print();
		System.out.println();
		
		CList cl2 = new CList();
		cl2.insert(4);
		cl2.insert(3);
		cl2.insert(2);
		cl2.insert(1);
		cl2.print();
		System.out.println();
		
		//System.out.println("[Tast 2]");
		cl1.rotateLeft(1);
		cl2.rotateRight(1);
		
		System.out.println("[Tast 3]");
		cl1.print();
		System.out.println();
		cl2.print();

	}

}
