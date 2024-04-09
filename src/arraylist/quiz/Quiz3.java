package arraylist.quiz;

import java.util.ArrayList;

//문자열형(String) 리스트를 생성하세요.
//문자열 5개를 추가하세요 ("AA","BB","CC","DD","EE")
//반복문을 사용하여 리스트의 요소를 출력하세요.
//리스트에 저장된 모든 문자열을 삭제하세요.


public class Quiz3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		System.out.println(list);
		
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String listA = list.get(i);
			System.out.println(listA);
		}
		
		System.out.println("---------------------");
		
		for(String listA :list) {
			System.out.println(listA);
		}
		
//		뒤부터삭제 - 추천요망
		list.remove(4);
		list.remove(3);
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
		System.out.println(list);
		
//		list.removeAll(인자값필요)
		
//		앞부터삭제
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		list.remove(0);
//		
//		System.out.println(list);
		
////		잘못된경우
//		list.remove(0);
//		list.remove(1);
//		list.remove(2);
//		list.remove(3);
//		list.remove(4);
		
		

	}

}
