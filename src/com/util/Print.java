package com.util;

public class Print {
	
	public static void print(int[] arr){
		String str = "";
		for(int i : arr){
			str += ", "+i;
		}
		System.out.print(str.replaceFirst(", ", "¥Ú”°£∫")+"\n");
	}
	
	public static void print(String[] arr){
		String str = "";
		for(String s : arr){
			str += ", "+s;
		}
		System.out.print(str.replaceFirst(", ", "¥Ú”°£∫")+"\n");
	}

}
