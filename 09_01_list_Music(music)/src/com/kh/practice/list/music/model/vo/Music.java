package com.kh.practice.list.music.model.vo;

public class Music {
//필드 
	private String title;
	private String singer;
//메서드
	//기본생성자
	public Music() {}
	//필수생성자
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	//Getter
	public String getTitle() {
		return title;
	}
	public String getSinger() {
		return singer;
	}
	//toString : String
	@Override
	public String toString() {
		return "[ 제목 : " + title + "작곡자 : " + singer + " ]";
	}
}
