package array;

import java.util.Arrays;

public class Ex5 {

	public static void main(String[] args) {
		
//		배열을 복사하여 새로운 배열 만들기
		char[] srcArr= {'a', 'b', 'c', 'd', 'e'};
		char[] newArr = new char[3];	//새로운 배열
		
//		배열 복사하기
//		arraycopy(원본배열, 시작위치, 새배열, 시작위치, 개수);
		System.arraycopy(srcArr, 0, newArr, 0, 3);
		System.out.println("원본배열 : " + Arrays.toString(srcArr));
		System.out.println("새로운 배열: " + Arrays.toString(newArr));
		

	}

}
