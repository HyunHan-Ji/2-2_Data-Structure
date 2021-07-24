package week06;

public class Q3main {

	public static void main(String[] args) {
		String str1 = "(ant+bee)*crab+{[ant*food]+(offset)}/gas";
		String str2 = "(ant+bee)*crab+[ant*food]+(offset)}/gas";
		
		System.out.println(str1+": "+checkParentheses(str1));
		
		System.out.println(str2+": "+checkParentheses(str2));
	}

	public static boolean checkParentheses(String s) {
		ListStack<Character> ls=new ListStack<Character>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch=='(' || ch=='{') {
				ls.push(ch);
			}else if(ch==')'){
				if(ls.isEmpty() || ls.pop()=='{') {
					return false;
				}
			}else if(ch=='}'){
				if( ls.isEmpty() || ls.pop()=='(') {
					return false;
				}
			}		
		}
		if(!ls.isEmpty()) {
			return false;
		}
		return true;
	}
}
