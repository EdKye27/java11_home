package org.KH.app;

import java.util.Scanner;

//조건문 if-elseif(~else~)
public class Condition3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력[0-100] : ");
		int point = scan.nextInt();
		System.out.printf("\n당신의 점수는 %d점 입니다.",point);
	}

}