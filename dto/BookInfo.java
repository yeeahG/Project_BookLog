package dto;

public class BookInfo {
	private int bookInfoNo;
	private String bookGenre;
	
	public BookInfo() {
		super();
	}

	public BookInfo(int bookInfoNo, String bookGenre) {
		super();
		this.bookInfoNo = bookInfoNo;
		this.bookGenre = bookGenre;
	}

	public int getBookInfoNo() {
		return bookInfoNo;
	}

	public void setBookInfoNo(int bookInfoNo) {
		this.bookInfoNo = bookInfoNo;
	}

	public String getBookGenre() {
		return bookGenre;
	}

	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n - 내용 - ");
		return builder.toString();
	}
	
}
