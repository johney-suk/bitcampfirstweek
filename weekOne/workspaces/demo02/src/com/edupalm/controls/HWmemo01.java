package com.edupalm.controls;
import java.util.Scanner;


public class HWmemo01 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String myNumber;
		myNumber = sc.nextLine(); 
		        int countE=0;
		        int countN=0;
		        
		        for(int i=0; i<myNumber.length(); i++) {
		            char k = myNumber.charAt(i); 
		            if (k >= '0' && k <= '9') {
		            	countN ++; 
		            }if (k >= 'A' && k <= 'Z') {
		            	countE ++;
		            }if (k >= 'a' && k <= 'z') {
		            	countE ++;
		            }

		        }
		        
		        System.out.println("영문자 개수는 :" + countE+ "숫자 개수는 :" +countN);
		        
		    }
			
	}
