package week06_;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 1, 6, 8, 11 };			//길이가 N인 배열(임의 값으로 저장)
		int arr2[] = new int[arr.length];		//arr2와 길이가 같은 배열, 
		int k = 4;								//정수K (임의 값)

		int j = 0;								//arr2의 인덱스
		
		for (int i = 0; i < arr.length; i++) {	//k보다 작거나 같은 값들을 arr2에 먼저 저장
			if (arr[i] <= 4) {
				arr2[j] = arr[i];
				j++;
			}
		}

		for (int i = 0; i < arr.length; i++) {	//k보다 큰 값들을 arr2에 나중에 저장
			if (arr[i] > 4) {
				arr2[j] = arr[i];
				j++;
			}
		}

		arr=arr2;								//arr에 arr2를 대입
		for (int temp : arr) {
			System.out.print(temp + " ");
		}
	}

}
