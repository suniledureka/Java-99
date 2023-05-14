package co.edureka.java.util;

public class Book  {
	private int bookId;
	private String bookName;
	
	public Book() {	}

	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		//return "Book [Book ID= " + bookId + " | Book Title= " + bookName +"]";
		return String.format("Book[%6d ---> %-22s]", bookId, bookName);
	}
}
