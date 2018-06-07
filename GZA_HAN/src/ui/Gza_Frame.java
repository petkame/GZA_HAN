package ui;

import java.awt.CardLayout;

import javax.swing.JFrame;

public class Gza_Frame extends JFrame {
	CardLayout cards = new CardLayout();

	Gza_Frame() {

		setSize(800, 600);
		getContentPane().setLayout(cards);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		getContentPane().add("비로그인메인", new Gza_MainPage1(this));
		getContentPane().add("메인", new Gza_MainPage1(this));
		getContentPane().add("매수", new Gza_purchase(this));
		getContentPane().add("매도", new Gza_sell(this));
		getContentPane().add("거래내역", new Gza_transaction(this));
		getContentPane().add("마이페이지", new Gza_MyPage(this));
		getContentPane().add("ID/PW찾기", new Gza_SearchIDPW(this));
		getContentPane().add("회원가입", new Gza_Register(this));
		getContentPane().add("로그인", new Gza_Login(this));
		
	

		setResizable(false);
		setVisible(true);
	}

	public void changePanel() {
		cards.next(this.getContentPane());
	}
	
	public CardLayout getCardLayout() {
		return cards;
	}
	
	public static void main (String [] args) {
		new Gza_Frame();
	}
}