package week14;

public class GenDataTest {

	public static void main(String[] args) {
		GenData GD = new GenData();

		System.out.println("[Task 1]");
		int arr[] = GD.getRandIntArr(5, 0, 10);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		System.out.println("\n[Task 2]");
		arr = GD.getRandIntArr(10, 0, 100);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
