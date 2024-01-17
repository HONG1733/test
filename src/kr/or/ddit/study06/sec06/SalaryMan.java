package kr.or.ddit.study06.sec06;

public class SalaryMan {
   //아무것도 안쓰면 접근제한이 디폴트다
   String name;
   private int age;
   
   //get
   //public 타입 get컬럼명()
   
   public int getAge() {
      return age;
   }
   
   //set
   //public void set컬럽명(타입 컬럼명)
   
   
   public void setAge(int age) {
      if(age<0||age>122) {
             System.out.println("올바른 데이터가 아닙니다.");
      }else {
             this.age=age;
       }
   }
   
   
   
   @Override
   public String toString() {
      return "SalaryMan [name=" + name + ", age=" + age + "]";
   }
   


}