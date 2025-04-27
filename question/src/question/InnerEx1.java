package question;

public class InnerEx1 {
	class InstanceInner{
		int iv = 100;
		static int cv = 100;
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
			static int cv = 300;
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
		InnerEx1 ex1 = new InnerEx1();
		ex1.myMethod();
//		System.out.println(InstanceInner.iv);
		System.out.println(InstanceInner.cv);
		System.out.println(InstanceInner.CONST);
//		System.out.println(StaticInner.iv);
		System.out.println(StaticInner.cv);
		System.out.println();
	}
}
