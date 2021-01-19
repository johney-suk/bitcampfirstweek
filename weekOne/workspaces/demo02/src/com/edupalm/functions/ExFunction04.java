package com.edupalm.functions;

/**
 * 
 * 하수의 전달과 반환 그리고 지역성 클래스 안에서 변수를 선언하는 위치
 * 
 * 
 * @author Hyunil
 *
 */
public class ExFunction04 {
	// 함수 밖에 선언한 변수 : field
	static int global; // 전역 ; 모든 함수들이 사용할 수 있다...

	public static void main(String[] args) {
		// 지역변수 > 매개변수, { }

		// 함수에서 사용할 수 있다.
		// static 함수인 경우 필드도 static 여야 사용 가능
		global = 10;
		int local = 10; // 지역변수: 함수 안에서 선언
		for (int i = 0; i < 10;) {

		}

//		do {// 중괄호 -> 지역성을 갖게 한다.
//			int num = 10;
//		} while (num < 10);
//		// 중괄호 밖에서는 안에 선언된 것을 사용 불가
//		num = 100;// not resolved

	}

}
