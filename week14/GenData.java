package week14;

import java.util.Random;

public class GenData {
	int[] getRandIntArr(int N, int min, int max) {
		if (min < 1)
			min = 1;
		Random random = new Random();
		int[] intarr = new int[N];
		for (int i = 0; i < N; i++) {
			intarr[i] = random.nextInt(max - min) + min;
		}
		return intarr;
	}
}
