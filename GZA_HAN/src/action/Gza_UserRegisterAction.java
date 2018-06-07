package action;

import model.Gza_DAO;
import model.Gza_USER_INFO;

public class Gza_UserRegisterAction {
	
	Gza_DAO dao;
	Gza_USER_INFO uinfo;
	
	public boolean CheckIdAction(String id) {
		boolean check = false;
		dao = new Gza_DAO();
		
		uinfo = dao.IdCheck(id);
		
		if(uinfo == null) {
			check = true;
		}
		
		return check;
	}
	
	public boolean RegisterUserAction(String id, String pw, String name) {
		boolean check;
		dao = new Gza_DAO();
		int pre_assets = 0;
		uinfo = new Gza_USER_INFO(id, pw, name, pre_assets);
		check = dao.Register(uinfo);
		
		return check;
	}

}
