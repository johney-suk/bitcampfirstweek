package com.edupalm.quiz;

import java.util.Random;

public class ExQuiz10_3 {
	// 3. 버스가 8개의 정류장 지나간다... 정원 40명
	// 각 정류장에서 임의 인원이 내리거나, 타거나
	// 각 정류장에서 탑승 인원을 출력하라.
	public static void main(String[] args) {
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

