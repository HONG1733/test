package kr.or.ddit.homework;

import java.util.Scanner;

// 클래스 : 멤버변수 + 메소드
public class HomeWork04 {
	//멤버변수
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	HomeWork04 obj = new HomeWork04();
	obj. process();
	
}

 public void process() {
	/*
	 *  가위   바위   보
	 *   0   1   2
	 *   
	 *   컴퓨터가 가위바위보를 램덤으로
	 *   뽑게 하고 내가 입력한 숫자랑 비교해서
	 *    
	 *    이겼으면 이겼다.
	 *    졌으면 졌다.
	 *    비겼으면 비겼다 출력
	 *    
	 *    ex) com 0 user 1
	 *    
	 *    -> 컴퓨터 : 가위, 유저: 바위
	 *       당신이 이겼습니다.
	 */
	 
	 
	 System.out.println("가위:0, 바위:1, 보:2 중 하나를 입력하세요");
	 int user= sc.nextInt(); 
	 int com= (int)(Math.random()*3)+0;
	 if(user == com) {
		 System.out.println("비겼습니다.");
	 }
	 else if  ((user==0 && com==2)|| (user==1 && com==0) || (user==2 && com==1)) {
		 System.out.println("이겼습니다.");
	 }
	 
	 else if (user>2) {
		 System.out.println("0부터2까지 숫자만 입력해주세요.");
	 }
	 else {
		 System.out.println("졌습니다.");
	 }
	 System.out.printf("user:%d,com:%d",user,com);
	 
 } 
}