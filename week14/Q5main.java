package week14;

import java.util.Arrays;

public class Q5main {

	public static void main(String[] args) {
		GenData GD = new GenData();
		Merge m = new Merge();

		int arr[] = GD.getRandIntArr(10, 0, 100);
		System.out.println("Before : " + Arrays.toString(arr));

		Integer[] arr2 = new Integer[arr.length];
		for (int i = 0; i < arr.length; i++)
			arr2[i] = arr[i];
		m.sort(arr2);

		System.out.println("After : " + Arrays.toString(arr2));
	}

}