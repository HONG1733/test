package kr.or.ddit.homework;

public class HomeWork14 {
   public static void main(String[] args) {
//      HomeWork14 hw = new HomeWork14();
      
      Deck deck = new Deck();
      Card[] cardList = deck.cardList();
//      deck.print(cardList);
//      deck.shuffle(cardList);
//      deck.print(cardList);
    	deck.win(cardList);
   }
}

class Card {
   String type;
   int num;

   public Card(String type, int num) {
      this.type = type;
      this.num = num;
   }

   @Override
   public String toString() {
      String n = "";
      if(num == 1) n = "A";
      else if(num == 10) n = "T";
      else if(num == 11) n = "J";
      else if(num == 12) n = "Q";
      else if(num == 13) n = "K";
      else n += num;
      return type+n;
   }
   
   
}

class Deck {
//   Card[] cardList;
   
   public Card[] cardList() {
      Card[] cardList = new Card[52];
      for(int i = 1; i <= cardList.length; i++) {
         int num = i % 13;
         if(num == 0) num = 13;
         String type ="";
         if((i-1)/13 == 0) type="♠";
         if((i-1)/13 == 1) type="◈";
         if((i-1)/13 == 2) type="♥";
         if((i-1)/13 == 3) type="♣";
         cardList[i - 1] = new Card(type,num);
      }
      return cardList;
   }
   
   public void print(Card[] cardList) {
      for(Card card : cardList) {
         System.out.println(card);
      }
   }
   
   // 카드 섞기
   public void shuffle(Card[] cardList) {
      for (int i = 0; i < 100000; i++) {

         int random = (int) (Math.random() * cardList.length);

         Card temp = cardList[random];
         cardList[random] = cardList[0];
         cardList[0] = temp;
         
      }
      
      
   }
   
   // 이겼는지 확인
   public boolean win(Card[] cardList) {
	   System.out.println("왔다");
      // 내 카드 숫자가 높으면 win
      // 작거나 같으면 lose
      boolean result = true;//내 숫자가 높아서 이긴 상태
      //카드객체가 52([0]~[51])개 들어있음. 그 중 0번째를 끄집어냄
      //cardList : Card[]
      Card mycard = cardList[0];//♣8
      //Math.random()             : 0 <= x < 1
      //Math.random() * 51        : 0 <= x < 51 
      //(int)(Math.random() * 51)+1 : 1,2...51 
      //random : 1~51
      int random = (int)(Math.random() * cardList.length-1) + 1;
      
      Card comcard = cardList[random];
      
      if(comcard.num >= mycard.num) {
    	  result = false;//졌다
    	  System.out.println("내 카드 : " + mycard + "상대방 카드 : " + comcard +  " 졌어");
      } else {
    	  System.out.println("내 카드 : " + mycard + "상대방 카드 : " + comcard +  "이겼어");
      }
      
      return result;
   }
}