package com.kh.practice.student.model.vo;

public class Student {
//필드 이름 과목 점수 등급
	private String name;
	private String subject;
	private    int score;
	private   char grade;
	private boolean passed;
	//메서드
	//Setter
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	//Getter
		public boolean isPassed() {
			return passed;
		}
	
		public String getName() {
			return name;
		}
		public String getSubject() {
			return subject;
		}
		public int getScore() {
			return score;
		}
		public char getGrade() {
			return grade;
		}
	//기본 생성자
	public Student() {
		
	}
	//필수 생성자
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	//인스턴스 변수들의 정보 출력 메서드
	public String information() {
		return "이름 : " + name + " 과목 : " + subject + " 점수 : " + score;
	}
}
