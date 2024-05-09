package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

public class AuditionMenu {

	AuditionController adc = new AuditionController();
	
	//기본생성자
	public AuditionMenu(){
		
	}
	
	public void printMenu() {
		adc.printGrade();
		System.out.println("이름\t분야\t점수");
		for(Audition ad : adc.adAddress()) {
			System.out.println(ad.info());
		}
		System.out.println("참가자 총 점수 : " + adc.sumScore());
		System.out.println("참가자 총 평균 : " + adc.averageScore()[1]);
		System.out.println("참가자 평균의 합격 여부 : " + (adc.averageScore()[1] >= adc.CUT_LINE));
		adc.printPassed();
	}
}
