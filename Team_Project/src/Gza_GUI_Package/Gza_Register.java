//package Gza_GUI_Package;
//
//import java.awt.TextField;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//
//import Gza_Action_Package.GZA_UserRegisterAction;
//
//public class Gza_Register extends JPanel {
//
//		public Gza_Register(Gza_Frame gf) {
//			
//			JLabel id = new JLabel("아이디");
//			JLabel pw = new JLabel("비밀번호");
//			JLabel pw2 = new JLabel("비밀번호 확인");
//			JLabel name = new JLabel("이름");
//			JButton j1 = new JButton("중복확인");
//			j1.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					JOptionPane.showMessageDialog(null, "중복되는 아이디가 없습니다.");
//					
//				}
//			});
//			JButton j2 = new JButton("회원가입");
//			j2.addActionListener(new ActionListener() {
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
//					gf.getCardLayout().show(gf.getContentPane(),"비로그인메인");
//				}
//			});
//			JButton j3 = new JButton("취소");
//			TextField idtext = new TextField();
//			TextField pwtext = new TextField();
//			TextField pw2text = new TextField();
//			TextField nametext = new TextField();
//			
//			add(id);
//			add(idtext);
//			add(j1);
//			add(pw);
//			add(pwtext);
//			add(pw2);
//			add(pw2text);
//			add(name);
//			add(nametext);
//			add(j2);
//			add(j3);
//			//(가로위치, 세로위치, 가로길이, 세로길이
//			
//			id.setBounds(110, 75, 100, 40);
//			idtext.setBounds(250, 80, 200, 30); 
//			j1.setBounds(510, 75, 100, 40);
//			pw.setBounds(110,135,100,40);
//			pwtext.setBounds(250,140,200,30);
//			pw2.setBounds(110,195,100,40);
//			pw2text.setBounds(250,200,200,30);
//			name.setBounds(110,255,100,40);
//			nametext.setBounds(250,260,200,30);
//			j2.setBounds(110,450,150,40);
//			j3.setBounds(300,450,150,40);
//			
//			setLayout(null);
//			setSize(800,600);
//			setVisible(true);
//			
//			j1.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					GZA_UserRegisterAction registerAction = new GZA_UserRegisterAction();
//					boolean check;
//					
//					if(idtext.getText().equals("")) {
//						JOptionPane.showMessageDialog(null, "입력칸이 비어있습니다.");
//					}
//					
//					check = registerAction.CheckIdAction(idtext.getText());
//					if(check) {
//						JOptionPane.showMessageDialog(null, "해당 아이디가 존재하지 않습니다.");
//					}else {
//						JOptionPane.showMessageDialog(null, "이미 존재하는 아이디입니다.");
//					}
//				}
//				
//			});
//			
//			j2.addActionListener(new ActionListener() {
//
//				@Override
//				public void actionPerformed(ActionEvent arg0) {
//					GZA_UserRegisterAction registerAction = new GZA_UserRegisterAction();
//					boolean check;
//					if(idtext.getText().equals("") || pwtext.getText().equals("")
//							|| pw2text.getText().equals("") || nametext.getText().equals("")) {
//						JOptionPane.showMessageDialog(null, "비어있는 입력칸이 있습니다.");
//					}
//					
//					if(!pwtext.getText().equals(pw2text.getText())) {
//						JOptionPane.showMessageDialog(null, "비밀번호가 서로 일치하지 않습니다.");
//					}
//					
//					
//					
//					check = registerAction.RegisterUserAction(idtext.getText(), pwtext.getText(), nametext.getText());
//					
//					if(check) {
//						JOptionPane.showMessageDialog(null, "회원가입에 성공했습니다.");
//					}else {
//						JOptionPane.showMessageDialog(null, "회원가입에 실패했습니다.");
//					}	
//				}
//				
//			});
//			
//		}
//}
