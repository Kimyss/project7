package array.quiz;
/*
 * 10개 크기의 정수형 배열을 생성하세요.
 * 값의 목록을 다음과 같이 초기화하세요 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
 * 첫번째 요소와 마지막 요소를 출력하세요.
 * 단, 값의 목록이 바뀌었을때도 첫번째요소와 마지막요소가 출력되어야합니다.
 * 
 * 예시) { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } -> 1과 10
 * 예시) { 55,1,87,11,33 } -> 55과 33
 * */

public class Quiz2 {

	public static void main(String[] args) {
//		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] number = {55, 1, 87, 11, 33};
		
		System.out.println(number[0]);
		
		int lastIndex = number.length -1;
		System.out.println(lastIndex);
		System.out.println(number[lastIndex]);
		System.out.println(number[number.length -1]);

	}
//		index의 특징
}
