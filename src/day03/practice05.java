package day03;

import java.util.Scanner;

public class practice05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//2조 1번
//		int year;
//		System.out.print("년도를 입력하세요 : ");
//		year = input.nextInt();
//		if (year<=1 || year >= 4000) { 
//			System.out.println("1~4000사이를 입력하세요.");
//		} else if (year%4==0 && year%100!=0) {
//			System.out.println("1");
//		} else if (year %400 == 0) {
//			System.out.println("1");
//		}
//		
//		else {
//			System.out.println("0");
//		}
		
		//2조 2번
		
//		int grade, score;
//		System.out.println("학년과 점수를 입력하세요");
//		grade = input.nextInt();
//		score = input.nextInt();
//		if (grade!=4&&score<=60) {
//			System.out.println("불합격");
//		}else if (grade==4 && score<=70) {
//			System.out.println("불합격");
//		}else
//			System.out.println("합격");
//		
		
		//2조 3번
		
//		int year, age;
//		System.out.print("현재 년도를 입력하세요. : ");
//		year = input.nextInt();
//		System.out.print("나이를 입력하세요. : ");
//		age = input.nextInt();
//		
//		int birth = year - age;
//		System.out.println(birth + "년도에 태어났습니다.");
		
		//1조 1번
//		int num;
//		System.out.print("정수를 입력하세요 : ");
//		num = input.nextInt();
//		if (num >= 0) {
//			System.out.println(num + "는 양수입니다.");
//		}
//		else {
//			System.out.println(num + "는 음수입니다.");
//		}
		
		//1조 2번
//		int num1, num2;
//		System.out.print("숫자를 입력하세요.");
//		num1 = input.nextInt();
//		num2 = input.nextInt();
//		
//		int sum, minus, times, divide, rest;
//		sum = num1+num2;
//		minus = num1-num2;
//		times = num1 * num2;
//		divide = num1/num2;
//		rest = num1%num2;
//		
//		System.out.println("덧셈\t뺄셈\t곱셈\t나눗셈\t나머지");
//		System.out.println(sum + "\t" + minus + "\t" + times + "\t" + divide + "\t" + rest);
		
		//1조 3번(모르게땅)
//		String text;
//		System.out.print("텍스트를 입력하세요");
//		text = input.next();
//		if (st)
		
		//3조 1번
		
//		int grade, kor, eng, math, average, gap;
//		System.out.print("학년을 입력하세요.");
//		grade = input.nextInt();
//		System.out.print("국어 성적을 입력하세요.");
//		kor = input.nextInt();
//		System.out.print("영어 성적을 입력하세요.");
//		eng = input.nextInt();
//		System.out.print("수학 성적을 입력하세요.");
//		math = input.nextInt();
//		average = (kor+eng+math)/3;
//		
//		if (grade <=3 && average <=65 ) {
//			System.out.println(65-average + " 점 미달로 불합격 입니다.");
//		}else if (grade ==4 && average <=75 ) {
//			System.out.println(75-average + " 점 미달로 불합격 입니다.");
//		}else if (grade ==5 && average <=75 ) {
//			System.out.println(75-average + " 점 미달로 불합격 입니다.");
//		}else if (grade ==6 && average <=80 ) {
//			System.out.println(80-average + " 점 미달로 불합격 입니다.");
//		}
		
		//3조 2번
//		int date;
//		System.out.println("일수를 입력하세요.");
//		date = input.nextInt();
//		if (date>= 30) {
//			System.out.println("1이상 30이하의 숫자를 입력해주세요.");
//		}else {
//			System.out.println(++date + "일입니다");
//		}
//		
		//4조 1번
		int dice1, dice2;
		String name1, name2;
		System.out.println(">>> ");
		name1 = input.next();
		dice1 = input.nextInt();
		System.out.println(name1 + dice1);
		
		
		
		
		
		
	}
}
