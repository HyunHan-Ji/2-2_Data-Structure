package week14;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		GenData GD = new GenData();
		int[] nums = GD.getRandIntArr(10, 0, 100);
		System.out.println("Before : " + Arrays.toString(nums));
		int[] sorted_nums = doSort(nums);
		System.out.println("After : " + Arrays.toString(sorted_nums));

	}

	public static int[] doSort(int[] arr) {
		int temp = 0;
		for (int end = arr.length - 1; end > 0; end--)
			for (int i = 0; i < end; i++)
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
		return arr;
	}
}
