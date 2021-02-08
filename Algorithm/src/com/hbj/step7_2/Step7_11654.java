/*
  - char와 String의 차이? char는 하나의 글자이고 그 값 그대로. String은 말그대로 문자열이므로 문자의 주솟값을 저장.
  - 아스키코드 : 문자를 컴퓨터 언어로 나타내기 위한 코드 
 */

package com.hbj.step7_2;

import java.util.Scanner;

public class Step7_11654 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = scan.nextLine().charAt(0);
		int num = ch;
		
		System.out.println(num);
	}

}
