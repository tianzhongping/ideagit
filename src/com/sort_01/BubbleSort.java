package com.sort_01;

import com.util.Print;
import com.util.RandomArray;

public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
		int[] arr = RandomArray.getIntArray(1000);
		long s = System.currentTimeMillis();
		bubbleSort(arr);
		long e = System.currentTimeMillis();
		Print.print(arr);
		System.out.println("ºÄÊ±£º"+(e-s));
	}
	
	public static void bubbleSort(int[] arr){
		int tmp = 0;
		for(int i = 0; i<arr.length-1;i++){
			for(int j = 0; j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
