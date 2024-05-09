package com.kh.practice.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayPractice {

//	길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 
//	순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
	
		public void practice1() {
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i] + " ");
		}

	}
		
		public void practice2() {
			int[] numbers = new int[10];
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = numbers.length-i;
				System.out.print(numbers[i] + " ");
			}
		}

		public void practice3() {
//			사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
//			1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if(num < 0) {
				System.out.println("양의 정수를 입력해주세요.");
				return;
			}
			int numbers[] = new int[num];
			for(int i = 0; i < numbers.length; i++ ) {
				numbers[i] = i+1;
				System.out.print(numbers[i] + " ");
			}
		}

		public void practice4() {
			
			Random random = new Random();
			String str[] = {"사과","귤","포도","복숭아","참외"};
			for(int i = 0; i < str.length; i++) {
				int r = random.nextInt(5);
				System.out.println("str["+r+"] "+str[r] + " ");
			}
		}
		
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			System.out.print("문자 입력 : ");
			String str = sc.next();
		}
		// 보류..
		public void practice6() {
//			“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//			입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 
//			범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
			String[] day = {"월","화","수","목","금","토","일"};
			Scanner sc = new Scanner(System.in);
		while(true) {
				System.out.print("숫자 입력 : ");
				int num = sc.nextInt();
				if(num > 6 || num < 0) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				System.out.println(day[num]);
				break;
			}
		}
		
		public void practice7() {
			
			Scanner sc = new Scanner(System.in);
		while(true) {
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				if(num < 1) {
					System.out.println("1 이상의 값을 입력해주세요.");
					continue;
				}
				int[] numbers = new int[num];
				int sum = 0;
				for(int i = 0; i < numbers.length; i++) {
					System.out.print("numbers["+i+"] = ");
					numbers[i] = sc.nextInt();
					System.out.println(numbers[i]);
					sum += numbers[i];
				}
				System.out.println("numbers 배열 값들의 합 : " + sum);
				break;
			}
		}

		public void practice8() {
			
		}
		// 보류..
		public void practice9() {
//			길이가 7인 배열을 생성하고, 1 ~ 45까지 랜덤한 숫자값을 넣어서 출력
			Scanner sc = new Scanner(System.in);
			System.out.print("배열 길이(정수) : ");
			int num = sc.nextInt();
			String[] str = new String[num];
			Random random = new Random();
			int sum = 0;
			for(int i = 0; i < str.length; i++) {
				str[i] = Integer.toString(random.nextInt(45)+1);
				System.out.println("str["+i+"] " + str[i]);
				sum += Integer.parseInt(str[i]);
			}
			System.out.println("str[]배열 값의 합 : " + sum);
		}

		public void practice10() {
			
		}
		// 보류..
		public void practice11() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열 길이(정수) : ");
			int num = sc.nextInt();
			int[] numbers = new int[num];
			Random random = new Random();
			for(int i = 0; i < numbers.length; i++ ) {
				numbers[i] = random.nextInt(10)+1;
				System.out.print(numbers[i] + " ");
			}
		}

		public void practice12() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열 길이(정수) : ");
			int num = sc.nextInt();
			int[] numbers = new int[num];
			Random random = new Random();
			for(int i = 0; i < numbers.length; i++ ) {
				numbers[i] = random.nextInt(10)+1;
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
			int max = numbers[0];
			int min = numbers[0];
			for(int i = 0; i < numbers.length; i++) {
				if(max < numbers[i]) {
					max = numbers[i];
				}
			}
			System.out.println("최대값 : " + max);
			for(int i = 0; i < numbers.length; i++) {
				if(min > numbers[i]) {
					min = numbers[i];
				}
			}
			System.out.println("최솟값 : " + min);
		}

		public void practice13() {
			Scanner sc = new Scanner(System.in);
			System.out.print("배열 길이(정수) : ");
			int num = sc.nextInt();
			int[] numbers = new int[num];
			Random random = new Random();
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = random.nextInt(10)+1;
			}
			System.out.println(Arrays.toString(numbers));
			int count = 0;
			int[] exNum = new int[num];
			
			for(int i = 0; i < numbers.length; i++) {
				boolean plug = false;
				for(int j = 0; j < exNum.length; j++) {
					if(numbers[i]==exNum[j]) {
						plug = true;
					} 
				}
				if(!plug) {	
					exNum[count++] = numbers[i];
					}
			}
			System.out.println(Arrays.toString(exNum));
		}
}

