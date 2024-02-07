package day03;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3, max;
		System.out.println("수 입력");
		n1 = input.nextInt();		
		n2 = input.nextInt();		
		n3 = input.nextInt();		
		
		if(n2>n1 && n2 > n3) {
			System.out.println("n2가 가장 크다");
			if(n1 > n3) {
				System.out.println("n1가 두번째로 크다");
				System.out.println("n3가 세번째로 크다");
			}
			else {
				System.out.println("n3가 두번째로 크다");
				System.out.println("n1가 세번째로 크다");
			}
		}
		if(n1>n2 && n1 > n3) {
			System.out.println("n1가 가장 크다");
			if(n2 > n3) {
				System.out.println("n2가 두번째로 크다");
				System.out.println("n3가 세번째로 크다");
			}
			else {
				System.out.println("n3가 두번째로 크다");
				System.out.println("n2가 세번째로 크다");
			}
		}
		if(n3>n1 && n3 > n2) {
			System.out.println("n3가 가장 크다");
			if(n1 > n2) {
				System.out.println("n1가 두번째로 크다");
				System.out.println("n2가 세번째로 크다");
			}
			else {
				System.out.println("n2가 두번째로 크다");
				System.out.println("n1가 세번째로 크다");
			}
		}
	}
}
