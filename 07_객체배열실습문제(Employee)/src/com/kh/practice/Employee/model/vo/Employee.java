package com.kh.practice.Employee.model.vo;

public class Employee {
//필드 이름, 과목, 점수
	private String name;
	private String subject;
	private int score;
	private boolean pass;
	private char grade;
//메서드
	//Setter
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void setPass(boolean pass) {
		this.pass = pass;
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
	//Getter
	public char getGrade() {
		return grade;
	}
	
	public boolean isPass() {
		return pass;
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
	//기본 생성자
	public Employee() {
		
	}
	//필수 생성자
	public Employee(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	public String information() {
		return "이름 : " + name + " 과목 : " + subject + " 점수 : " + score + " 등급 : " + grade;
	}
}
