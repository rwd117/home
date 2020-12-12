package User;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Graphics.RoundedButton;

public class UserLogin implements ActionListener {

	private JFrame frame;
	private JTextField IDText;
	private JPasswordField PWDText;
//	private RoundedButton BtnLogin,BtnClear;
	private JButton BtnLogin,BtnClear;
	
	public static void main(String[] args) {
		new UserLogin();
	}
	/**
	 * Create the application.
	 */
	public UserLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 966, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(051, 051, 051));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(244, 202, 89, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uBE44\uBC00\uBC88\uD638");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(212, 303, 184, 33);
		frame.getContentPane().add(label);
		
		IDText = new JTextField();
		IDText.setBounds(442, 200, 246, 41);
		IDText.selectAll();
		frame.getContentPane().add(IDText);
		
		
		PWDText = new JPasswordField();
		PWDText.setBounds(442, 307, 246, 41);
		PWDText.selectAll();
		PWDText.setEchoChar('*');
		frame.getContentPane().add(PWDText);
		
		BtnLogin = new JButton("로그인");
		BtnLogin.setFont(new Font("굴림", Font.PLAIN, 30));
		BtnLogin.setBounds(264, 396, 136, 41);
		BtnLogin.setBackground(new Color(153, 204, 255));
		frame.add(BtnLogin);
		
		BtnClear = new JButton("취소");
		BtnClear.setBounds(499, 396, 136, 41);
		BtnClear.setFont(new Font("굴림", Font.PLAIN, 30));
		BtnLogin.setBackground(new Color(153, 204, 255));
		frame.getContentPane().add(BtnClear);
		
		BtnLogin.addActionListener(this);
		BtnClear.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(BtnLogin)) {
			//아이디와 패스워드 조건 이랑 다넣어야함.
			new TimeInsert();
			frame.dispose();
		}else if(e.getSource().equals(BtnClear)) {
			
		}
	}
}
