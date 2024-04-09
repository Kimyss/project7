package arraylist;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
//		학생1 생성
		Student student1 = new Student("둘리");
		
//		수강과목추가
		student1.subjectList.add(new Subject("국어", 100));
		student1.subjectList.add(new Subject("수학", 50));
		
//		학생정보 출력
		student1.showInfo();
		
//		학생2 생성
		Student student2 = new Student("도너");
		
//		수강과목추가
		student2.subjectList.add(new Subject("국어", 70));
		student2.subjectList.add(new Subject("영어", 85));
		student2.subjectList.add(new Subject("사회", 60));
		student2.subjectList.add(new Subject("과학", 78));
		
//		학생정보출력
		student2.showInfo();

	}

}



//	과목클래스
class Subject {
	String name;
	int score;

//	생성자 추가
	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}

// 학생클래스
class Student{
	String studentName;
	ArrayList<Subject> subjectList;
//	선언하면 빈값이기 떄문에 객체 생성이 되는 시점에 클래스생성자 
	
	
	public Student(String studentName) {
		super();
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();		//참조변수. 바로 실행X 객체생성 후 사용요망
	}
	
//	학생의 총점 출력메소드
	public void showInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			total = total + s.score;
		}
		System.out.println(studentName + "학생의 총점은 " + total + " 입니다.");
	}
	
	
}
	
	
	
