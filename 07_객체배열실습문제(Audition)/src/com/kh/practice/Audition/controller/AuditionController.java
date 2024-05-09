package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {
	// 객체 배열 생성 adArr은 new Audition[5]의 주소를 가지고있음.
	Audition[] adArr = new Audition[5];
	public static final int CUT_LINE = 60;
	//기본 생성자
	public AuditionController() {
		adArr[0] = new Audition("김영희","발라드",100);
		adArr[1] = new Audition("박영희","힙합",50);
		adArr[2] = new Audition("이연이","뮤지컬",85);
		adArr[3] = new Audition("정영히","댄스",60);
		adArr[4] = new Audition("홍영희","팝",20);
	}
	// new Audition[]의 주소 반환 메서드
	public Audition[] adAddress() {
		return adArr;
	}
	// 점수 합계 메서드
	public int sumScore() {
		int sum = 0;
		for(Audition ad : adArr) {
			sum += ad.getScore();
		}
		return sum;
	}
	// 합한 점수의 평균값 구하는 메서드 double[]사용
	public double[] averageScore() {
		double[] db = new double[2];
		db[0] = sumScore(); 
		db[1] = sumScore()/adArr.length;
		return db;
	}
	// 각 참가자들의 합격여부 출력 매서드
	public void printPassed() {
		for(Audition ad : adArr) {
			ad.setPassed(ad.getScore() >= CUT_LINE);
			System.out.println(ad.getName() + " 참가자 : " + (ad.isPassed() ? "합격" : "불합격") + "입니다." );
		}
	}
	// 각 참가자들의 등급 출력 메서드
	public void printGrade() {
		for(Audition ad : adArr) {
			if(ad.getScore() > 80) {
				ad.setGrade('A');
			}else if(ad.getScore() > 70) {
				ad.setGrade('B');
			}else if(ad.getScore() > 60) {
				ad.setGrade('C');
			}else {
				ad.setGrade('D');
			}
		}
	}
}
