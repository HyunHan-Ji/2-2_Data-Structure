package week10;

public class Q1main {

	public static void main(String[] args) {
		BST<Integer, Integer> bst1 = new BST<>(60, 60);
		bst1.put(10, 10);
		bst1.put(20, 20);
		bst1.put(25, 25);
		bst1.put(30, 30);
		bst1.put(35, 35);
		bst1.put(40, 40);
		bst1.put(45, 45);
		bst1.put(50, 50);
		bst1.put(60, 60);
		bst1.put(70, 70);

		bst1.print();

		System.out.printf("Searching for %d yields : %d\n", 45, bst1.get(45));

		bst1.put(45, 99);
		System.out.printf("Searching for %d yields : %d\n", 45, bst1.get(45));

		System.out.println("Min value: " + bst1.min());

		bst1.deleteMin();
		System.out.println("Min value: " + bst1.min());

		bst1.delete(25);
		bst1.delete(35);
		bst1.delete(45);
		bst1.print();
	}

}
