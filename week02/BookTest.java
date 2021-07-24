package week02;

import java.util.Arrays;
public class BookTest {

	public static void main(String[] args) {
		Book b[]= {
				new Book("한림대학교", 1, 2010, 3, 15),
				new Book("IT 기술", 2, 2018, 8, 11 ),
				new Book("자바 프로그래밍", 3, 2011, 1, 1),
				new Book("C프로그래밍", 4, 1999, 12, 18),
				new Book("인공지능", 5, 2019, 2, 22),
				new Book("기계학습", 6, 2015, 9, 30),
				new Book("인간의 미래", 7, 2017, 5, 21),
		};
		
		System.out.println("비교 기준을 명시하지 않고 sort 호출");
		Arrays.sort(b);
		for(Book temp : b) {
			temp.print();
		}
		
		System.out.println("WithName을 기준으로 sort");
		Arrays.sort(b, Book.With_Title);
		for(Book temp : b) {
			temp.print();
		}
		
		System.out.println("WithSerial을 기준으로  sort");
		Arrays.sort(b, Book.With_Serial);
		for(Book temp : b) {
			temp.print();
		}
		
		System.out.println("WithDate를 기준으로 sort");
		Arrays.sort(b, Book.With_Date);
		for(Book temp : b) {
			temp.print();
		}
		
	}

}
