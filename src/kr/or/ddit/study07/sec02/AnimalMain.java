package kr.or.ddit.study07.sec02;

import java.util.Scanner;

public class AnimalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal ani = null;
		// 1 을 입력하면 고양이
		// 2 를 입력하면 강아지 울음소리 출력하기.
		
		System.out.println("1. 고양이  2. 강아지");
		int sel = sc.nextInt();
		
		if(sel ==1) {
			ani = new Cat();
		}
		if(sel == 2) {
			ani = new Dog();
		}
		
		ani.cry();
		
	}
}
