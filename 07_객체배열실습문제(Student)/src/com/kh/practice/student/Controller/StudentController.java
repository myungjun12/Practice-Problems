package com.kh.practice.student.Controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	// 배열을 통해 5개의 객체 공간 생성
	private Student[] stArr = new Student[5];
	public static final int CUT_LINE = 60;
	// 기본 생성자
	public StudentController() {
		stArr[0] = new Student("차명준","자바",80);
		stArr[1] = new Student("이동연","디비",75);
		stArr[2] = new Student("정민규","자바",95);
		stArr[3] = new Student("홍기영","디비",70);
		stArr[4] = new Student("김정현","자바",65);
	}
	// Student[]의 주소값 리턴하는 메소드 //후에 for-each문에서 각 개체 출력할때 사용
	public Student[] stAddress() {
		return stArr;
	}
	// 반의 점수 총합값 리턴
	public int sumScore() {
		int sum = 0 ;
		 // 참조타입 
		for(Student st : stArr) {
			sum += st.getScore();
		}
		return sum;
	}
	// 반의 점수의 평균 실수형 배열을 통해 메서드 정의
	public double[] averageScore() {
		double[] db = new double[2];
		db[0] = sumScore();
		db[1] = sumScore()/ stArr.length;
		return db;
	}
	// 각 학생의 합격 여부 출력 메서드
	public void passedInfo() {
		for(Student st : stArr) {
			st.setPassed(st.getScore() >= CUT_LINE);
			System.out.println(st.getName() + " 학생 : " + (st.isPassed() ? "합격" : "불합격") +"입니다.");
		}
	}
	// 각 학생의 등급 출력 메서드
	public void gradeInfo() {
		for(Student st : stArr) {
			if(st.getScore() >= 80) {
				st.setGrade('A');
			}else if(st.getScore() >= 70) {
				st.setGrade('B');
			}else if(st.getScore() >= 50) {
				st.setGrade('C');
			}else {
				st.setGrade('D');
			}
			System.out.println(st.getName() + " 학생 : " + st.getGrade());
		}
	}
}
