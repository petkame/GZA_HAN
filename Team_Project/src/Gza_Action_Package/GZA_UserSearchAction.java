package Gza_Action_Package;

import Gza_DB_Package.GZA_USER_INFO;
import Gza_Process_Package.GZA_DAO;

public class GZA_UserSearchAction {
	
	GZA_DAO dao;
	GZA_USER_INFO uinfo;

	public String returnid(String name, String pw) {
		dao = new GZA_DAO();
		uinfo = dao.searchID(name, pw);
		
		return uinfo.getUSER_ID();
	}
	
	public String returnpw(String id, String name) {
		dao = new GZA_DAO();
		uinfo = dao.searchPW(id, name);
		
		return uinfo.getUSER_PW();
	}
	
}
