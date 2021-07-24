package week02;

import java.util.Arrays;
public class BookTest {

	public static void main(String[] args) {
		Book b[]= {
				new Book("�Ѹ����б�", 1, 2010, 3, 15),
				new Book("IT ���", 2, 2018, 8, 11 ),
				new Book("�ڹ� ���α׷���", 3, 2011, 1, 1),
				new Book("C���α׷���", 4, 1999, 12, 18),
				new Book("�ΰ�����", 5, 2019, 2, 22),
				new Book("����н�", 6, 2015, 9, 30),
				new Book("�ΰ��� �̷�", 7, 2017, 5, 21),
		};
		
		System.out.println("�� ������ ������� �ʰ� sort ȣ��");
		Arrays.sort(b);
		for(Book temp : b) {
			temp.print();
		}
		
		System.out.println("WithName�� �������� sort");
		Arrays.sort(b, Book.With_Title);
		for(Book temp : b) {
			temp.print();
		}
		
		System.out.println("WithSerial�� ��������  sort");
		Arrays.sort(b, Book.With_Serial);
		for(Book temp : b) {
			temp.print();
		}
		
		System.out.println("WithDate�� �������� sort");
		Arrays.sort(b, Book.With_Date);
		for(Book temp : b) {
			temp.print();
		}
		
	}

}
