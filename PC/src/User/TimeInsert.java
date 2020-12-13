package User;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import Graphics.RoundedButton;
import Main.Main;

public class TimeInsert implements MouseListener, ActionListener {

	private JFrame frame = new JFrame();
	private JPanel Panel;
	private JButton BtnPay, BtnCan;
	private RoundedButton Btn1, Btn2, Btn3, Btn4, Btn5, Btn6, Btn7, Btn8;
	private JScrollPane scrollPane;
	private String Text;
	private JTextArea TA;
	private String Time, Money;
	private boolean TAcheck = false;

	public static void main(String[] args) {
		new TimeInsert();
	}

	/**
	 * Create the application.
	 */
	public TimeInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	private void initialize() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setBounds(120, 150, 1600, 800);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);

		Panel = new JPanel();
		Panel.setLayout(null);
		Panel.setVisible(true);
		Panel.setBounds(0, 80, 1600, 600);
		Panel.setBackground(new Color(000, 153, 255));
		frame.getContentPane().add(Panel);

		JLabel lblNewLabel = new JLabel("\uC2DC\uAC04 \uCD94\uAC00");
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 30));
		lblNewLabel.setBounds(50, 10, 222, 82);
		Panel.add(lblNewLabel);

		Btn1 = new RoundedButton("00:45     |      1000\uC6D0");
		Btn1.setForeground(SystemColor.textHighlightText);
		Btn1.setFont(new Font("����", Font.BOLD, 30));
		Btn1.setBounds(60, 80, 815, 63);
		Btn1.setBackground(new Color(051, 051, 051));
		Btn1.setFocusPainted(false);
		Panel.add(Btn1);

		Btn2 = new RoundedButton("01:30     |      2000\uC6D0");
		Btn2.setForeground(SystemColor.textHighlightText);
		Btn2.setFont(new Font("����", Font.BOLD, 30));
		Btn2.setBounds(60, 140, 815, 63);
		Btn2.setBackground(new Color(051, 051, 051));
		Btn2.setFocusPainted(false);
		Panel.add(Btn2);

		Btn3 = new RoundedButton("02:15     |      3000\uC6D0");
		Btn3.setForeground(SystemColor.textHighlightText);
		Btn3.setFont(new Font("����", Font.BOLD, 30));
		Btn3.setBounds(60, 200, 815, 63);
		Btn3.setBackground(new Color(051, 051, 051));
		Btn3.setFocusPainted(false);
		Panel.add(Btn3);

		Btn4 = new RoundedButton("03:00     |      4000\uC6D0");
		Btn4.setForeground(SystemColor.textHighlightText);
		Btn4.setFont(new Font("����", Font.BOLD, 30));
		Btn4.setBounds(60, 260, 815, 63);
		Btn4.setBackground(new Color(051, 051, 051));
		Btn4.setFocusPainted(false);
		Panel.add(Btn4);

		Btn5 = new RoundedButton("04:00     |      5000\uC6D0");
		Btn5.setForeground(SystemColor.textHighlightText);
		Btn5.setFont(new Font("����", Font.BOLD, 30));
		Btn5.setBounds(60, 320, 815, 63);
		Btn5.setBackground(new Color(051, 051, 051));
		Btn5.setFocusPainted(false);
		Panel.add(Btn5);

		Btn6 = new RoundedButton("09:00     |   10,000\uC6D0");
		Btn6.setForeground(SystemColor.textHighlightText);
		Btn6.setFont(new Font("����", Font.BOLD, 30));
		Btn6.setBounds(60, 380, 815, 63);
		Btn6.setBackground(new Color(051, 051, 051));
		Btn6.setFocusPainted(false);
		Panel.add(Btn6);

		Btn7 = new RoundedButton("45:00     |   50,000\uC6D0");
		Btn7.setForeground(SystemColor.textHighlightText);
		Btn7.setFont(new Font("����", Font.BOLD, 30));
		Btn7.setBounds(60, 440, 815, 63);
		Btn7.setBackground(new Color(051, 051, 051));
		Btn7.setFocusPainted(false);
		Panel.add(Btn7);

		Btn8 = new RoundedButton("100:00    |  100,000\uC6D0");
		Btn8.setForeground(SystemColor.textHighlightText);
		Btn8.setFont(new Font("����", Font.BOLD, 30));
		Btn8.setBounds(60, 500, 815, 63);
		Btn8.setBackground(new Color(051, 051, 051));
		Btn8.setFocusPainted(false);
		Panel.add(Btn8);

		scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(951, 140, 618, 262);
		scrollPane.setBackground(new Color(000, 153, 255));

		Border lineBorder = BorderFactory.createLineBorder(new Color(000, 153, 255), 3);

		Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);

		scrollPane.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		Panel.add(scrollPane);

		TA = new JTextArea();
		TA.setForeground(Color.BLACK);
		TA.setEnabled(false);
		TA.setBackground(new Color(000, 153, 255));
		TA.setFont(new Font("Monospaced", Font.BOLD, 30));

		TA.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));

		scrollPane.setViewportView(TA);

		BtnPay = new JButton("\uACB0\uC81C");
		BtnPay.setBounds(1069, 442, 179, 47);
		Panel.add(BtnPay);

		BtnCan = new JButton("\uCDE8\uC18C");
		BtnCan.setBounds(1370, 440, 179, 47);
		Panel.add(BtnCan);

		Btn1.addMouseListener(this);
		Btn2.addMouseListener(this);
		Btn3.addMouseListener(this);
		Btn4.addMouseListener(this);
		Btn5.addMouseListener(this);
		Btn6.addMouseListener(this);
		Btn7.addMouseListener(this);
		Btn8.addMouseListener(this);
		BtnPay.addActionListener(this);
		BtnCan.addActionListener(this);

	}

	public void Clear() {
		TAcheck = false;
		TA.setText("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (TAcheck == false) {
			if (e.getSource().equals(BtnCan)) {
				int result = JOptionPane.showConfirmDialog(null, "Ȩ ȭ������ ���� ���ðڽ��ϱ�?", "Ȯ�� �޽���",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.CANCEL_OPTION || result == JOptionPane.CLOSED_OPTION) {

					Clear();

				} else if (result == JOptionPane.YES_OPTION) {

					new Main(1);
					frame.dispose();
				}

			} else {
				JOptionPane.showMessageDialog(null, "�ð��� ���� �� �ּ���");
				return;
			}
		} else {
			if (e.getSource().equals(BtnPay)) {
				int result = JOptionPane.showConfirmDialog(null, Money + "�� ���� �Ͻðڽ��ϱ�?", "Ȯ�� �޽���",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION || result == JOptionPane.CANCEL_OPTION) {
					
						Clear();
				} else if (result == JOptionPane.YES_OPTION) {
					String Name="�ƹ���";
					new ImpoNotice(Time,Name);
					frame.dispose();
				}

			} else if (e.getSource().equals(BtnCan)) {
				int result = JOptionPane.showConfirmDialog(null, "Ȩ ȭ������ ���� ���ðڽ��ϱ�?", "Ȯ�� �޽���",
						JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.CANCEL_OPTION || result == JOptionPane.CLOSED_OPTION) {

					Clear();

				} else if (result == JOptionPane.YES_OPTION) {

					new Main(1);
					frame.dispose();
				}
			}
		}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(Btn1)) {
			TAcheck = true;
			Text = Btn1.getText();
			Time = Text.substring(0, 5);
			Money = Text.substring(16);
			TA.setText("�߰� �ð� : " + Time + "\n" + "���� �Ͻ� �ݾ���" + Money + "�Դϴ�");
		} else if (e.getSource().equals(Btn2)) {
			TAcheck = true;
			Text = Btn2.getText();
			Time = Text.substring(0, 5);
			Money = Text.substring(16);
			TA.setText("�߰� �ð� : " + Time + "\n" + "���� �Ͻ� �ݾ���" + Money + "�Դϴ�");
		} else if (e.getSource().equals(Btn3)) {
			TAcheck = true;
			Text = Btn3.getText();
			Time = Text.substring(0, 5);
			Money = Text.substring(16);
			TA.setText("�߰� �ð� : " + Time + "\n" + "���� �Ͻ� �ݾ���" + Money + "�Դϴ�");
		} else if (e.getSource().equals(Btn4)) {
			TAcheck = true;
			Text = Btn4.getText();
			Time = Text.substring(0, 5);
			Money = Text.substring(16);
			TA.setText("�߰� �ð� : " + Time + "\n" + "���� �Ͻ� �ݾ���" + Money + "�Դϴ�");
		} else if (e.getSource().equals(Btn5)) {
			TAcheck = true;
			Text = Btn5.getText();
			Time = Text.substring(0, 5);
			Money = Text.substring(16);
			TA.setText("�߰� �ð� : " + Time + "\n" + "���� �Ͻ� �ݾ���" + Money + "�Դϴ�");
		} else if (e.getSource().equals(Btn6)) {
			TAcheck = true;
			Text = Btn6.getText();
			Time = Text.substring(0, 5);
			Money = Text.substring(13);
			TA.setText("�߰� �ð� : " + Time + "\n" + "���� �Ͻ� �ݾ���" + Money + "�Դϴ�");
		} else if (e.getSource().equals(Btn7)) {
			Text = Btn7.getText();
			Time = Text.substring(0, 5);
			Money = Text.substring(13);
			TA.setText("�߰� �ð� : " + Time + "\n" + "���� �Ͻ� �ݾ���" + Money + "�Դϴ�");
		} else if (e.getSource().equals(Btn8)) {
			TAcheck = true;
			Text = Btn8.getText();
			Time = Text.substring(0, 6);
			Money = Text.substring(12);
			TA.setText("�߰� �ð� : " + Time + "\n" + "���� �Ͻ� �ݾ���" + Money + "�Դϴ�");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(Btn1)) {
			Btn1.setBackground(new Color(240, 255, 255));
			Btn1.setForeground(Color.black);
		} else if (e.getSource().equals(Btn2)) {
			Btn2.setBackground(new Color(240, 255, 255));
			Btn2.setForeground(Color.black);
		} else if (e.getSource().equals(Btn3)) {
			Btn3.setBackground(new Color(240, 255, 255));
			Btn3.setForeground(Color.black);
		} else if (e.getSource().equals(Btn4)) {
			Btn4.setBackground(new Color(240, 255, 255));
			Btn4.setForeground(Color.black);
		} else if (e.getSource().equals(Btn5)) {
			Btn5.setBackground(new Color(240, 255, 255));
			Btn5.setForeground(Color.black);
		} else if (e.getSource().equals(Btn6)) {
			Btn6.setBackground(new Color(240, 255, 255));
			Btn6.setForeground(Color.black);
		} else if (e.getSource().equals(Btn7)) {
			Btn7.setBackground(new Color(240, 255, 255));
			Btn7.setForeground(Color.black);
		} else if (e.getSource().equals(Btn8)) {
			Btn8.setBackground(new Color(240, 255, 255));
			Btn8.setForeground(Color.black);
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(Btn1)) {
			Btn1.setBackground(new Color(051, 051, 051));
			Btn1.setForeground(SystemColor.textHighlightText);
		} else if (e.getSource().equals(Btn2)) {
			Btn2.setBackground(new Color(051, 051, 051));
			Btn2.setForeground(SystemColor.textHighlightText);
		} else if (e.getSource().equals(Btn3)) {
			Btn3.setBackground(new Color(051, 051, 051));
			Btn3.setForeground(SystemColor.textHighlightText);
		} else if (e.getSource().equals(Btn4)) {
			Btn4.setBackground(new Color(051, 051, 051));
			Btn4.setForeground(SystemColor.textHighlightText);
		} else if (e.getSource().equals(Btn5)) {
			Btn5.setBackground(new Color(051, 051, 051));
			Btn5.setForeground(SystemColor.textHighlightText);
		} else if (e.getSource().equals(Btn6)) {
			Btn6.setBackground(new Color(051, 051, 051));
			Btn6.setForeground(SystemColor.textHighlightText);
		} else if (e.getSource().equals(Btn7)) {
			Btn7.setBackground(new Color(051, 051, 051));
			Btn7.setForeground(SystemColor.textHighlightText);
		} else if (e.getSource().equals(Btn8)) {
			Btn8.setBackground(new Color(051, 051, 051));
			Btn8.setForeground(SystemColor.textHighlightText);
		}
	}
}
