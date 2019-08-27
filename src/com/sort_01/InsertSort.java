package com.sort_01;

import com.util.Print;

public class InsertSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
//		int[] arr = RandomArray.getIntArray(1000);
		long s = System.currentTimeMillis();
		insertSort(arr);
		long e = System.currentTimeMillis();
		Print.print(arr);
		System.out.println("ºÄÊ±£º"+(e-s));
	}

	public static void insertSort(int[] arr) {
		int p = 0;
		for(int i = 1; i<arr.length; i++){
			int temp = arr[i];
			for(p = i; p>0&&temp<arr[p-1];p--){
				arr[p] = arr[p-1];
			}
			arr[p] = temp;
		}
	}
	
	public static void insertSort(int[] arr, int left, int right) {
		int p = 0;
		for(int i = left+1; i<=right; i++){
			int temp = arr[i];
			for(p = i; p>0&&temp<arr[p-1];p--){
				arr[p] = arr[p-1];
			}
			arr[p] = temp;
		}
	}

}
