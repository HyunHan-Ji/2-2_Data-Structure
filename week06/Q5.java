package week06_;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 1, 6, 8, 11 };			//���̰� N�� �迭(���� ������ ����)
		int arr2[] = new int[arr.length];		//arr2�� ���̰� ���� �迭, 
		int k = 4;								//����K (���� ��)

		int j = 0;								//arr2�� �ε���
		
		for (int i = 0; i < arr.length; i++) {	//k���� �۰ų� ���� ������ arr2�� ���� ����
			if (arr[i] <= 4) {
				arr2[j] = arr[i];
				j++;
			}
		}

		for (int i = 0; i < arr.length; i++) {	//k���� ū ������ arr2�� ���߿� ����
			if (arr[i] > 4) {
				arr2[j] = arr[i];
				j++;
			}
		}

		arr=arr2;								//arr�� arr2�� ����
		for (int temp : arr) {
			System.out.print(temp + " ");
		}
	}

}
