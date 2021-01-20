

package com.hbj.step7;

import java.util.Scanner;

public class Step7_1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String input = scan.next().toUpperCase(); // 소대문자 구분 없으므로 다 대문자로 바꿔
		int[] arr = new int[26]; // 영문자의 갯수는 26개다 
		int max = 0;					// 가장 많이 나온 알파벳의 개수
		int index = 0;				// 가장 많이 나온 알파벳 인덱스
		
		for(int i=0; i<input.length(); i++) {
			int alpha = input.charAt(i); // alpha변수에 한문자씩 넣기
			arr[alpha-65]++; // 대문자 A의 ASCII code 값은 65임. 입력받은 문자가 a,A(toUpperCase 함수로 인해 대문자로 변환)라고 치면 
		}					// 65 - 65 = 0 이므로 위의 arr 배열의 0번째에는 a부터 순차적으로 개수를 샌다. A ~ Z 까지( 이해 꼭 해야함 )
		
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i+65; // 가장 많은 알파벳의 수가 있는 배열의 index번호 + 65 를 하면 그 알파벳의 ASCII code가 나옴 
			} else if(max == arr[i]) {
				index = '?';
			}
		}
		
		System.out.println((char)index);		// idx 출력
		
	}

}
