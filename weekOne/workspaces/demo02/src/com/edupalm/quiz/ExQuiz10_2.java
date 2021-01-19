package com.edupalm.quiz;

import java.util.Random;
// 2. 3자리 정수를 생성해서 출력하기 ( 각 자리 중복 값 없어야 한다)
//		123,224x
public class ExQuiz10_2 {

	public static void main(String[] args) {
		Random r = new Random();

		int a = r.nextInt(900) + 100; // 100~999
		int b = a / 100;
		int c = a / 10 % 10;
		int d = a % 10;

		System.out.print("랜덤으로 뽑힌 숫자는 : ");

		if (b != c && b != d && c != d) {
			System.out.println(a+"\n");
		}else {
			a = r.nextInt(900) + 100;
		}
		

		System.out.print("100의자리:" + b + "\t");
		System.out.print("10의자리:" + c + "\t");
		System.out.print("1의자리:" + d + "\t");

	}

}
