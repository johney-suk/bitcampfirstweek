package com.edupalm.baseball.team;

import java.util.Random;
import java.util.Scanner;


public class Team03{
//    static int gameCnt = 0;                
//    static int strCnt = 0;
//    static int ballCnt = 0;
//    static int ball = 0;
//    static int strike = 0;
//    static int answer1;                                                            
//    static int answer2;
//    static int answer3;
	

	public static void main(String[] args) {
		
		boolean next = false;
		
		// 랜덤 3개의 정수
		Random random = new Random();
    	int answer1 = random.nextInt(9)+1;// 첫번째 공
    	int answer2 = random.nextInt(9)+1;// 두번째 공
    	int answer3 = random.nextInt(9)+1;// 세번째 공
		
		// 랜덤 3개의 정수 중복값 확인
	    while(!next) {   

			
		 if(answer2==answer1 || answer2==answer3) {                  
			 answer2 = random.nextInt(10);
         }if(answer3==answer1 || answer3==answer2) {
        	 answer3 = random.nextInt(10);
         }else {
             next = true;
         }
	  }
	    // 정답
		 System.out.println("첫번째 공:"+answer1+"\t두번째 공:"+answer2+"\t세번째 공:"+answer3); 

		 // 볼, 스트라이크 맞추기
		 
		Scanner sc = new Scanner(System.in);
		
		int ball = 0; // 볼 개수
		int strike = 0; // 스트라이크 개수
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.println("첫번째 맞출 공: ");
		a = sc.nextInt(); 
		System.out.println("두번째 맞출 공: ");
		b = sc.nextInt();
		System.out.println("첫번째 맞출 공: ");
		c = sc.nextInt();
		
		// 볼 카운트
		if(a == answer2 || a == answer3) {
            ball++;
        if(b == answer1 || b == answer3) 
            ball++;
        if(c == answer1 || c == answer2) 
            ball++;
		}
        // 스트라이크 카운트
		if(a == answer1) {
	        strike++;
	    if(b == answer2) 
	        strike++;
	    if(c == answer3) 
	        strike++;
		 }
		System.out.println("ball 개수는: "+ ball+"\tstrike 개수는 : "+strike);
	}
	
}
