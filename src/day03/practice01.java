package day03;

import java.util.Scanner;

public class practice01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		System.out.print("첫번째 입력");
		num1  = input.nextInt();
		
		int num2;
		System.out.print("두번째 입력");
		num2 = input.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
		}
		
		if (num1 < num2) {
			System.out.println(num2);
		}
		System.out.println("다음 문장");
	}

}
