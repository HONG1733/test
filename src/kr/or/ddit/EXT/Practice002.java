package kr.or.ddit.EXT;

public class Practice002 {
	public static void main(String[] args) {
		// 1. p2라는 변수명으로 Practice002 클래스의 객체 생성하기
		// ▽
		Practice002 p2 = new Practice002();

		// 3. 클래스명 변수명 = new 클래스명(값,값,값,값);
		// 형식으로 Person 클래스 생성하기
		// ▽
		Person p1 = new Person("이홍석", 25, 173.5, 65.5);
		Person p7 = new Person("김현수", 25, 173.5, 65.5);
		// 5. hello메서드 실행해 보기
		// ▽
		p1.hello();
		p7.hello();
		// 7. getHeight메서드의 리턴값을 returnValue 변수에 할당하기
		// ▽
		int returnValue = p1.getHeight();

		int a = 10;

		// 9. 8번에서 만든 새 클래스로 객체를 생성하고 그 객체로 2~7번 반복 하기(메서드는 맘대로 만들어서)
		// ▽
		// 1
		Practice002 p3 = new Practice002();
		// 3
		Study s1 = new Study("홍길동", 90, 85, 70);
		s1.hello();
		returnValue = s1.geteng();

	}
}

class Person {
	String name;
	int age;
	double height;
	double weight;

	// 2. Person p1 = new Person(이름,나이,키,무게); 형식으로 값을 받을 수 있게 생성자 만들기
	// 생성자 형식
	// public 클래스명(parameters) {
	//
	// }
	// ▽
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// 4. hello 메서드를 만들어 name, age를 출력하기
	// ▽

	public void hello() {
		System.out.println("이름 :" + name + " 나이: " + age);
	}

	// 6. 리턴 타입 int인 getHeight라는 메서드를 만들어 height값을 리턴하기
	// ▽
	public int getHeight() {
		int h = 190;
		return h;
	}
}

// 8. 새 클래스 자유롭게 만들어보기
// ▽ 

class Study {
	String name;
	int kor;
	int eng;
	int math;

	// 2
	public Study(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		// 4
	}

	public void hello() {
		System.out.printf("이름 : %s , 국어 : %d , 영어 : %d , 수학 : %d", name, kor, eng, math);
	}

	// 6
	public int geteng() {
		int e = 50;
		return e;
	}
}
