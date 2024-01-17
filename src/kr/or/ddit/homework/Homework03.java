
package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework03 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Homework03 obj = new Homework03();
		obj.question1();
//		obj.question2();

	}
	private void question2() {
		/*
		 * &&, ||, ! 이용 해볼것
		 * 
		 * 윤년 : 4의 배수, 100의 배수x,400의 배수 o
		 * 
		 * 4 8 12 16  윤년
		 * 100 200 300 500 윤년x
		 * 400 800 1200  윤년 // 년도 %4 =0 이면 4의 배수
		 */
		
		System.out.println("년도를 입력 : ");
		int year = sc.nextInt();
		
		if(year%4==0 && year%400==0 && year/100!=0) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("평년입니다.");
		}
		
	}
	private void question1() {
		/*
		 * 정수 하나를 설정하고 키보드로 임의의 수를 입력받아 입력받은 수가 크면 -> "더작은 수를 입력하세요"
		 * 											작으면 ->"더 큰 수를 입력하세요"
		 * 											같으면 종료
		 * 설정된 값과 같은 값을 얼마만에 맞추는지를 출력
		 */
		int question =5000;
		int cnt = 0;
		
		while(true) {
			System.out.println("정수 하나를 입력하세요 : ");
			int answer = sc.nextInt();
			int count = ++cnt;
			
			if(answer>5000) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			if(answer<5000) {
				System.out.println("더 큰 수를 입력하세요.");
			}
			if(answer==5000) {
				System.out.println("정답입니다. 시도횟수 : "+cnt);
				break;
			}
			
		}

	}
	

}
