package week11;

public class Q4main {

	public static void main(String[] args) {
		RandProbing<Integer, String> RP = new RandProbing<Integer, String>();

		RP.put(25, "grape");
		RP.put(37, "apple");
		RP.put(18, "banana");
		RP.put(55, "cherry");
		RP.put(22, "mango");
		RP.put(35, "lime");
		RP.put(50, "orange");
		RP.put(63, "watermelon");
		
		System.out.println("탐색 결과:");
		System.out.println("50의 data = "+RP.get(50));
		System.out.println("63의 data = "+RP.get(63));
		
		RP.print();
	}

}
