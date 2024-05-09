package array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public void practice1() {

		String[][] table = new String[][] { { "(0,0)", "(0,1)", "(0,2)" }, { "(1,0)", "(1,1)", "(1,2)" },
				{ "(2,0)", "(2,1)", "(2,2)" } };

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] table = new int[4][4];
		int k = 1;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = k++;
				System.out.printf("%4d", table[i][j]);
			}
			System.out.println();
		}
	}

	public void practice3() {
		int[][] table = new int[4][4];
		int k = 1;
		for (int i = table.length - 1; i >= 0; i--) {

			for (int j = table[i].length - 1; j >= 0; j--) {
				table[i][j] = k++;
			}
		}
		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table[i].length; j++) {

				System.out.printf("%4d", table[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		int[][] table = new int[4][4];
		int k = 1;
		for (int i = 0; i < table.length - 1; i++) {
			for (int j = 0; j < table[i].length - 1; j++) {
				table[i][j] = k++;
				table[3][j] += table[i][j];// 00 10 20 3 1 01 11 21
				table[i][3] += table[i][j];// 20 21 22
			}
			table[3][3] += table[i][i];
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.printf("%4d", table[i][j]);
			}
			System.out.println();
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("행 크기 입력 : ");
			int num1 = sc.nextInt();
			if (num1 < 1 || 10 < num1) {
				System.out.println("행 : 반드시 1~10사이에 정수를 입력해야 합니다.");
				continue;
			}
			System.out.print("열 크기 입력 : ");
			int num2 = sc.nextInt();
			if (num2 < 1 || 10 < num2) {
				System.out.println("열 : 반드시 1~10사이에 정수를 입력해야 합니다.");
				continue;
			}
			char[][] ch = new char[num1][num2];
			for (int i = 0; i < ch.length; i++) {
				for (int j = 0; j < ch[i].length; j++) {
					ch[i][j] = (char) (int) (Math.random() * 26 + 65);
					System.out.printf("%4c", ch[i][j]);
				}
				System.out.println();
			}
			break;

		} // while

	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.printf("%4s", strArr[j][i]);
			}
			System.out.println();
		}

	}

	public void practice7() {
//		사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아 
//		문자형 가변 배열을 선언 및 할당하세요.
//		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		Scanner sc = new Scanner(System.in);
//		a = 97;
		System.out.print("행과 열의 크기 : ");
		int num1 = sc.nextInt();
		int k = 0;
		char[][] ch = new char[num1][num1];
		for (int i = 0; i < ch.length; i++) {
			System.out.print("[" + i + "]" + "행의 [열] 크기 입력 : ");
			int num2 = sc.nextInt();
			for (int j = 0; j < num2; j++) {
				ch[i][j] = (char) (97 + k);
				k++;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.printf("%4c", ch[i][j]);
			}
			System.out.println();
		}
	}

	public void practice8() {
//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배 
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		String[] student = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };
		String[][] table1 = new String[3][2];
		String[][] table2 = new String[3][2];
		int k = 0;
		System.out.println("== 1분단 ==");
		for (int i = 0; i < table1.length; i++) {
			for (int j = 0; j < table1[i].length; j++) {
				table1[i][j] = student[0 + k];
				System.out.printf("%4s", table1[i][j]);
				k++;
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < table2.length; i++) {
			for (int j = 0; j < table2[i].length; j++) {
				table2[i][j] = student[k];
				System.out.printf("%4s", table2[i][j]);
				k++;
			}
			System.out.println();
		}

	}

	public void practice9() {
	String[] student = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
									  "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] table1 = new String[3][2];
		String[][] table2 = new String[3][2];
		int k = 0;
		System.out.println("== 1분단 ==");
		for (int i = 0; i < table1.length; i++) {
			for (int j = 0; j < table1[i].length; j++) {
				table1[i][j] = student[0 + k];
				System.out.printf("%4s", table1[i][j]);
				k++;
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < table2.length; i++) {
			for (int j = 0; j < table2[i].length; j++) {
				table2[i][j] = student[k];
				System.out.printf("%4s", table2[i][j]);
				k++;
			}
			System.out.println();
		}
		System.out.println("=====================");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String st = sc.next();
//		for (String[] student1 : table1) {
//			if(student1.equals(st)) {
//				System.out.println();
//			}
//		}
		Arrays.stream(student).filter(x -> x.contains(st))
		.forEach(System.out::println);
		
	}
}
