package ui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import action.Gza_UserRegisterAction;

public class Gza_Register extends JPanel {

	public boolean check(String id) {
		boolean check = false;
		Gza_UserRegisterAction ura = new Gza_UserRegisterAction();

		check = ura.CheckIdAction(id);

		return check;
	}

	public Gza_Register(Gza_Frame gf) {

		JLabel id = new JLabel("아이디");
		JLabel pw = new JLabel("비밀번호");
		JLabel pw2 = new JLabel("비밀번호 확인");
		JLabel name = new JLabel("이름");
		JButton j1 = new JButton("중복확인");
		JButton j2 = new JButton("회원가입");
		JButton j3 = new JButton("취소");

		TextField idtext = new TextField();
		TextField pwtext = new TextField();
		TextField pw2text = new TextField();
		TextField nametext = new TextField();

		add(id);
		add(idtext);
		add(j1);
		add(pw);
		add(pwtext);
		add(pw2);
		add(pw2text);
		add(name);
		add(nametext);
		add(j2);
		add(j3);
		// (가로위치, 세로위치, 가로길이, 세로길이

		id.setBounds(110, 75, 100, 40);
		idtext.setBounds(250, 80, 200, 30);
		j1.setBounds(510, 75, 100, 40);
		pw.setBounds(110, 135, 100, 40);
		pwtext.setBounds(250, 140, 200, 30);
		pw2.setBounds(110, 195, 100, 40);
		pw2text.setBounds(250, 200, 200, 30);
		name.setBounds(110, 255, 100, 40);
		nametext.setBounds(250, 260, 200, 30);
		j2.setBounds(110, 450, 150, 40);
		j3.setBounds(300, 450, 150, 40);

		j1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { // id중복체크

				boolean check;
				String id = idtext.getText();
				if (id.equals("")) {
					// JOptionPane.showMessageDialog(idtext, message);
					JOptionPane.showMessageDialog(gf, "입력칸이 비어있습니다.");
					return;
				}

				// check = ;

				if (check(id)) {
					JOptionPane.showMessageDialog(gf, "이용 가능한 아이디입니다.");
				} else {
					JOptionPane.showMessageDialog(gf, "이미 존재하는 아이디입니다.");
				}
			}

		});

		j2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) { // 회원가입
				Gza_UserRegisterAction registerAction = new Gza_UserRegisterAction();
				boolean check;
				if (idtext.getText().equals("") || pwtext.getText().equals("") || pw2text.getText().equals("")
						|| nametext.getText().equals("")) {
					// JOptionPane.showMessageDialog(gf, message);
					JOptionPane.showMessageDialog(gf, "비어있는 입력칸이 있습니다.");
				}

				if (!pwtext.getText().equals(pw2text.getText())) {
					JOptionPane.showMessageDialog(gf, "비밀번호가 서로 일치하지 않습니다.");

				} else {

					check = registerAction.RegisterUserAction(idtext.getText(), pwtext.getText(), nametext.getText());

					if (check) {
						JOptionPane.showMessageDialog(gf, "회원가입에 성공했습니다.");
						gf.getCardLayout().show(gf.getContentPane(), "로그인");
					} else {
						JOptionPane.showMessageDialog(gf, "회원가입에 실패했습니다.");
					}
				}
			}

		});

		j3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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

		setLayout(null);
		setSize(800, 600);
		setVisible(true);
	}
}