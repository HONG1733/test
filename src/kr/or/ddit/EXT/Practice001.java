package kr.or.ddit.EXT;

//1---------------------------------------------------
//기본지식 1. ()로 끝나는 건 무언갈 실행한다는 뜻
//    2. 클래스는 값(변수)과 동작(메서드)를 가진 객체
//    3. 클래스를 만들면 그 클래스의 이름이 '타입'이 됨
//    ex) People클래스로 새 객체를 생성함
//			 People p1 = new People();
//			 이 때 p1의 타입은 'People'임
//1---------------------------------------------------

public class Practice001 {
	// 2---------------------------------------------------
	// 해당 파일명과 같은 클래스에는 메인메서드가 필요한데 그게 ▽ 이거, 
	// 실행 진입점이라고 하는데 얘가 있어야 실행이 가능함(설명 필요)
	// 2---------------------------------------------------
	public static void main(String[] args) {
		// 4---------------------------------------------------
		
		People p1 = new People();
		
		// People 클래스의 People() {} 생성자를 실행
		
		p1.hello();
		// People클래스로 만든 p1객체의 hello메서드를 실행
		// 출력값 : 안녕하세요
		
		p1.hello("차정원");
		// People클래스로 만든 p1객체의 오버로딩된 hello메서드를 실행
		// 출력값 : 안녕하세요 차정원입니다
		
		// 4---------------------------------------------------
	}
}

//3---------------------------------------------------
class People {
	int age;
	String name;
	// △ 클래스가 가질 값(변수)를 설정
	
	
	// 생성자란 클래스로 객체를 생성할 때 자동으로 실행되는 함수
	People() {
		
	}
	// △ 처음부터 존재하는 기본 생성자, 다른 생성자가 없는 경우 이 코드가 실행될 같이 실행 됨.
	// People p1 = new People(); << ()로 끝나기 때문에 무언가의 실행이라는 걸 알 수 있음. 
	
	public void hello() {
		System.out.println("안녕하세요");
	}
	// △ 이걸 메서드라고 하는데, 클래스의 동작을 담당함.
	
	public void hello(String name ) { // 괄호 안에 들어간 String name : 매개변수
		System.out.printf("안녕하세요 %s입니다", name);
	}
	// △ 같은 메서드여도 매개변수가 다르면 다른 동작을 함(오버로딩)
}
//3---------------------------------------------------