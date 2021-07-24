package week06;

public class Q4main {
	public static void main(String[] args) {
		String s1 = "redivider";
		System.out.println(s1 +": "+ checkPalindrome(s1));
		
		String s2 = "redder";
		System.out.println(s2 +": "+checkPalindrome(s2));
		
		String s3 = "a";
		System.out.println(s3 +": "+checkPalindrome(s3));
		
		String s4 = "abbd";
		System.out.println(s4 +": "+checkPalindrome(s4));
		
		String s5 = "koxko";
		System.out.println(s5 +": "+checkPalindrome(s5));
	}

	public static boolean checkPalindrome(String s) {
		ListStack<Character> ls = new ListStack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if(i<s.length()/2) {
				ls.push(ch);
				continue;
			}
			
			if(s.length()%2==1 && i==s.length()/2) {
				continue;
			}
			
			if(ls.pop() != ch) {
				return false;
			}
		}
		return true;
	}

}
