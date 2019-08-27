package com.sort_01;

import com.util.Print;
import com.util.RandomArray;

public class HeapSort {

	public static int leftChild(int i){
		return 2*i+1;
	}
	
	public static void percDown(int[] arr, int i, int n){
		int tmp = arr[i];
		int child = 0;
		for(;leftChild(i)<n;i = child){
			child = leftChild(i);
			if(child!=n-1&&arr[child]<arr[child+1]){
				child ++;
			}
			if(tmp<arr[child]){
				arr[i] = arr[child];
			}else{
				break;
			}
		}
		arr[i] = tmp;
	}
	
	public static void swapReferences(int[] arr, int i, int n){
		int tmp = arr[n];
		arr[n] = arr[i];
		arr[i] = tmp;
	}
	
	public static void heapSort(int[] arr){
		for(int i = arr.length/2-1;i>=0;i--){
			percDown(arr, i, arr.length);
		}
		for(int i = arr.length-1;i>0;i--){
			swapReferences(arr, 0, i);
			percDown(arr, 0, i);
		}
	}
	
	public static void main(String[] args) {
//		int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5 };
		int[] arr = RandomArray.getIntArray(1000);
		long s = System.currentTimeMillis();
		heapSort(arr);
		long e = System.currentTimeMillis();
		Print.print(arr);
		System.out.println("ºÄÊ±£º"+(e-s));
	}
	
}
