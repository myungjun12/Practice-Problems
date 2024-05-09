package com.kh.practice.student.view;

import com.kh.practice.student.Controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	StudentController sdc = new StudentController();
		
	public void studentInfoMenu() {
		System.out.println("이름\t과목\t점수");
		System.out.println("================");
		for(Student st : sdc.stAddress()) {
			System.out.println(st.information());
		}
		System.out.println("반의 총 합계 : " + sdc.sumScore());
		System.out.println("반의 총 평균 : " + sdc.averageScore()[1]);
		System.out.println("반평균 통과/미통과 : " + (sdc.averageScore()[1] >= sdc.CUT_LINE));
		// 각 학생의 합격/불합격 출력
		System.out.println("학생별 합격 불합격 통계");
		sdc.passedInfo();
		// 최종 학생별 등급 출력
		System.out.println("학생별 등급 통계");
		sdc.gradeInfo();
	}
}
