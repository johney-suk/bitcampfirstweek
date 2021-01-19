package com.edupalm.controls;

import java.io.IOException;

/**
 * 
 * 변수: 자료형, 저장된 값의 의미
 * 함수
 * 제어문 기본 사용법 
 * - 공통적으로 조건식의 결과형 boolean <- 관계연산, 논리연산
 * 분기문(선택문) : 조건이 참이면 ~ 선택(실행)
 * 반복문 : 조건이 참이면 계속 실행
 * 
 * @author bit
 *
 */
public class ExStatement01 {

	public static void main(String[] args) throws IOException {
		// 순서: 조건식을 먼저 본다.
		// 키보드 입력된 문자가 숫자가 아니면 다시 입력하기.
		int key = System.in.read();
//		while( (key = System.in.read()) >= '0' );
	
		while( !( '0'<= key && key <= '9' )) {
			//실행을 하지 않는 경우가 있다.			
			key = System.in.read();
		}
		
		do {
//			한 번은 실행 
//			실행된 결과에 따라 반복 결정
			key = System.in.read();
		}while( !('0'<= key && key <= '9') );
		
	}
	
	public static void main05(String[] args) {
		// 규칙성 찾기 : 제어하기 쉬워진다.
		// 조건식에서 사용된 변수 변해야 조건이 거짓이 될 수 있다...
		for(int i=10; i<=30 ;i+=5){// 5번 실행
			for( int k=0; k < 15; k+=1) {
				System.out.print("-");
			}
			// - 를 15번 출력할 때마다 행을 내린다.
			System.out.println();// 화면 출력 형식 행을 내리는 지점
		}
		
	}
	
	/**
	 * 반복을 구현할 때
	 * 1. 한 번을 찾기 - 규칙성 찾기
	 * 2. 변하는 것을 찾기 - 언제 얼마로 변한다..
	 * 3. 영향이 있는가 <- 식으로 표현하기
 	 * @param args
	 */
	public static void main04(String[] args) {
		// ~ 에서부터 ~까지 ~씩 반복한다... for 문
		// 1 에서부터 15까지 연속하는(+1) 정수들 출력
		// 변수명 같으면 연산 줄여서 쓰는 방법 : 복합대입
		for( int i=1/*초기식 = */ ; i <= 15/*조건식 참*/; i += 1/*증감식 +1, -1*/)
		{
			// 제어문 식을 생략할 수 있다.. 조건식을 생략:무한반복
			System.out.print(i+" ");
		}// end loop
		
//		System.out.println(); // dead code
		
		
	}
	
	public static void main03(String[] args) {
		// 조건식- 범위 판단 가능 : if
		//	switch 0 ~ 10 : 0 1 2 3 4 6 : 범위 조건 줄 수 없다..
		// Mapping : 연결, 1->변환->'월'
		//	Table : ASCII 
		// 요일:일 월 화 수 <- 정수 0 1 2 3 4 5
		int nweek = 1;
		char cweek = ' ';
		switch( nweek ) {
			case 0:	cweek = '일';	break;
			case 1:	cweek = '월';	break;
			case 2:	cweek = '화';	break;
			case 3:	cweek = '수';	break;
			case 4:	cweek = '목';	break;
			case 5:	cweek = '금';	break;
			case 6:	cweek = '토';	break;
		}
		System.out.println(cweek+"요일");
		
		
		
		int irq = 10;// 정수를 문자,문자열, 함수로 연결하는 표를 만든다.
		String message = "";
		switch( irq ) {
		case 10:	message = "마우스눌렀음"; break;
		case 404:	message = "페이지없음"; break;
		case 503:	message = "개발자오류"; break;
		}
		System.out.println(message);
		
	}
	
	public static void main02(String[] args) {
		// if 조건에 따라서 결정한다...	조건식: 논리
		// switch 값에 따라서 결정한다... 	상수식: 값(산술식)
		// 시작점을 찾는다... 여기까지만 실행하고 나가라 break;
		int value = 3;// 얼만지 모르는 상태
		int n = 10;
		switch( value ) {// 저장된 값에 따라서 ... 
		case 1:	// 값만 1개 쓴다..
		case 5:	
			System.out.println("1");
			break;// { } 나간다
		case 2:	// 값만 1개 쓴다.. <- 시작한다...
			System.out.println("2");
			break;// { } 나간다
		case 3:	// 값만 1개 쓴다..
			System.out.println("3");
			break;// { } 나간다
		case 4:	// 값만 1개 쓴다..
			System.out.println("4");		
			break;// { } 나간다
		}// end switch
		
		// 필수로 적어야 case
		// break; 선택적으로 사용
		
	}
	
	public static void main01(String[] args) {
		// if 의 기본 형식		
		if( 3 < 9 /*조건식*/ )
		{
			System.out.println("참이다");
		}// end if : 중괄호 쌍이 항상 개수 맞아야 한다.
		
		// 참 또는 거짓 중 하나를 반드시 실행한다...
		// 조건연산자 : 값을 선택
		if( 3 > 10) {
			// 참
		}else {
			// 거짓
		}
		
		// 다중(중첩) : 조건들의 연속
		// 중첩: 안쪽 들여쓰기 많아져서 보기가 불편 - 가독성이 떨어진다..
		// 열맞춤 : 구조는 그대로이고, 보이는 모습만 편하게
		// 범위 구간으로 나누어서 조건
		int score = 80;
		if( score >= 90 ) {
			// 'A';
		}else if( score >= 70 ) {// 90미만이면서 
		}else if( score >= 50 ) {// 70미만이면서
		}else {
			
		}

	}

}