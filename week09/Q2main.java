package week09;

public class Q2main {

	public static void main(String[] args) {
		System.out.println("[Task 1]");
		BinaryTree<Integer> t1 = new BinaryTree<Integer>();
		t1.setRoot(
				new Node(100,
						new Node(200,
								new Node(400,
										new Node(800, null, null), null),
								new Node(500, null, null)),
						new Node(300,
								new Node(600, null, null),
								new Node(700, null, null))));

		int arr[] = t1.btree2intarr();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("[Task 2]");
		BinaryTree<Integer> tNew = new BinaryTree<Integer>();
		tNew.intarr2btree(arr);
		tNew.levelorder(tNew.getRoot());
	}

}
