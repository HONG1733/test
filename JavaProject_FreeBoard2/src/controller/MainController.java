package controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.FreeService;
import service.UserService;
import util.ScanUtil;
import util.View;
import vo.FreeBoardVo;
import vo.UserVo;

public class MainController {
   static public Map<String, Object> sessionStorage = new HashMap<>();
   FreeService freeService = FreeService.getInstance();
   UserService userService = UserService.getInstance();
   
   public static void main(String[] args) {
      new MainController().start();
   }

   private void start() {
      View view = View.HOME;
      while (true) {
         switch (view) {
         case HOME:
            view = home();
            break;
         case FREE_LIST:
            view = freeList();
            break;
         case FREE_UPDATE:
        	 view = freeUpdate();
        	 break;
         case USER_LOGIN:
        	 view = login();
        	 break;
         default:
            break;
         }
      }
   }



   private View login() {
		String id = ScanUtil.nextLine("ID >> ");
		String pass = ScanUtil.nextLine("pass >> ");
		List<Object> param = new ArrayList();
		param.add(id);
		param.add(pass);
		boolean login = userService.login(param);
		if(!login) {
			System.out.println("1. 재 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 홈");
		}
		View view = (View) sessionStorage.get("view");
		if(view == null) return View.HOME;
		return view;
	}

   private View freeUpdate() {
	   if(!sessionStorage.containsKey("user")) {
		   sessionStorage.put("view", View.FREE_UPDATE);
		   return View.USER_LOGIN;
	   }
	   
	   UserVo user = (UserVo)sessionStorage.get("user");
	   int boardNo = (int)sessionStorage.get("boardNo");
	   
	   List<Object> chkList = new ArrayList();
	   chkList.add(user.getMem_no());
	   chkList.add(boardNo);
	   boolean chk = freeService.check(chkList);
	   if(!chk) {
		   System.out.println("작성자가 아닙니다.");
		   return View.FREE_LIST;
	   }
	   
	   System.out.println("1. 제목 :");
	   System.out.println("2. 내용:");
	   System.out.println("3. 전체:");
	   System.out.println("4. 홈");
	   
	   //3번 선택하면 제목도 되고 내용도 됨
	   List<Object> param = new ArrayList();
	   int sel = ScanUtil.menu();
	   if(sel == 1 || sel == 3) {
		   String title = ScanUtil.nextLine("제목 : ");
		   param.add(title);
	   }
	   if(sel == 2 || sel == 3) {
		   String content = ScanUtil.nextLine("내용 : ");
		   param.add(content);
	   }
	   
	   param.add(boardNo);
	   
	   freeService.freeUpdate(param, sel);
	   
	   return View.FREE_LIST;
   }

	private View freeList() {
		   int page = 1;
		   if(sessionStorage.containsKey("page")){
			   page =(int) sessionStorage.get("page");
		   }
		   //page 1 > start = 1 end =5
		   //page 2 > start = 6 end =10
		   //선택하는 갯수에 따라 달라진다
		   int startNum =1+5*(page-1);
		   int endNum = 5*page;
		   List<Object> param = new ArrayList();
		   param.add(startNum);
		   param.add(endNum);
		   
		   List<FreeBoardVo> list = freeService.freeList(param);
		   for (FreeBoardVo freeBoardVo : list) {
			   System.out.println(freeBoardVo);
		   }
		   
		   System.out.println("1. 다음페이지");
		   System.out.println("2. 이전페이지");
		   System.out.println("3. 수정");
		   System.out.println("4. 삭제");
		   System.out.println("5. 홈");
		   
		   int sel = ScanUtil.nextInt("메뉴 : ");
		   
		   if(sel==1) {
			   page++;
			   sessionStorage.put("page",page);
			   return View.FREE_LIST;
		   }
		   else if(sel==2) {
			   if(page !=1) page--;
			   sessionStorage.put("page",page);
			   return View.FREE_LIST;
		   }
		   else if(sel==3) {
			   int boardNo = ScanUtil.nextInt("수정할 게시판 번호 입력 :");
			   sessionStorage.put("boardNo", boardNo);
			   
			   sessionStorage.remove("page");
			   return View.FREE_UPDATE;
		   }
		   else if(sel==4) {
			   sessionStorage.remove("page");
			   return View.FREE_DELETE;
		   }
		   else if(sel==5) {
			   sessionStorage.remove("page");
			   return View.HOME;
		   }
		   else {
			   return View.FREE_LIST;
		   }
		   
	   }
	
	private View home() {
	      System.out.println("1. 전체 게시판 조회 ");
	      System.out.println("2. 게시판 등록");
	      System.out.println("3. 홈");
	      System.out.println("4. 관리자 로그인");
	      int sel = ScanUtil.nextInt("메뉴 선택 : ");
	      switch (sel) {
	      case 1:
	         return View.FREE_LIST;
	      case 2:
	         return View.FREE_INSERT;
	      case 3:
	    	  return View.HOME;
	      case 4:
	         return View.ADMIN_LOGIN;
	      default:
	         return View.HOME;
	      }
	   }
	}