package com.kh.practice.list.library.model.vo;

public class Book {

//필드
	private String title; // 제목
	private String author;// 저자
	private String category;// 종류
	private    int price; // 가격
//메서드
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getCategory() {
		return category;
	}
	public int getPrice() {
		return price;
	}
	//기본 생성자
	public Book() {}
	//필수 생성자
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[ 제목 : " + title + ", 저자 : " + author 
			 + ", 종류 : " + category + ", 가격 : " + price + " ]";
	}
}
