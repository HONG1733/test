package kr.or.ddit.homework.Home12;

public class HomeWork12 {
	public static void main(String[] args) {
		/*
		 * 1. 다음을 만족하는 Student 클래스를 설계
		 * String 형의 학과와 정수형의 학번을 필드로 선언
		 * HomeWork12 에서 Student 객체를 생성하고
		 * 학과와 학번을 적당한 값을 넣고 출력.
		 * 
		 * 2. 다음을 만족하는 TV 클래스를 설계
		 *  Tv 클래스에 제조사 생산년도 크기를 필드로 선언
		 *  생산자(제조사, 생산년도, 크기) 통해 객체를 만들고
		 *  printTv 라는 메소드에서 값을 출력할것.
		  
		
		 * 3. 세 과목의 성적을 입력 받고 총점메소드 합 메소드를 통해 출력할 수 있는
		 *  Grade class 설계.
		 *  
		 */
        Student s1= new Student();
        System.out.println();
        
        

		Tv t1 = new Tv("애플",2023,20.5);
		System.out.println(t1);
		
//		Grade grade = new Grade();
//		grade.kor =100;
//		grade.eng =80;
//		grade.math =87;
		
		Grade grade = new Grade(100, 80, 87);
		System.out.println(grade);
		
		
		System.out.println("총점: "+grade.sum());
		System.out.println("평균;" +grade.avg());
		
	}

	@Override
	public String toString() {
		return "HomeWork12 []";
	}

}
