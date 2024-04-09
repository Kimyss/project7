package array.quiz;
/*
 * 5개 크기인 정수형 배열을 생성하세요.
 * 값의 목록을 다음과 같이 초기화하세요 { 10, 15, 20, 25, 30 }
 * 반복문을 사용하여 배열요소의 합을 구하고 출력하세요.
 * */

public class Quiz3 {

	public static void main(String[] args) {
//		int[] number = new int[5];  //직접할당 또는 반복문으로 할당 가능
		
		int[] number = {10, 15, 20, 25, 30};
		
		int sum = 0;
		for(int i =0; i < number.length; i++) {
			sum += number[i];
//			sum = sum + number[i];
		}
		
		System.out.println("배열요소의 합계: " + sum);

	}

}
