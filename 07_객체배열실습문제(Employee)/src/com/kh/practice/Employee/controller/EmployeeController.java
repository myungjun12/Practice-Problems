package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {
	// 합계, 평균 // 배열을 사용하여 다수의 객체 생성 및 필수 생성자 input
	Employee[] empArr = new Employee[5];
	public static final int CUT_LINE = 60; // 상수 합격 커트라인
//메서드
	//기본 생성자
	public EmployeeController() {
		empArr[0] = new Employee("김길동","자바",100);
		empArr[1] = new Employee("박길동","디비", 50);
		empArr[2] = new Employee("이길동","화면", 85);
		empArr[3] = new Employee("정길동","서버", 60);
		empArr[4] = new Employee("홍길동","자바", 20);
//		for(Employee emp : empArr) {
//			if(emp.getScore()>80) {
//				emp.setGrade('A');
//			}else if(emp.getScore()>60) {
//				emp.setGrade('B');
//			}else if(emp.getScore()>40) {
//				emp.setGrade('C');
//			}else {
//				emp.setGrade('D');
//			}
//		}
	}
	//모든 Employee[] 정보
	public Employee[] printEmployee() {
		return empArr;
	}
	
	// 총합계 sum 메서드
	public int sumScore() {
		int sum = 0;
		for(Employee emp : empArr) {
			sum += emp.getScore();
		}
		return sum;
	}
	// 총합의 평균 메서드
	public double[] averageScore() {
		double[] dbArr = new double[2];
		dbArr[0] = sumScore();
		dbArr[1] = sumScore() / empArr.length;
		return dbArr;
	}
	// 직원 개인간의 합격 여부
	public void EmployeePass() {
		for(Employee emp : empArr) {
			emp.setPass(emp.getScore() >= CUT_LINE);
			System.out.println(emp.getName() + " 학생 : " + (emp.isPass() ? "합격" : "불합격") + "입니다.");
		}
	}
}
	

