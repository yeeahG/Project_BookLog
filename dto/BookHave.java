package dto;

public class BookHave {
	private int bookNo;
	private String bookName;
	private String genre;
	private String author;
	
	
	public BookHave() {
		super();
	}


	public BookHave(int bookNo, String bookName, String genre, String author) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.genre = genre;
		this.author = author;
	}


	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n - 책 - ");
		builder.append(bookName);
		builder.append(", ");
		builder.append(genre);
		builder.append("장르, ");
		builder.append(author);
		builder.append("작가 ");
		return builder.toString();
	}
	

}
