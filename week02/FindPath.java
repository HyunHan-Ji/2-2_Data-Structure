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
		
		//맵크기
		final int nROW = 3;		
		final int nCOL = 3;
		//시작 좌표
		int startX = 0;
		int startY = 2;
		//도착 좌표
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
		// 0을 리턴 : 길없음.
		// 0보다 큰 양수 리턴 : 길 있음 (success)
		
		// base case : 더이상 재귀 호출 없음
		// 1. 목적지 도달
		if( startX == endX && startY == endY ) return 1;
		// 2. 지도 벗어남
		if( startX < 0 || startX >= nCOL ) return 0;
		if( startY < 0 || startY >= nROW ) return 0;
		
		
		int a=0;
		// rec case : 나를 한번 더 부름
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
