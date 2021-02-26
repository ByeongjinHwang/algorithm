package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[26];
		int max = 0;
		int index = 0;
		
		String str = scan.next().toUpperCase();
		
		for(int i=0; i<str.length(); i++) {
			int alpha = str.charAt(i);
			arr[alpha-65]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = 65+i;
			} else if(max == arr[i]) {
				index = '?';
			}
		}
		
		System.out.println((char) index);
		
	}

}
