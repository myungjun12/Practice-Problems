package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;
						// 뮤직클레스 참조하는 컴퍼레이터 인터페이스 
public class AscTitle implements Comparator<Music> {
	
	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

	
	}


