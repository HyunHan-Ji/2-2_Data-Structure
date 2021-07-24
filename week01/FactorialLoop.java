package week01;

public class FactorialLoop {

	public int loop(int n) {
		int a=1;
		
		for (int i=n;i>0;i--) {
			a*=i;
		}
		return a;
	}
}
