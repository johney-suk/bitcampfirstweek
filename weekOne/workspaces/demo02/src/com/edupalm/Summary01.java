package com.edupalm;

import java.io.IOException;
import java.util.Random;

/**
 * 
 * 콘솔 환경에서 실행되는 프로그램 작성
 * 1. main 함수 1개 있어야 한다.
 * 
 * 변수들이 있어야 값들을 처리할 수 있다.
 * 1. 자료형 결정 : 정수(int), 실수(double), 문자(char), 문자열(String)
 * - 여러분이 값을 무엇으로 볼 건지 결정하세요.
 * 2. 변수 선언, 대입(저장), 사용(식에 쓴다)
 * - 변수의 선언 위치에 따라 사용범위가 다르다.
 * 
 * 변경되는 것들을 제어한다... (연산자, 식들을 조합)
 * 1. 연산자 : 결과의 자료형 ? 조건식(관계연산)
 * 2. 조건에 따라서 선택한다. 분기문(선택문) if, switch(값 얼마인 경우)
 * 3. 같은 처리를 여러번 연속해서 실행 : 반복문(조건식)
 * - 규칙성, 변하는 것과 그 영향 관계 -> 식을 완성
 * 
 * @author hsuk
 *
 */

public class Summary01 {
	
	public static void main(String[] args) {
	/*
	 * 구구단 출력하기
	 * [2][3][4] <- x1 ~ x9
	 * [5][6][7] <- x1 ~ x9
	 * [8][9][10] <- x1 ~ x9
	 */
		
//		2 x 1 = 2   3 x 1 = 3	4 x 1 = 4 \n
//		2 x 1 = 2   3 x 1 = 3	4 x 1 = 4 \n
//		2 x 1 = 2   3 x 1 = 3	4 x 1 = 4 \n
//		2 x 9 = 2   3 x 9 = 3	4 x 9 = 4 \n
		
//		5 x 1 = 2   6 x 1 = 3	7 x 1 = 4 \n
//		5 x 2 = 2   6 x 1 = 3	7 x 1 = 4 \n
//		5 x 6 = 2   6 x 1 = 3	7 x 1 = 4 \n
//		5 x 9 = 2   6 x 9 = 3	7 x 9 = 4 \n
		
//		8 x 1 = 2   9 x 1 = 3	10 x 1 = 4 \n
//		8 x 2 = 2   9 x 1 = 3	10 x 1 = 4 \n
//		8 x 6 = 2   9 x 1 = 3	10 x 1 = 4 \n
//		8 x 9 = 2   9 x 9 = 3	10 x 9 = 4 \n
		
//		for(int block = 0; block < 3;block+=1) {
//			// 각 블럭마다 9행
//			for(int line = 2; line < 9; line+=1) {
//				// 각 행마다 3개식 곱셈 값
//				for(int cols = 1; cols <= (block+3); cols+=1) {
//					// 각 행마다 3개식 곱셈 값
//					System.out.print(line+ " x " + cols +"=");
//				}
//				System.out.print("\n");
//			}// 9개 행을 출력했다
//			System.out.print("-----------------\n");
//		}//블럭 출력했다.
//		
//	 	// 구조(형식) 먼저보고 그 안에 데이터를 넣는다.
//	}
		
			for(int m = 2; m <= 8; m += 3) {//3블럭
				for (int y = 1; y <= 9; y += 1) {
					for (int x = m; x <= (m+2); x += 1) {
						System.out.print(x + "x" + y + "\t");
					}
					System.out.print("\n");
				}
				System.out.print("\n");
			}
		}
	
	public static void main03(String[] args) {
		// 학생 점수표를 출력한다. 학생 5명, 과목 3개
		// 행(학생), 열(과목) 형식으로 출력
		// 행열 구조를 2차-표
		int score;// random
		Random random = new Random();
		
		// 학생 5명의 반복한다.
		for(int i =0; i<5; i+=1){// 행단위 반복
			// 학생 1명의 점수 3개를 출력한다.
			System.out.print("["+i+"]");// 학생번호 1번 출력
			for(int k=0; k<3; k+=1){// 한 번 실행 : 열 단위 반복
				score = random.nextInt(101);
				System.out.print("["+k+"]"+score+"\t");// 점수 여러 개를 출력
			}
			System.out.print("\n");// 점수 3개를 출력한 후
		}
//		"[학생번호][과목번호]90	[과목번호]45 [과목번호]34\n"
		// 반복 주기, 순서(위치), 구분하는 값이 뭔가요?
		// (학생번호*과목개수)과목번호; // 전체 점수의 1차(일련번호)
		// 2차구조 -> 1차구조
//		0*3 + 0 => 0
//		0*3 + 1 => 1
//		0*3 + 2 => 2
//		1*3 + 0 => 3
//		1*3 + 1 => 4
//		1*3 + 2 => 5
	}
	
	public static void main01(String[] args) throws IOException {
		// 실행하고 싶은 모든 내용은 여기서부터 시작된다.
		// 입력받은 문자들의 구분과 개수 세기
		int keyValue;
		int numOfAlpha = 0;// 계수 값
		int numOfDigit = 0;
		// 키보드에서 입력되는 값들이 여러 개 다....
		// 몇 개 입력 ? 끝에는 엔터를 칠 거다.. 번역하듯이...
		while((keyValue = System.in.read()) != '\n' ) {
			// 판단하다... 계수한다...
			if( 'a'<= keyValue && keyValue <= 'z' /*소문자이면*/ ) {
				numOfAlpha += 1;// 센다.. 1씩 증가시킨다..
			}
			else if('A'<= keyValue && keyValue <= 'Z' /*대문자이면*/ ) {
				numOfAlpha += 1;// 센다.. 1씩 증가시킨다..

			}
			else if('0'<= keyValue && keyValue <= '9' /*숫자이면*/ ) {
				numOfDigit += 1;
			}
			else{
				// 기호들...
			}
		
	}
		System.out.println(numOfAlpha+" "+ numOfDigit);
}
}
