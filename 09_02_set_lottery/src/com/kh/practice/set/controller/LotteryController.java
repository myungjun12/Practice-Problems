package com.kh.practice.set.controller;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {

	HashSet<Lottery> lottery = new HashSet<>();
	HashSet<Lottery> win = new HashSet<>();
	// 추첨 대상 추가
	public boolean insertObject(Lottery l) {
		lottery.add(l);
		return true;
	}
	// 추첨 대상 삭제
	public boolean deleteObject(Lottery l) {
		 return lottery.remove(l);
	}
	// 모든 당첨자를 출력하는 메소드
	public Set<Lottery> winObject(){
		return win;
	}
	//정렬된 당첨자 목록을 출력하는 메소드
	 public TreeSet<Lottery> sortedWinObject() {
		 return new TreeSet<>(win);
	 }
	
	 public boolean searchWinner(Lottery l) {
		 return win.contains(l);
	 }
	 
}
