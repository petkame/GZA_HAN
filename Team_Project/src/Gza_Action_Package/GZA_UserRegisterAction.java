package Gza_Action_Package;

import Gza_DB_Package.GZA_USER_INFO;
import Gza_Process_Package.GZA_DAO;

public class GZA_UserRegisterAction {
	
	GZA_DAO dao;
	GZA_USER_INFO uinfo;
	
	public boolean CheckIdAction(String id) {
		
		return dao.IdCheck(id);
	}
	
	public boolean RegisterUserAction(String id, String pw, String name) {
		boolean check;
		int assets = 0;
		uinfo = new GZA_USER_INFO(id, pw, name, assets);
		check = dao.Register(uinfo);
		
		return check;
	}

}
