package org.KH.app2;

import java.util.Random;

public class Loop7 {

	public static void main(String[] args) {
		
		// 로또 645 번호 추첨기 만들어보자!
		int min = 1;
		int max = 45;
		Random r = new Random();
		for(int i=0; i<6 ;i++) {
			int val = r.nextInt(max + min) + min;
			System.out.println(val+"\t");
		}
		
	}

}
