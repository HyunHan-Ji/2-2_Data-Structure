package week09;

public class BinaryTreeTest {

	public static void main(String[] args) {
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

		BinaryTree<Integer> t2 = t1;

		System.out.println("트리 노드 수= " + t1.size(t1.getRoot()));
		System.out.println("트리 높이 = " + t1.height(t1.getRoot()));

		System.out.print("전위 순회: ");
		t1.preorder(t1.getRoot());
		System.out.println();

		System.out.print("중위 순회: ");
		t1.inorder(t1.getRoot());
		System.out.println();

		System.out.print("후위 순회: ");
		t1.postorder(t1.getRoot());
		System.out.println();

		System.out.print("레벨 순회: ");
		t1.levelorder(t1.getRoot());
		System.out.println();

		System.out.println("동일성 검사: " + BinaryTree.isEqual(t1.getRoot(), t2.getRoot()));
	}

}
