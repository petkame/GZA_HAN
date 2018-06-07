package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gza_Login extends JPanel {

	JLabel id, pw;
	JButton j1, j2, j3;
	JTextField idtext;
	JPasswordField pwtext;
	Gza_MainPage1 mp1;

	public Gza_Login(Gza_Frame gf) {

		mp1 = new Gza_MainPage1();
		id = new JLabel("ID");
		pw = new JLabel("PASSWORD");
		j1 = new JButton("로그인");
		j2 = new JButton("ID/PW 찾기");
		j3 = new JButton("취소");
		idtext = new JTextField();
		pwtext = new JPasswordField();

		add(id);
		add(idtext);
		add(j1);
		add(pw);
		add(pwtext);
		add(j2);
		add(j3);
		// (가로위치, 세로위치, 가로길이, 세로길이

		id.setBounds(110, 145, 100, 40);
		idtext.setBounds(250, 150, 200, 30);
		pw.setBounds(110, 205, 100, 40);
		pwtext.setBounds(250, 210, 200, 30);
		j1.setBounds(510, 145, 100, 100);
		j2.setBounds(110, 450, 150, 40);
		j3.setBounds(430, 450, 150, 40);

		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
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
		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gf.getCardLayout().show(gf.getContentPane(), "ID/PW찾기");
			}
		});
		j3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				boolean main_LoginDefault = false;
				Gza_MainPage1.mainL.setVisible(main_LoginDefault);
				Gza_MainPage1.mainL1.setVisible(main_LoginDefault);
				Gza_MainPage1.coinSellB.setVisible(main_LoginDefault);
				Gza_MainPage1.coinBuyB.setVisible(main_LoginDefault);
				Gza_MainPage1.myPageB.setVisible(main_LoginDefault);
				Gza_MainPage1.transaction.setVisible(main_LoginDefault);
				gf.getCardLayout().show(gf.getContentPane(), "메인");
			}
		});
		setSize(800, 600);
		setLayout(null);
		setVisible(true);
	}

}