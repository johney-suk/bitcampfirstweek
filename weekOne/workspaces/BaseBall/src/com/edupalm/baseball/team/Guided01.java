package com.edupalm.baseball.team;

public class Guided01 extends Player {


	int step = 1;
	int[] step1 = {123,456,789};
	int[] step1_count = {0,0,0};
	int step1_index = 0;
	
	@Override
	public int call() {
		if(step == 1) {
			return step1[step1_index];
		}
		return 987;
	}

	@Override
	public void predict(int strike, int ball) {
		int sum = strike + ball;
		boolean isOut = (sum==0)? true:false;
		if(step == 1 )
		if(step1_index < 3) {
			step1_count[step1_index] = sum;
			++step1_index;
		}else {
			if( step1_count[0]==1 
					&& step1_count[1]==1 
					&& step1_count[2]==1) {
				step = 2;
			}
		}
		
	}

	public static void main(String[] args) {
		
	}
}
