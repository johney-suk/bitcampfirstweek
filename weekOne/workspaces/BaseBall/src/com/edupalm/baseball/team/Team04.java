package com.edupalm.baseball.team;
//야구게임 v 팀전
//자바 1주차 팀별 과제

//플레이어 2명 서로 상대의 수를 맞춘다...
//1.각자 자신의 정답 정하기 필드 answer에 저장
//2.한명 caller.call() 번호부르기 -> replier.reply() 대답 스트라이크0 볼1
//3.caller.predict()
//4.역할 바꾸기
//5.정답을 먼저 맞추면 승자 종료.

//산출물(팀별)
//Team0x.java
//.call(); <--predict 함수에서 계산한 걸 반환: 중복없는 3자리 정수
//.predict(strike,ball);
//내가 부른 값에 대해 상대방이 대답한게 전달된다.
//다음에 부를 값을 call함수에서 반환할수 있게 연결.

//각자 함수를 하나씩 만들어서 사용
//.predict(){
//	a();
//	b();
//	c();
//}

//스트라이크가 1이면 세자리중 하나는 맞췄다
//볼이		1이면 숫자는 맞췄지만 자릿수는 틀렸다

public class Team04 extends Player {
	int call = 0;
	int start = -1;

	public int call() {
		start += 1;
		return call;
	}

	public void predict(int strike, int ball) {
		int preNum[] = new int[3]; // {0,0,0}
		int sb = strike + ball;
		int a = 1;
		int i = 1;
		int j = 1;
		int temp = 0;
		int temp1 = 0;
		int count = 0;
		int count2 = 0;
		for (int k = 0; k < preNum.length; k++) { // {7,8,9}
			preNum[k] = k + 1;
		} // preNum[0] = 1; preNum[1] = 2; preNum[2] = 3;
		if (start == 0) {
			call = preNum[0] * 100 + preNum[1] * 10 + preNum[2]; // 123
			count2++;
		}

		if (start > 0) { // 123하고 반환값이 돌아왔을대.
			if (sb == 0 && count2 == 1) {
				for (int m = 0; m < preNum.length; m++) {
					preNum[m] += 3;
				}
				count2++;
			} // 123이 아니면 456확인
			else if (sb == 0 && count2 == 2) {
				for (int m = 0; m < preNum.length; m++) {
					preNum[m] += 3;
				}
				count2++;
			} // 아니면 789
			
		} else if (sb == 1) {
			preNum[1] = i;
			i++; // 1개라도 숫자가 상대 숫자에 존재하면 2번째 자리수에 1++을 넣는다
		} else if (sb == 2) {
			i = 0;
			preNum[2] = j;
			j++;
		} else if (sb == 3 && count == 0) { // 123 - > 213
			temp = preNum[0];
			preNum[0] = preNum[1];
			preNum[1] = temp;
			count++; // 1자리와 2자리를 바꿈
		} else if (sb == 3 && count == 1) { // 213  - >312
			temp = preNum[0];
			preNum[0] = preNum[2];
			preNum[2] = temp;
			count++; // 1의 자리와 3의 자리를 바꿈
		} else if (sb == 3 && count == 2) { // 312 - > 321
			temp = preNum[1];
			preNum[1] = preNum[2];
			preNum[2] = temp;
			count++; // 2의 자리와 3의 자리를 바꿈
		} else if (sb == 3 && count == 3) {	// 321 -> 132
			temp = preNum[2];		//1
			temp1 = preNum[1];		//2		
			preNum[1] = preNum[0]; //331
			preNum[0] = temp; //132
			preNum[2] = temp1;
			count++;
		} else if (sb == 3 && count == 4) { // 132 -> 231
			temp = preNum[0];
			preNum[0] = preNum[2];
			preNum[2] = temp; // 마지막 경우의 수
		}
		call = preNum[0] * 100 + preNum[1] * 10 + preNum[2];
	}

}
