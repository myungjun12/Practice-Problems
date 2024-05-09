package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	SnackController scr = new SnackController();
		Scanner sc = new Scanner(System.in);
	public SnackMenu() {
		
	}
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print(" 맛 : ");
		String flavor = sc.next();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("저장된 정보를 확인하시겠습니까? y/n");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")) {
			//저장 내용 잘 들어갔는지 확인 
			System.out.println(scr.saveData(kind, name, flavor, numOf, price));
			
			System.out.println(scr.confirmData());
		}
	}
}
