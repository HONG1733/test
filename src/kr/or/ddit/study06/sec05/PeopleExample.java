package kr.or.ddit.study06.sec05;

public class PeopleExample {
   public static void main(String[] args) {
      System.out.println(People.year);
      
      People p1 = new People("사람1", "남");
      People p2 = new People("사람2", "여");
      System.out.println(p1);
      System.out.println(p2);
      
      System.out.println("새해가 밝았습니다.");
      People.year++;
      System.out.println(p1);
      System.out.println(p2);
      
   }

}