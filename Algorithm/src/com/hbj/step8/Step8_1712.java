package com.hbj.step8;

import java.util.Scanner;

public class Step8_1712 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); // 고정비용 
		int b = scan.nextInt(); // 가변비용 
		int c = scan.nextInt();	// 판매가격 
		// 우리가 구해야할건 손익분기점을 넘는 판매갯수(x)
		// 손익분기점이 존재하지 않을 시 -1 -> b > c
		// a + b*x < c * x 
		// a < x (c-b)
		// a / (c-b) < x
		
		if(b >= c) {
			System.out.print("-1");
		} else {
			int x = a / (c-b);
			System.out.println(x+1);
		}

	}

}
