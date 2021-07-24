package week04;

public class TimeMeasure {

	public static void main(String[] args) {
		int[] arr = new int[300];
		for(int i=0 ; i < arr.length ; i++) arr[i] = 0;
		
		long beforeTime = System.currentTimeMillis();
		fConstant(arr);
		long afterTime = System.currentTimeMillis();
		long diffTimeMillSecond = afterTime-beforeTime;
		System.out.println("상수시간\tTime diff: " + diffTimeMillSecond);
		
		beforeTime = System.currentTimeMillis();
		fLinear(arr);
		afterTime = System.currentTimeMillis();
		diffTimeMillSecond = afterTime-beforeTime;
		System.out.println("선형시간\tTime diff: " + diffTimeMillSecond);
		
		beforeTime = System.currentTimeMillis();
		fQuadratic(arr);
		afterTime = System.currentTimeMillis();
		diffTimeMillSecond = afterTime-beforeTime;
		System.out.println("제곱시간\tTime diff: " + diffTimeMillSecond);
		
		beforeTime = System.currentTimeMillis();
		fCubic(arr);
		afterTime = System.currentTimeMillis();
		diffTimeMillSecond = afterTime-beforeTime;
		System.out.println("세제곱시간\tTime diff: " + diffTimeMillSecond);
		
		beforeTime = System.currentTimeMillis();
		fFourth(arr);
		afterTime = System.currentTimeMillis();
		diffTimeMillSecond = afterTime-beforeTime;
		System.out.println("네제곱시간\tTime diff: " + diffTimeMillSecond);
	}
	
	public static int fConstant(int[] arr) {
		return arr.length * 2; 
	}
	
	public static int fLinear(int[] arr) {
		int totalSum = 0;
		for (int n : arr) {
			totalSum += n;
		}
		return totalSum;
	}
	
	public static void fQuadratic(int[] arr) {
		int target = 30;
		for (int first : arr) {
			for(int second : arr) {
				if(first + second == target) {
					return;
				}
			}
		}
		return;
	}
	
	public static void fCubic(int[] arr) {
		int target = 30;
		for (int first : arr) {
			for(int second : arr) {
				for(int third : arr) {
					if(first + second + third == target) {
						return;
					}
				}
			}
		}
		return;
	}
	
	public static void fFourth(int[] arr) {
		for(int i=0 ; i < arr.length ; i++) {
			for(int j=0 ; j < arr.length ; j++) {
				for(int k=0 ; k < arr.length ; k++) {
					for(int l=0 ; l < arr.length ; l++) {
						arr[i]+=i+j+k+l;
					}
				}
			}
		}
	}
}
