package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gza_transaction extends JPanel {
	
	Date today = new Date();
	SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd/hh:mm");
	String today1 = date.format(today);
	ArrayList<String> list = new ArrayList<String>();

	Gza_transaction(Gza_Frame gf) {
		int y = 50;
		int timeSize = 130;
		int priceSize = 100;
		int amountSize = 100;
		int pcSize = 100;
		setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        
        JLabel lb0 = new JLabel("주문시간");
        JLabel lb1 = new JLabel("구분");
        JLabel lb2 = new JLabel("체결가격");
        JLabel lb3 = new JLabel("체결수량");
        JLabel lb4 = new JLabel("체결금액");
        JLabel time1 = new JLabel(today1);
        JLabel time2 = new JLabel();
        JLabel time3 = new JLabel();
        JLabel time4 = new JLabel();
        JLabel time5 = new JLabel();
        JLabel dv1 = new JLabel("매수");
        JLabel dv2 = new JLabel();
        JLabel dv3 = new JLabel();
        JLabel dv4 = new JLabel();
        JLabel dv5 = new JLabel();
        JLabel price1 = new JLabel("30");
        JLabel price2 = new JLabel();
		JLabel price3 = new JLabel();
		JLabel price4 = new JLabel();
		JLabel price5 = new JLabel();
		JLabel amount1 = new JLabel("300000");
		JLabel amount2 = new JLabel();
		JLabel amount3 = new JLabel();
		JLabel amount4 = new JLabel();
		JLabel amount5 = new JLabel();
		JLabel pc1 = new JLabel("1000000000");
		JLabel pc2 = new JLabel();
		JLabel pc3 = new JLabel();
		JLabel pc4 = new JLabel();
		JLabel pc5 = new JLabel();
		JButton jb1 = new JButton("메인으로");
        
        
		add(lb0);add(lb1);add(lb2);
		add(lb3);add(lb4);
		add(time1);add(time2);add(time3);
		add(time4);add(time5);
		add(dv1);add(dv2);add(dv3);
		add(dv4);add(dv5);
		add(price1);add(price2);add(price3);
		add(price4);add(price5);
		add(amount1);add(amount2);add(amount3);
		add(amount4);add(amount5);
		add(pc1);add(pc2);add(pc3);
		add(pc4);add(pc5);
		add(jb1);
		
		
		lb0.setBounds(50,y,100,30);
		lb1.setBounds(210,y,50,30);
		lb2.setBounds(330,y,100,30);
		lb3.setBounds(480,y,100,30);
		lb4.setBounds(625,y,100,30);
		time1.setBounds(30,125,timeSize,30);
		time2.setBounds(30,200,timeSize,30);
		time3.setBounds(30,275,timeSize,30);
		time4.setBounds(30,350,timeSize,30);
		time5.setBounds(30,425,timeSize,30);
		dv1.setBounds(210,125,50,30);
		dv2.setBounds(210,200,50,30);
		dv3.setBounds(210,275,50,30);
		dv4.setBounds(210,350,50,30);
		dv5.setBounds(210,425,50,30);
		price1.setBounds(330,125,priceSize,30);
		price2.setBounds(330,200,priceSize,30);
		price3.setBounds(330,275,priceSize,30);
		price4.setBounds(330,350,priceSize,30);
		price5.setBounds(330,425,priceSize,30);
		amount1.setBounds(480,125,amountSize,30);
		amount2.setBounds(480,200,amountSize,30);
		amount3.setBounds(480,275,amountSize,30);
		amount4.setBounds(480,350,amountSize,30);
		amount5.setBounds(480,425,amountSize,30);
		pc1.setBounds(625,125,pcSize,30);
		pc2.setBounds(625,200,pcSize,30);
		pc3.setBounds(625,275,pcSize,30);
		pc4.setBounds(625,350,pcSize,30);
		pc5.setBounds(625,425,pcSize,30);
		jb1.setBounds(330,500,100,30);
		
		
		lb0.setFont(new Font("Gothic", Font.BOLD, 15));
		lb1.setFont(new Font("Gothic", Font.BOLD, 15));
		lb2.setFont(new Font("Gothic", Font.BOLD, 15));
		lb3.setFont(new Font("Gothic", Font.BOLD, 15));
		lb4.setFont(new Font("Gothic", Font.BOLD, 15));
		time1.setFont(new Font("Gothic", Font.BOLD, 15));
		time2.setFont(new Font("Gothic", Font.BOLD, 15));
		time3.setFont(new Font("Gothic", Font.BOLD, 15));
		time4.setFont(new Font("Gothic", Font.BOLD, 15));
		time5.setFont(new Font("Gothic", Font.BOLD, 15));
		dv1.setFont(new Font("Gothic", Font.BOLD, 15));
		dv2.setFont(new Font("Gothic", Font.BOLD, 15));
		dv3.setFont(new Font("Gothic", Font.BOLD, 15));
		dv4.setFont(new Font("Gothic", Font.BOLD, 15));
		dv5.setFont(new Font("Gothic", Font.BOLD, 15));
		price1.setFont(new Font("Gothic", Font.BOLD, 15));
		price2.setFont(new Font("Gothic", Font.BOLD, 15));
		price3.setFont(new Font("Gothic", Font.BOLD, 15));
		price4.setFont(new Font("Gothic", Font.BOLD, 15));
		price5.setFont(new Font("Gothic", Font.BOLD, 15));
		amount1.setFont(new Font("Gothic", Font.BOLD, 15));
		amount2.setFont(new Font("Gothic", Font.BOLD, 15));
		amount3.setFont(new Font("Gothic", Font.BOLD, 15));
		amount4.setFont(new Font("Gothic", Font.BOLD, 15));
		amount5.setFont(new Font("Gothic", Font.BOLD, 15));
		pc1.setFont(new Font("Gothic", Font.BOLD, 15));
		pc2.setFont(new Font("Gothic", Font.BOLD, 15));
		pc3.setFont(new Font("Gothic", Font.BOLD, 15));
		pc4.setFont(new Font("Gothic", Font.BOLD, 15));
		pc5.setFont(new Font("Gothic", Font.BOLD, 15));

				
		jb1.addActionListener(new ActionListener() {
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