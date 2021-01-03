package com.hbj.step7;

import java.util.Scanner;

public class Step7_11720 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input1 = scan.nextInt();
		String input2 = scan.next();
		int[] arr = new int[input2.length()];
		int sum = 0;
		
		for(int i=0; i<input1; i++) {
			arr[i] = Integer.parseInt(input2.substring(i, i+1));
			sum += arr[i];
		}

		System.out.println(sum);
	}

}
