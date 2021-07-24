package week11;

public class Q1main {

	public static void main(String[] args) {
		LinearProbing<Integer, String> LP = new LinearProbing<Integer, String>();
		
		LP.put(25, "grape");
		LP.put(37, "apple");
		LP.put(18, "banana");
		LP.put(55, "cherry");
		LP.put(22, "mango");
		LP.put(35, "lime");
		LP.put(50, "orange");
		LP.put(63, "watermelon");
		
		System.out.println("탐색 결과:");
		System.out.println("50의 data = "+LP.get(50));
		System.out.println("63의 data = "+LP.get(63));
		
		LP.print();
	}

}
