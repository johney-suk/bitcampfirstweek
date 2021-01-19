package com.edupalm.controls;

import java.util.Random;

public class ExQuiz01 {
	
	// HW3: (소문자,대문자,숫자,기호) + 영문자 개수, 숫자 개수 출력
	
	public static void main(String[] args) {
		// 6자리 정수(인증번호) 생성 5번 출력하세요
		// 9는 반드시 1개가 있어야 한다....
		// 알고리즘 : 아이디어 내기
		Random random = new Random();
		for(int i = 0; i < 5; i+=1) {
// 정수 만들기 시작 : 반복 시 한번의 기
			int number = 0;// 변수의 선언 위치 : 지역성(사용범위)
			for(int k=0; k<6; k+=1) {// 9가 없는 6자리 정수 만든다...
				int d; //= random.nextInt(8)+1;
				do {
					d = random.nextInt(9)+1;
				}while(d == 9);
				number = number * 10 + d;
			}
			// 9을 삽입/바꾼다...
			number = number / 10; // 한 자리 내림
			number = number * 10; // 한 자리 올림
			// 1의 자리에 9를 넣는다...
			number = number + 9; // 1의 자리가 0인 상태
			System.out.println(number);
			number = 0;
// 생성된 정수 출력하기 : 다음 정수를 만들기 위해서 = 0
			
		}
		
	}
	
	public static void main02(String[] args) {
		// min ~ max 연속하는 정수들 출력하기
		// 1. min max 임의 값
		// 2. 각 행에서 최대 6개까지 출력할 수 있다...
		// 		6개를 출력했으면 행을 내려라
		// for, if 
		Random random = new Random();
		int min = random.nextInt(100);// 음수, 양수
		int max = random.nextInt(100);
		if( min > max ) {
			// 교환- 두 변수의 값을 바꾸기 : 대입하는 순서를 잘 지키세요
			int t = min;// t[90] min[90]
			min = max;
			max = t;
		}
		System.out.println(min + "~" + max);
		
		int count = 0; // 출력한 개수 / 행
		for(int value = min; value <= max; value +=1) {
			System.out.print(value+ ",");
			count += 1;
			if( count == 6 ) {// 행을 출력하는 조건이 있다...
			System.out.println();
			count = 0;// 다시 세어야 한다.. 전체 개수를 세는 것이 아니다
			}
		}
		
	}
	
	/**
	 * 난수 발생
	 * 
	 */
	public static void main01(String[] args) {
		// 정수 기준에서 풀기
		Random random = new Random();// 생성한다..
		for(int i = 0; i<5; i+=1) {
//			int ran= random.nextInt();
			int ran= random.nextInt(1000);// 0 ~ 999
			System.out.println(ran);
		}
//		for(int i = 0; i<5; i+=1) {
//			double If = Math.random();// 0 ~ 1 소수이하
//			// 정수 범위로 바꾼다... 자리올림 * 100
//			int random = (int)(If*1000);					
//			System.out.println( random );
//		}
		
		
	}
}
