package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
//		obj.method5();
	}

	public void method5() {
		/*
		 * 홀수만 출력해보기.
		 */

		for (int i = 1; i < 20; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);

		}
	}

	
	public void method4() {
		/*
		 * 전체 구구단 출력해보기.
		 */
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("--------"+dan+"단-------");
		   for(int i = 1; i<=9; i++) {
			   System.out.println(dan+"*"+i+"="+dan*i);
		   }
		}
	}
	
	
	public void method3() {
		/*
		 *  입력받은 숫자로 구구단을 만드시오 .
		 *  
		 *  ex 3) 3*1  =3
		 *        3*2
		 *        .
		 
		 *        .
		 *        .
		 *        3*9 = 27
  
		 */
		System.out.println("출력할 구구단의 단을 입력.");
		int dan = sc.nextInt();
		for(int i = 1; i<= 9; i++) {
           System.out.printf("%d * %d = %d\n", dan, i, dan*i);    
		}
	}
	
	
	
	
	public void method2() {
		
		for(int i =0; i< 5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public void method1() {
		/*
		 *  영어를 입력한 후 영어에 포함된 모음의 개수를 구해보시오.
		 *  모음 a e i o u
		 */  
		
		String str =sc.next();
		
		//문자열의 길이.
		int length = str.length();
		
		int count = 0;
		for(int i=0; i<str.length() ; i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch =='u') {
				count++;
			}
		}
		System.out.println("모음의 개수는  : "+count);
	}
}
