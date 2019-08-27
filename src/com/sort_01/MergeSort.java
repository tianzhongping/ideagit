package com.sort_01;

import com.util.Print;
import com.util.RandomArray;

public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
		int[] arr = RandomArray.getIntArray(1000);
		long s = System.currentTimeMillis();
		mergeSort(arr, new int[arr.length],0,arr.length-1);
		long e = System.currentTimeMillis();
		Print.print(arr);
		System.out.println("ºÄÊ±£º"+(e-s));
	}
	
	public static void mergeSort(int[] arr, int[] tmparr, int left, int right){
		int center = (left+right)/2;
		if(left<right){
			mergeSort(arr, tmparr, left, center);
			mergeSort(arr, tmparr, center+1, right);
			merge(arr, tmparr, left, center+1, right);
		}
	}
	
	public static void merge(int[] arr, int[] tmparr, int leftPos, int rightPos, int rightEnd){
		int tmp = leftPos;
		int leftEnd = rightPos-1;
		int number = rightEnd-leftPos + 1;
		while(leftPos<=leftEnd&&rightPos<=rightEnd){
			if(arr[leftPos]<arr[rightPos]){
				tmparr[tmp++] = arr[leftPos++];
			}else{
				tmparr[tmp++] = arr[rightPos++];
			}
		}
		while(leftPos<=leftEnd){
			tmparr[tmp++] = arr[leftPos++];
		}
		while(rightPos<=rightEnd){
			tmparr[tmp++] = arr[rightPos++];
		}
		for(int i = 0; i<number;i++,rightEnd--){
			arr[rightEnd] = tmparr[rightEnd];
		}
	}

}
