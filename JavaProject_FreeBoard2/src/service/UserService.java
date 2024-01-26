package service;

import java.util.List;

import controller.MainController;
import dao.UserDao;
import vo.UserVo;

public class UserService {
	private static UserService instance = null;

	private UserService() {
	}

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}
	
	//서비브 다오 연결
	UserDao userDao = UserDao.getInstance();
	
	public boolean login(List<Object> param) {
		UserVo user = userDao.login(param);
		if(user == null) {
			return false;
		}
		MainController.sessionStorage.put("user",user);
		return true;
	}

}
