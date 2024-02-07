package day03;

import java.util.Scanner;

public class practice04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

				System.out.print("1과목 : ");
				int num1 = input.nextInt();
				
				System.out.print("2과목 : ");
				int num2 = input.nextInt();
				System.out.print("3과목 : ");
				int num3 = input.nextInt();
				System.out.print("4과목 : ");
				int num4 = input.nextInt();
				System.out.print("5과목 : ");
				int num5 = input.nextInt();
				int sum = num1+num2+num3+num4+num5;
				if (num1<60 || num2<60 || num3<60 || num4<60 || num5<60 || sum<400) {
					System.out.println( "불합격입니다" );
					
				}else {
					
					System.out.println("합격입니다!"); 
				}
			    
				
				
			
				
				

			}

		
		
	}

