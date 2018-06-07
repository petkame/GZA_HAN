package Gza_DB_Package;

public class GZA_USER_INFO {
	private String USER_ID;
	private String USER_PW;
	private String USER_NAME;
	private int USER_ASSETS;
	
	public GZA_USER_INFO(String USER_ID, String USER_PW, String USER_NAME, int USER_ASSETS) {
		this.USER_ID = USER_ID;
		this.USER_PW = USER_PW;
		this.USER_NAME = USER_NAME;
		this.USER_ASSETS = USER_ASSETS;
	}
	
	public int getUSER_ASSETS() {
		return USER_ASSETS;
	}
	public void setUSER_ASSETS(int uSER_ASSETS) {
		USER_ASSETS = uSER_ASSETS;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}
	public String getUSER_PW() {
		return USER_PW;
	}
	public void setUSER_PW(String USER_PW) {
		this.USER_PW = USER_PW;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String USER_NAME) {
		this.USER_NAME = USER_NAME;
	}
	
	
}
