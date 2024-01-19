package kr.or.ddit.study07.sec01.phone;

public class IPhone1Gen extends SmartPhone {
	
	public void appstore() {
		System.out.println("앱스토어");
	}

	@Override
	public void camera() {
		// 부모클래스에 있는 카메라를 사용 하겠다
//		super.camera();
		System.out.println("1000만 화소 카메라");
	}
	
	
}
