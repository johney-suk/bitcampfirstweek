package com.edupalm.functions;

public class ExFunction03 {

	// 함수 실행 결과 변화가 있도록 만든다.. 변수가 있어야 한다.
	// 변수가 누구에게 있고, 어떤 값을 누가 결정...
	// 함수를 호출하는 쪽에서 값을 결정한다.... 전달한다....
	// 호출되는 전달되는 값을 받아야 한다... 변수를 선언해야 한다.. 매개변수
	public static void main(String[] args) {
		// 구구단 출력 함수로 구현해보기
		int start = 2;
		for(int k=0; k<3; k+=1) {
			printBlock(start);// 3개씩 단을 출력, 왼쪽 첫 단의 값을 준다.
			// 2에서부터 3단씩 +3 증가해서 
			start+=3;
		}
	}
	/**
	 * 
	 * @param left
	 * 	왼쪽 첫 번재 단으로 사용한다.
	 */
	private static void printBlock(int left) {
		// TODO : x1 ~ x9 행 9개를 출력한다...
		for(int i=1; i<10; i+=1) {// 행의 개수
			printLine(left, i);// 3번째 3을 곱해라 
			// 행의 번호, 1~9: 곱할 값
		}		
	}
	private static void printLine(int left, int value) {
		// 한 행을 출력, 3개의 단 곱셈을 출력
		// 좀 더 편한 방법 찾아라 처리가 연속해서 실행(반복)
		for(int v=0; v<3; v+=1) {
			int dan = left+v;
			int i = value;// 행에 따라서 다르다.. <- 호출하는 함수가 행을 결정
			int multi = dan * i;
			System.out.print(dan+" x "+i+" = "+multi+"\t");
		}
		System.out.println();// 출력 결과는 1개 행
	}

}
