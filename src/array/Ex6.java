package array;


public class Ex6 {

	public static void main(String[] args) {
		
//		5개 크기의 객체 배열 생성
		Book[] library = new Book[5];		//참조변수  인스턴스만들기전 까진 null
		
		for(int i = 0; i< library.length; i++) {		
			System.out.print(library[i] + " ");
		}
		
		System.out.println();
		
//		library[0].showInfo(); 인스턴스를 만들기 않았기 떄문에 에러
		
		
//		각요소에 인스턴스(객체)생성, 저장하기
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 해세");
		library[2] = new Book("어떻게 살 것인가", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린왕자", "생텍쥐페리");
		
		for(int i = 0; i< library.length; i++) {		
			System.out.print(library[i] + " | ");	//주소값다르네
		}
		
		System.out.println();
		
		library[0].showInfo();
		System.out.println("___________________");
		
//		각 요소의 정보 출력하기
		for(int i = 0; i< library.length; i++) {		
			library[i].showInfo();
		}
	}

}



//	도서 클래스
class Book {
	String bookName;
	String author;

//	제목과 저자를 **초기화**하는 생성자 ** 제목과저자를 전달받아서 초기화 **
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(bookName + ", " + author);
	}

}
