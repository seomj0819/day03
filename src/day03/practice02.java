package day03;

import java.util.Scanner;

public class practice02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//int n2, n2, n2;
		//System.out.println("수 입력");
		//n1 = input.nextInt();
		//n2 = input.nextInt();
		//공백을 구분자로 여러개의 숫자를 한번에 받을 수 있다.
		
		int num1;
		System.out.print("첫번째 입력");
		num1 = input.nextInt();
		int num2;
		System.out.print("두번째 입력");
		num2 = input.nextInt();
		int num3;
		System.out.print("세번째 입력");
		num3 = input.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		}
		if (num3 > num1 && num3 > num2) {
			System.out.println(num3);
		}
		System.out.println("다음 문장");
	}

}
