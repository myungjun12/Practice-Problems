package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	MusicController mc = new MusicController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
	while(true) {
		System.out.println("=== 메인메뉴 ===");
		System.out.println("1. 음악 추가");
		System.out.println("2. 첫 번째 위치에 음악 추가");
		System.out.println("3. 음악 전체 목록");
		System.out.println("4. 음악 검색");
		System.out.println("5. 음악 삭제");
		System.out.println("6. 음악 수정");
		System.out.println("7. 음악 제목 오름차순 정렬");
		System.out.println("8. 음악 가수명 내림차순 정렬");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			//음악 추가
			addList();
			break;
		case 2:
			//첫 위치에 곡 추가
			addAtZero();
			break;
		case 3:
			//전체 곡 목록 출력
			printAll();
			break;
		case 4:
			//음악 검색
			searchMusic();
			break;
		case 5:
			//음악 삭제
			removeMusic();
			break;
		case 6:
			//음악 수정
			setMusic();
			break;
		case 7:
			//음악 제목 오름차순 정렬
			ascTitle();
			break;
		case 8:
			//음악 가수명 내림차순 정렬
			descSinger();
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
		}
	}
}
	
	public void addList() {
		//1.음악 추가
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String author = sc.nextLine();
		Music music = new Music(title, author);
		int result = mc.addList(music);
		if(result > 0) {
			System.out.println("곡 추가 성공");
		}else {
			System.out.println("곡 추가 실패");
		}
	}
	
	public void addAtZero() {
		//2.첫 위치에 음악 추가  
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String author = sc.nextLine();
		Music music = new Music(title, author);
		int result = mc.addAtZero(music);
		if(result > 0) {
			System.out.println("첫 위치에 곡 추가 성공");
		}else {
			System.out.println("첫 위치에 곡 추가 실패");
		}
	}
	
	public void printAll() {
		//3.전체 음악 목록 출력
		for(Music music : mc.printAll()) {
			System.out.println(music);
		}
	}
	
	public void searchMusic() {
		//4.음악 검색
		System.out.print("검색할 곡명 : ");
		String title = sc.nextLine();
		Music music = mc.searchMusic(title);
		if(music != null) {
			System.out.println("검색 결과 : " + music);
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	public void removeMusic() {
		//5.음악 삭제
		System.out.print("삭제할 곡명 : ");
		String author = sc.nextLine();
		Music music = mc.removeMusic(author);
		if(music != null) {
			System.out.println("삭제 성공 : " + music);
		}else {
			System.out.println("삭제할 곡이 없습니다.");
		}
	}
	
	public void setMusic() {// prevMusic과 music이 같지 않을까 ?...
		//6.음악 수정
		System.out.print("수정할 곡명 : ");
		String title = sc.nextLine();
		System.out.print("새로운 가수명 : ");
		String author = sc.nextLine();
		Music music = new Music(title, author);
		Music prevMusic = mc.setMusic(title, music); // .. ?? 흠
		if(prevMusic != null) {
			System.out.println("수정 성공 : " + prevMusic + " -> " + music);
		}else {
			System.out.println("수정할 곡이 없습니다.");
		}
	}
	
	public void ascTitle() {
		int result = mc.ascTitle(); // 길이를 반환받아서 result값이 존재한다면 1 이상의 리스트값이 존재하는거니까 정렬수행 가능하니까 없다면 정렬할 값이 없는거고
		if(result > 0) {
			System.out.println("곡명 오름차순 정렬 완료");
		}else {
			System.out.println("정렬할 곡이 없습니다.");
		}
	}
	
	public void descSinger() {
		 int result = mc.descSinger();
		 if(result > 0) {
			 System.out.println("가수명 내림차순 정렬 완료");
		 }else {
			 System.out.println("정렬할 곡이 없습니다.");
		 }
	}
	
}

