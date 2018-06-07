package Gza_GUI_Package;

import java.awt.*;

import javax.swing.*;

import Gza_DB_Package.GZA_USER_INFO;
import Gza_Process_Package.GZA_DAO;

public class Main extends JFrame {
	static boolean onoff = true;
	static GZA_Mypage mp = new GZA_Mypage();
	static GZA_SearchIDPW sip = new GZA_SearchIDPW();

	public Main() {
		setTitle("GAZUA");
		setSize(800, 600);
		setVisible(onoff);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 마이페이지 전개.
		getContentPane().add(sip.searchIP());
		//
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//
//		getContentPane().removeAll();
		// getContentPane().add(mp.contents())
//		repaint();

		// onoff = false;
		// this.setVisible(onoff);
		// mp.setVisible(!onoff);
		// mp.setSize(800, 600);
		//
	}

	public static void main(String[] args) {
		new Main();
		// SearchIDPW sip = new SearchIDPW();
	}

}
