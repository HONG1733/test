package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork06 {
Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
HomeWork06 obj = new HomeWork06();
//obj.method1();
//obj.method2();
obj.method3();
}

public void method1() {
	/*
	 *  전체 구구단을 출력하시오.
	 *  
	 *  2*1 = 2 3*1 = 3 4*1=4... 9*1=9
	 *  2*2 = 4
	 *  
	 *  
	 *  
	 *  2*9 =18 .................9*9=81
	 */

//    for (int i = 1; i <= 9; i++) {
//        for (int j = 1; j <= 9; j++) {
//           System.out.printf("%d * %d = %d\t",j,i,i*j);
//        }
//        System.out.println();
	for(int i = 1; i <= 9; i++){
		
		for (int dan=2; dan<=9; dan++) {
			System.out.printf("%d * %d = %d	", dan, i, dan*i);
     }
		System.out.println();
  }
}

public void method2() {
	/*
	 * 전체 구구단 출력하는데
	 * 입력 받은 구구단은 제외하고 출력.
	 * ex 3) 3단을 제외한 전체 구구단 출력.
	 */
	System.out.println("정수를 입력하세요");
	int excluded = sc.nextInt();
	 for (int i = 1; i <= 9; i++) {
	        for (int dan = 2; dan <= 9; dan++) {
	        	if (excluded == dan) {
	        		continue;
//	        		if()continue!();
	        	}
	           System.out.printf("%d * %d = %d\t", dan,i,i*dan);
	        }
	        System.out.println();
	     }
	  }
	

	public void method3() {
		/*
		 * 입력 받은 값이 양의 정수 라면
	     * 1. 홀수라면
	      	  n 이상의 홀수인 모든 양의 정수 총합.
	      	  ex 5) 1 + 3 + 5 
	 	 * 2. 짝수라면
	      	  n 이하의 모든 짝수의제곱 총합.
	      	  ex 6) 2*2 + 4*4 +6*6
	 	 */
		System.out.println("정수를 입력하세요");
		int n =sc.nextInt();
		if(n <= 0) {
			System.out.println("양의 정수를 입력해주세요");
		}
		int result = 0;
		if (n % 2== 1) {
			for (int i = 1; i <= n; i += 2) {
				result += i;
			}
		}else {
			for (int i =2; i<=n; i += 2) {
				result += i*i;
			}
		}
		System.out.println("총합: " + result);
	}
	
//	int nim =10;
//	int sun =0;
//	if(num%2 ==0) {
//		for(int i=2; i <=num; i+2=) {
//			sum+=i*i;
//		}
//	}
}   
