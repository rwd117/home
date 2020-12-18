package NoUser;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Db.CardDb;
import Db.NoUserDb;
import Db.PCSeatDb;
import Main.MainPc;
import Set.AllNum;

public class PCNouserLogin implements ActionListener {
	private JFrame frame;
	private JTextField NameText;
	private JButton BtnLogin, BtnClear;
	private JLabel IDlb, Namelb,PClb;
	private JComboBox JCom,JCom1;
//	private ClientBackGround client=new ClientBackGround();
//	private PCServerBackGround server=new PCServerBackGround();
//	private String msg;
	private String Cardcombo="";
	private String PCcombo="";
	private ArrayList<String> CardNum;
	private String Card[];
	private ArrayList<String> PCNum;
	private String PC[];


	public PCNouserLogin() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 100, 966, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(051, 051, 051));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		PClb=new JLabel("�ڸ� ����");
		PClb.setForeground(Color.WHITE);
		PClb.setFont(new Font("����", Font.PLAIN, 20));
		PClb.setBounds(212, 121, 150, 33);
		frame.getContentPane().add(PClb);
		
		IDlb = new JLabel("ī�� ��ȣ");
		IDlb.setForeground(Color.WHITE);
		IDlb.setFont(new Font("����", Font.PLAIN, 20));
		IDlb.setBounds(212, 222, 150, 33);
		frame.getContentPane().add(IDlb);

		Namelb = new JLabel("ȸ�� �̸�");
		Namelb.setForeground(Color.WHITE);
		Namelb.setFont(new Font("����", Font.PLAIN, 20));
		Namelb.setBounds(212, 323, 184, 33);
		frame.getContentPane().add(Namelb);
		
		PCNum=AllNum.PCNum(PCNum);
		PC=PCNum.toArray(new String[PCNum.size()]);
		
		JCom1=new JComboBox(PC);
		JCom1.setBounds(442, 121, 246, 41);
		frame.getContentPane().add(JCom1);
		JCom1.setVisible(true);
		
		CardNum=AllNum.CardNum(CardNum);
		Card=CardNum.toArray(new String[CardNum.size()]);
		
		JCom = new JComboBox(Card);
		JCom.setBounds(442, 222, 246, 41);
		frame.getContentPane().add(JCom);
		JCom.setVisible(true);

		NameText = new JTextField();
		NameText.setBounds(442, 327, 246, 41);
		NameText.selectAll();
		frame.getContentPane().add(NameText);

		BtnLogin = new JButton("�α���");
		BtnLogin.setFont(new Font("����", Font.PLAIN, 30));
		BtnLogin.setBounds(264, 420, 136, 41);
		BtnLogin.setBackground(new Color(153, 204, 255));
		frame.getContentPane().add(BtnLogin);

		BtnClear = new JButton("���");
		BtnClear.setBounds(499, 420, 136, 41);
		BtnClear.setFont(new Font("����", Font.PLAIN, 30));
		BtnClear.setBackground(new Color(153, 204, 255));
		frame.getContentPane().add(BtnClear);

//		server.setGUI(this);
//		server.setting();

		BtnLogin.addActionListener(this);
		BtnClear.addActionListener(this);
		JCom.addActionListener(this);
		JCom1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(BtnLogin)) {

//				client.setGui(this);
//				client.setCheckUser(id, pwd);
//				client.Userconnet();
			String name = NameText.getText();
			if (Cardcombo.equals(null) || Cardcombo.equals("") || Cardcombo.equals("ī�� ��ȣ�� ����ּ���")) {
				JOptionPane.showMessageDialog(null, "ī���ȣ �� ������ �ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
				return;
			} else if (name.equals("") || name.equals(null)) {
				JOptionPane.showMessageDialog(null, "�̸��� �����ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
				return;
			} else if(PCcombo.equals("")||PCcombo.equals(null)||PCcombo.equals("�¼��� ����ּ���")) {
				JOptionPane.showMessageDialog(null, "�¼��� �������ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
				return;
			}	else {
				
				boolean flag=NoUserDb.NoUserCheck(Cardcombo,name);
				
				if(flag) {
//					String Time=
					PCSeatDb.PCSeatSub(PCcombo);
					 CardDb.Cardsub(Cardcombo);
					new PCnouser(PCcombo ,Cardcombo, name);
					frame.dispose();
				}else if(!flag) {
					JOptionPane.showMessageDialog(null, "�̸��� ī���ȣ�� �ٽ� Ȯ�� ���ּ���", "�˸� â", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
			}
		} else if (e.getSource().equals(BtnClear)) {
			int result = JOptionPane.showConfirmDialog(null, "Ȩ ȭ������ ���� ���ðڽ��ϱ�?", "Ȯ�� �޽���", JOptionPane.YES_NO_OPTION);

			if (result == JOptionPane.NO_OPTION || result == JOptionPane.CLOSED_OPTION) {
				Clear();
			} else if (result == JOptionPane.YES_OPTION) {
				new MainPc();
				frame.dispose();
			}
		} else if (e.getSource().equals(JCom)) {
			Cardcombo = JCom.getSelectedItem().toString();

		} else if(e.getSource().equals(JCom1)) {
			PCcombo=JCom1.getSelectedItem().toString();
		}
	}

	public void Clear() {
		NameText.setText("");
	}

}
