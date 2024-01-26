package service;

import java.util.List;

import dao.FreeDao;
import vo.FreeBoardVo;

public class FreeService {
	private static FreeService instance = null;

	private FreeService() {
	}

	public static FreeService getInstance() {
		if (instance == null) {
			instance = new FreeService();
		}
		return instance;
	}
	
	FreeDao freeDao = FreeDao.getInstance();
	
	public List<FreeBoardVo> freeList (List<Object>param){
		return freeDao.freeList(param);
	}
	
	public void freeUpdate (List<Object> param, int sel){
		freeDao.updateFree(param, sel);
	}
	public boolean check (List<Object> param){
		FreeBoardVo free = freeDao.check(param);
		if(free==null) return false;
		else return true;
		
	}

}
