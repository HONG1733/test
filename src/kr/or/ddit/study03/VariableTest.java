package kr.or.ddit.study03;

import java.util.Scanner;

public class VariableTest {
   Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      VariableTest obj = new VariableTest();
//      obj.method1();
//      obj.method2();
//      obj.method3();
//      obj.method4();
      obj.method6();
   }
   private void method1() {
      // 기본타입을 각각 선언해보고 갑을 저장 할 것
      // 8가지  
      // System.out.println 을 이용해서 출력까지 해보자.
      
      // 정수형 byte ~
      //1
      byte b1 = 10;
      System.out.println(b1);
      //2
      short s1 = 127;
      System.out.println(s1);
      //4 자바기본형
      int i1 = 1000;
      System.out.println(i1);
      //8
      long l1 = 100000000000L;
      System.out.println(l1);
      
      //4
      float f1 = 10.41f;
      System.out.println(f1);
      //8 자바기본형
      double d1 = 10.41;
      System.out.println(d1);
      
      //1
      boolean b = false;
      System.out.println(b);
      //2
      char c1 = 'b';
      System.out.println(c1);
      
      // 바이트 = 8bit 프로그램 기본단위로 많이 사용  
   }

   private void method2() {
      /*
       *  각 데이터를 형변환 하고 출력 하시오.
       */
      //byte<short<int<long<float<double
      
      // char -> int 
      char c2 = 'a';
      int i2 = c2;
      System.out.println(i2);
      // int -> char
      int i3 =12;
      char c3 = (char)i3;
      
//      byte bte =  100;
//      char ch = bte; // byte크기가 작지만 - 포함하고 있기 때문에 강제 타입변환 필요 
//      
      // int -> double
      int i4 = 100;
      double d2 = i4;
      System.out.println(d2);
      // int 값 변수 a,b 를 나누기 연산후 double로 저장
      int a = 10;
      int b = 7;
      double d3 = (double)a/b;
      // char -> String
      char ch5 = 'a';
      String s5 = ""+ch5;
      // c3_1 + c3_2 값을 문자열에 저장
      char ch3_1 ='a';
      char ch3_2 ='b';
      
      String s6 = ""+ch3_1+ch3_2;
      //charAt 문자열 -> 문자
      //0번부터 시작함
      char ch6 = s6.charAt(0);
      
   }
   
   private void method3() {
      // Math.random
      // 0~0.9999999999999999 범위 값.
      // *10은 범위 값  +1은 시작 값.
      // (int)(Math.random()*10)+1
      
//      int ran = (int)(Math.random()*100)+1;
//      System.out.println(ran);
      
      /*
       * 11~20범위 랜덤 숫자 만들기
       */
      int ran = (int)(Math.random()*10)+11;
      System.out.println(ran);
      
      /*
       * 양꼬치는 1인분에 12000원 음료수는 2000원 입니다. 
       * 양꼬치 n개와 음료수 k 를 먹었다면 총 얼마를 지불해야 하는지 
       * 출력해보세요.
       * n 값은 1~10 
       * k 값은 1~3
       */
      
      int n = (int)(Math.random()*10)+1;
      int k = (int)(Math.random()*3)+1;
      System.out.println(n);
      System.out.println(k);
      
      //결과값 저장 할 곳
      int result = 12000*n + 2000*k; 
      System.out.printf("양꼬치%d개 음료수%d개 \n",n,k);
      System.out.printf("총금액은 %d",result);
      
   }
   
   private void method4() {
      /*
       * 정수 num1, num2 랜덤한 변수(1~50)로 주어질때
       * num1을 num2로 나눈 나머지와 몫을 출력하세요.
       */
      int num1 = (int)(Math.random()*50)+1;
      int num2 = (int)(Math.random()*50)+1;
      
      // 몫  : 정수형 데이터 이기 때문에 소수점 값 자동 생략됨.
      int re1= num1/num2;
      // 나머지 
      int re2= num1%num2;
      System.out.printf("num1 : %d, num2 : %d \n" ,num1,num2);
      System.out.printf("re1 : %d, re2 : %d" ,re1,re2);
      
   }
   private void method6() {
      /*
       * 두 정수에 대한 연산으로 두정수를 붙여서 쓴 값을 출력합니다. 
       * 예를 들면 다음과 같습니다.
       * a = 12,  b =3
       * 12 ☆ 3 = 123
       * 3  ☆ 12 = 312 
       * 
       *  양의 정수 a와 b가 주어졌을때 
       *  a ☆ b 와 b ☆ a 값중 더 큰값을 출력하세요 
       *  
       *  스트링으로 더해주고 인트로 바꿔서 출력
       */
      int a = (int)(Math.random()*100)+1;
      int b = (int)(Math.random()*100)+1;
      
//      String ab=""+a+b;
//      String ba=""+b+a;
      int ab_int = Integer.parseInt(""+a+b);
      int ba_int = Integer.parseInt(""+b+a);
      
      int result = ab_int > ba_int ? ab_int : ba_int;
      System.out.printf("a:%d, b:%d \n",a,b);
      System.out.printf("결과값 :%d",result);
      
      
   }
   
}