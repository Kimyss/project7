package array;

public class Ex4 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		람다식 for문
//		배열에서 꺼낸 값으 저장할 변수 : 배열
		
		for(int value : arr) {		//조건식 X  배열 마지막까지 꺼내서 저장
			System.out.println(value + " ");
		}
		
		System.out.println("----------------------------------");
		
//		기존 for문
		
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i] + " ");
		}
		
		int value = 1;
		
		
		
	}

}
