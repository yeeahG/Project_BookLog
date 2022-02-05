package view;

import java.util.Scanner;

import controller.BookLogController;
import dto.BookHave;
import dto.BookInfo;
import dto.BookLogOne;

public class StartView {
	public static void main(String[] args) {
		

		// 책목록
		BookHave book1 = new BookHave(1, "지구 끝의 온실", "SF", "김초엽");
		BookHave book2 = new BookHave(2, "The midnight library", "판타지", "김초엽");
		BookHave book3 = new BookHave(3, "두번재 달", "SF", "최이수");
		BookHave book4 = new BookHave(4, "나인폭스 갬빗", "SF", "이윤하");
		BookHave book5 = new BookHave(5, "달러구트 꿈 백화점", "판타지", "이미예");
		BookHave book6 = new BookHave(6, "이기적 유전자", "과학", "Richard Dawkins");
		BookHave book7 = new BookHave(7, "구글의 미래", "경제", "Thomas schulz");

		
		// 장르
		BookInfo bookInfo1 = new BookInfo(1, "SF");
		BookInfo bookInfo2 = new BookInfo(2, "판타지");
		BookInfo bookInfo3 = new BookInfo(3, "외국어");
		BookInfo bookInfo4 = new BookInfo(4, "경제");
		BookInfo bookInfo5 = new BookInfo(5, "과학");
		BookInfo bookInfo6 = new BookInfo(6, "추리");

		
		// 기록장
		BookLogOne blo[] = { new BookLogOne("1page", book2, bookInfo2, "2021-10-27", "교보문고", "◼️◼️◼️◼️◻️"),
							 new BookLogOne("2page", book1, bookInfo1, "2021-10-27", "교보문고", "◼️◼️◼️◼️◼️"),
							 new BookLogOne("3page", book3, bookInfo1, "2021-01-30", "yes24북클럽", "◼️◼️◻️◻️◻️"),
							 new BookLogOne("4page", book5, bookInfo2, "2021-01-29", "yes24북클럽", "◼️◼️◼️◻️◻️"),
							 new BookLogOne("5page", book6, bookInfo5, "2013-04-21", "교내서점", "◼️◼️◼️◻️◻️")};

		
		BookLogController controller = BookLogController.getInstance();

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		for (int index = 0; index < blo.length; index++) {
			controller.BookLogWrite(blo[index]);
		}
		System.out.println("\n 1. 책 목록검색 \n 2. 원하는 책 제목 검색 \n 3. 모든 장르 검색 \n 4. 원하는 장르 검색 \n 5. 북로그 페이지 검색 \n 6. 북로그 기록 삭제");

		int i = sc.nextInt();
		while (i != 0) {

			if (i == 1) {
				System.out.println("\n -- 1. 책 목록검색 --");
				controller.getBookLogList();

			} else if (i == 2) {
				System.out.println("-- 검색하고 싶은 책 제목을 입력하세요 --");
				String bookName = sc1.nextLine();
				System.out.println("\n 2. 책 제목 " + bookName + " 검색결과");
				controller.getBookName(bookName);

			} else if (i == 3) {
				System.out.println("\n 3. 모든 장르 검색");
				controller.getBookGenreList();
				
			} else if (i == 4) {
				System.out.println("-- 원하는 장르를 입력하세요 --");
				String bookGenre = sc1.nextLine();
				System.out.println("\n 4. " + bookGenre + " 검색결과");
				controller.getBookGenre(bookGenre);

			} else if ( i == 5 ) {
				System.out.println("-- 검색하고자 하는 페이지를 입력하세요 (page까지 입력하세요) --");
				String logName = sc1.nextLine();
				controller.logInfoRead(logName);
				
			} else if ( i == 6 ) {
				System.out.println("--삭제하고 싶은 page를 입력하세요");
				String logName = sc1.nextLine();
				System.out.println("\n " + logName + "를 삭제하였습니다");
				controller.deleteLogName(logName);
				controller.getBookLogList();
			}
			
			System.out.println("\n 1. 책 목록검색 \n 2. 원하는 책 제목 검색 \n 3. 모든 장르 검색 \n 4. 원하는 장르 검색 \n 5. 북로그 페이지 검색 \n 6. 북로그 기록 삭제 \n 0번 나가기");

			i = sc.nextInt();
			
		} 
		
		System.out.println("종료중입니다");
		System.out.println(".");
		System.out.println(".");
		sc.close();
		sc1.close();
		System.out.println("-- CLOSE --");
		
	}


}
