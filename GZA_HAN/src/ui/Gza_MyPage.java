package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gza_MyPage extends JPanel {
	
	String id;
	String name;
	long TOTAL_ASSETS;
	long CASH_ASSETS;
	double BTC_ASSETS;
	double BTC_TO_CASH;
	Font DFont = new Font(Font.SANS_SERIF, Font.BOLD, 20);
	
	
	String BTCTOCASH;

	JButton GO_TO_MAINPAGE;
	JLabel USER_COIN_ASSETS_BTC;
	JLabel ID_LABEL;
	JLabel NAME_LABEL;
	JLabel TOTAL_ASSETS_LABEL;
	JLabel SEVERAL_ASSETS_LABEL;
	JLabel CASH_ASSETS_LABEL;
	JLabel BTC_ASSETS_LABEL;
	JLabel BTC_TO_CASH_LABEL;

	public Gza_MyPage(Gza_Frame gf) {

		
		id = "GAZUA";
		name = "개망함";
		TOTAL_ASSETS = 512511156;
		CASH_ASSETS = 16212167;
		BTC_ASSETS = 0.00124;
		BTC_TO_CASH = 1412.124;

		BTCTOCASH = BTC_TO_CASH + " krw";

		GO_TO_MAINPAGE = new JButton("메인페이지로");
		GO_TO_MAINPAGE.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
	            boolean main_LoginDefault = true;
	            Gza_MainPage1.mainL.setVisible(main_LoginDefault);
	            Gza_MainPage1.mainL1.setVisible(main_LoginDefault);
	            Gza_MainPage1.coinSellB.setVisible(main_LoginDefault);
	            Gza_MainPage1.coinBuyB.setVisible(main_LoginDefault);
	            Gza_MainPage1.myPageB.setVisible(main_LoginDefault);
	            Gza_MainPage1.transaction.setVisible(main_LoginDefault);
	            gf.getCardLayout().show(gf.getContentPane(), "메인");
				
			}
			
			
		});
		
				
		
		USER_COIN_ASSETS_BTC = new JLabel(Double.toString(BTC_ASSETS));
		ID_LABEL = new JLabel("아이디       " + id);
		NAME_LABEL = new JLabel("이름          " + name);
		TOTAL_ASSETS_LABEL = new JLabel("전체 자산 : KRW " + TOTAL_ASSETS);
		SEVERAL_ASSETS_LABEL = new JLabel("자산별 보유금액");
		CASH_ASSETS_LABEL = new JLabel("KRW : " + CASH_ASSETS);
		BTC_ASSETS_LABEL = new JLabel("BTC : ");
		BTC_TO_CASH_LABEL = new JLabel(BTCTOCASH);
		
		setLayout(null);

		add(ID_LABEL);
		add(NAME_LABEL);
		add(TOTAL_ASSETS_LABEL);
		add(SEVERAL_ASSETS_LABEL);
		add(CASH_ASSETS_LABEL);
		add(CASH_ASSETS_LABEL);
		add(USER_COIN_ASSETS_BTC);
		add(BTC_ASSETS_LABEL);
		add(BTC_TO_CASH_LABEL);
		add(GO_TO_MAINPAGE);

		ID_LABEL.setFont(DFont);
		NAME_LABEL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		TOTAL_ASSETS_LABEL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		SEVERAL_ASSETS_LABEL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		CASH_ASSETS_LABEL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		BTC_ASSETS_LABEL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		BTC_TO_CASH_LABEL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
		USER_COIN_ASSETS_BTC.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

		ID_LABEL.setBounds(50, 40, 300, 30);
		NAME_LABEL.setBounds(50, 80, 300, 30);
		TOTAL_ASSETS_LABEL.setBounds(450, 60, 300, 30);
		SEVERAL_ASSETS_LABEL.setBounds(80, 170, 180, 30);
		CASH_ASSETS_LABEL.setBounds(80, 215, 300, 30);
		BTC_ASSETS_LABEL.setBounds(80, 305, 80, 30);

		USER_COIN_ASSETS_BTC.setBounds(145, 295, 200, 30);
		BTC_TO_CASH_LABEL.setBounds(145, 320, 200, 30);

		GO_TO_MAINPAGE.setBounds(280, 470, 140, 40);
		
		
		
//		setVisible(onoff);

	}

}