package org.KH.java;

public class Variable8 {

	public static void main(String[] args) {
		//가변 할당(동적 할당) : 자료형과 무관하게 해당하는 리터럴(값)
		var num1 = 20.456;
		var num2 = 34;
		var num3 = 'k';
		var num4 = "계성우";
		var num5 = true;
		num1 = 67; //67로 초기화
			
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		System.out.println("num5 : "+num5);
		
	}

}
