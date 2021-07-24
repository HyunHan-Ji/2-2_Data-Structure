package week05;

public class Q6Test {

	public static void main(String[] args) {
		System.out.println("[Tast 1]");
		DList dl1= new DList();
		dl1.insertBefore(dl1.tail, 1);
		dl1.insertBefore(dl1.tail, 2);
		dl1.insertBefore(dl1.tail, 3);
		dl1.print();
		
		System.out.println("[Tast 2]");
		DList dl2= new DList();
		dl2.insertBefore(dl2.tail, 6);
		dl2.insertBefore(dl2.tail, 7);
		dl2.insertBefore(dl2.tail, 8);
		dl2.insertBefore(dl2.tail, 9);
		dl2.print();
		
		System.out.println("[Tast 3]  dl1.add(dl2)");
		System.out.println(dl1.add(dl2));
		
		System.out.println("[Tast 3]  dl2.add(dl1)");
		System.out.println(dl2.add(dl1));
	}

}
