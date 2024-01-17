package kr.or.ddit.study06.sec06;

import java.util.Scanner;

public class SalaryTest {
   public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      SalaryMan s1 = new SalaryMan();
      s1.name = "김선경";
       System.out.println("나이를 입력하세요.");
       int age = sc.nextInt();
       //setAge 로 데이터를 입력하도록 설정해놈
       s1.setAge(age);
       System.out.println(s1);
      
   }

}
