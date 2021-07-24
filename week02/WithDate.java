package week02;

import java.util.Comparator;

public class WithDate implements Comparator<Book> {
	public int compare(Book b1, Book b2) {
		if(b1.yyyy-b2.yyyy != 0) {
			return b1.yyyy-b2.yyyy;
		}else if(b1.mm - b2.mm != 0) {
			return b1.mm - b2.mm;
		}else {
			return b1.dd - b2.dd;
		}
	}
}
