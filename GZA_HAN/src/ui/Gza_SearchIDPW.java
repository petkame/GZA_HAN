package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import action.Gza_UserSearchAction;
import model.Gza_DAO;

public class Gza_SearchIDPW extends JPanel {
	Font DFont = new Font(Font.SANS_SERIF, Font.BOLD, 20);

	JLabel ID_SEARCH;
	JLabel PW_SEARCH;
	JLabel ID_LABEL;
	JLabel PW_LABEL;
	JLabel NAME_LABEL, NAME_LABEL2;

	JTextField INPUT_ID;
	JTextField INPUT_PW;
	JTextField INPUT_NAME1, INPUT_NAME2;

	JButton APPLY1, APPLY2;
	JButton CANCEL;

	public Gza_SearchIDPW(Gza_Frame gf) {

		ID_SEARCH = new JLabel("아이디 찾기");
		PW_SEARCH = new JLabel("비밀번호 찾기");

		ID_LABEL = new JLabel("아이디");
		PW_LABEL = new JLabel("비밀번호");
		NAME_LABEL = new JLabel("이름");
		NAME_LABEL2 = new JLabel("이름");
		APPLY1 = new JButton("확인");
		APPLY2 = new JButton("확인");
		CANCEL = new JButton("취소");

		INPUT_ID = new JTextField();
		INPUT_PW = new JTextField();
		INPUT_NAME1 = new JTextField();
		INPUT_NAME2 = new JTextField();

		setLayout(null);

		ID_SEARCH.setBounds(70, 25, 200, 30);
		PW_SEARCH.setBounds(70, 270, 200, 30);
		NAME_LABEL.setBounds(120, 90, 150, 30);
		PW_LABEL.setBounds(120, 170, 150, 30);
		ID_LABEL.setBounds(120, 335, 200, 30);
		NAME_LABEL2.setBounds(120, 415, 200, 30);
		INPUT_NAME1.setBounds(300, 90, 200, 30);
		INPUT_PW.setBounds(300, 170, 200, 30);
		INPUT_ID.setBounds(300, 335, 200, 30);
		INPUT_NAME2.setBounds(300, 415, 200, 30);

		APPLY1.setBounds(650, 110, 75, 50);
		APPLY2.setBounds(650, 355, 75, 50);
		CANCEL.setBounds(355, 500, 90, 35);

		ID_SEARCH.setFont(DFont);
		PW_SEARCH.setFont(DFont);
		NAME_LABEL.setFont(DFont);
		PW_LABEL.setFont(DFont);
		NAME_LABEL2.setFont(DFont);
		ID_LABEL.setFont(DFont);

		add(ID_SEARCH);
		add(PW_SEARCH);
		add(NAME_LABEL);
		add(NAME_LABEL2);
		add(ID_LABEL);
		add(PW_LABEL);
		add(APPLY1);
		add(APPLY2);
		add(CANCEL);
		add(INPUT_NAME1);
		add(INPUT_PW);
		add(INPUT_ID);
		add(INPUT_NAME2);

		setBounds(0, 0, 400, 600);

		APPLY1.addActionListener(new ActionListener() {// ID찾기

			@Override
			public void actionPerformed(ActionEvent arg0) {

				String NAME1 = new String(INPUT_NAME1.getText());
				String PW = new String(INPUT_PW.getText());
				Gza_UserSearchAction searchAction = new Gza_UserSearchAction();
				Gza_DAO dao = new Gza_DAO();
				if (NAME1.equals("") || PW.equals("")) {
					JOptionPane.showMessageDialog(null, "입력되지 않은 항목이 있습니다.");
				} else {

					String GET_ID = searchAction.returnid(NAME1, PW);
					JOptionPane.showMessageDialog(null, NAME1 + "님의 ID는 " + GET_ID + "입니다.");
				}
			}
		});

		APPLY2.addActionListener(new ActionListener() {// PW찾기

			@Override
			public void actionPerformed(ActionEvent e) {
				String ID = new String(INPUT_ID.getText());
				String NAME2 = new String(INPUT_NAME2.getText());

				Gza_UserSearchAction searchAction = new Gza_UserSearchAction();

				if (ID.equals("") || NAME2.equals(null)) {
					JOptionPane.showMessageDialog(null, "입력되지 않은 항목이 있습니다.");
				} else {
					String GET_PW = searchAction.returnpw(ID, NAME2);
					JOptionPane.showMessageDialog(null, ID + "님의 PW는 " + GET_PW + "입니다.");
				}
			}
		});
		CANCEL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
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

	}
}