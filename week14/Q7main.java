package week14;

public class Q7main {

	public static void main(String[] args) {
		GenData GD = new GenData();

		int arr1[] = GD.getRandIntArr(10000, 0, 10000);

		Integer[] arr2 = new Integer[arr1.length];
		for (int i = 0; i < arr1.length; i++)
			arr2[i] = arr1[i];
		Integer[] arr3 = arr2;
		Integer[] arr4 = arr2;
		Integer[] arr5 = arr2;

		BubbleSort b = new BubbleSort();
		long beforeTime = System.currentTimeMillis();
		b.doSort(arr1);
		long afterTime = System.currentTimeMillis();
		long diffTimeMilliSecond = afterTime - beforeTime;
		System.out.println("[Bubble] Time diff (ms): " + diffTimeMilliSecond);

		Selection s = new Selection();
		beforeTime = System.currentTimeMillis();
		s.sort(arr2);
		afterTime = System.currentTimeMillis();
		diffTimeMilliSecond = afterTime - beforeTime;
		System.out.println("[Selection] Time diff (ms): " + diffTimeMilliSecond);

		Insertion is = new Insertion();
		beforeTime = System.currentTimeMillis();
		is.sort(arr3);
		afterTime = System.currentTimeMillis();
		diffTimeMilliSecond = afterTime - beforeTime;
		System.out.println("[Insertion] Time diff (ms): " + diffTimeMilliSecond);

		Merge m = new Merge();
		beforeTime = System.currentTimeMillis();
		m.sort(arr4);
		afterTime = System.currentTimeMillis();
		diffTimeMilliSecond = afterTime - beforeTime;
		System.out.println("[Merge] Time diff (ms): " + diffTimeMilliSecond);

		beforeTime = System.currentTimeMillis();
		Quick q = new Quick();
		q.sort(arr5);
		afterTime = System.currentTimeMillis();
		diffTimeMilliSecond = afterTime - beforeTime;
		System.out.println("[Quick] Time diff (ms): " + diffTimeMilliSecond);

	}

}
