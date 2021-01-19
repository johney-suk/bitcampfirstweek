package com.edupalm.baseball;

import java.io.IOException;

import com.edupalm.baseball.team.*;

/**
 * 
 * 야구게임
 * - 3자리 정수를 서로 맞추는 예측 게임
 * - 값 같다, 위치 같다 스트라이크 : 스트라이크 3이면 정답을 맞춘 것
 * - 값 같다, 위치 다르다 볼
 * 
 * @author edupalm
 *
 */
public class GameStarter {

	public static void main(String[] args) throws IOException {
		// 각 팀 소스파일을 읽어들인다.
//		Player[] robot = { new Team01(), new Team02(), new Team03(), new Team04(), new Cricker()};
		Player[] robot = { new Sampler01(), new Sampler02()};
		int[] score = new int[robot.length];
		// 새로 시합 시작됩니다.
		for(int p1=0; p1 < robot.length;p1++) {
			for(int p2=0; p2 < robot.length;p2++) {
				if( p1 != p2 ) {
					System.out.println((p1+1)+" vs "+(p2+1));
					robot[p1].ready();
					robot[p2].ready();
					int caller = p1;
					int replier = p2;
					int loop = 0;
					while(loop < 200) {
						++loop;
						int value = robot[caller].call();
						int[] count = robot[replier].reply(value);
						int strike = count[0];
						int ball = count[1];
						System.out.println((caller+1)+"["+value+"] -> "+(replier+1)+"[S: "+strike+", B: "+ball+"]");
						if(strike == 3 ) {
							System.out.println((caller+1)+" team win");
							score[caller]++;
							break;
						}
						robot[caller].predict(strike, ball);
						// 바꾼다.. 역할
						caller = ( caller == p1 ) ? p2 : p1;						
						replier = ( replier == p1 ) ? p2 : p1;						
					}
					if( loop >= 200) {
						System.out.println("제한 수 초과 : draw");
					}
				}
			}			
		}
		
		System.out.println("전체 시합 결과");
		for(int i=0; i < robot.length;i++) {
			System.out.println("team["+(i+1)+"]\t"+score[i]);
		}

	}

}
