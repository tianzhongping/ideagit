package com.sort_01;

import com.util.Print;
import com.util.RandomArray;

public class SelectSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
		int[] arr = RandomArray.getIntArray(1000);
		long s = System.currentTimeMillis();
		selectSort(arr);
		long e = System.currentTimeMillis();
		Print.print(arr);
		System.out.println("ºÄÊ±£º"+(e-s));
	}

	public static void selectSort(int[] arr) {
		int pos = 0, j = 0;
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			pos = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < tmp) {
					pos = j;
					tmp = arr[j];
				}
			}
			arr[pos] = arr[i];
			arr[i] = tmp;
		}
	}

}
