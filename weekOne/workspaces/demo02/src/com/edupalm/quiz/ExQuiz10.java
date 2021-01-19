package com.edupalm.quiz;

import java.util.Random;
import java.util.Random;

public class ExQuiz10 {
	// 1. 로또번호 생성기 - 3세트 이상 출력하기
	// 2. 3자리 정수를 생성해서 출력하기 ( 각 자리 중복 값 없어야 한다)
	// 123,224x
	// 3. 버스가 8개의 정류장 지나간다... 정원 40명
	// 각 정류장에서 임의 인원이 내리거나, 타거나
	// 각 정류장에서 탑승 인원을 출력하라.

	public static void main02(String[] args) {

// 2.
		Random r = new Random();

		int a = r.nextInt(900) + 100; // 100~999
		int b = a / 100;
		int c = a / 10 % 10;
		int d = a % 10;

		System.out.print("랜덤으로 뽑힌 숫자는 : ");

		if (b != c && b != d && c != d) {
			System.out.println(a + "\n");
		} else {
			a = r.nextInt(900) + 100;
		}

		System.out.print("100의자리:" + b + "\t");
		System.out.print("10의자리:" + c + "\t");
		System.out.print("1의자리:" + d + "\t");

	}
//3
	public static void main03(String[] args) {
		Random ran = new Random();
		int max = 40;
		int stops = 8;
		int in = 0;
		int out = 0;
		int current = 0;

		for (int i = 1; i <= stops; i += 1) {
			in = ran.nextInt(max);
			out = ran.nextInt(max);
			current = current + in - out;
			if (current < 0) {
				current = 0;
			}else if (current >= max) {
				current = max;
			}
			System.out.println(i+"번째 정거장 탑승인원은 " + current+"명");

	}
	}
}
