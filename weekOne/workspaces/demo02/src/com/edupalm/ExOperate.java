package com.edupalm;

// 패키지가 다르면 가져오기(정보)
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
// 변경되는 것이 있다 없다.....
public class ExOperate {

	public static void main(String[] args) {
		// 지금 20분내 푸세요
		// 정수 2개를 입력받아서 크기 순으로 출력하세요
		Scanner kb = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요 > ");
		int a = kb.nextInt();
		int b = kb.nextInt();
		// 조건 판단 - 선택해야한다는 것 <- 제어해야 한다...
		// 제어문을 배우지 않은 상태입니다.			
		// 조건연산자 : 조건에 따라 하나를 선택한다...
		int small = (a < b) ? a : b;
		int big = (a > b) ? a : b;
		System.out.println(small + "," + big);// 문자열 + 정수 = 문자열
	}
	
	public static void main02(String[] args) {
		// 키보드 입력 시 원하는 자료형으로 받을 수 있다...
		//	입력기 -> 변환기(Filter) -> 원하는 자료형 받기
		Scanner kb = new Scanner(System.in);// 키보드에서 받는 값을 바꿔라
		// 오류 발생 시 처리를 내가 직접 어찌 하겠다
		try {
			// 원하는 자료형 next~~();
			int number = kb.nextInt();// 숫자들을 받아서 정수로 바꾼다
			kb.nextLine(); // 문자열 입력시
		}catch(InputMismatchException e) {
			System.out.println("사용자 오입력 시 내가 처리하겠다...");
		}		
		
	}
	
	public static void main01(String[] args) throws IOException {
		// 키보드에서 문자 1개를 입력받아서... 
		// 영문자이면 true 를 출력하세요
		
		// HW1. 2진수
		// HW2. 키보드 입력되는 문자들을 소문자, 대문자, 숫자, 기호로 구분하세요
			// ASCII 문자 값
		
		System.out.println("문자를 1개 입력하세요 : ");
		int code = System.in.read();// 입력 시 문제 생길 수 있다.
		char ch = (char)code;// 영문자 ASCII char 범위 초과하지 값이 입력될 것
		
		boolean low = 'a' <= ch && ch <= 'z';// 소문자이면
		boolean upper = 'A' <= ch && ch <= 'Z';// 대문자이면
		
		// 출력할 값이 바뀐다... 변수를 만든다.. 조건에 따라 적당한 값이 저장된다.
		boolean result = low || upper;// AND 둘 다 만족
		// 출력부터 만들어 보세요
		System.out.println( result );
		
		// 원하지 않는 결과가 나올 경우가 있는지 찾아라
		// 정상이다. 어떤 경우 비정상 나올지 고민해보기

	}

}