package kr.or.ddit.homework;

public class HomeWork10 {
public static void main(String[] args) {
//		Student[] score = new Student[5];
		// 1 클래스 완성.
		
		// 2 클래스에 데이터 입력. // 이름 국 영 수
		Student s1 = new Student();
		s1.name = "장원영";
		s1.kor = 95;
		s1.eng = 80;
		s1.math = 85;
		
		Student s2 = new Student();
		s2.name = "안유진";
		s2.kor = 75;
		s2.eng = 88;
		s2.math = 92;
		
		Student s3 = new Student();
		s3.name = "가을";
		s3.kor = 95;
		s3.eng = 92;
		s3.math = 85;
		
		Student s4 = new Student();
		s4.name = "다니엘";
		s4.kor = 80;
		s4.eng = 77;
		s4.math = 70;
		
		Student s5 = new Student();
		s5.name = "민지";
		s5.kor = 95;
		s5.eng = 97;
		s5.math = 94;
		
		// 3 클래스를 클래스 배열에 담기.
		Student[] score = {s1, s2, s3, s4, s5};
		
//		for(int i = 0; i < score.length; i++) {
//			Student student = score[i];
//		}

			
			// 평균 총합 구하기.
//              for(Student s : score) {
			for (int i = 0; i < score.length; i++) {
				// 총점
				score[i].sum = score[i].kor + score[i].eng + score[i].math;
				// 평균
				score[i].avg = score[i].sum / 3.0;
			}

			// 등수 구하기
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score.length; j++) {
					if (score[i].sum < score[j].sum) {
						score[i].rank++;
					}
				}
			}
			//정렬하기
			for (int i = 0; i < score.length-1; i++) {
				for (int j = 0; j < score.length-1-i; j++) {
					//등수 비교
					if(score[j].rank>score[j+1].rank) {
						Student temp = score[j];
						score[j] = score[j+1];
						score[j+1] = temp;
					}
				}
				
			}
			//향상된 for문

			for(Student student : score) {
				System.out.println(student);
			
				
			}
			
			

//			System.out.println(s1);
//			System.out.println(s2);
//			System.out.println(s3);
//			System.out.println(s4);
//			System.out.println(s5);

		}
	}

	class Student {
		// 이름, 국, 영, 수, 총점, 평균, 등수
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		int rank = 1;

		@Override
		public String toString() {
			return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum
					+ ", avg=" + avg + ", rank=" + rank + "]";
		}
	
	
	
	
}
