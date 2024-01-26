package dao;

import java.util.List;

import util.JDBCUtil;
import vo.FreeBoardVo;

public class FreeDao {
	private static FreeDao instance = null;

	private FreeDao() {
	}

	public static FreeDao getInstance() {
		if (instance == null) {
			instance = new FreeDao();
		}
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<FreeBoardVo> freeList(List<Object> param){
		String sql = "SELECT * FROM\r\n" + 
					"(SELECT ROWNUM RN, A.*\r\n" + 
					"FROM (SELECT BOARD_NO,TITLE,CONTENT,MEM_NAME,\r\n" + 
					"       TO_CHAR(REG_DATE, 'YYYY.MM.DD') REG_DATE,\r\n" + 
					"       CNT \r\n" + 
					"  FROM JAVA_FREEBOARD F, JAVA_USER U\r\n" + 
					" WHERE F.MEM_NO = U.MEM_NO\r\n" + 
					" ORDER BY BOARD_NO ) A)\r\n" + 
					" WHERE RN BETWEEN ? AND ?";
		return jdbc.selectList(sql,param,FreeBoardVo.class);
	}
	
	//어려우면 메소드 각각 만들기 -> 각각 다른 DAO를 부르면 됨
	public void updateFree(List<Object> param, int sel) {
		String sql = " UPDATE JAVA_FREEBOARD"
					+"    SET";
		if(sel ==1 | sel ==3 ) {
			sql += " TITLE = ?";
			//, 가 추가 되어야 여러 값 넣어짐
			if(sel ==3) sql +=",";
		}
		if(sel ==2 | sel ==3 ) {
			sql += " CONTENT = ?";
		}
		sql+= " WHERE BOARD_NO = ?";
		
		jdbc.update(sql,param);
	}
	
	public FreeBoardVo check(List<Object> param) {
		String sql = "SELECT BOARD_NO \r\n" + 
					" FROM JAVA_FREEBOARD F\r\n" + 
					" WHERE F.MEM_NO =?\r\n" + 
					"   AND F.BOARD_NO=?";
		
		return jdbc.selectOne(sql,param, FreeBoardVo.class);
	}
	 

}
