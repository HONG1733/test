package dao;

import java.util.List;

import util.JDBCUtil;
import vo.UserVo;

public class UserDao {
	private static UserDao instance = null;

	private UserDao() {
	}

	public static UserDao getInstance() {
		if (instance == null) {
			instance = new UserDao();
		}
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public UserVo login(List<Object> param) {
		String sql = "SELECT * \r\n" + 
				     "  FROM JAVA_USER\r\n" + 
				     "  WHERE MEM_ID =?\r\n" + 
				     "    AND MEM_PASS=?";
		
		return jdbc.selectOne(sql,param,UserVo.class);
	}
	

}
