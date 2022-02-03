package dto;

public class BookLogOne {
	
	private String logName;
	private BookHave bookName;
	private BookInfo bookInfo;
	private String buyDate;
	private String buyPlace;
	private String satisfy;
	
	public BookLogOne() {
		super();
	}

	public BookLogOne(String logName, BookHave bookName, BookInfo bookInfo, String buyDate, String buyPlace,
			String satisfy) {
		super();
		this.logName = logName;
		this.bookName = bookName;
		this.bookInfo = bookInfo;
		this.buyDate = buyDate;
		this.buyPlace = buyPlace;
		this.satisfy = satisfy;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public BookHave getBookName() {
		return bookName;
	}

	public void setBookName(BookHave bookName) {
		this.bookName = bookName;
	}

	public BookInfo getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

	public String getBuyPlace() {
		return buyPlace;
	}

	public void setBuyPlace(String buyPlace) {
		this.buyPlace = buyPlace;
	}

	public String getSatisfy() {
		return satisfy;
	}

	public void setSatisfy(String satisfy) {
		this.satisfy = satisfy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[책기록] ");
		builder.append(logName);
		builder.append(bookName);
		builder.append(bookInfo);
		builder.append(buyDate);
		builder.append(" ");
		builder.append(buyPlace);
		builder.append("에서 구매, ");
		builder.append("만족도 : ");
		builder.append(satisfy);
		return builder.toString();
	}
	
	
}
