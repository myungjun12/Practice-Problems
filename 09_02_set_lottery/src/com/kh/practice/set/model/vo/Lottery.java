package com.kh.practice.set.model.vo;

import java.util.Objects;

/**
 * @author PC
 *
 */
public class Lottery implements Comparable<Lottery>{

//필드
	private String name;
	private String phone;
//메서드
	
	//기본생성자
	public Lottery() {}
	//필수생성자
	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	//Getter
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	//String toString
	@Override
	public String toString() {
		return " [ 이름 = " + name + ", 전화번호 = " + phone + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Lottery other = (Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
	@Override
	public int compareTo(Lottery o) {// Comparable은 "자기 자신과 매개변수 객체를 비교"
		return this.name.compareTo(o.name);
	}
	
}
