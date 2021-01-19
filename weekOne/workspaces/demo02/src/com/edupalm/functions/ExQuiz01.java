package com.edupalm.functions;

// 계획을 세운다.. 실행 절차, 자료형 결정, 전달 반환 문맥 연결
public class ExQuiz01 {
	static int gl;
	
	private static int best(int i, int j) {
		gl = 10;
	
		return ( i > j) ? i : j;
	}
	
	private static int than(int i, int j) {
		// 보다 큰 값을 반환한다..
		return ( i > j) ? i : j;
//		System.out.println();
	}
	
	public static void main(String[] args) {
		// 두 "정수"를 "전달"받아서 보다 큰 값을 "반환"하는 함수를 만드세요
		int bigger = than(23, 40);
		System.out.println(bigger);// 준다. 받는다..

		// 이야기 중 코드를 읽지 않는다. 일반, 공통 규칙 : 용어 중요하다...
		// 똑같은 얘기, 싸운다...
		
		// 이건 필드로 빼라~ 이유? 싸우세요
		// 자료형(정수, 문자열)
		
		// 전달과 반환 : 문법적인 규칙이 된다.
		// 자료형, ~ 개
		// 유연하게 생각, 넓게(사용성 높이라)
		// 필드를 사용하는 함수 : 해당 필드가 없으면 안된다. (의존성 갖는다);
		
	}

}
