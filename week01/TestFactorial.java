package week01;

public class TestFactorial {

	public static void main(String[] args) {
		FactorialRecursive FR= new FactorialRecursive();
		System.out.printf("재귀 함수를 사용한 10! = %d\n",FR.function(10));
		System.out.printf("재귀 함수를 사용한  5! = %d\n",FR.function(5));
		
		FactorialLoop FL = new FactorialLoop();
		System.out.printf("루프를 사용한 10! = %d\n",FL.loop(10));
		System.out.printf("루프를 사용한  5! = %d",FL.loop(5));
	}

}
