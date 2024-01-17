package kr.or.ddit.study03;

import java.util.Scanner;

public class RelationOperator {
	public static void main(String[] args) {
		/*
		 *  관계 연산자
		 *  > < == <= >= !=
		 *  
		 */
		
//		int a = 10;
//		int b = 7;
//		
//		System.out.println("a>b : "+(a>b));
//		System.out.println("a<b : "+(a<b));
//		System.out.println("a==b : "+(a==b));
//		System.out.println("a<=b : "+(a<=b));
//		System.out.println("a>=b : "+(a>=b));
//		System.out.println("a!=b : "+(a!=b));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요. : ");
		int score = sc.nextInt(); //int로 바로 타입변환된다
		
		if(score>90) {
			System.out.println("A학점");
		}
		else if(score >80) {
			System.out.println("B학점");
		}
		else if(score >70) {
			System.out.println("C학점");
		}
		else if(score >60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점");// 조건을 걸 필요 없기 때문
		}
	}

}
