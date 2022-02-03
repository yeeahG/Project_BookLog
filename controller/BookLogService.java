package controller;

import java.util.ArrayList;

import dto.BookHave;
import dto.BookInfo;
import dto.BookLogOne;
import exception.BookLogNotFoundException;
import exception.BookNameDuplicationException;

public class BookLogService {

	private static BookLogService instance = new BookLogService();
	private ArrayList<BookLogOne> BookLogList = new ArrayList<BookLogOne>();

	private BookLogService() {
	}

	public static BookLogService getInstance() {
		return instance;
	}

	// 기록된 모든 책 검색
	public ArrayList<BookLogOne> getBookLogList() {
		return BookLogList;
	}

	// 북로그 생성
	public void BookLogWrite(BookLogOne log) throws BookNameDuplicationException {

		for (BookLogOne b : BookLogList) {
			if (b.getBookName().equals(log.getBookName())) {
				throw new BookNameDuplicationException("이미 존재하는 책 기록이 있습니다.");
			}
		}
		BookLogList.add(log);

	}

	// 2. 책 제목 검색
//	public BookLogOne getbookName(String bName) throws BookLogNotFoundException {
//		
//		for (int i=0; i<BookLogList.size(); i++) {
//			if (BookLogList.get(i).getBookName().equals(bName)) {
//				return BookLogList.get(i);
//			}
//		} throw new BookLogNotFoundException("해당 제목의 책이 없습니다.");
//	}

	public BookLogOne getbookName(String bookName) throws BookLogNotFoundException {
		for (BookLogOne b : BookLogList) {
			if (b.getBookName().equals(bookName)) {
				return b;
			}
		}
		throw new BookLogNotFoundException("입력한 책은 존재하지 않습니다");
	}

	private ArrayList<BookInfo> bookInfoList = new ArrayList<BookInfo>();

	// 3. 모든 장르 검색
	public ArrayList<BookInfo> getBookGenreList() {
		return bookInfoList;
	}

//	public ArrayList<BookLogOne> getBookLogList() {
//		return BookLogList;
//	}

	// 4. 장르 검색하면 책 이름 나오게
	public ArrayList<String> getBookGenre(String bookGenre) throws BookLogNotFoundException {
		ArrayList<String> bookgenreList = new ArrayList<String>();

		for (BookLogOne b : BookLogList) {
			if (b.getBookInfo().getBookGenre().equals(bookGenre)) {
				bookgenreList.add(b.getBookName().getBookName());
			}
		}
		if (bookgenreList.isEmpty()) {
			throw new BookLogNotFoundException("해당 장르가 존재하지 않습니다");
		}
		return bookgenreList;
	}

	// 5. 북로그 페이지 검색
	public BookLogOne logInfoRead(String l) throws BookLogNotFoundException {
		int count = BookLogList.size();

		for (int i = 0; i < count; i++) {
			if (BookLogList.get(i).getLogName().equals(l)) {
				return BookLogList.get(i);
			}
		}
		throw new BookLogNotFoundException("해당 책이 존재하지 않습니다");
	}
	
	
	// 6. 북로그 기록 삭제
//	public boolean deleteLogName(String logName) {
//		
//		BookLogOne log = null;
//		int count = BookLogList.size();
//		
//		for (int i=0; i<count; i++) {
//			log = BookLogList.get(i);
//			
//			if (BookLogOne.getLogName().equals(logName)) {
//				BookLogList.remove(i);
//				return true;
//			} 
//		return false;
//	}

	
	
	
}
