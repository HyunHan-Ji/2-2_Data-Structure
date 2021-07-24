package week11;

public class Q7main {
	public static void main(String[] args) {
		Chaining<Integer, Integer> ch = new Chaining<Integer, Integer>();

		System.out.println("[Task1]");
		for (int i = 0; i < 20; i++)
			ch.put(i, i);

		ch.print();

		System.out.println("[Task2]");
		for (int i = 0; i < 20; i++)
			ch.delete(i);

		ch.print();

	}
}
