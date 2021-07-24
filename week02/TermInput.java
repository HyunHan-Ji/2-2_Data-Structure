package week02;

import java.util.*;

public class TermInput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String input = sc.next();
		System.out.printf("you entered: %d\n", Integer.parseInt(input));
		sc.close();
		
		int num[]=new int[100];
		for (int i=0;i<100;i++) {
			num[i]=i+1;
		}
		
		sum(num, input);	
	}
	
	
	static void sum(int num[],String input) {
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				for(int k=j+1;k<num.length;k++) {
					if(Integer.parseInt(input) == num[i]+num[j]+num[k]) {
						System.out.printf("%d %d %d",num[i], num[j], num[k]);
						return;
					}
				}
			}
		}
		
		System.out.println("찾을 수 없음");
		return;
	}
}