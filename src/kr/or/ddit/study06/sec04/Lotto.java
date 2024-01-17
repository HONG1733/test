package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
   public static void main(String[] args) {
      Lotto l = new Lotto();
//      int[] lotto = l.generateLotto();
//      
//      System.out.println(Arrays.toString(lotto));
      int[][] paper = l.lottoPaper();
      for (int i = 0; i < paper.length; i++) {
         int[] lotto = paper[i];
         System.out.println(Arrays.toString(lotto));
      }
   }

   public int[][][] lottoBundle(int money) {
      int papers = money / 5000;
      int[][][] bundle = l.lottoBundle(7000);
      
      for (int i = 0; i < bundle.length; i++) {
    	  int[][]paper = bundle[i];
    	  System.out.println("============================");
    	  for(int j = 0; j < paper.length; j++) {
    		  int[] lotto = paper[j];
//    		  int[] lotto = bundle[i][j];
    		  System.out.println(Arrays.toString(lotto));
    	  }
    	  System.out.println("============================");
         bundle[i] = lottoPaper();
      }
      if (money % 5000 != 0) {
         // money/1000%5
         // 17000 -> 17 -> 2
         bundle[papers - 1] = lottoPaper(money / 1000 % 5);
      }

      return bundle;
   }

   public int[][] lottoPaper(int num) {
      int[][] paper = new int[num][6];
      for (int i = 0; i < paper.length; i++) {
         int[] lotto = generateLotto();
         paper[i] = lotto;
      }
      return paper;
   }

   //
   public int[][] lottoPaper() {
//      int [] [] paper = new int [5][6];
//      for(int i=0; i<paper.length; i++) {
//         int[] lotto =generateLotto();
//         paper[i] = lotto;
//   }
      return lottoPaper(5);
   }

   // 1차원 로또 배열 만들어 보기
   public int[] generateLotto() {
      int[] lotto = new int[6];

      for (int i = 0; i < lotto.length; i++) {
         // 1. 로또 뽑기
         int ran = new Random().nextInt(45) + 1;
         lotto[i] = ran;
         for (int j = 0; j < i; j++) {
            // 2. 새로운 번호랑 기존의 번호 비교하기.
            if (ran == lotto[j]) {
               // 3. 기존 번호랑 같다면 다시뽑기
               i--;
               break;
            }

         }
      }
      Arrays.sort(lotto);
      return lotto;
   }
}