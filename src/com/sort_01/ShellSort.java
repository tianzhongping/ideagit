package com.sort_01;

import com.util.Print;
import com.util.RandomArray;

public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
		int[] arr = RandomArray.getIntArray(10000);
		long s = System.currentTimeMillis();
		shellSort(arr);
		long e = System.currentTimeMillis();
		Print.print(arr);
		System.out.println("ºÄÊ±£º"+(e-s));
	}
	
	public static void shellSort(int[] arr){
		int p = 0;
		for(int gap = arr.length/2;gap>0;gap/=2){
			for(int i = gap; i<arr.length; i++){
				int tmp = arr[i];
				for(p = i; p>=gap&&tmp<arr[p-gap];p-=gap){
					arr[p] = arr[p-gap];
				}
				arr[p] = tmp;
			}
		}
	}

}
