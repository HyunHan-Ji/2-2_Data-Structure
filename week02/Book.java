package week02;

import java.util.Comparator;

public class Book implements Comparable<Book> {
	public static final Comparator<Book> With_Title = new WithTitle();
	public static final Comparator<Book> With_Serial = new WithSerial();
	public static final Comparator<Book> With_Date = new WithDate();
	
	String title;
	int serial;
	int yyyy;
	int mm;
	int dd;
	
	public Book(String title, int serial, int yyyy, int mm, int dd) {
		this.title = title;
		this.serial = serial;
		this.yyyy = yyyy;
		this.mm = mm;
		this.dd = dd;
	}

	public String getTitle() {
		return title;
	}
	public int getSerial() {
		return serial;
	}
	public int getYyyy() {
		return yyyy;
	}
	public int getMm() {
		return mm;
	}
	public int getDd() {
		return dd;
	}


	public int compareTo(Book o) {
		return this.getTitle().compareTo(o.getTitle());
	}
	
	public void print() {
		System.out.printf("%-11s\t%d\t%d\t%d\t%d\n", title, serial, yyyy, mm, dd);
	}
}
