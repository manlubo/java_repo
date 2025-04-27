package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentService {
	//학생 리스트 생성
	List<Student> students = new ArrayList<Student>();
	
	//랜덤 점수 생성
	private int ranNum(){
		return (int)(Math.random() * 41 + 60);
	}
	
	//초기화 블럭
	{
		students.add(new Student(1, "소크라", ranNum(),  ranNum(), ranNum()));
		students.add(new Student(2, "아리스", ranNum(),  ranNum(), ranNum()));
		students.add(new Student(3, "토텔레", ranNum(),  ranNum(), ranNum()));
		students.add(new Student(4, "플라톤", ranNum(),  ranNum(), ranNum()));
	}
	
	//등록
	public void register() {
		
		int no = StudentUtils.nextInt("학번을 입력해 주세요 > ");
		String name = StudentUtils.nextLine("이름을 입력해 주세요 > ");
		int kor = StudentUtils.nextInt("국어점수를 입력해 주세요 > ");
		int eng = StudentUtils.nextInt("수학점수를 입력해 주세요 > ");
		int mat = StudentUtils.nextInt("영어점수를 입력해 주세요 > ");
		
		students.add(new Student(no, name, kor, eng, mat));
	}
	
	//조회
	public void view() {
		for(Student s : students) {
			System.out.println(s.getNo());
		}
	}
	
	
	
}
