package com.edupalm.quiz;

public class ExQuiz01 {

	public static void main(String[] args) {
		// 현실의 상태, 프로그램 실행 상황 조건 표현
		boolean alarm = false;
		boolean isOpen = false;// close false
		boolean isLock = true; // false unlock
		// ~ 아니면  NOT 연산
		alarm = !( !isLock && isOpen ) ;// 상황
		if(alarm) {
			// 잠김 상태에서 문이 열리면
			System.out.println("출동해라~~~~");
		}
	}
	
	public static void main01(String[] args) {
		// 조건식 : 값이 크기만 아니라 "상황"
		// 여러 개의 값을 함께 생각해야 하는 경우
		// 문의 상태
		boolean isOpen = false;// close false
		// 잠금 장치의 상태
		boolean isLock = true; // false unlock
		if(isLock) {
			// 잠겨있다... 문은 닫혀있다...
			isLock = false;
		}
		isOpen = true;
		System.out.println("들어간다");
		
		
		if(isOpen) {
			System.out.println("들어갈 수 있다.");
		}else {
			System.out.println("들어갈 수 없다.");
			if(!isLock) {
				System.out.println("열고 들어간다.");
			}else {
				System.out.println("푼다.");
				if(!isLock) {
					System.out.println("열고 들어간다.");
				}else {
					System.out.println("잠금을 풀 수 없다");
				}

			}

		}
		if( isOpen && isLock) {
			System.out.println("문은 열려있으면서 잠금장치는 잠긴 상태");
		}
		if( isOpen && !isLock) {
			System.out.println("문은 열려있으면서 잠금장치는 잠겨있지 않은 상태");
		}	
		
		// 범위를 판단하는 조건식 : ~ ~ 사이 -> 관계연산자
		int v = 29 ;
		if( v <= 10 || v >= 20) {
			// 두 조건 하나라도 참일 때
			System.out.println();
		}
		if( v >= 0 && v <= 20) {// <-- 이상이면서 이하이면 : 사이
			// 두 조건 모두 참일 때
			// 조건의 범위 겹치는 부분 없이 독립적인 범위	
		}
		System.out.println(v);
	}

}
