package student;

public class Student {
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	// 세터
	public int setNo(){
		return this.no;
	}
	public String setName(){
		return this.name;
	}
	public int setKor(){
		return this.kor;
	}
	public int setEng(){
		return this.eng;
	}
	public int setMat(){
		return this.mat;
	}
	
	//게터
	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
	public int getKor(){
		return kor;
	}
	public int getEng(){
		return eng;
	}
	public int getMat(){
		return mat;
	}
	
	
	//생성자
	public Student() {
		
	}
	public Student(int no, String name) {
		this.no = setNo();
		this.name = setName();
	}
	public Student(int no, String name,int kor, int eng, int mat) {
		setNo();
		setName();
		setKor();
		setEng();
		setMat();
	}
	
	//toString
//	public void toString() {
//		System.out.printf("%3d %5s %5d %5d %5d", getNo(), getName(), getKor(), getEng(), getMat());
//		
//	}
	
	
	// 총점 평균
	public int total() {
		return getKor() + getEng() + getMat();
	}
	
	public double avg() {
		return total() / 3d;
	}
	
}
