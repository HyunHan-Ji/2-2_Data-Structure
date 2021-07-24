package week10;

public class Q2main {
	public static void main(String[] args) {
		BST<Integer, Integer> bst2 = new BST<>(60, 60);
		bst2.put(10, 10);
		bst2.put(20, 20);
		bst2.put(25, 25);
		bst2.put(30, 30);
		bst2.put(35, 35);
		bst2.put(40, 40);
		bst2.put(45, 45);
		bst2.put(50, 50);
		bst2.put(60, 60);
		bst2.put(70, 70);
		bst2.print();

		bst2.deleteMax();
		bst2.print();
		bst2.deleteMax();
		bst2.print();
		bst2.deleteMax();
		bst2.print();

	}
}
