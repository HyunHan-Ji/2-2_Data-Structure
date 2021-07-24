package week06;

public class Q5main {

	public static void main(String[] args) {
		String s1 = "A*(B+C/D)";
		System.out.println(s1 + ": " + getPostEq(s1));

		String s2 = "(A+B)*(C-D)";
		System.out.println(s2 + ": " + getPostEq(s2));

		String s3 = "A+B+C*(B+C*D)/D";
		System.out.println(s3 + ": " + getPostEq(s3));
	}

	public static String getPostEq(String s) {
		ListStack<Character> ls = new ListStack<Character>();
		String rt = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(' || ch == ')' || ch == '{'
					|| ch == '}')) {
				rt += ch;
			} else if (ch == '(') {
				ls.push(ch);
			} else if (ch == ')') {
				while (!ls.isEmpty()) {
					if (ls.peek() == '(') {
						ls.pop();
						break;
					}
					rt += ls.pop();
				}
			} else if (ch == '+' || ch == '-') {
				ls.push(ch);
			} else if (ch == '*' || ch == '/') {
				while (!ls.isEmpty()) {
					if (ls.peek() == '+' || ls.peek() == '-') {
						break;
					}
					rt += ls.pop();
				}
				ls.push(ch);
			}
		}
		while (!ls.isEmpty()) {
			rt += ls.pop();
		}
		return rt;
	}
}
