/*
	각자리가 등차수열인 수의 갯수를 구하라
 */


package com.hbj.step6;

import java.util.Scanner;

public class Step6_1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int cnt = 0;
		
		for(int i=1; i<=input; i++) {
			
			// input 이 100 보다 클때
			if(i >= 100) {
				String first = Integer.toString(i).substring(0, 1);
				String second = Integer.toString(i).substring(1, 2);
				String third = Integer.toString(i).substring(2, 3);
				
				int int_first = Integer.parseInt(first);
				int int_second = Integer.parseInt(second);
				int int_third = Integer.parseInt(third);
				
				if((int_second-int_first) == (int_third-int_second)) {
					cnt++;
				}
				
			} else {
				cnt++;
			}
		
		}
		
		System.out.println(cnt);
		
		
		
	}

}
