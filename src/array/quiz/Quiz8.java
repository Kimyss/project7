package array.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
//		학생 3명 저장할 배열 형성 자료형으로 Studnet
		Student[] students = new Student[3];		//3개크기의 배열 형성 그 후 인스턴스 만들 필요가 있다
		
//		인스턴스를 생성하고 배열에 저장
		students[0] = new Student(100, "둘리");
		students[1] = new Student(110, "도너");
		students[2] = new Student(120, "또치");
		
//		for문 사용하여 배열 모든요소 출력
		
		for(int i = 0; i < students.length; i++) {		//for문 다시만들어보기 int i =1
			students[i].studentInfo();
		}
		
		
		
		
		

	}

}

class Student{
	
	String name;
	int stNum;
	
//	학번 이름을 초기화하는생성자
	public Student(int stNum, String name) {
		super();
		this.name = name;
		this.stNum = stNum;
	}
	
//	학생정보 출력메소드
	public void studentInfo(){
		System.out.println("이름: " + name +  " 학번: " + stNum);
	}
	
	
}

