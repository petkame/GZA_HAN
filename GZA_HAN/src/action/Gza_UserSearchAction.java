package action;

import model.Gza_DAO;
import model.Gza_USER_INFO;

public class Gza_UserSearchAction {
	
	Gza_DAO dao;
	Gza_USER_INFO uinfo;

	public String returnid(String name, String pw) {
		dao = new Gza_DAO();
		uinfo = dao.searchID(name, pw);
		
		return uinfo.getUSER_ID();
	}
	
	public String returnpw(String id, String name) {
		dao = new Gza_DAO();
		uinfo = dao.searchPW(id, name);
		
		return uinfo.getUSER_PW();
	}
	
}