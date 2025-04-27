package student;

import java.util.Scanner;

public class StudentUtils {
	private static final Scanner scanner = new Scanner(System.in);
	public static Object nextline;
	
	public static int nextInt(String i) {
		System.out.print(i);
		return Integer.parseInt(scanner.nextLine());
	}
	public static String nextLine(String i) {
		System.out.print(i);
		return scanner.nextLine();
	}
}
