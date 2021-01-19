package com.edupalm.functions;

import java.util.Date;
import java.util.Scanner;

/**
 * 
 * 주차장 요금 계산기
 * - 요금 기준 : 시간차를 구해서 추가요금 + 기본요금
 * 
 * 기능
 * - 입차 : 값 
 * - 출차 : 값
 * 
 * 키보드 입력받기
 * 
 * @author Hyunil
 *
 */
public class ConcoleApp01 {
	// 필요한 데이터를 필드로 선언해보기
	// 필드에는 연산 처리를 하지 않는다. 선언만 하는 것이다...
	static long price;    // 요금
	static long intime;   // 들어온 시간
	static long outtime;  // 나가는 시간
	static long perMin = 10;   // 분단위 : 추가요금 기준
	static long duration; // 시간차
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// 흐름 잡기
		boolean run = true;
		while( run ) {
			// 사용자가 선택한다... 문자열 명령을 입력한다...
			String cmd = kb.nextLine();
			// 입력받은 문자열과 다른 문자열 비교한다....
			switch(cmd) {// handler(함수) Table
			case "in":
				inCar();		break;
			case "out":
				outCar();		break;
			case "exit":
				run= false; break;
			}
			
//			if("in".equals(cmd)) { // 모든 글자가 같으면 참
//				inCar();
//			}
//			if("out".equals(cmd)) {
//				outCar();
//			}
//			if("exit".equals(cmd)) {
//				break;
//			}
		}
		
	}

	private static void outCar() {
		// TODO: 차가 나간다...
		System.out.println("차량번호 > ");
		String Carno = kb.nextLine();
		// 들어온 시간 : intime;
		// 나가는 시간
		outtime = new Date().getTime();
		// 시간차: 얼마나 시간
		duration = outtime - intime;// 시, 분, 초, 날짜 - 정수
		// 24시간, 12시간
		// 추가요금 계산
		// 120(분)/10 * 500;
		long extra = (duration / 10) * perMin; 
		// 받은 총요금 계산
		price = 5000 + extra;
		
		System.out.println(price);
		
		
	}

	private static void inCar() {
		// TODO : 차가 들어온다...
		System.out.println("차량번호 > ");
		String Carno = kb.nextLine();
		// 현재 시간 값 저장하기
		intime = new Date().getTime();// 실행되는 시점에서의 시간 값 저장
		// 1/1000 * 1000* 초 / 60 분
		//		Calendar, LocalDateTime
		
	}

}
