package week14;

import java.util.Arrays;

public class Q3main {

	public static void main(String[] args) {
		GenData GD = new GenData();
		Selection s = new Selection();

		int arr[] = GD.getRandIntArr(10, 0, 100);
		System.out.println("Before : " + Arrays.toString(arr));

		Integer[] arr2 = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++)
			arr2[i] = arr[i];
		s.sort(arr2);

		System.out.println("After : " + Arrays.toString(arr2));
	}

}
