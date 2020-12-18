package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Set.RoundedButton;
import State.LoginSelect;
import State.Seat;
import State.TimeUserSelect;
import User.NewMember;

public class MainPc extends JFrame implements ActionListener {

	private JFrame frame = new JFrame();
	private RoundedButton BtnSelect, BtnTime, BtnNewMember, BtnLogin, button_3, BtnCoupon;
	private int a;

	public static void main(String[] args) {
		new MainPc();	
	}

	public MainPc() {
		initialize();
	}
	
	private void initialize() {
		frame.setTitle("������ PC��");
		frame.getContentPane().setBackground(new Color(051, 051, 051));
//		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
//		container = frame.getContentPane();
//		container.setLayout(null);
		// �ߴ� �� ����� ����
//		int x = screensize.width / 4;
//		int y = screensize.height / 4;
//		int width = screensize.width / 2;
//		int heigth = screensize.height / 2;
//		container = frame.getContentPane();
//		container.setLayout(null);

		frame.setBounds(120, 150, 1600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);


		BtnSelect = new RoundedButton("�¼� ����") {
			@Override
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;

				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				if (getModel().isArmed()) {
					graphics.setColor(getBackground().darker());
				} else if (getModel().isRollover()) {
					graphics.setColor(getBackground().brighter());
				} else {
					graphics.setColor(getBackground());
				}
				graphics.fillRoundRect(0, 0, width, height, 30, 30);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 2;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		BtnSelect.setFont(new Font("����", Font.PLAIN, 30));
		BtnSelect.setBounds(148, 59, 300, 300);
		BtnSelect.setBackground(new Color(153, 204, 255));
		frame.add(BtnSelect);

		BtnTime = new RoundedButton("�ð� �߰�") {
			@Override
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;

				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				if (getModel().isArmed()) {
					graphics.setColor(getBackground().darker());
				} else if (getModel().isRollover()) {
					graphics.setColor(getBackground().brighter());
				} else {
					graphics.setColor(getBackground());
				}
				graphics.fillRoundRect(0, 0, width, height, 30, 30);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 2;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		BtnTime.setFont(new Font("����", Font.PLAIN, 30));
		BtnTime.setBounds(630, 59, 300, 300);
		BtnTime.setBackground(new Color(102, 153, 255));
		frame.add(BtnTime);

		BtnNewMember = new RoundedButton("ȸ�� ����") {
			@Override
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;

				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				if (getModel().isArmed()) {
					graphics.setColor(getBackground().darker());
				} else if (getModel().isRollover()) {
					graphics.setColor(getBackground().brighter());
				} else {
					graphics.setColor(getBackground());
				}
				graphics.fillRoundRect(0, 0, width, height, 30, 30);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 2;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		BtnNewMember.setFont(new Font("����", Font.PLAIN, 30));
		BtnNewMember.setBounds(1087, 59, 300, 300);
		BtnNewMember.setBackground(new Color(000, 153, 255));
		frame.add(BtnNewMember);

		BtnCoupon = new RoundedButton("��ǰ�� ����") {
			@Override
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;

				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				if (getModel().isArmed()) {
					graphics.setColor(getBackground().darker());
				} else if (getModel().isRollover()) {
					graphics.setColor(getBackground().brighter());
				} else {
					graphics.setColor(getBackground());
				}
				graphics.fillRoundRect(0, 0, width, height, 30, 30);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 2;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		BtnCoupon.setFont(new Font("����", Font.PLAIN, 30));
		BtnCoupon.setBounds(148, 423, 300, 300);
		BtnCoupon.setFocusPainted(false);
		frame.add(BtnCoupon);

		BtnLogin = new RoundedButton("ȸ�� �α���") {
			@Override
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;

				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				if (getModel().isArmed()) {
					graphics.setColor(getBackground().darker());
				} else if (getModel().isRollover()) {
					graphics.setColor(getBackground().brighter());
				} else {
					graphics.setColor(getBackground());
				}
				graphics.fillRoundRect(0, 0, width, height, 30, 30);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 2;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		BtnLogin.setBounds(630, 423, 300, 300);
		BtnLogin.setFont(new Font("����", Font.PLAIN, 30));
		BtnLogin.setFocusPainted(false);
		frame.add(BtnLogin);

		button_3 = new RoundedButton("New button") {
			@Override
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;

				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				if (getModel().isArmed()) {
					graphics.setColor(getBackground().darker());
				} else if (getModel().isRollover()) {
					graphics.setColor(getBackground().brighter());
				} else {
					graphics.setColor(getBackground());
				}
				graphics.fillRoundRect(0, 0, width, height, 30, 30);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 2;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		button_3.setBounds(1087, 423, 300, 300);
		button_3.setFocusPainted(false);
		frame.add(button_3);
		

		BtnSelect.addActionListener(this);
		BtnTime.addActionListener(this);
		BtnNewMember.addActionListener(this);
		BtnCoupon.addActionListener(this);
		BtnLogin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnSelect) {
			new Seat();
			frame.dispose();
		} else if (e.getSource() == BtnTime) {
			new TimeUserSelect();
			frame.dispose();
		} else if (e.getSource() == BtnNewMember) {
			new NewMember();
			frame.dispose();
		} else if (e.getSource() == BtnCoupon) {
			
		} else if (e.getSource() == BtnLogin) {
			new LoginSelect();
			frame.dispose();
		} else if (e.getSource() == button_3) {

		}
	}
}