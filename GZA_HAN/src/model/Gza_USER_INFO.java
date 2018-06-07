package model;

public class Gza_USER_INFO {
	String USER_ID;
	String USER_PW;
	String USER_NAME;
	int USER_ASSETS;
	public Gza_USER_INFO(String uSER_ID, String uSER_PW, String uSER_NAME, int uSER_ASSETS) {
		super();
		USER_ID = uSER_ID;
		USER_PW = uSER_PW;
		USER_NAME = uSER_NAME;
		USER_ASSETS = uSER_ASSETS;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_PW() {
		return USER_PW;
	}
	public void setUSER_PW(String uSER_PW) {
		USER_PW = uSER_PW;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public int getUSER_ASSETS() {
		return USER_ASSETS;
	}
	public void setUSER_ASSETS(int uSER_ASSETS) {
		USER_ASSETS = uSER_ASSETS;
	}
	
	
	}