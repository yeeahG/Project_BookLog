package exception;

public class BookNameDuplicationException extends Exception {
	
	public BookNameDuplicationException() {}
	public BookNameDuplicationException(String m) {
		super(m);
	}
}
