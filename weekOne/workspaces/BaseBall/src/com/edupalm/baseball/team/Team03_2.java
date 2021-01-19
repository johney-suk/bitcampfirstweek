package com.edupalm.baseball.team;

import java.util.Random;

/**
 * 1. s+b == 3 이면 call값 빼고 나머지 숫자 지우기 2. s+b == 3 이면 call값 지우기 3.
 * 
 */
public class Team03_2 extends Player {
	static int last = 8; // 가상 tNum 요소번호 0~8번까지 초기값은 9개
	int call;

	public int call() {
		return call;
	}

	public void predict(int strike, int ball) {
		// 상대방의 대답 보고 예측해서 
		
		int tNum[] = {1,2,3,4,5,6,7,8,9};
		int guess[] = new int[3];
		getRan(guess); // 3자리 랜덤값 생성
		int sb = strike+ball;

		
		if(sb == 3) { // tNum에서 guess값 빼고 지우기
			  int a =0;
		      for(int i = 0; i<guess.length; i++) {
		      for(int j = 0; j<tNum.length; j++) {
		      if(tNum[j] == guess[i]) {
		      a = guess[i];
		             }

		          }
			
		}
		
		if(sb == 0) { // tNum에서 guess값만 지우기
			for(int m=0;m<guess.length;m+=1) {
				for(int i=0;i<(last+1);i+=1) {	// last == tNum.length()-1 이라고 생각...
					if(guess[m] == tNum[i]) {
						for(int k = i; k<last;k+=1) {
							tNum[k] = tNum[k+1];
						}// end 당기기(지우기)
						tNum[last] = 0; // 당긴다음 맨 끝값 0으로 세팅
						last -= 1;	// 요소번호 줄여서 가상으로 tNum이 0~last값 까지만 있다고 상정하자...
					} // end 같은지 비교
				} // end for
			} // end for
		} // end if 노스트라이크 노볼
		
	}

	static int[] getRan(int[] guess) {
//		guess = new int[3];  
		int ran = 0; // 랜덤값을 받을 변수를 만듭니다.
		boolean cheak; // 중복값 비교
		Random r = new Random();

		for (int i = 0; i < guess.length; i++) {
			ran = r.nextInt(9) + 1; // 0~9까지 랜덤값 뽑기
			cheak = true; // i문이 돌 때마다 cheak를 true로
			for (int j = 0; j < i; j++) { // if문 때문에 j를 i값만큼 돌림
				if (guess[j] == ran) { // 값이 같으면?
					i--; // i의 값을 하나 줄여 한 번 더 돌게 한다.
					cheak = false; // 목적과는 다르게 같은 값이 나왔으므로 cheak를 false로.
				}
			}
			if (cheak) { // 위의 if문의 조건을 만족하지 않았으면 자동으로 cheak는 true므로 실행
				guess[i] = ran; // ran에 받은 값을 guess[i]방에 넣습니다.
			}
		}

		for (int i = 0; i < guess.length; i++) { // guess값 확인용 반복문
			System.out.print(guess[i]);
		}
		return guess;
	}

}
