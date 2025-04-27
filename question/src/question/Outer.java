package question;

public class Outer {
	int i = 4;
	public Outer(int i) {
		super();
		this.i = i;
	}
	public Outer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "" + i;
	}
	public class Inner{
		
		public Inner() {

		}
		
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		System.out.println(outer.toString());
	}
}
