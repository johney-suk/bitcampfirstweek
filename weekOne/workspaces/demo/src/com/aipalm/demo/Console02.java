package com.aipalm.demo;

import java.io.IOException;

/**
 * 
 * 키보드 -> [입력버퍼] -> 프로그램
 * 버퍼가 비어 있어야 입력을 할 수 있다.
 * 입력 자료형과 프로그램에서 원하는 자료형이 다르다.
 * - 입력값의 유효성 확인
 * - 문자와 정수간의 변환표 : 문자코드(ASCII, Unicode:UTF) 
 * @author hsuk
 *
 */
public class Console02 {
	
	public static void main(String[] args) {
		// 문자 를 의미하는 값 : 그림을 출력한다
		System.out.println( '1' ); // 문자 '1' 
		System.out.println( (int)'1' ); // 문자 '1' 의 정수 값

	}
	
	public static void main02(String[] args) throws IOException {
		// 키보드로 정수 123을 입력받아서 출력하기
		// 입력과 출력 차이를 파악, 변환에 필요한 처리, 함수를 알고 있으면
		int key;
		int number = 0;
		key = System.in.read();// '1'
		number = (number *10) + key-'0'; // (0 * 10 ) +1; 
		key = System.in.read();// '2'
		number = (number *10) + key-'0'; // (1 * 10 ) +2 ->12 
		key = System.in.read();// '3'
		number = (number *10) + key-'0'; // (12 * 10 ) +3 -> 123
		System.out.println( number );
	}
	
	
	public static void main01(String[] args) throws IOException {
		// 키보드 :
		int v = System.in.read(); // 이 입력받는 함수가 반환하는 값이 정수이다.
		// 키보드 각 키의 번호(문자표에 정의된)
		// 첫번째 키 값을 반환하다.
		System.out.println( v-48 );
		// 'a'숫자 -> 49 - 48 -> 1정수
	
		// 키보드 입력값은 문자표에 정해진 정수값이 들어온다.
		// 다시 사람이 생각하는 값의 범위 계산
		
	}
}
