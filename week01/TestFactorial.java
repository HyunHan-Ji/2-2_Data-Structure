package week01;

public class TestFactorial {

	public static void main(String[] args) {
		FactorialRecursive FR= new FactorialRecursive();
		System.out.printf("��� �Լ��� ����� 10! = %d\n",FR.function(10));
		System.out.printf("��� �Լ��� �����  5! = %d\n",FR.function(5));
		
		FactorialLoop FL = new FactorialLoop();
		System.out.printf("������ ����� 10! = %d\n",FL.loop(10));
		System.out.printf("������ �����  5! = %d",FL.loop(5));
	}

}
