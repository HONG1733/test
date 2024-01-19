package kr.or.ddit.study08;

public class BoardImple implements IBoard{

	@Override
	public void writeBoard(String title, String content) {
		
		ILogin login = null;
		
		//핸드폰 여부 체크
		boolean phonchk = false;
		
		if(phonchk) login = new MobileLoginImple();
		else login = new LoginImple();
		
		login.login("id", "pass");
		
		/*
		 * 디비에 데이터 넣어주기.
		 */
		
		
	}

}
