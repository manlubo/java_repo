package student;

import java.util.Arrays;

public class StudentMain {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		System.out.println("학생 관리 프로그램");
		while(true) {
			
				int input = StudentUtils.nextInt("1. 등록 2.조회 >");
				switch (input) {
				case 1: {
					service.register();
					
				}
				case 2: {
					service.view();
					
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
		}
		
	}
}
