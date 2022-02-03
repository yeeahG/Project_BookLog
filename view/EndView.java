package view;

import java.util.ArrayList;
import java.util.HashMap;

import dto.BookHave;
import dto.BookInfo;
import dto.BookLogOne;

public class EndView {

	// 1. 모든 책 검색
	public static void BookLogListView(ArrayList<BookLogOne> allBookLog) {
		if (allBookLog != null) {
			for (int i = 0; i < allBookLog.size(); i++) {
				if (allBookLog.get(i) != null) {
					System.out.println(allBookLog.get(i));
				}
			}
		} else {
			System.out.println("책기록이 존재하지 않습니다");
		}
	}

	// 2. 책 제목 검색
	public static void BookNameView(BookLogOne bookName) {
		if (bookName != null) {
			System.out.println(bookName);
		} else {
			System.out.println("책기록이 존재하지 않습니다");
		}
	}

	// 3. 모든 장르 검색
	public static void BookGenreListView(ArrayList<BookInfo> bookGenreList) {
		System.out.println(bookGenreList);
	}

	
	// 4. 원하는 장르의 책들 검색
	public static void readBookGenre(HashMap<String, ArrayList<String>> bookGenrebName) {
		System.out.println(bookGenrebName.toString());
	}

	
	// 
	public static void logNameView(BookLogOne logInfoRead) {
		System.out.println(logInfoRead);
	}

	public static void successView(String string) {
		
	}

	
}
