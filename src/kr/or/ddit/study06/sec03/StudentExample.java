package kr.or.ddit.study06.sec03;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 =new Student("n1", 20);
		Student s2 =new Student("406호", "n2", 20);
		Student s3 =new Student(new People("n4",25));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
