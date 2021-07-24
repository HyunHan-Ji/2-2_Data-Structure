package week11;

public class Q2main {

	public static void main(String[] args) {
		LinearProbing2<Integer, Integer> LP2 = new LinearProbing2<Integer, Integer>();

		LP2.put(25, 25);
		LP2.put(37, 37);
		LP2.put(18, 18);
		LP2.put(55, 55);
		LP2.put(22, 22);
		LP2.put(35, 35);
		LP2.put(50, 50);
		LP2.put(63, 63);

		LP2.print();

		System.out.println("63ÀÇ data: " + LP2.get(63));

		LP2.delete(50);

		LP2.print();

		System.out.println("63ÀÇ data: " + LP2.get(63));
	}

}
