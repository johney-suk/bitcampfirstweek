package com.edupalm.functions;

/**
 * 
 *   - 함수 : 실행 단위 - 프로그램을 구성하는 부품(Component)
 * - 독립적이면서 하나의 기능을 담당하도록 작게 여러 개 만든다.
 * - 사용자 정의 : 자기가 만든 함수들을 관리하세요(경력)
 * 
 * 1. 함수를 정의한다.(구현한다.)
 * 2. 다른 함수로부터 호출(call)되어야 실행된다....
 * -	호출측 <  준다,받는다  > 피호출측
 * -	데이터를 가지고 있다...(누구것이냐)
 * 3. 전달법(데이터를 상대에게 주는 방법) : 값, 참조(위치)
 * 4. 반환:되돌아온다.. 함수는 1개만 반환 가능(파이썬 여러 개 가능)
 * - 여러 개를 반환하고 싶으면 자료구조 사용(여러 개 저장하는 방법)
 *   
 *   함수 안에서 선언되는 변수들: 지역변수- 사라진다.... when 함수 종료
 *   - 일시적이다...
 */
public class ExFunction01 {

	public static void main(String[] args) 
	{
		// 프로그램이 실행, 시작 
		todo( ); // main 이 todo 를 실행시킨다...(호출한다)
		// static 함수 : 정적 함수 - static 만 사용할 수 있다..
		
	}
	// 함수 구현부
	// 반환 : 함수의 실행 결과 어떤 자료형의 값 나온다 선언
	// 함수명 : 동사목적어 getMember
	// ( ) : 매개변수를 선언 : 외부로부터 가져올 값을 저장하는 변수(입력)
	// { } : 실행 내용 작성
	static void todo() {
		// 전달과 반환이 없는 함수 : 프로시저
	}
	
	
}
