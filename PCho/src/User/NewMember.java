package User;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Main.MainPc;
import Set.RoundedButton;

import javax.swing.JPanel;

import Db.*;

public class NewMember extends JFrame implements ActionListener {

	private JFrame frame = new JFrame();
	private JTextField Tfid;
	private JPasswordField Tfpwd;
	private JPasswordField TfpwdCheck;
	private JTextField Tfname;
	private JTextField Tfphone;
	private JButton BtnOver, BtnNew, BtnCan;
	private JLabel LBCheck;
	private JCheckBox Check;
	private JPanel TopPan, BottomPan;
	private int CheckPoint = 0;
	private boolean idcheck = false;

	public NewMember() {
		initialize();
	}

	private void initialize() {
		frame.setBounds(700, 200, 550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		TopPan = new JPanel();
		TopPan.setBounds(0, 0, 534, 99);
		TopPan.setBackground(Color.white);
		frame.getContentPane().add(TopPan);

		BottomPan = new JPanel();
		BottomPan.setBounds(0, 425, 534, 86);
		BottomPan.setBackground(Color.white);
		frame.getContentPane().add(BottomPan);
		TopPan.setLayout(null);

		JLabel LbTitle = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		LbTitle.setForeground(Color.BLACK);
		LbTitle.setFont(new Font("����", Font.BOLD, 30));
		LbTitle.setBounds(200, 31, 128, 35);
		TopPan.add(LbTitle);

		JLabel LBid = new JLabel("ID");
		LBid.setFont(new Font("����", Font.BOLD, 18));
		LBid.setBounds(160, 130, 35, 29);
		frame.getContentPane().add(LBid);

		JLabel LBpwd = new JLabel("\uBE44\uBC00\uBC88\uD638");
		LBpwd.setFont(new Font("����", Font.BOLD, 18));
		LBpwd.setBounds(108, 180, 87, 29);
		frame.getContentPane().add(LBpwd);

		JLabel LBpwdCheck = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		LBpwdCheck.setFont(new Font("����", Font.BOLD, 18));
		LBpwdCheck.setBounds(69, 230, 143, 29);
		frame.getContentPane().add(LBpwdCheck);

		JLabel LBphone = new JLabel("\uD578\uB4DC\uD3F0 \uBC88\uD638");
		LBphone.setFont(new Font("����", Font.BOLD, 18));
		LBphone.setBounds(85, 330, 110, 29);
		frame.getContentPane().add(LBphone);

		JLabel LBName = new JLabel("\uC774\uB984");
		LBName.setFont(new Font("����", Font.BOLD, 18));
		LBName.setBounds(146, 280, 49, 29);
		frame.getContentPane().add(LBName);

		Tfid = new JTextField();
		Tfid.setBounds(223, 136, 143, 23);
		frame.getContentPane().add(Tfid);
		Tfid.setColumns(10);

		Tfpwd = new JPasswordField();
		Tfpwd.setBounds(224, 186, 142, 21);
		Tfpwd.setEchoChar('*');
		frame.getContentPane().add(Tfpwd);

		TfpwdCheck = new JPasswordField();
		TfpwdCheck.setBounds(224, 236, 142, 21);
		TfpwdCheck.setEchoChar('*');
		frame.getContentPane().add(TfpwdCheck);

		Tfname = new JTextField();
		Tfname.setColumns(10);
		Tfname.setBounds(223, 286, 143, 23);
		frame.getContentPane().add(Tfname);

		Tfphone = new JTextField();
		Tfphone.setColumns(10);
		Tfphone.setBounds(223, 336, 143, 23);
		frame.getContentPane().add(Tfphone);

		BtnOver = new RoundedButton("\uC911\uBCF5\uD655\uC778");
		BtnOver.setBounds(393, 135, 87, 23);
		frame.getContentPane().add(BtnOver);

		JLabel lblNewLabel_2 = new JLabel(
				"\uAC1C\uC778\uC815\uBCF4 \uC218\uC9D1\uC5D0 \uB3D9\uC758 \uD558\uC2ED\uB2C8\uAE4C?");
		lblNewLabel_2.setBounds(95, 390, 208, 29);
		frame.getContentPane().add(lblNewLabel_2);
		BottomPan.setLayout(null);

		BtnNew = new JButton("\uD68C\uC6D0\uAC00\uC785");
		BtnNew.setBounds(141, 27, 100, 23);
		BtnNew.setBackground(new Color(153, 204, 255));
		BottomPan.add(BtnNew);

		BtnCan = new JButton("\uCDE8\uC18C");
		BtnCan.setBounds(309, 27, 70, 23);
		BtnCan.setBackground(new Color(153, 204, 255));
		BottomPan.add(BtnCan);

//		Check = new JButton("\uB0B4\uC6A9 \uD655\uC778");
//		Check.setBounds(291, 393, 97, 23);
//		frame.getContentPane().add(Check);

		LBCheck = new JLabel("");
		LBCheck.setBounds(414, 397, 57, 15);
		frame.getContentPane().add(LBCheck);

		Check = new JCheckBox("\uB3D9\uC758\uD569\uB2C8\uB2E4");
		Check.setBounds(301, 393, 115, 23);
		Check.setBackground(Color.white);
		frame.getContentPane().add(Check);

		BtnOver.addActionListener(this);
		BtnNew.addActionListener(this);
		BtnCan.addActionListener(this);
		Check.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String id = Tfid.getText();
		String pwd = Tfpwd.getText();
		String pwdCheck = TfpwdCheck.getText();
		String name = Tfname.getText();
		String tel = Tfphone.getText();

		if (e.getSource().equals(Check)) {
			Check.setSelected(false);
			int result = JOptionPane.showConfirmDialog(null, "�������� ������ ���� �Ͻðڽ��ϱ�?", "Ȯ�� �޽���",
					JOptionPane.YES_NO_OPTION);

			if (result == JOptionPane.NO_OPTION || result == JOptionPane.CLOSED_OPTION) {
				Check.setSelected(false);
				CheckPoint = 0;
			} else if (result == JOptionPane.YES_OPTION) {
				Check.setSelected(true);
				CheckPoint = 1;
			}

		} else if (e.getSource().equals(BtnCan)) {
			int result = JOptionPane.showConfirmDialog(null, "Ȩ ȭ������ ���ư��ðڽ��ϱ�?", "Ȯ�� �޽���", JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.NO_OPTION || result == JOptionPane.CLOSED_OPTION) {

			} else if (result == JOptionPane.YES_OPTION) {
				new MainPc();
			}
		} else if (e.getSource().equals(BtnNew)) {

			if (CheckPoint == 0) {
				JOptionPane.showMessageDialog(null, "�������� ������ ���� ���ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
				return;
			} else if ((!pwdCheck.equals(pwd)) || (pwdCheck.equals("")) || (pwd.equals("")) || (pwdCheck.equals(null))|| (pwd.equals(null))) {
				if ((pwdCheck.equals("")) || pwdCheck.equals(null) || (pwd.equals("")) || (pwd.equals(null))) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ������ �ֽ��ϴ�.", "�˸� â", JOptionPane.WARNING_MESSAGE);
					return;
				} else if (!pwdCheck.equals(pwd)) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ���� �ٸ��ϴ�!", "�˸� â", JOptionPane.WARNING_MESSAGE);
					return;
				}
			} else if (idcheck == false) {
				JOptionPane.showMessageDialog(null, "���̵� �ߺ�Ȯ���� ���ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
				return;
			} else if (tel.contains("-") || tel.equals("")) {
				JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� Ȯ�����ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
				return;
			}else if(name.equals("")||name.equals(null)){
				JOptionPane.showMessageDialog(null, "�̸��� Ȯ�� ���ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
				return;
			}else{
				NewMemberDb.NewMember(id, pwd, name, tel);
				JOptionPane.showMessageDialog(null, "ȸ�� ���� ����");
				frame.dispose();
				new MainPc();
			}
		} else if (e.getSource().equals(BtnOver)) {
			// ���̵� �ߺ�Ȯ��, BtnNew������ üũ �������,�����ͺ��̽� ����

			if (id.equals("") || id.equals(null)) {

				JOptionPane.showMessageDialog(null, "���̵� �����ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);

			} else {

				boolean Check = NewMemberDb.IDCheck(id);

				if (Check) {
					JOptionPane.showMessageDialog(null, "�ߺ��ϴ� ���̵� �ֽ��ϴ�.", "�˸� â", JOptionPane.WARNING_MESSAGE);
					idcheck = false;
				} else if (!Check) {
					JOptionPane.showMessageDialog(null, "��� ������ ���̵� �Դϴ�.", "�˸� â", JOptionPane.WARNING_MESSAGE);
					idcheck = true;
				}
			}

		}
	}
}
