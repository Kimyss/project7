package arraylist;

import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {

//			선언					클래스이기때문에 new + 생성자 
//								(생성자: 객체가 생성될때 자동으로 호출되는 특수 목적의 멤버함수(메소드)로 객체의 초기화를 위해 사용)
		ArrayList<Integer> numList = new ArrayList<Integer>();

		numList.add(10);
		numList.add(20);
		numList.add(30);

		for (int i = 0; i < numList.size(); i++) { // 배열은 length사용했으나 배열리스트클래스는 size !

			int num = numList.get(i);
			System.out.println(num + " ");
		}

	}

}
