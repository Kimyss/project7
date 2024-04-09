package array;
/*
 * 2차원 배열 만들기
 * */

public class Ex7 {

	public static void main(String[] args) {

//		2차원 배열 생성 및 초기화
		int[][] arr = { { 2, 4, 6 }, { 3, 6, 9 } };
//		위와같음	
		int[][] arr1 = new int[2][3];

//		i는 행 index(0~1) j는 열 index(0~2)
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		// 배열의 인덱스를 출력
//				for(int i=0; i<arr.length; i++){ //행
//					for(int j=0; j<arr[i].length; j++){ //열
//						System.out.print("["+i+","+j+"] ");
//					}
//					System.out.println();
//				}
	}

}
