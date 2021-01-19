package com.edupalm.quiz;


// 식들에 사용된 연산자들 동작 파악
// 산수 문제 풀기 : 숙명

// 함수 만들고, 실행시키고, 전달, 반환
// 야구게임 : 금요일 대전 팀별 점수 보고 1등

public class ExQuiz04 {
	
	public static void main(String[] args) {
		// 화면 모양꾸미기
		char sp = 'O';
		// 사각형 모양 : 정사각형 길이 4
		int row = 4;// 세로길이(행)
		int col = 6;// 가로길이(열)
//		for(int y=0; y<row; y+=1) {// 행, 세로
//			for(int x=0; x<col; x+=1) {// 열. 가로
//				System.out.print(sp);
//			}
//			
//			System.out.print("\n");
//		}
		// 직삼각형 모양 : 정사각형 길이 4
		for(int y=0; y<row; y+=1) {// 행, 높이
			for(int x=0; x<col; x+=1) {// 열. 밑변
				if( y >= (-1)*x+4 ) { // sp를 출력하는 조건
				System.out.print(sp);
				}else {
				System.out.print(" ");
				}

			}
			System.out.print("\n");
		}
		
		
		
	}
	
	
	public static void main02(String[] args) {
		// 분산, 편차, 표준편차 <- 통계 계산 해야하는 일이 많다.
		// 두 점의 위치를 알 때, 두 점을 잇는 직선 식을 완성하세요
		int x1 = 1;
		int y1 = 5;
		int x2 = 3;
		int y2 = 11;
		// y-y1 = ((y2-y1) / (x2-x1))*(x-x1)
		int a = ( y2-y1 ) / ( x2-x1 );	// 기울기(가중치)
		int b =	(x2*y1-x1*y2)/(x2-x1);// y축 기준 평행이동량
		
		// 직선그래프, 시각화
		for(int x = 1; x <10; x+=1) {
			int y = (a*x)+b;
			System.out.println("("+x+","+y+")");
		}
	}

	
	public static void main01(String[] args) {
		// 인공지능: 기계학습 : 딥러닝
		double a = 1; // 기울기 1
		double b = 0;
		double x = 1;
		double y = (a*x) + b;// 1차 함수
		
		for(int i=0; i <10;i+=1) {
			x = Math.random();
			y = (a*x) + b;
			System.out.println("("+x+","+y+")");
			
		}
		
	}

}
