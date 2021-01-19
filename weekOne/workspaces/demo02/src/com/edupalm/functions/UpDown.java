package com.edupalm.functions;

import java.util.Scanner;

/**
 * 
 * 정수 맞추기 : 1 ~ 100 사이의 정수를 정답 정하기 그 값 맞추기
 * 
 * 1. 임의 수를 부른다... 
 * 2. 정답 비교해서 대답 
 *  - 정답보다 큰 값인 경우 : up 
 *  - 정답보다 작은 값인 경우 : down 
 *  - 정답이면 종료 
 * 3. 정답이 아닐 때 대답에 따라 다음 값(예측)
 * 
 * 알고리즘 : 탐색
 *  - 이진 탐색법 : 최소 ~ 최대 사이의 중간 값 선택
 *  - 범위를 반씩 취한다(버린다)
 *  - 전제조건 : 값들이 정렬된 상태여야 한다...
 *   
 * @author Hyunil
 *
 */
public class UpDown {
	static int min = 1;
	static int max = 100;

	public static void main(String[] args) {
		// 전체적인 실행 흐름
		// 계산, 기능적 실행 함수를 호출한다...
		Scanner kb = new Scanner(System.in);
		int response = 0;// '0':up '1':down '2':correct
		int call = 1; // 1~100
		while (true) {
			System.out.println(min+"~"+max);
			call = getCall();// 잘 예측해라
			System.out.println(call + "대답 : ");
			response = kb.nextInt(); // 키보드에서 입련된 숫자르 정수로 바꿔준다.
			
			if (response == 2) {
				// 종료 조건
				System.out.println("정답입니다.");
				break;
				// continue; 조건식 되돌아간다. 이하 부분 실행 않고
			}
			// 이하로 내려가면
			predict(response, call);// 대답을 듣고 다음에 부를 값을 예측 처리
		} // end while

	}// end main

	private static void predict(int response, int prevcall) {
		// TODO: 사용자의 대답을 받아서 다음 값을 예상 처리
		// 특정 값을 찾는 것 : 탐색, 검색
		// 범위를 좁힌다... min max
		int UP = 0;
		int DOWN = 1;
		if( response == UP) {
			System.out.println("아까 부른 "+prevcall+" 보다 작은 값을 찾아야...");
			max = prevcall;
		}
		if( response == DOWN) {
			System.out.println("아까 부른 "+prevcall+" 보다 큰 값을 찾아야...");
			min = prevcall;
		}
	}

	private static int getCall() {
		// TODO: 사용자에게 부를 값을 반환한다...
		// predict 조절해 놓은 범위에서 가운데 값을 부른다..
		return (min+max) /2;
		// 10 ~ 20 : 30/2 : 15<--
		
	}
	
	// 함수가 맡은 역할별 권한이 있다...
	// 수정하는 수정할 수 있어야
	// 사용만 하는 경우
	// 데이터가 일한 논리, 의미 유지할 수 있어야... 아무나 수정, 출력 -> 혼란
	// 지역,매개,필드 구분
	// 접근권한자 : public, private
}
