package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}
	
	public void method1() {
		/*
		 *   실수 데이터를 입력 받은후 
		 *   *100 한후 정수 부분만 출력해보기. 
		 */
		System.out.println("실수 데이터를 입력하세요.");
		String num = sc.next();
		double d1 = Double.parseDouble(num)*100; //d1 = d18*100;
		System.out.println(d1);
		int i1 = (int)d1;
		System.out.println(i1);
	}
	
	public void method2() {
		/*
		 *   소수점 2째 자리까지 출력.
		 */
		System.out.println("실수 데이터를 입력하세요.");
		String num = sc.next();
		double d1 = Double.parseDouble(num);
		System.out.printf("소수점 2째 자리까지 출력 : %-10.2f\n", d1);
	}
	
	public void method3() {
		/*
		 *   num1 에 num2 값을 나눈후 *2000 한 값을 출력.
		 *   num1 = 3 
		 *   num2 = 2 
		 *   -> 결과 값 3000
		 */
		System.out.println("num1을 입력하세요");
		String num1 = sc.next();
		
		System.out.println("num2를 입력하세요");
		String num2 = sc.next();
		
		int i1 = Integer.parseInt(num1);
		int i2 = Integer.parseInt(num2);
		int result = (int)(((double)i1/i2)*2000);//2000*i1/i2;
		System.out.println(result);
		
		
	}
	
	public void method4() {
		/*
		 * 	 심화 과제
		 *   (생략 가능  if 문 사용 하지 않고.)
		 *   소수점 2째 자리에서 반올림 하기.
		 *   
		 *   원래 숫자에 100을 곱한다.
		 *   곱한 결과에 0.5를 더해준다.
		 *   그 다음, 소수점 아래를 버리고 정수로 만든다.
		 *   최종 결과에 100을 나눠서 다시 소수점 2째 자리로 만든다.
		 */
		
		System.out.println("실수 데이터를 입력하세요.");
		String num = sc.next();
		double d1 = (Double.parseDouble(num)*100)+0.5;
		System.out.println(d1);
		int i1 = (int)d1;
		System.out.println(i1);
		double d2 = i1/100.0;
		System.out.println(d2);
	}
	
}
