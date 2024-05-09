package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController empc = new EmployeeController();
	
	public EmployeeMenu(){
		
	}
public void printEmployeeMenu() {
	System.out.println("이름\t과목\t점수");
	for(Employee emp : empc.printEmployee()) {
			System.out.println(emp.information());
	}
	System.out.println("총 점수 합계 : " + empc.sumScore());
	System.out.printf("총 평균 점수 : %.2f%n",empc.averageScore()[1]);
	System.out.println("총 평균 합격 여부 (>60) : " + (empc.averageScore()[1] >= EmployeeController.CUT_LINE));
	empc.EmployeePass();
//	empc.employGrade();

}

}
