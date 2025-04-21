package ch3;

public class OperatorEx6 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // 바이트타입으로 표현하기 위해 형변환 필요
		
		System.out.println(c);
	}
}
