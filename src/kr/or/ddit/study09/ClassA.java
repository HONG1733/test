package kr.or.ddit.study09;

import kr.or.ddit.study09.ClassA.ClassB.ClassC;

public class ClassA {
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassB b = a.new ClassB();
		ClassC c = b.new ClassC();
	}
	
	class ClassB{
		class ClassC{
			
		}
	}

}
