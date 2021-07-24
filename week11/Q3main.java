package week11;

public class Q3main {

	public static void main(String[] args) {
		QuadProbing<Integer, String> QP = new QuadProbing<Integer, String>();

		QP.put(25, "grape");
		QP.put(37, "apple");
		QP.put(18, "banana");
		QP.put(55, "cherry");
		QP.put(22, "mango");
		QP.put(35, "lime");
		QP.put(50, "orange");
		QP.put(63, "watermelon");
		
		System.out.println("탐색 결과:");
		System.out.println("50의 data = "+QP.get(50));
		System.out.println("63의 data = "+QP.get(63));
		
		QP.print();
	}

}
