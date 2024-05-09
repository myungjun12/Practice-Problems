package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	Snack s = new Snack();
	
	//기본 생성자
	public SnackController() {
		
	}
	//Setter로 저장하고 저장완료 되었다고 반환하는 메서드
	public String saveData(String kind, String name, String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장완료";
	}
	//저장된 데이터를 반환하는 메서드 
	public String confirmData() {
		return s.information();
	}
	
}
