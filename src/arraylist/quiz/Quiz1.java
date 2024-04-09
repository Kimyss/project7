package arraylist.quiz;

import java.util.ArrayList;

//문자형(Character) 리스트를 생성하세요.
//문자 3개를 추가하세요 ('A','B','C')
//리스트의 모든 요소를 출력하세요.

public class Quiz1 {

	public static void main(String[] args) {

		ArrayList<Character> charList = new ArrayList<Character>();
		
		charList.add('A');
		charList.add('B');
		charList.add('C');
		
//		값을 저장 할 때도 문자타입(기초) 으로 -
		char ch1 = charList.get(0);
		System.out.println(ch1);
		char ch2 = charList.get(1);
		System.out.println(ch2);
		char ch3 = charList.get(02);
		System.out.println(ch3);
		
		System.out.println(charList);

	}

}
