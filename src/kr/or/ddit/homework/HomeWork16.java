package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork16 {
	Scanner sc = new Scanner(System.in);
	
	Member[] memList = new Member[100];
	int cur=0;

	public static void main(String[] args) {
		HomeWork16 obj = new HomeWork16();
		obj.process();
	}
	public void process() {
		//회원 관리 시스템
		System.out.println("사이트 방문 목적을 선택해주세요");
		while(true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 탈퇴"); //생략
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 전체 정보 출력");
		
			
			int input = sc.nextInt();
			
			if(input == 1) {
				 addMember();
			} else if(input == 2) {
				delecting();
			} else if(input == 3) {
				 update();
			} else if(input == 4) {
				 printList();
			} else {
				System.out.println("틀린값이 들어옴");
				continue;
			}
		}
	}
	public void addMember() {
		
		System.out.println("아이디를 입력하세요");
		String idString = sc.next();
		System.out.println("이름를 입력하세요");
		String nameString = sc.next();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		Member mem = new Member();
		mem.setId(idString);
		
		mem.setName(nameString);
		
		mem.setAge(age);
		
		
		memList[cur++] = mem;
	}
	public void printList() {
		for(int i=0; i<cur; i++) {
			Member mem = memList[i];
			
			System.out.printf("%d번째 회원 [id : %s,이름 : %s, 나이 : %d]\n",i+1 , mem.getId(),mem.getName(),mem.getAge());
		}
	}
	public void update() {
		printList();
		System.out.print("수정할 회원 번호 입력: ");
		int num = sc.nextInt() - 1;
		// 1 0
		
		Member mem = memList[num];
		
		System.out.println("수정할 정보 선택");
		System.out.println("1. id");
		System.out.println("2. 이름");
		System.out.println("3. 나이");
		int selectNum = sc.nextInt();
		
		if(selectNum == 1) {
			System.out.println("수정할 id를 입력하세요.");
			String id = sc.next();
			mem.setId(id);
		}else if(selectNum == 2) {
			System.out.println("수정할 이름을 입력하세요.");
			String name = sc.next();
			mem.setName(name);
		}else if(selectNum == 3) {
			System.out.println("수정할 나이를 입력하세요.");
			int age = sc.nextInt();
			mem.setAge(age);
		}
	}
	public void delecting () {
		printList();
		System.out.println("몇번 회원을 삭제할지 선택하세요.");
		int num = sc.nextInt() - 1;
		
		Member[] tempMemberList = new Member[100];
		int cnt = 0;
		
		for(int i = 0; i < cur; i++) {
			if(num != i) {
				tempMemberList[cnt++] = memList[i];
			}
		}
		cur--;
		memList = tempMemberList;
	}
	
}
class Member{
	private String id;
	private String name;
	private int age;
	// getter
	//String 아이디 = 객체.id;
	// ▽
	// String 아이디 = getId();
	public String getId() {
		return id;
	}
	// setter
	// 객체.id = "장원영"
	
	// ▽ private 객체. 찍어도 변수가 안나옴.
	// 그래서 객체의 값을 setting해주려면 setter를 사용해야 함
	
	// setId("장원영"); << 얘량 private 세트임
	public void setId(String id) {
		this.id = id;
	}
	// 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 * getter setter 사용해 보기.
	 * 
	 */
	
	
}