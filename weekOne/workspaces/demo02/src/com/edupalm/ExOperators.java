package com.edupalm;

/**
 * 
 * 연산자들
 * - 연산의 결과 자료형
 * 
 * 정의하세요 : 결정하세요 어떤 값을 어떤 의미로 본인들이 정해라
 * 
 * 산술연산 : 값
 * 관계연산 : 논리(boolean)	~이면 값 간의 비교 ( 3 어떤 의미로 사용되는가 ? )
 * 논리연산 : 논리				조건 간의 비교(조합)
 * 
 * 비트연산 : 정수				2진수 연산(자리)
 * 
 * @author bit
 *
 */
public class ExOperators {

	/**
	 * 
	 * 조건식 80%
	 * - 변수의 의미를 잘 생각하기
	 * - 실행되는 절차에서 현재 상황(값)
	 * - 이후에 어떻게 될거다(되야 한다)
	 * @param args
	 */
	public static void main(String[] args) {
		// 논리연산자 : 조건식이 여러 개 있을 때 사용
		//	조건식 2개 이상 있을 때
		boolean a = 10 < 20;// 조건 a
		boolean b = 10 <= 20;// 조건 b		
		boolean c = a && b; // 합친다...
		boolean d = a || b; // 합친다...
		boolean e = !a; // 반전... 아니면
		
		// ~에서 ~사이 0 < n && n < 10
		int min = 1;
		int max = 10;
		int ran = 28;
		boolean check = (min <= ran) && (ran <= max);// 이상 이면서 , 그리고 이하
		System.out.println( check );
		// 컴퓨터가 판단한다... 조건식(관계연산자)
		// 조건식 2개 이상이어서 같이 봐야하는 것은 논리연산자 합친다
	}
	
	public static void main_compare(String[] args) {
		// 값 간의 크기를 비교연산자
		//	물어본다는 생각 필요 -> true, false  대답한다...
		// ~이면, 냐? 조건식을 쓰세요
		boolean a = 10 < 20;// ?
		boolean b = 10 <= 20;
		boolean c = 10 > 20;
		boolean d = 10 >= 20;
		boolean e = 10 == 20;	// 등호의 개수가 달라요
		boolean f = 10 != 20; // 다르면, 아니면
		
		// 제어의 조건으로 사용하는 연산자
		if( a ) {
			// true 이면 실행, 선택한다...
		}
	}
	
	public static void main_arith(String[] args) {
		//  두 개의 값이 있어야 한다.
		//	정수와 정수 -> 정수
		//	실수가 있는 경우 -> 실수(double)
		// 1개 이상의 연산자를 사용한 문장 -> expression (식)
		int a = 10 + 5;	// 0 인 경우 부호는 다르고 절대값 같다
		int b = 10 - 5;	// 0 인 경우 두 값이 같다..
		int c = 10 * 5;
		int d = 10 / 5;	// 슬래쉬-방향은 따로 생각
		int e = 10 % 5;	// 배수 판별식, 짝수, 홀수 나머지가 얼마이면
		
		// 최대, 최소
		int min = 1;
		int max = 10;
		int number = (max-min+1);// min ~ max 연속하는 정수의 개수(길이)
		number = (max+min) / 2; // 중간값 취한다..
		// 프로그래밍 시 수학 공식 종종 사용된다...
		
		// 나머지 연산의 성질 - 원형 저울,시계 0~11:59 12:00 00:00 12시간,24시간
		// 범위를 초과하지 않도록 조정
		int ran = 89;// 임의 정수 값이 있을 때 출력될 때는 9를 최대값
		int value = ran % 10; // 0 ~ (10-1) : 최대값의 한정 할 수 있다..
		System.out.println( value );
		
		// 산술 계산기 용도만 있는건 아니다.
		// 제어할 때 조건을 맞추기 위한 연산으로 사용할 수 있어야 한다.
		

	}

}