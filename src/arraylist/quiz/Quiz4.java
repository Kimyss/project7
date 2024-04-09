package arraylist.quiz;

import java.awt.List;
import java.util.ArrayList;

//학생(Student)을 정의하는 클래스를 만드세요.
//속성: 학번, 이름
//학번과 이름을 초기화하는 생성자
//학생정보를 출력하는 메소드

public class Quiz4 {

	public static void main(String[] args) {
		
//		Ex3 비교확인요망
		
		ArrayList<Student> student = new ArrayList<Student>();
//		student.add("이순재", 20);XXXXX
		
//		리스트에 학생정보추가
		Student student1 = new Student("이순재", 1001);
		student.add(student1);
		
		student.add(new Student("나문희", 1002));
		student.add(new Student("정준하", 1003));
		
//		직접하나식 꺼내서
		Student student2 = student.get(0);
		student2.showInfo();
		
		
		System.out.println();
		
//		반복문 써서
		for(int i = 0; i < student.size(); i++) {
			Student student00 = student.get(i);
			student00.showInfo();
		}
		
												
	}

}

class Student{
	String name;
	int stNum;
	
	public Student(String name, int stNum) {
		super();
		this.name = name;
		this.stNum = stNum;
	}
	
	public void showInfo() {
		System.out.println(name +", "+ stNum);
	}
	
	
}
