package week11;

public class Q6main {

	public static void main(String[] args) {
		Chaining<Integer, String> Ch = new Chaining<Integer, String>();

		Ch.put(25, "grape");
		Ch.put(37, "apple");
		Ch.put(18, "banana");
		Ch.put(55, "cherry");
		Ch.put(22, "mango");
		Ch.put(35, "lime");
		Ch.put(50, "orange");
		Ch.put(63, "watermelon");

		System.out.println("Ž�� ���:");
		System.out.println("50�� data = " + Ch.get(50));
		System.out.println("63�� data = " + Ch.get(63));
		System.out.println("37�� data = " + Ch.get(37));
		System.out.println("22�� data = " + Ch.get(22));
		System.out.println();

		Ch.print();
	}

}
