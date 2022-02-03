package controller;

import java.util.ArrayList;
import java.util.HashMap;

import dto.BookInfo;
import dto.BookLogOne;
import exception.BookLogNotFoundException;
import exception.BookNameDuplicationException;
import view.EndFailView;
import view.EndView;

public class BookLogController {

	private static BookLogController instance = new BookLogController();
	private BookLogService service = BookLogService.getInstance();

	private BookLogController() {
	}

	public static BookLogController getInstance() {
		return instance;
	}

	// 북로그 생성
	public void BookLogWrite(BookLogOne log) {

		if (log != null) {
			try {
				service.BookLogWrite(log);
			} catch (BookNameDuplicationException e) {
				e.printStackTrace();
				EndFailView.failView(e.getMessage());
			}
		} else {
			EndFailView.failView("기록된 책이 없습니다. ");
		}
	}

	// 1. 책 목록 검색
	public void getBookLogList() {
		EndView.BookLogListView(service.getBookLogList());
	}

	// 2. 책 제목 검색
	public void getBookName(String bookName) {
		try {
			EndView.BookNameView(service.getbookName(bookName));
		} catch (BookLogNotFoundException e) {
			EndFailView.failView(e.getMessage());
		}
	}

	// 3. 모든 장르 검색
	public void getBookGenreList() {
		EndView.BookGenreListView(service.getBookGenreList());
	}

	// 4. 원하는 장르 검색
	public BookInfo getBookGenre(String bookGenre) {
		try {
			HashMap<String, ArrayList<String>> bookGenrebName = new HashMap<String, ArrayList<String>>();
			bookGenrebName.put(bookGenre, service.getBookGenre(bookGenre));
			EndView.readBookGenre(bookGenrebName);
		} catch (BookLogNotFoundException e) {
			EndFailView.failView("장르 이름을 제대로 입력하십시오");
		}
		return null;
	}
	
	// 5. 북로그 페이지 검색
//	public BookLogOne logInfoRead(String logName) {
//		try {
//			EndView.logNameView(service.logInfoRead(logName));
//		} catch (BookLogNotFoundException e) {
//			EndFailView.failView(e.getMessage());
//		}
//	}
	
//	public void getBookName(String bookName) {
//		try {
//			EndView.BookLogListView(service.getbookName(bookName));
//		} catch (BookLogNotFoundException e) {
//			EndFailView.failView(e.getMessage());
//		}
//	}

	// 5. 북로그 페이지 검색
	public void logInfoRead(String logName) {
		try {
			EndView.logNameView(service.logInfoRead(logName));
		} catch (BookLogNotFoundException e) {
			EndFailView.failView(e.getMessage());
		}
	}

	
	// 6. 북로그 페이지 삭제
	public static void deleteLogName(String logName) {
		if (logName != null) {
			boolean result = service.deleteLogName(logName);
			
			if (result) {
				EndView.successView(logName + "가 삭제되었습니다");
			} else {
				EndFailView.failView("삭제할 페이지가 없습니다");
			} 
		} else {
			EndFailView.failView("삭제하려는 페이지를 입력하세요");
		}
	}
	

	
}
