package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String str = scan.next();
		String[] arr = new String[num];
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) { 
			arr[i] = str.substring(i, i+1);
			
		}
		
		for(int i=0; i<arr.length; i++) { 
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
		
	}

}
