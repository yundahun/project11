package object;

public class Ex4 {

	public static void main(String[] args) {

		Book book = new Book(200, "개미");
		
		System.out.println(book.toString());
		System.out.println(book); // == book.toString()과 같음
		
		Book book2 = book;
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
	}

}

class Book {
	
	int bookNumber; // 도서번호
	String bookTitle; //제목
	
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	// source > generate tostring 메뉴
	
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}
}