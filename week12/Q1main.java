package week12;

import java.util.*;
import java.util.LinkedList;

public class Q1main {
	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,0},
				  {1,0,1,1},
				  {1,1,0,1},
				  {0,1,1,0}};
		Matrix2List ml= new Matrix2List(matrix);
		
		System.out.println("��������Ʈ�� �̿��� �׷���");
		ml.print();
	}
}