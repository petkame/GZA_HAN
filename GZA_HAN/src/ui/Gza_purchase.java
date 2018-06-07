package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Gza_purchase extends JPanel {
	
	Scanner sc;
	int currentMoney;
	int mybtc;
	int btc;
	int btcCurrentPrice;
	int charge;
	int result1;
	int result2;
	String buy = "매수";
	String sell = "매도";
	Date today = new Date();
	
	
	public Gza_purchase(Gza_Frame gf) {
		sc = new Scanner(System.in);
		currentMoney = 1000000;
		btcCurrentPrice = 50000;
		btc = 10;
		charge = (int) (btcCurrentPrice * btc * 0.05);
		result1 = btcCurrentPrice * btc + charge;
		int xL = 100;
		int xT = 530;
		String[] coin = { "btc", "btc1" };
		ArrayList<String> list = new ArrayList<String>();

		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd/hh:mm:ss a");
		String today1 = date.format(today);
		

		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
    
		
		JLabel lb0 = new JLabel("보유금액");
		JLabel lb1 = new JLabel("구매가능");
		JLabel lb2 = new JLabel("매수수량");
		JLabel lb3 = new JLabel("매수가격");
		JLabel lb4 = new JLabel("수수료");
		JLabel lb5 = new JLabel("구매총액");
		JLabel lb10 = new JLabel("------------------------------------------------------------");
		JButton jb1 = new JButton("확인");
		JButton jb2 = new JButton("취소");
		JButton jb3 = new JButton("수량갱신");
		JLabel lb = new JLabel(Integer.toString(currentMoney));
		JTextField jf1 = new JTextField();
		JLabel jf2 = new JLabel(Integer.toString(btcCurrentPrice));
		JLabel jf3 = new JLabel(Integer.toString(charge));
		JLabel jf4 = new JLabel(Integer.toString(result1));
		JComboBox jc = new JComboBox(coin);
		JScrollPane s = new JScrollPane(jc);
		
		
		add(lb);add(lb0);add(lb1);
		add(lb2);add(lb3);add(lb4);
		add(lb5);add(lb10);
		add(jf1);add(jf2);
		add(jf3);add(jf4);
		add(jb1);add(jb2);add(jb3);
		add(s);
		
		
		lb0.setBounds(xL, 10, 100, 30);
		lb1.setBounds(xL, 50, 100, 100);
		lb2.setBounds(xL, 130, 100, 100);
		lb3.setBounds(xL, 210, 100, 100);
		lb4.setBounds(xL, 290, 100, 100);
		lb5.setBounds(xL, 400, 100, 100);
		lb10.setBounds(xL, 370, 800, 30);
		lb.setBounds(xT, 50, 100, 100);
		jf1.setBounds(xT,163,70,30);
		jf2.setBounds(xT,233,50,50);
		jf3.setBounds(xT,313,50,50);
		jf4.setBounds(xT,423,50,50);
		jb1.setBounds(300,500,70,30);
		jb2.setBounds(400, 500, 70, 30);
		jb3.setBounds(610, 163, 90, 30);
		s.setBounds(xT,10,70,35);
		
		
		lb0.setFont(new Font("Gothic", Font.BOLD, 23));
		lb1.setFont(new Font("Gothic", Font.BOLD, 23));
		lb2.setFont(new Font("Gothic", Font.BOLD, 23));
		lb3.setFont(new Font("Gothic", Font.BOLD, 23));
		lb4.setFont(new Font("Gothic", Font.BOLD, 23));
		lb5.setFont(new Font("Gothic", Font.BOLD, 23));
		lb10.setFont(new Font("Gothic", Font.BOLD, 30));

		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mybtc += btc;
				currentMoney -= result1;
				date.format(today);
				list.add(today1);
				System.out.println(date.format(today));
				System.out.println("내돈 : " + currentMoney + " / 코인 : " + mybtc);
				System.out.println("--------------");
				System.out.println(list.get(0));
				JOptionPane.showMessageDialog(null, "구매에 성공하였습니다.");
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

		
		jb2.addActionListener(new ActionListener() {
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
		
		
		setSize(800, 600);
		setVisible(true);
	}
	
	
	}