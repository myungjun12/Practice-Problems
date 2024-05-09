package com.kh.practice.Audition.model.vo;

public class Audition {
//필드
	private String name;
	private String value;
	private    int score;
	private boolean passed;
	private     char grade;
//메서드
	//Getter
	public char getGrade() {
		return grade;
	}
	
	public String getName() {
		return name;
	}
	public String getValue() {
		return value;
	}
	public int getScore() {
		return score;
	}
	public boolean isPassed() {
		return passed;
	}
	//Setter
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPassed(boolean passed) {
		this.passed = passed;
	}
	//기본 생성자
	public Audition() {
		
	}
	//필수 생성자
	public Audition(String name, String value, int score) {
		this.name = name;
		this.value = value;
		this.score = score;
	}
	// 문자열로 모든 필드값 반환 
	public String info() {
		return "이름 : " + name + "분야 : " + value + "점수 : " + score + " 등급 : " + grade;
	}
}
