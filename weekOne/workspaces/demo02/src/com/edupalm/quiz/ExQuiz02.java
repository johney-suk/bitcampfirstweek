package com.edupalm.quiz;

import java.util.Random;

public class ExQuiz02 {

	public static void main(String[] args) {
		// 여러 개의 정수들을 난수로 출력하기
		// 몇 개? 마지막 ? 10 보다 작으면 종료한다.
		Random random = new Random();
		int v;
		for(; ;) { // 조건식을 생략하면 무한 반복
			v= random.nextInt();
		if( v < 10) { // 반복 종료하는 조건
			break;// stop loop
		}
		System.out.println();
	}// end loop

}
}