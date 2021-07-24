package week06;

public class Q6main {

	public static void main(String[] args) {
		String[] str1 = { "81", "37", "-211", "+", "15", "-", "/" };
		for(String temp:str1) {
			System.out.print(temp+" ");
		}
		System.out.println(": "+calc(str1));

		String[] str2 = { "20.5", "10.2", "+", "10", "*" };//피연산자가 부족해서 10을 추가함
		for(String temp:str2) {
			System.out.print(temp+" ");
		}
		System.out.println(": "+calc(str2));
	}

	public static double calc(String[] s) {
		ListStack<Double> ls = new ListStack<Double>();
		for (int i = 0; i < s.length; i++) {
			String ch = s[i];
			if (ch == "+" || ch == "-" || ch == "*" || ch == "/") {
				double a = ls.pop();
				double b = ls.pop();
				ls.push(cal(a, b, ch)); 
			} else {
				ls.push(Double.parseDouble(ch));
			}
		}

		return ls.pop();
	}

	public static double cal(double a, double b, String ch) {
		if (ch.equals("+")) {
			return a + b;
		} else if (ch.equals("-")) {
			return a - b;
		} else if (ch.equals("*")) {
			return a * b;
		} else if (ch.equals("/")) {
			return a / b;
		} else {
			System.out.println("연산자 입력 오류");
			return 0;
		}
	}
}
