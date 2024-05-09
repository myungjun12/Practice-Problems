package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	ArrayList<Book> list = new ArrayList<>();
	//기본 생성자
	public BookController() {}
	//책 추가하기 객체생성하며 필수생성자통해 값초기화 및 주소 전달 list.add(주소및 값)에 공간할당  
	public void insertBook(Book bk) {
		list.add(bk);
	}
	//책 전체보기 비었을경우 isEmpty로 확인, 내용이 있을경우 for - each문으로 나열 
	public void selectList() {
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		}else {
			for(Book b : list) {
				System.out.println(b.toString());
			}
		}
		
	}
	// 책이름을 검색하여 정보 출력
		public void searchBook(String keyword) {
			ArrayList<Book> search = new ArrayList<>();
			for(Book b : list) {
				if(b.getTitle().equals(keyword)) {
					search.add(b);
				}
			}
			if(search.isEmpty()) {
				System.out.println("검색 기록이 없습니다.");
			}else {
				for(Book b: search) {
					System.out.println(b);
				}
			}
			
	}
	boolean remove;
	public void deleteBook(String title, String author) {
		for(Book b :list) {
			if(b.getTitle().equals(title) && b.getAuthor().equals(author)) {
				list.remove(b);
				remove = true;
				break;
			}
		}
		if(remove) {
			System.out.println("도서 삭제가 완료되었습니다.");
		}else {
			System.out.println("해당 도서를 찾을 수 없습니다.");
		}
	}
	// 오름차순 정렬
	public void ascBook() {
		// sort 목록을 오름차순 정렬한다.
		//comparing 비교하다
		// 정렬하는 기준       책에서 책제목
		//    :: =    Book 파일의 getTitle 참조해서 사용하겠다.
		Collections.sort(list,Comparator.comparing(Book::getTitle));
	}

}
