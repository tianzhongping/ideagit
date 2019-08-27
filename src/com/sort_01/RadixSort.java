package com.sort_01;

import java.util.ArrayList;

import com.util.Print;

public class RadixSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = { "abc", "dfg", "ert", "aaa", "hjf", "bbb", "eer", "uit", "sdg" };
		long s = System.currentTimeMillis();
		radixSort(arr,3);
		long e = System.currentTimeMillis();
		Print.print(arr);
		System.out.println("ºÄÊ±£º"+(e-s));
	}
	
	@SuppressWarnings("unchecked")
	public static void radixSort(String[] arr, int stringLen){
		final int BUCKETS = 256;
		ArrayList<String>[] buckets = new ArrayList[BUCKETS];
		for(int i = 0; i < BUCKETS; i++){
			buckets[i] = new ArrayList<String>();
		}
		for(int pos = stringLen-1;pos>=0;pos--){
			for(String str : arr){
				buckets[str.charAt(pos)].add(str);
			}
			int idx = 0;
			for(ArrayList<String> thisBucket : buckets){
				for(String s : thisBucket){
					arr[idx++] = s;
				}
				thisBucket.clear();
			}
		}
	}

}
