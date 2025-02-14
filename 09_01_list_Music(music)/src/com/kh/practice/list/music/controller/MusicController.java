package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		list.add(music);
		return list.size();
	}
	public int addAtZero(Music music) {
		list.add(0, music);
		return list.size();
	}
	public List<Music> printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				return music;
			}
		}
		return null;
	}
	public Music removeMusic(String title) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}
		}
		return null;
	}
	public Music setMusic(String title, Music music) {
		for(int i = 0; i < list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.set(i, music);
			}
		}
		return null;
	}
	// int 반환하는 이유는 list.size 반환해서 list값이 0인지 아닌지 확인하기위해
	public int ascTitle() { // new AscTitle 정렬기준을 호출
		list.sort(new AscTitle()); // (정렬기준_getTitle을 비교해서) sort_ 정렬하겠다.
		return list.size(); //아.. 반환값이 없으면 정렬할 리스트가 존재하지않는거니까 0보다 작으면 수행하지 않았다는것을 알기위해서 !.!
	}
	//람다식을 썻네 흠
	public int descSinger() {
			//정렬기준을 넣어줘야하는데
		list.sort( (o1,o2) -> o2.getSinger().compareTo(o1.getSinger())); // 내림차순
//		list.sort((o1,o2) -> o1.getSinger().compareTo(o2.getSinger()));  // 오름차순
		return list.size();
	}


}
