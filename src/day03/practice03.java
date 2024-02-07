package day03;

import java.util.Scanner;

public class practice03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.print("수 입력");
		num = input.nextInt();
		
		if (num %3 == 0 && num %4 == 0 && num !=0) {
			System.out.println("3의 배수 이면서 4의 배수에도 해당합니다.");
		}
		else if (num %3 ==0 && num !=0) {
			System.out.println("3의 배수에만 해당합니다.");
		}
		else if (num %4 ==0 && num !=0) {
			System.out.println("4의 배수에만 해당합니다.");
		}
		else if (num %3 != 0 && num %4 != 0){
			System.out.println("3의 배수도, 4의 배수도 해당안됩니다.");
		}
		else {
			System.out.println("0은 잘못입력했습니다.");
		}
		
		
		
		
	}	
}
