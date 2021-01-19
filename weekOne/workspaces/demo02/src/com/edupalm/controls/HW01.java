package com.edupalm.controls;

import java.io.IOException;

public class HW01 {

		public static void main(String[] args) throws IOException {
			// 입력버퍼
			

	        int countN = 0;
	        int counte = 0;
			int countE = 0;
			int k;
			while( (k=System.in.read()) != '\n') {
				if (k >= 65 && k <= 90) {
					countE++;
			  } if (k >= 97 && k <= 122) {
				  counte++;
			  } if ( k >= 48 && k <= 57)
				  countN++;

			  System.out.println("영소문자 개수는 :" + counte+ "영대문자 개수는 :" + countE +"숫자 개수는 :" +countN);
				
			}
			System.out.println("영소문자 개수는 :" + counte+ "영대문자 개수는 :" + countE +"숫자 개수는 :" +countN);
			
		}
		
	}
