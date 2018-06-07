package ui;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class Gza_MainPage1 extends JPanel { // 1번째 패널

	static boolean main_LoginDefault;
	int user_capital = 0;// db에서 user 정보 받을 예정
	String user_id = "xxx";// Login 완료시 id 넘겨 받을 변수
	Hour hour;
	static int[] btcCurrentPrice = { 0, 0, 0, 0, 0, 0, };
	TimeSeriesCollection dataset;
	static Minute min1, min2, min3, min4, min5, min6;
	static JLabel mainL;
	static JButton coinSellB;
	static JLabel mainL1;
	static JButton coinBuyB;
	static JButton myPageB;
	static JButton transaction;
	static JButton logoutB;
	JFreeChart chart;
	static TimeSeries series;
	JPanel westP;

	public Gza_MainPage1(Gza_Frame gf) {
		main_LoginDefault = false;
		setLayout(null);
		btcCurrentPrice[0] = 44000;
		btcCurrentPrice[1] = 44000;
		btcCurrentPrice[2] = 44000;
		btcCurrentPrice[3] = 44000;
		btcCurrentPrice[4] = 44000;
		btcCurrentPrice[5] = 44000;

		series = new TimeSeries("Coin 가격", Minute.class);
		hour = new Hour();
		min6 = new Minute();
		min1 = new Minute(min6.getMinute() - 5, hour);
		min2 = new Minute(min6.getMinute() - 4, hour);
		min3 = new Minute(min6.getMinute() - 3, hour);
		min4 = new Minute(min6.getMinute() - 2, hour);
		min5 = new Minute(min6.getMinute() - 1, hour);

		series.add(min1, btcCurrentPrice[0]);
		series.add(min2, btcCurrentPrice[1]);
		series.add(min3, btcCurrentPrice[2]);
		series.add(min4, btcCurrentPrice[3]);
		series.add(min5, btcCurrentPrice[4]);
		series.add(min6, btcCurrentPrice[5]);
		dataset = new TimeSeriesCollection(series);

		chart = ChartFactory.createTimeSeriesChart("Coin 시세 Chart", "시간순", "단가", dataset, true, true, false);

		setLayout(null);
		// chartPanel에 chart를 담음.
		ChartPanel cp = new ChartPanel(chart);
		cp.setPreferredSize(new java.awt.Dimension(500, 460));
		westP = new JPanel();
		westP.setSize(550, 480);
		westP.setLocation(5, 50);
		// west에 cp 넣기
		westP.add(cp);
		add(westP, BorderLayout.WEST);

		// North 구성
		JButton joinB = new JButton("회원가입");
		joinB.setSize(100, 30);
		joinB.setLocation(550, 10);
		joinB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gf.getCardLayout().show(gf.getContentPane(), "회원가입");
			}
		});
		JButton loginB = new JButton("로그인");
		loginB.setSize(100, 30);
		loginB.setLocation(660, 10);
		loginB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gf.getCardLayout().show(gf.getContentPane(), "로그인");
			}
		});
		// logoutB = new JButton("로그아웃");
		// logoutB.setSize(100, 30);
		// logoutB.setLocation(660, 10);
		// logoutB.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// gf.getCardLayout().show(gf.getContentPane(), "로그인");
		// }
		// });

		mainL = new JLabel(user_id + "님 환영합니다.");
		mainL.setSize(150, 30);
		mainL.setLocation(20, 10);
		mainL.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

		myPageB = new JButton("마이페이지");
		myPageB.setSize(100, 30);
		myPageB.setLocation(200, 10);
		myPageB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gf.getCardLayout().show(gf.getContentPane(), "마이페이지");
			}
		});

		mainL1 = new JLabel("자본금 = " + user_capital + " KRW ");
		mainL1.setSize(150, 30);
		mainL1.setLocation(350, 10);
		mainL1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

		add(mainL);
		add(myPageB);
		add(mainL1);
		add(joinB);
		add(loginB);

		// south 구성
		JButton refreshB = new JButton("그래프 새로고침");
		refreshB.setSize(150, 30);
		refreshB.setLocation(200, 530);
		add(refreshB);
		refreshB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				createDataset();
			}
		});
		// east 구성
		coinSellB = new JButton("코인 매도");
		coinSellB.setSize(150, 90);
		coinSellB.setLocation(580, 80);
		coinSellB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gf.getCardLayout().show(gf.getContentPane(), "매도");
			}
		});
		coinBuyB = new JButton("코인 매수");
		coinBuyB.setSize(150, 90);
		coinBuyB.setLocation(580, 190);
		coinBuyB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gf.getCardLayout().show(gf.getContentPane(), "매수");
			}
		});
		transaction = new JButton("거래내역조회");
		transaction.setBounds(580, 300, 150, 90);
		transaction.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gf.getCardLayout().show(gf.getContentPane(), "거래내역");
			}
		});

		add(transaction);
		add(coinBuyB);
		add(coinSellB);

		// logoutB.setVisible(main_LoginDefault);
		transaction.setVisible(main_LoginDefault);
		mainL.setVisible(main_LoginDefault);
		mainL1.setVisible(main_LoginDefault);
		coinSellB.setVisible(main_LoginDefault);
		coinBuyB.setVisible(main_LoginDefault);
		myPageB.setVisible(main_LoginDefault);

	}

	public Gza_MainPage1() {
		// TODO Auto-generated constructor stub
	}

	public XYDataset createDataset() {
		min6 = new Minute();
		min1 = new Minute(min6.getMinute() - 5, hour);
		min2 = new Minute(min6.getMinute() - 4, hour);
		min3 = new Minute(min6.getMinute() - 3, hour);
		min4 = new Minute(min6.getMinute() - 2, hour);
		min5 = new Minute(min6.getMinute() - 1, hour);

		btcCurrentPrice[0] = btcCurrentPrice[1];
		btcCurrentPrice[1] = btcCurrentPrice[2];
		btcCurrentPrice[2] = btcCurrentPrice[3];
		btcCurrentPrice[3] = btcCurrentPrice[4];
		btcCurrentPrice[4] = btcCurrentPrice[5];
		int upAndDown = (int) (Math.random() * 2) + 1;
		switch (upAndDown) {
		case 1:
			btcCurrentPrice[5] -= (int) (Math.random() * 200) + 1;
			break;
		case 2:
			btcCurrentPrice[5] += (int) (Math.random() * 200) + 1;
		}

		series.delete(0, 5);
		series.add(min1, btcCurrentPrice[0]);
		series.add(min2, btcCurrentPrice[1]);
		series.add(min3, btcCurrentPrice[2]);
		series.add(min4, btcCurrentPrice[3]);
		series.add(min5, btcCurrentPrice[4]);
		series.add(min6, btcCurrentPrice[5]);
		dataset = new TimeSeriesCollection(series);

		return dataset;
	}
}