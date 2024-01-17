package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
//		obj.println();
//		obj.print();
//		obj.printf();
		obj.printf2();
	}
	
	public void printf2() {
		/*
		 * 정수 %d,문자열 %s
		 * 나이와 이름 넣어보기.
		 */
		System.out.println("나이를 입력하세요 :");
		String age = sc.next();
		int i1 = Integer.parseInt(age);
		
		System.out.println("이름을 입력하세요 :");
		String name = sc.next();
	//	int i2 = Integer.parseInt(age);
		
		System.out.printf("나이 : %d\n",i1);
		System.out.printf("이름 : %s\s",name);
	}
	
	public void printf() {
//		System.out.println("형식지정문자열",변수리스트);
//		형식 문자열
//		->"%%[[-|0]n]d 10진 정수"
//		-> - 왼쪽정렬
//		-> 0남은 왼쪽 빈공간에 0 채움
		//d는 정수 f는 실수
		System.out.printf("숫자 : %d\n",1000);
		System.out.printf("숫자 : %8d\n",1000);
		System.out.printf("숫자 : %-8d\n",1000);
		System.out.printf("숫자 : %08d\n",1000);
	}
	
	public void print() {
		//줄바꿈 기능 x
		System.out.print("홍길동");
		System.out.print(" 34061");
		System.out.print(" 대전시 중구 대흥동");
		
	}
	
	public void println() {
		//줄바꿈 기능
		System.out.println("홍길동");
		System.out.println(" 34061");
		System.out.println(" 대전시 중구 대흥동");
		
	}

}
