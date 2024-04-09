package arraylist;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		
//		Book 참조자료형(?)
		ArrayList<Book> list = new ArrayList<Book>();
		
//		리스트에 도서정보 추가
		Book book1 = new Book("태백산맥", "조정래");			//주소값 가리킴 차이: 참조변수 생긴거 
		list.add(book1);
		
		list.add(new Book("데미안", "헤르만해세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));		//주소값 가리킴
		
//		람다식 for
		for(Book book : list) {			//조건X get을 써서 값 꺼내는 부분X
			book.showInfoBook();
		}
		
		System.out.println("~~~~~~~~~~~~~");
		
//		일반 for문
		for(int i =0; i < list.size(); i++) {
			Book book = list.get(i);
			book.showInfoBook();
		}

	}

}

// 도서 클래스
class Book {
	String bookName;
	String author;

//	제목과 저자를 초기화하는 생성자 ~

	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
//	도서정보출력메소드
	public void showInfoBook(){
		System.out.println("제목 " + bookName + " 저자 " + author);
	}
	

}
