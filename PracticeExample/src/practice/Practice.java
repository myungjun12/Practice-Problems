package practice;

import java.util.Scanner;

public class Practice {

	public static void practice10() {
//		사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
//		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while(exit == false) {
			System.out.print("단 입력 : ");
			int dan = sc.nextInt();
			if(dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			System.out.println(dan + "단부터 9단까지 출력");
			for(int i = dan; i <= 9; i++) {
				System.out.println(i + "단");
				for(int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}// for 2
				System.out.println();
				if(i==9) {
					System.out.println("정상적으로 계산이 완료되었습니다.");
					System.out.println("종료하시겠어요? 네/아니오");
					String answer = sc.next();
					if(answer.equals("네")) {
						System.out.println("프로그램을 종료합니다.");
						exit=true;
					}else {
						System.out.println("계산을 계속합니다.");
					}
				}
			}//for main
		}//while 
	}
  
	public static void practice11() {
		// 시작 숫자, 공차, 10개만
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int dipNum = sc.nextInt();    
		for(int i = startNum; i <= startNum+(dipNum*9) ; i += dipNum) {
			System.out.print(i + " ");
		}
	}
	
	public static void practice12() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("계산을 진행할 정수1과 정수2 연산자 부호를 입력하세요.");
			System.out.println("연산자 부호 : (+,-,*,/,%,exit)");
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자부호 : ");
			String simbol = sc.next();
			int result = 0;
			switch(simbol) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					continue;
				}
				result = num1 / num2;
				break;
			case "%":
				if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					continue;
				}
				result = num1 % num2;
				break;
			case "exit":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				continue;
			}
			System.out.println(result);
		}
	}

	public static void practice13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num ; i++) {
			for(int j = 0; j < num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
	
		
	}
	
}