package array.quiz;
/*
 * 5개 크기의 정수형 배열을 생성하세요.
 * 값의 목록을 다음과 같이 초기화하세요 {5, 20, 100, 30, 77}
 * 20이 저장되어있는 요소의 인덱스를 찾아서 출력하세요.
 * 
 * 예시) 20을 가지는 요소의 인덱스는 1 입니다
 * */
public class Quiz6 {

	public static void main(String[] args) {

		int numInt[] = { 5, 20, 100, 30, 77 };

		int numIndex = 0;
		for (int i = 0; i < numInt.length; i++) {
			if (numInt[i] == 20) {			
				numIndex = i;
				System.out.println("20을 가지는 요소의 인덱스는 " + numIndex + "번");
			}
		}
		System.out.println("20을 가지는 요소의 인덱스는 " + numIndex + "번"); //why 아예 다른 숫자 인덱스 0번? 
		
		System.out.println("*-*-*-*-*-*-*-*-*-*");
		
		int arr[] = { 5, 20, 100, 30, 77 };
		for(int i = 0; i< numInt.length; i++) {
//			배열의 값 == 찾고싶은 값
			if(arr[i] == 20) {  //배열의 값이 20이라면
				System.out.println("20이 저장된 요소인덱스는 " + i);
				break;	// 20 찾으면 그 이후로 빠져나온다
			}
		}
		
	}
}


