package com.edupalm;

/**
 * 소스 파일 생성하는 규칙
 * - 첫 글자 대문자
 * 
 * 실행시키려면 반드시 main 함수(메서드)
 * 
 * 자동완성 잘 지원되느냐 IDE 선택 - 인텔리J
 * 
 */
public class ExVar01 {

	public static void main(String[] args) {
		// 학생 점수를 처리하는 프로그램 만든다...
		// 각 학생마다 어떤 정보들이 필요한가?
		// 이름,국어,영어,수학 : 1명당 4개의 데이터 필요하다.
		String name;
		int k, e, m;
		double avg; // 나누셈 소수 필요
		
		// 정수, 실수 
		int sum = 64;
		int numbersOfStudent = 7;
		avg = (double)sum / numbersOfStudent; // 정수 나누기 정수 : 정수(소수값이 없음)
		System.out.println( avg );// 실수값을 얻으려면 실수로 연산
		
	}
	
	public static void main04(String[] args) {
		// 자료형을 일시적으로 바꿀 수 있다....
		// 형변환(casting) : 다형성
		// (변환할자료형)변수명,값
		int a = 97; // 정수를 저장한 변수
		char lt = (char)a; // a 변수의 값을 lt 변수에 복사 저장
		// 모두 다 되는건 아니고 가능한 범위가 있다..
		// 크기 : 범위에서 짤리지 않을거다...
		
		// 문자 처리할 때 형변환 동작
		// 1. ASCII : 문자 1개를 1byte 크기로 정의 : 영문자 정의
		byte ch = 'A';// 문자값:정수
		// 2. Unicode : 문자 1개를 2byte 이상으로 정의(자바에서는 2byte) : 다국어
		char ko = '한';	// byte[] : byte단위로 값을 받아서 2개씩 모아 char 바꾸는 처리 필요
		
		// 바이트 스트림 : 데이터를 주고받는 단위 1byte 씩
		// 캐릭터 스트림 : 데이터를 주고받는 단위 2byte 씩
		
		
	}
	
	public static void main03(String[] args) {
		// default 선택 : 코드에 값을 적으면 컴퓨터가 인식하는 자료형
		// 대입연산 시 양쪽 자료형을 일치시켜야 한다.
		 int n = 10;
		 double lf = 10.24;
		 // 만약 나는  float 사용해야한다
		 float f = 20.24F;
		 // mismatched convert from ~ to ~ 
		 char letter = 'A';// 문자 1개

		 // 참조형(클래스형)
		String s = ""; // 문자열
		
//		// 자료형 고르기
//		boolean // 논리형: true, false
//		
//		// 정수 :  크기가 다르다
//		byte	// 1byte
//		short	// 2byte
//		int		// 4byte : <-- 표현할 수 있는 10진 최대 자리 : 9자리 999999999  ~ 0
//		long	// 8byte
//		
//		// 실수 : 부동소수점 정수.소수
//		float	// 4byte
//		double	// 8byte <-- 
//		
//		// 문자 : unicode 기준 ( 2byte 이상 정의 )
//		char	// 2byte <-- 
//		
//		// 소문자 자료형 -> Primitive : 기본형
//		// 값 ~ 이다. 참조형 Reference : 위치 의미한다..
		
		
	}
	
	public static void main02(String[] args) {
		// 받기, 받아서 - 변수를 만든다... 저장한다....
		// 값을 저장하려면 반드시 변수가 있어야 한다.
		// 메모리의 일부분 (공간)
		// 1. 변수를 선언한다.  자료형 변수명; 의미를 알 수 있게..
		int v;	// 정수 값을 저장할 수 있는 변수 v
		// 2. 변수에 값을 저장한다.. 대입연산자(명령기호) 변수명 = 값,식,함수;
		v = 1;
		// 3. 변수를 사용할 수 있다.	 변수명 - 변수에 저장된 값을....		
		// 내가 작성하고 있는 이 소스에 있는 함수인 경우
		// 다른 클래스, 소스파일에  있는 위치표현해야 한다.
		System.out.println(v); //  v 변수의 값을 준다...
		
		
	}
	
//	println(){
//		
//	}
	public static void main01(String[] args) {
		// 실행할 내용들은 전부 여기에 작성
	
		// 모니터 화면 출력하기 -> 함수를 찾기
		System.out.println("행을\t내리지\n않음 ");	// 똑같은 목적 여러 개 함수들이 존재한다.
		// 문자 중에 제어문자(기호) : 공백문자라고도 해요 : 눈에 모양 보이지 않음
		// 동작을 의미하는 문자  \t \r\n<enter>
		// 화면 출력 시 모양(형식) formatted 문자열을 출력한다...		

	}

}