package week11;

public class Q5main {

	public static void main(String[] args) {
		DoubleHashing<Integer, String> DH = new DoubleHashing<Integer, String>();
		
		DH.put(25, "grape");
		DH.put(37, "apple");
		DH.put(18, "banana");
		DH.put(55, "cherry");
		DH.put(22, "mango");
		DH.put(35, "lime");
		DH.put(50, "orange");
		DH.put(63, "watermelon");
		
		System.out.println("탐색 결과:");
		System.out.println("50의 data = "+DH.get(50));
		System.out.println("63의 data = "+DH.get(63));
		
		DH.print();

	}

}
