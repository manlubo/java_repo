package question;

public class Book {
	String name;
	String writer;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String writer) {
		this.name = name;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", writer=" + writer + "]";
	}
	
	public static void main(String[] args) {
		Book book = new Book("개미", "베르나르베르베르");
		System.out.println(book.toString());
	}
}
