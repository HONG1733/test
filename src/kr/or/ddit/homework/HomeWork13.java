package kr.or.ddit.homework;

public class HomeWork13 {
	public static void main(String[] args) {
		// 과제 10을 메소드로 바꿔서 구현
		// 1. dataInput();
		// 클래스에 데이터 입력 및 클래스를 클래스 배열에 담기.
		// 2. 평균과, 총점을 구하는 메소드
		// 3. 랭크를 구하는 메소드
		// 4. 정렬하는 메소드
		// 5. 출력하는 메소드

		HomeWork13 hw = new HomeWork13();
		Student[] students = hw.dataInput();
		students = hw.sum(students);
		students = hw.rank(students);
		students = hw.sort(students);
		hw.printStudent(students);
	}

	public Student[] sum(Student[] stu) {
		/*
		 * for 문 이용해서 총점과 평균 구하기
		 */

		for (int i = 0; i < stu.length; i++) {
			// 총점
			stu[i].sum = stu[i].kor + stu[i].eng + stu[i].math;
			// 평균
			stu[i].avg = stu[i].sum / 3.0;
		}
		
		for (int i = 0; i < stu.length; i++) {
			for (int j = 0; j < stu.length; j++) {
				if (stu[i].sum < stu[j].sum) {
					stu[i].rank++;
				}
			}
		}
		
		return stu;
	}
	public studnet[ sort(student[] student){
		for (int i=0; i<student.length; i++) {
			for(int j=0; j<student.length-1; j++) {
				if(student[j].sum < student[j+1].sum)
			}
		}
	}
	
	//등수
	public studnet rank(student[] students) {
	
		for(int i=0; i<students.length; i++) {
			for(int j=0; j<students.length; j++) {
				if()students[i].sum < students[j]. sum {
					student
				}
			}
		}
		return students;
	}
	
	
			
	public void printStudent(Student[] stu) {
		for (Student student : stu) {
			System.out.println(student);
		}
	}

	public Student[] dataInput() {
		Student s1 = new Student();
		s1.name = "n1";
		s1.kor = 65;
		s1.eng = 85;
		s1.math = 96;
		Student s2 = new Student();
		s2.name = "n2";
		s2.kor = 77;
		s2.eng = 85;
		s2.math = 89;
		Student s3 = new Student();
		s3.name = "n3";
		s3.kor = 92;
		s3.eng = 89;
		;
		s3.math = 67;
		Student s4 = new Student();
		s4.name = "n4";
		s4.kor = 75;
		s4.eng = 63;
		s4.math = 100;
		Student s5 = new Student();
		s5.name = "n5";
		s5.kor = 92;
		s5.eng = 77;
		s5.math = 100;

		// 3 클래스를 클래스 배열에 담기.
		Student[] students = { s1, s2, s3, s4, s5 };

		return students;
	}

}
