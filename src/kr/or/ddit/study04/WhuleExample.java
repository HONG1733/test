package kr.or.ddit.study04;

import java.util.Scanner;

public class WhuleExample {
	Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
		WhuleExample obj = new WhuleExample();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
		}
		
	public void method5() {
		end : while(true) {
			 System.out.println("바깥쪽 와일문 실행");
			 while(true) {
				 System.out.println("안쪽 와일문 실행");
				 try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				 break end;
			 }
		 }
	}
		
	public void method4() {
		int i=1;
		do {
//			i++;
			System.out.println(i+"실행 됨.");
			i++;
		}
		while(i<10);
	}

		
		
		public void method3() {
			long i =1l;
			while(i>0) {
				i+=10000;
				System.out.println(i);
			}
		}
		
		public void method2() {
		/*
		 * 
		 * 
		 */
		int sum =0;
		String bill ="***영수증***\n";
		while(true) {
			System.out.println("====메뉴====");
			System.out.println("1. 아메리카노           :1000");
			System.out.println("2. 카페라떼              :1500");
			System.out.println("3. 자바칩 프라프치노 :2000");
			System.out.println("4. 주문 완료.");
			System.out.println("=========");
			int select = sc.nextInt();
			if(select ==1) {
				sum+=1000;
				bill+="아메리카노 : 1000\n";
			}
			if(select ==4) {
				break;
			}
		}
		System.out.println("주문이 완료 되었습니다.");
		}


public void method1() {
	/*
	 *  while 반복문 무한루프 등을 사용할때 주로 사용. 
	 *             (끝나는 지점을 알기 어려울때)
	 *              
	 * while(조건식) { 
	 * }
	 */
	
//	int num = 0;
//	while(num<10) {
//		System.out.println(num++);
//	}
	
//	while(true) {
//		System.out.println("실행중");
//	}
	
	for(;;) {
		System.out.println("실행중");
	}
	 	
}
}