package week02;

public class FindPath {
	public static void main(String[] args) {
		// 0000 = no path
		// 1000 = go left
		//  100 = go right
		//   10 = go up
		//    1 = down
		int[][] map1 = { {  0,  100, 0},
						 {100,   10, 0},
						 { 10,    0, 0}}; 
		int[][] map2 = { {  0, 1000, 0},
				 		 {100,   10, 0},
		 				 { 10,    0, 0}};
		
		//��ũ��
		final int nROW = 3;		
		final int nCOL = 3;
		//���� ��ǥ
		int startX = 0;
		int startY = 2;
		//���� ��ǥ
		int endX = 2;
		int endY = 0;
		
		System.out.println("map1");
		if( findpath(map1, nROW, nCOL, startX, startY, endX, endY) > 0 ) System.out.println("I found a path!");
		else System.out.println("There is no such a path");
		
		System.out.println("map2");
		if( findpath(map2, nROW, nCOL, startX, startY, endX, endY) > 0 ) System.out.println("I found a path!");
		else System.out.println("There is no such a path");
	}
	public static int findpath(int[][] map, int nROW, int nCOL, int startX, int startY, int endX, int endY) {
		// 0�� ���� : �����.
		// 0���� ū ��� ���� : �� ���� (success)
		
		// base case : ���̻� ��� ȣ�� ����
		// 1. ������ ����
		if( startX == endX && startY == endY ) return 1;
		// 2. ���� ���
		if( startX < 0 || startX >= nCOL ) return 0;
		if( startY < 0 || startY >= nROW ) return 0;
		
		
		int a=0;
		// rec case : ���� �ѹ� �� �θ�
		if( map[startY][startX] == 1000 ) // left 
			a = findpath(map, nROW, nCOL, startX-1, startY, endX, endY);
		if( map[startY][startX] == 100 ) // right
			a = findpath(map, nROW, nCOL, startX+1, startY, endX, endY);
		if( map[startY][startX] == 10 ) // up 
			a = findpath(map, nROW, nCOL, startX, startY-1, endX, endY);
		if( map[startY][startX] == 1 ) // down 
			a = findpath(map, nROW, nCOL, startX, startY+1, endX, endY);
		
		return a;
	}
	
}
