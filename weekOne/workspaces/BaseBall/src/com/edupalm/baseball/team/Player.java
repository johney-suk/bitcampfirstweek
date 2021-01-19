package com.edupalm.baseball.team;

/**
 * 
 * 야구게임 선수 
 * - 이 클래스를 상속받아 자신의 선수를 작성
 * 
 * @author edupalm
 *
 */
public class Player {
	protected int answer = 123;
	
	public int[] reply(int value) {
		int strike = 0;
		int ball = 0;
		int copy = answer;
		for(int p1=0; p1<3; p1++) {
			int v1 = copy % 10;
			copy /= 10;
			int opp = value;
			for(int p2=0; p2<3; p2++) {
				int v2 = opp % 10;
				opp /= 10;
				if( v1 == v2 ) {
					if( p1 == p2 ) {
						strike++;
					}else {
						ball++;
					}
				}				
			}
		}
		return new int[]{strike,ball};		
	}
	
	private int genRandom() {
		boolean[] flag = new boolean[10];
		int number = 0;
		for(int i=0; i < 3; ++i) {
			int r;
			do {
				r = (int)(Math.random()*100)%9+1;
			}while( flag[r] );
			number = (number*10) + r;
			flag[r] = true;
		}
		return number;
	}

	public int call() {
		return genRandom();
	}

	public void predict(int strike, int ball) {
//		System.out.println("나는 아무 생각이 없다 :"+answer);
	}

}
