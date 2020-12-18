package User;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Db.UserDb;
import Main.MainPc;

public class TimeUserLogin implements ActionListener {

	private JFrame frame;
	private JTextField IDText;
	private JPasswordField PWDText;
	private JButton BtnLogin, BtnClear;
	private JLabel IDlb, PWDlb;
	private JComboBox JCom;

	public TimeUserLogin() {
		frame = new JFrame();
		frame.setBounds(500, 100, 966, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(051, 051, 051));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		IDlb = new JLabel("ID");
		IDlb.setForeground(Color.WHITE);
		IDlb.setFont(new Font("����", Font.PLAIN, 20));
		IDlb.setBounds(244, 202, 89, 33);
		frame.getContentPane().add(IDlb);

		PWDlb = new JLabel("\uBE44\uBC00\uBC88\uD638");
		PWDlb.setForeground(Color.WHITE);
		PWDlb.setFont(new Font("����", Font.PLAIN, 20));
		PWDlb.setBounds(212, 303, 184, 33);
		frame.getContentPane().add(PWDlb);

		IDText = new JTextField();
		IDText.setBounds(442, 200, 246, 41);
		IDText.selectAll();
		frame.getContentPane().add(IDText);

		PWDText = new JPasswordField();
		PWDText.setBounds(442, 307, 246, 41);
		PWDText.selectAll();
		PWDText.setEchoChar('*');
		frame.getContentPane().add(PWDText);

		BtnLogin = new JButton("�α���");
		BtnLogin.setFont(new Font("����", Font.PLAIN, 30));
		BtnLogin.setBounds(264, 396, 136, 41);
		BtnLogin.setBackground(new Color(153, 204, 255));
		frame.getContentPane().add(BtnLogin);

		BtnClear = new JButton("���");
		BtnClear.setBounds(499, 396, 136, 41);
		BtnClear.setFont(new Font("����", Font.PLAIN, 30));
		BtnClear.setBackground(new Color(153, 204, 255));
		frame.getContentPane().add(BtnClear);


		BtnLogin.addActionListener(this);
		BtnClear.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String id = IDText.getText();
		String pwd = PWDText.getText();
		if (e.getSource().equals(BtnLogin)) {
			if (id.equals("") || id.equals(null)) {
				JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� Ȯ�� ���ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
			} else if (pwd.equals("") || pwd.equals(null)) {
				JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� Ȯ�� ���ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
			} else if ((!id.equals("")) && (!id.equals(null)) && (!pwd.equals("")) && (!pwd.equals(null))) {

				// ȸ��
				boolean Check = UserDb.UserLogin(id, pwd);
				if (Check) {
					JOptionPane.showMessageDialog(null, "Ȯ�εǾ����ϴ�.", "�˸� â", JOptionPane.WARNING_MESSAGE);
					new TimeUserInsert(id,pwd);
					frame.dispose();
					
				} else if (!Check) {
					JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� Ȯ�� ���ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
				}
			}
			} else if (e.getSource().equals(BtnClear)) {
				int result = JOptionPane.showConfirmDialog(null, "Ȩ ȭ������ ���� ���ðڽ��ϱ�?", "Ȯ�� �޽���",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.NO_OPTION || result == JOptionPane.CLOSED_OPTION) {
					Clear();
				} else if (result == JOptionPane.YES_OPTION) {
					new MainPc();
					frame.dispose();
				}
		}
	}
	
	public void Clear() {
		IDText.setText("");
		PWDText.setText("");
	}
	
	
}
