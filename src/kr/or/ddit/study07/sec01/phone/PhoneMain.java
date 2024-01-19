package kr.or.ddit.study07.sec01.phone;

public class PhoneMain {
	public static void main(String[] args) {
		FolderPhone fp = new FolderPhone();
		fp.call();
		
		CameraPhone cp = new CameraPhone();
		//부모에서 상속을 받았기 때문에 출력이 된다.
		cp.camera();
		cp.call();
		
		IPhone1Gen ip = new IPhone1Gen();
		ip.camera();
		ip.call();
		ip.internet();
		ip.touch();
		ip.appstore();
				
	}

}
