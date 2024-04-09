package arraylist.quiz;

import java.util.ArrayList;

//논리형(Boolean)의 리스트를 생성하세요.
//값 3개를 추가하세요 (true, true, false)
//반복문을 사용하여 리스트의 요소를 출력하세요.
//리스트의 첫번째 요소와 마지막요소를 출력하세요.

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Boolean> bool = new ArrayList<Boolean>();

		bool.add(false); 
		bool.add(true);
		bool.add(null);

		for (int i = 0; i < bool.size(); i++) {
			Boolean boolbool = bool.get(i);
			System.out.println(boolbool);
		}

		System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*");
		
//		for(boolean boolbool : list) {
//			System.out.println(boolbool + " ");
//		}
		
//		boolean firstValue = bool.get(0);
//		
//		int lastIndex = bool.size() - 1;
//		boolean lastValue = bool.get(lastIndex);

	}
}
