package com.kh.practice.set.model.compare;

import java.util.Comparator;

import com.kh.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator<Lottery> {
							
	@Override	//  Comparator는 "두 매개변수 객체를 비교"
	public int compare(Lottery o1, Lottery o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
