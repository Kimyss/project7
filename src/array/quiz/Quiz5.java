package array.quiz;
/*
 * 5개 크기의 정수형 배열을 생성하세요.
 * 값의 목록을 다음과 같이 초기화하세요 {5, 20, 100, 30, 77}
 * 배열에서 가장 큰값을 찾으세요.
 * 
 * 답: 100
 * */

import java.util.Arrays;

public class Quiz5 {

	public static void main(String[] args) {
		
		int[] intNum = { 5, 20, 100, 30, 77};
		
		int max = intNum[0];	//1. 최대값을 저장하기 위한변수  2.배열의 첫번째 값으로 초기화 index 0번 부터(5부터) 차례로 크기비교
//		int max = 0;		 	//0부터 index 0번 (0과 5부터 비교)
		
		for(int i = 0; i < intNum.length; i++) {
			if(max < intNum[i]){		//배열의 값이 현재 최대값보다크면
				max = intNum[i];
			}
		}
		System.out.println("intNum = " + Arrays.toString(intNum));
		System.out.println("가장 큰 값: " + max);
		
		
		
	}

}
