package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();
	}
	
	public void process() {
		// 5명의 3과목(국어, 영어, 수학) 성적과 이름을 배열에 저장하고.
		// 총점과 평균과 등수를 구하여 출력 하시오.
		String[] stName = {"강타", "문희준", "이재원", "장우혁", "토니 안"};
		int[][] score= {{80,70,80,0,0,1},
		                {90,85,90,0,0,1},
		                {90,70,75,0,0,1},
		                {65,75,70,0,0,1},
		                {80,80,70,0,0,1}
		               }; 
		for(int i=0; i<score.length; i++) {
			// 총점 계산.
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			// 평균 계산
			score[i][4] = score[i][3]/3;
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(stName[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
		// 등수 구하기.
		for (int i = 0; i < score.length; i++) {
			// 내 점수랑 다른 사람들의 점수랑 비교하기.
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3]) {
					score[i][5]++;
				}
			}
		}
		System.out.println("------------------------------");
		for (int i = 0; i < score.length; i++) {
			System.out.print(stName[i] + "\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();

		}
		
		/*
		 *  정렬하기.
		 */
		 for(int i=0; i<score.length; i++) {
	         for(int j= i+1; j<score.length; j++) {
	            if (score[i][5]>score[j][5])   {
	               
	            int[] temp = score[i];
	            score[i] = score[j];
	            score[j] = temp;
	            String tempname = stName[i];
	            stName[i] = stName[j];
	            stName[j] = tempname;
	            }
	         }
	      
	      }
	      System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
	      for (int i = 0; i < score.length; i++) {
	          System.out.print(stName[i] + "\t");
	          for (int j = 0; j < score[i].length; j++) {
	              System.out.print(score[i][j] + "\t");
	          }
	          System.out.println();

	      }
	}

}
