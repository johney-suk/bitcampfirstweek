package com.edupalm.quiz;

import java.util.Random;

public class ExQuiz03 {
	
	/**
	 * 프로그래밍 처리해야하는 데이터 80% 이상 문자열
	 * 필요한 대부분 기능들은 이미 만들어져 있다...
	 * @param args
	 */
	public static void main(String[] args) {	
		int n = 234;
		// 정수를 문자열로 바꾸기
		String str = ""+n;//"234"
		str = String.valueOf(n);
		System.out.println(str);
		for(int i=0; i<str.length(); i+=1) {
			// 문자열의 길이 : 글자 개수
			// 번호가 작다. 첫번째 높은 자리값
			System.out.println(str.charAt(i));// 한 글자식 꺼내오기
		}
		
		// 숫자열 -> 정수
		int v = Integer.parseInt(str);// 정수로 바꿔서 반환한다.
		System.out.println(v);// 정수값을 출력
		
	}

	public static void main04(String[] args) {
		int n = 234;
		
		for(int i=0; i<3; i+=1) {
			int v= n % 10; // 일의 자리값
			System.out.println(v);
			n = n / 10;// 한 자리 낮아진다.
			// 234 -> 23 -> 2
	}
}
	public static void main03(String[] args) {
		// 2020-01-13-03. 3자리 정수 값을 정한다.
		// 각 자리로 분리해서 출련한다.
		int n = 234;
		int a = n / 100; // 백
		int b = (n/10)%10; // 십
		int c = n % 10; // 일
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	public static void main02(String[] args) {
		// 2020-01-13-02. 산수 문제
		// 전체 출력할 데이터의 개수가 120 개;
		// 1페이지에 25개씩 보여줄 것이다.
		// 페이지 개수-번호를 출력해 준다.
		// [1][2][3][4]..[12]
		int total = 12037;// 개의 데이터
		int numPerPage = 25;
		int numPages = total / numPerPage;
		int div = total % numPerPage;// 나머지가 있냐?
		if(div > 0) {
			numPages +=1;
		}
		// 페이지 번호를 현재 페이지 10씩만 보여준다. prev<< >>next
		for(int start = 1; start <= numPages; start+=10) {
			// start 왼쪽 첫번째 번호
			int end = start +9; // 9 는 한페이지에서보여줄 번호 개수 -1
			for(int page=start; page<=end; page +=1) {
				if(page <= numPages) {
				System.out.print("["+page+"]");
				}
			}
			System.out.println("\n");
		}
		System.out.println(numPages);
		
	}
	
	
	public static void main01(String[] args) {
		// 2020-01-13-01. 10개의 임의 정수들을 출력한다.
		// 그중에서 최소값, 최대값을 출력하세요
		int number;//출력할 값
		int min=0;	// 최소
		int max=0;	// 최대
		Random random = new Random();
		
		for(int i=0; i<10; i+=1) {
			number = random.nextInt(1000);
			// 처음에 한 번만 값을 저장해준다.
			if( i==0 ) {
			min = max = number;
			}else {
				// 두 번째 부터는 서로 비교해서 작은, 큰 찾는다..
				// 현재 최소보다 더 작은 값이 있다면
				if( min > number) {
					min = number;
				}
				// 현재 최대보다 더 큰 값이있다면
				if( max < number) {
					max = number;
				}
			}
			System.out.print(number+",");
		}
		System.out.println("Min :"+min+", Max :"+max);
	}

}
