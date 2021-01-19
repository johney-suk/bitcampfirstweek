package com.edupalm.controls;

import java.util.Random;

public class PrinStar01 {

    private Object array;

	public static void Main(String[] args){
    	 
        int[] array = {1,2,3,4,5};

        double random= Math.floor(Math.random()*(array.length-1));

        System.out.println(array [random]);
    }
}
