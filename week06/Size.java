package week06_;

public class Size {
	public static void main(String[] args) {
		System.out.printf("char의 크기는 %d바이트 입니다.\n", Character.SIZE/8);
		System.out.printf("int의 크기는 %d바이트 입니다.\n", Integer.SIZE/8);
		System.out.printf("long크기는 %d바이트 입니다.\n", Long.SIZE/8);
		System.out.printf("float의 크기는 %d바이트 입니다.\n", Float.SIZE/8);
		System.out.printf("double의 크기는 %d바이트 입니다.\n", Double.SIZE/8);
	}
}
