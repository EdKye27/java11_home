package org.KH.app2;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		/*
	 	숫자 맞추기 게임 :
	 	무작위로 퀴즈의 답이 되는 수(랜덤수)를 점수 형태로 발생시키고,
	 	답이 되는 숫자가 입력될 때 까지 계속 입력을 받되,
	 	만약 퀴즈의 답과 일치하는 숫자를 입력하면 "축하합니다. 맞추셨습니다." 라고 출력한다.
		 */
		
	//한 자리 랜덤 수 뽑기 (예시)
	int quiz = (int) (Math.random()*10);		//Math.random 식은 0~1 사이의 소숫점 랜덤으로 나타나기에 *10 입력 필요
	System.out.println(quiz);
		
	//문제 풀어보기!
	Scanner s = new Scanner(System.in);
	while(true) {								
		System.out.println("숫자 입력 [0-10] : ");	//맞을 때 까지 반복해서 물어봐야 하기에 while 문 안에 숫자 입력 란이 들어가게 된다
		int n = s.nextInt();
		if(quiz==n) {
			System.out.println("\n축하합니다. 맞추셨습니다.");
			break;
		}
	}
	
	}

}