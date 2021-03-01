package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String num1 = scan.next();
		String t_num1 = num1.substring(2, 3) + num1.substring(1, 2) + num1.substring(0, 1); 
		int int_t_num1 = Integer.parseInt(t_num1);
		
		String num2 = scan.next();
		String t_num2 = num2.substring(2, 3) + num2.substring(1, 2) + num2.substring(0, 1); 
		int int_t_num2 = Integer.parseInt(t_num2);
		
		if(int_t_num1 > int_t_num2) {
			System.out.println(int_t_num1);
		} else {
			System.out.println(int_t_num2);
		}
		
		
		
		
		
		
	}

}
