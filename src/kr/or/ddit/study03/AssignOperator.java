package kr.or.ddit.study03;

public class AssignOperator {
	public static void main(String[] args) {
		AssignOperator obj = new AssignOperator();
		
		obj.method2();
	}
	
	public void method2() {
		int a = 5;
		int b = 4;
		
		/*
		 * int result
		 * 1.a+b 값 저장
		 * 2.result 본인 값에 b값 곱해보기
		 * 3.result 본인 값에 a값 더해보기
		 * 4.result 본인 값에 나머지 a 값 구해보기
		 */
		int result = a+b;
		System.out.println(result);
		System.out.println(result*=b);
		System.out.println(result+=a);
		System.out.println(result%=a);
		
	}
	public void method1() {
		/*
		 * = : '='오른쪽 값을 '=' 왼쪽에 저장 우선순위가 가장 낮음
		 * 
		 * '=' 과 다른 연산자가 결합
		 * a = a+b; -> a+=b;
		 * a = a-b; -> a-=b;
		 * a = a*b; -> a*=b;
		 * a = a/b; -> a/=b;
		 * a = a%b; -> a%=b;
		 */
		
		int a = 10;
		int b = 4;
		System.out.println("a=a+b => a+=b : " +(a+=b));
		System.out.println("a=a-b => a-=b : " +(a-=b));
		System.out.println("a=a*b => a*=b : " +(a*=b));
		System.out.println("a=a/b => a/=b : " +(a/=b));
		System.out.println("a=a%b => a%=b : " +(a%=b));
		
		
	}
}
