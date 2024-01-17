package kr.or.ddit.study06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.kor = 100;
		st1.eng = 80;
		st1.math = 70;
		st1.name = "홍길동";
		st1.sum = st1.kor + st1.eng+st1.math;
		st1.avg = st1.sum/3.0;
		
		Student st2 = new Student();
		st2.kor = 85;
		st2.eng = 84;
		st2.math = 99;
		st2.name = "강감찬";
		st2.sum = st2.kor + st2.eng+st2.math;
		st2.avg = st2.sum/3.0;
		
		System.out.println(st1.name+"\t"+st1.kor+"\t"+st1.eng+"\t"+st1.math+"\t");
		System.out.println(st2.name+"\t"+st2.kor+"\t"+st2.eng+"\t"+st2.math+"\t");

				System.out.println(st1);
				System.out.println(st2);
				
	}

}
