package com.sort_01;

import com.util.Print;
import com.util.RandomArray;

public class QuickSort {
	
	final static int CUTOFF = 20;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
		int[] arr = RandomArray.getIntArray(1000);
		long s = System.currentTimeMillis();
		quickSort(arr, 0, arr.length-1);
		long e = System.currentTimeMillis();
		Print.print(arr);
		System.out.println("ºÄÊ±£º"+(e-s));
	}
	
	public static void swapReferences(int[] arr, int i, int n){
		int tmp = arr[n];
		arr[n] = arr[i];
		arr[i] = tmp;
	}
	
	public static int media(int[] arr, int left, int right){
		int center = (left+right)/2;
		if(arr[center]<arr[left]){
			swapReferences(arr, left, center);
		}
		if(arr[right]<arr[left]){
			swapReferences(arr, left, right);
		}
		if(arr[right]<arr[center]){
			swapReferences(arr, center, right);
		}
		swapReferences(arr, center, right-1);
		return arr[right-1];
	}
	
	public static void quickSort(int[] arr, int left, int right){
		if(left+CUTOFF<=right){
			int media = media(arr, left, right);
			int i = left, j = right-1;
			for(;;){
				while(arr[++i]<media){}
				while(arr[--j]>media){}
				if(i<j){
					swapReferences(arr, i, j);
				}else{
					break;
				}
			}
			swapReferences(arr, i, right-1);
			quickSort(arr, left, i-1);
			quickSort(arr, i+1, right);
		}else{
			InsertSort.insertSort(arr, left, right);
		}
	}

}
