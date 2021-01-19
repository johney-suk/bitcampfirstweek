package com.edupalm.baseball.team;

/**
 * 이제는 우리가 헤어져야 할 시간
 * 다음에 또 만나요~
 * 
 * 코딩의 기준...잡기
 * - 문제 자체 분석, 판단
 * 
 * @author bit
 *
 */
public class Sampler01 extends Player{

	// 여러 함수들이 하나의 변수를 사용, 접근 필드
	int call;
	int count;
	
	@Override
	public void ready() {
		answer = 987;
	}

	@Override
	public int call() {
		// 상대에게 부를 3자리 정수를 반환
		// 전달 값 여부, 자료형
		// 반환 값 여부, 자료형
		// 함수 반환
		if( count == 0) {
			call = 123;
		}
		count += 1;// 회수, 개수
		return call;
	}

	@Override
	public void predict(int strike, int ball) {
		// 다음에 call() 반환할 값을 예상,계산 처리
		//지역변수 는 다른 사용할 수 없다...
		// 두 개의 정수를 전달받아
		// 반환 없다... 순서와 값 변경
		if( count == 1) {
			// 처음 부른 값에 대답이 들어온것이다. call = 123;// call() 함수에서 이 값을 반환
			call = 456;
		}
		if( count == 2) {
			// 두번째 부른 call = 456;
			call = 789;
		}
		if( count == 3) {
			// 세번째 부른 call = 789;
		}
	}

	
}
