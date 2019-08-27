package com.util;

import java.util.Random;

public class RandomArray {
	
	public static int[] getIntArray(int number){
		int[] arr = new int[number];
		Random random = new Random();
		for(int i = 0; i<arr.length;i++){
			arr[i] = random.nextInt(number);
		}
		return arr;
	}
	
	public static int[] getEqualIntArray(int number){
		int[] arr = new int[number];
		Random random = new Random();
		int temp = random.nextInt(number);
		for(int i = 0; i<arr.length;i++){
			arr[i] = temp;
		}
		return arr;
	}

}
