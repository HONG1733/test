package kr.or.ddit.study04;

import java.util.Scanner;

public class IfExample {
   Scanner sc = new Scanner(System.in);
   
   public static void main(String[] args) {
      IfExample obj = new IfExample();
//      obj.method1();
//      obj.method2();
//      obj.method3();
//      obj.method4();
        obj.method5();
   }
   
   public void method5() {
	
	   boolean flag = false;
	   
	   if(flag) {
		   System.out.println("실행1");
		   System.out.println("실행1-1");
	   }
	   if(flag)
	       System.out.println("실행2");
	       System.out.println("실행2-1");
   }
   
   
   
   private void method4() {
	      /*
	       * 0~2 -
	       * 3~6 0
	       * 7~9 +
	       * 
	       * 90점 이상 A
	       * 80점 이상 B
	       * 70점 이상 C
	       * 60점 이상 D
	       * 60점 미만 F
	       */
	      
	       System.out.println("점수를 입력하세요.");
	         int score = sc.nextInt();
	         String grade = "";
	         if (score==100) {
	            grade = "A+";
	         }else if (score >=90) {
	            grade = "A";
	         }else if (score >=80) {
	            grade = "B";
	         }else if (score >=70) {
	            grade = "C";
	         }else if (score >=60) {
	            grade = "D";
	         }else {
	            grade = "F";
	         }
	         //else if 를 쓰면 조건문 더 간결하게 쓸수있다 
	         if(score!=100 && score>60) {
	            if(score%10 <=2) {
	               grade += "-";
	            }else if(score%10 <=6) {
	               grade += "0";
	            }else if(score%10 <=9) {
	               grade += "+";
	            }
	         }
	   }
   private void method1() {
      //if문은 어디서 시작하고 끝나는지 잘 보아야함
      System.out.println("method1 실행");
      boolean flag = false;
      if(flag) {
         System.out.println("if 문 실행");
      }
      System.out.println("if문 종료");
      System.out.println("method1 종료");
      
   }
   private void method2() {
      /*
       * 90점 이상 A
       * 80점 이상 B
       * 70점 이상 C
       * 60점 이상 D
       * 60점 미만 F
       */
      //전부다 포함 하는것이 else ,else if 는 다른조건을 또 걸어주고 싶을때
      System.out.print("점수를 입력해주세요. : ");
      int score = sc.nextInt();
      String grade ="";
      if(score>=90) {
         grade="A";
      }
      else if(score>=80 && score<90) {
         grade="B";
      }
      else if(score>=70 && score<80) {
         grade="C";
      }
      else if(score>=60 && score<70) {
         grade="D";
      }
      else {
         grade="F";
      }
      System.out.println("학점은 :" +grade);
   }

}