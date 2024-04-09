package array.quiz;
/*
 * System.arraycopy 메소드를 사용하여 배열을 복사하세요.
 * 원본배열: {'a', 'b', 'c', 'd', 'e'}
 * 새배열: {'d', 'e'}
 * */

import java.util.Arrays;

public class Quiz7 {

	public static void main(String[] args) {
		
		char[] srcArr = {'a', 'b', 'c', 'd', 'e'};
		char[] newArr = new char[2];
		
		System.arraycopy(srcArr, 3, newArr, 0, 2);
		
		System.out.println("원본배열: " + Arrays.toString(srcArr));
		System.out.println("새배열: " + Arrays.toString(newArr));
		
		
	}

}
