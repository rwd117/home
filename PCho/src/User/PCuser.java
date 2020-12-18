package User;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import Db.PCSeatDb;
import Db.UserDb;
import Main.MainPc;

public class PCuser implements ActionListener{
	
	private JFrame frame;
	private JLabel Cardnum;
	private JLabel TimeInsert;
	private JLabel Timer;
	private JButton BtnExit;
	private JTextArea ta, ta1, ta2;
	boolean state = true;
	private String Time;
	private String TimeCheck;
	int seconds;
	int minutes;
	int hours;
	private String ID;
	Thread time;
	private String pccombo;
	
	public PCuser (String PCcombo, String Id) {
		initialize();
		test();
		this.ID=Id;
		this.pccombo=PCcombo;
		
		TimeCheck=UserDb.UserTimeDb(PCcombo,ID);
		
		ta.setText(PCcombo + "�� �ڸ�" + "\n" + Id +  "���� ������Դϴ�.");
		ta1.setText(TimeCheck);
		
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);

		Border lineBorder = BorderFactory.createLineBorder(new Color(255, 255, 255), 3);

		Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);

		Cardnum = new JLabel("�ڸ�  ��ȣ �� ID");
		Cardnum.setBounds(43, 47, 139, 40);
		frame.getContentPane().add(Cardnum);

		TimeInsert = new JLabel("\uCDA9\uC804\uD55C \uC2DC\uAC04");
		TimeInsert.setBounds(43, 115, 139, 36);
		frame.getContentPane().add(TimeInsert);

		Timer = new JLabel("\uD604\uC7AC \uC0AC\uC6A9\uD55C \uC2DC\uAC04");
		Timer.setBounds(43, 175, 139, 38);
		frame.getContentPane().add(Timer);

		BtnExit = new JButton("\uB85C\uADF8\uC544\uC6C3");
		BtnExit.setBounds(183, 214, 97, 23);
		BtnExit.setBackground(new Color(255, 255, 255));
		BtnExit.setFont(new Font("����", Font.PLAIN, 13));
		BtnExit.setForeground(new Color(0, 00, 00));
		BtnExit.setBorderPainted(false);
		frame.getContentPane().add(BtnExit);

		JScrollPane sp = new JScrollPane();
		sp.setBounds(204, 40, 250, 80);
		frame.getContentPane().add(sp);
		sp.setBackground(new Color(255, 255, 255));
		sp.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));

		ta = new JTextArea();
		ta.setEnabled(false);
		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		ta.setBackground(new Color(255, 255, 255));
		ta.setFont(new Font("Monospaced", Font.BOLD, 15));
		ta.setForeground(new Color(0, 00, 00));
		sp.setViewportView(ta);

		JScrollPane sp1 = new JScrollPane();
		sp1.setBounds(204, 100, 250, 65);
		frame.getContentPane().add(sp1);
		sp1.setBackground(new Color(255, 255, 255));
		sp1.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));

		ta1 = new JTextArea();
		ta1.setEnabled(false);
		ta1.setForeground(new Color(0, 00, 00));
		ta1.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		ta1.setFont(new Font("Monospaced", Font.BOLD, 15));
		ta1.setBackground(new Color(255, 255, 255));
		sp1.setViewportView(ta1);

		JScrollPane sp2 = new JScrollPane();
		sp2.setBounds(204, 160, 250, 65);
		frame.getContentPane().add(sp2);
		sp2.setBackground(new Color(255, 255, 255));
		sp2.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));

		ta2 = new JTextArea();
		ta2.setEnabled(false);
		ta2.setForeground(new Color(0, 00, 00));
		ta2.setBackground(new Color(255, 255, 255));
		ta2.setFont(new Font("Monospaced", Font.BOLD, 15));
		ta2.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		sp2.setViewportView(ta2);

		BtnExit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(BtnExit)) {
			int result = JOptionPane.showConfirmDialog(null, "��� ���Ḧ �Ͻðڽ��ϱ�?", "Ȯ�� �޽���", JOptionPane.YES_NO_OPTION);

			if (result == JOptionPane.NO_OPTION || result == JOptionPane.CLOSED_OPTION) {
				
			} else if (result == JOptionPane.YES_OPTION) {
				//id�� �а� Time�� �ǽð�,TimeCheck �� �� �����ð�
				UserDb.UserTimesub(ID, TimeCheck, Time);
				PCSeatDb.PCSeatAdd(pccombo);
				new MainPc();
				frame.dispose();
			}
		}
	}

	public void test() {
		state = true;
		
		
		time = new Thread() {
			public void run() {

				for (;;) {
					if (state == true) {
						try {
							sleep(1000);
							if(seconds>=59) {
								seconds=0;
								minutes++;
							}
							if (minutes >= 59) {
								minutes = 0;
								hours++;
							}	
							seconds++;
							Time=String.format("%02d", hours) + ":" + String.format("%02d", minutes);
							ta2.setText(Time);
							

							if(Time.equals(TimeCheck)) {
								time.interrupt();
								
							}
							
						} catch (InterruptedException e) {
							JOptionPane.showMessageDialog(null, "���� �ð��� �� �Ἥ ����˴ϴ�.", "�˸� â", JOptionPane.WARNING_MESSAGE);
							new MainPc();
							frame.dispose();
							return;
						}
					} else {
						break;
					}
				}
			}
		};
		time.start();
	}

}
