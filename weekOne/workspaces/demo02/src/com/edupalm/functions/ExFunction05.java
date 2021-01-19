package com.edupalm.functions;

/**
 * 
 * 기본형 변수들의 전달은 값을 복사해서 두 개의 변수에 같은 값의 상태 
 * (참조형)
 * 모든 지역성에 따라 다른 함수의 변수를 직접 접근 수정할
 * 수 없다.. - 저장할 값을 반환 받아 저장하는 명령 처리 가능
 * 
 * -return (10,20); 불가, 1개만 반환할 수 있다. --> 필드로 빼면 전달,반환 필요 없다...
 * 
 * 
 * @author Hyunil
 *
 */
public class ExFunction05 {
	// 필드는 클래스 속성
	// 지역변수 ? 모르면 필드로 빼세요
	static int idx;
	static int score;
	static int count = 0;

	public static void main(String[] args) {

		counting();
		counting();
		counting();

		// 몇 번 호출했을까?

		// 학생 번호, 점수 2개의 데이터를 받고 싶다.
//		getStudent(); // 결정한다. 누가 저장(=)했냐?
//		System.out.println(idx + ":" + score);
	}

	private static void counting() {
		// TODO Auto-generated method stub
		int a; // 지역변수는 호풀 시 새로 생성된다.

		// 이 함수가 호출된 회수를 저장하세요
		count += 1;
		// 실행한 결과 값을 반환하지 않는다.
		// 그 값을 계속 유지하고 있어야 한다.

	}

	private static void getStudent() {
		// TODO: 데이터를 저장한다.
		idx = 10;
		score = 100;
	}

	public static void main02(String[] args) {

		int number;// 변수의 값을 누가 결정하냐?
		number = edit();// 지역변수 값을 저장/변경 by 다른 함수 반환 값
		// 값을 받아서 변경,저장
		System.out.println(number);
	}

	public static void main01(String[] args) {
		// 일시적, 변경할 수 없다.
		int value_main;
		value_main = 10;
		// 다른 함수가 이 함수의 변수를 직접(이름)수정할 수 있냐?
//		edit(value_main);
		System.out.println("main : " + value_main);

	}

	/**
	 * 
	 * 값을 전달받는다.... 변수의 자료형을 잘보세요... 기본형(Primitive)
	 * 
	 */
	private static int edit() {
		// value_edit = value_main : 변수 2개, 값은 같다
//		value_main = 10;// 직접 접근할 수 없다...
		return 1000;// 반환형에 자료형을 쓴 경우 반드시 return 실행해야 한다.
		// 함수 종료된다.
//		System.out.println();
		// != main

	}

}
