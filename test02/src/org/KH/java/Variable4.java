package org.KH.java;

public class Variable4 {

	public static void main(String[] args) {
		String name = "\'계성우\'";
		short age = 27;
		float height = 170;
		double weight = 62.2;
		char init = 'k';
		
		/* 이스케이프 문자
		 \n : 줄바꿈
		 \t : 탭
		 \\ : \를 출력
		 \" : " 를 출력
		 \' : ' 를 출력
		 */

		 
		System.out.printf("%n이름 : \" %s \"", name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %.3f", height);
		System.out.printf("%n체중 :%.3f", weight);
		System.out.printf("\n이니셜 : "+init);
	}

}
