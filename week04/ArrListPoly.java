package week04;

import java.util.NoSuchElementException;

public class ArrListPoly extends ArrList {

	private int highestDegree;
	private int[] poly;

	public ArrListPoly() {
	}

	public ArrListPoly(int highestDegree, int[] poly) {
		this.highestDegree = highestDegree;
		this.poly = poly;
	}

	public int getHighestDegree() { // �ְ�����
		return highestDegree;
	}

	public void setHighestDegree(int highestDegree) {
		this.highestDegree = highestDegree;
	}

	public void setPoly(int highestDegree, int[] poly) {
		this.highestDegree = highestDegree;
		this.poly = poly;
	}

	public int[] getPoly() {
		return this.poly;
	}

	public ArrListPoly sumPoly(ArrListPoly poly2) {
		int a = this.poly.length - poly2.getPoly().length;// �� ������ ������ ��
		int[] longPoly;
		int[] shortPoly;

		if (a > 0) {// ��ü�� ������ ���̰� �Ű������� ������ ���̺��� �涧
			longPoly = this.poly;
			shortPoly = poly2.getPoly();
		} else {
			longPoly = poly2.getPoly();
			shortPoly = this.poly;
		}

		for (int i = 0; i < shortPoly.length; i++) {
			longPoly[i] += shortPoly[i];
		}

		return new ArrListPoly(longPoly.length - 1, longPoly);
	}
	public Object peek(int k) {
		if (poly.length == 0 || k >= poly.length)
			throw new NoSuchElementException();
		return poly[k];
	}
}
