package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		int[] arr = new int[24]; // 알파벳 24개 저장하는 배
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1; // 배열의 각 방에 -1값 넣음 
		}
		
		for(int i=0; i<str.length(); i++) {
			int temp = (int) str.charAt(i);
			for(int z=0; z<arr.length; z++) {
				if(temp-97 == z && arr[z] == -1) {
					arr[z] = i;
				}
			}
		}
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
