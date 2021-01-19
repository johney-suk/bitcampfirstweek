package com.edupalm.baseball.team;


import java.util.Random; 
import java.util.Scanner; 

public class Team03_1 {
	static int strike = 0; // 스트라이크 변수 선언
	static int ball = 0; // 볼 변수 선언

	public static void main(String[] args) {
		int guess[] = new int[3]; 	
		Random random = new Random();

		while (guess[0] == 0) {
			guess[0] = random.nextInt(10);
		}

		while (guess[0] == guess[1] || guess[1] == 0) {
			guess[1] = random.nextInt(10);
		}

		// [3]중에 [1]번째와 [3]번째가 중복되거나,
		// [2]번째와 [3]번째가 중복되거나,
		// [3]번째가 0이라면 랜덤 값 넣음
		while (guess[0] == guess[2] || guess[1] == guess[2] || guess[2] == 0) {
			guess[2] = random.nextInt(10);
		}
		
		if(a == guess[2] || a == guess[3]) {
            ball++;
        if(b == guess[1] || b == guess[3]) 
            ball++;
        if(c == guess[1] || c == guess[2]) 
            ball++;
		}

		
}
	}