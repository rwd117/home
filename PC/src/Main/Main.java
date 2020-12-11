package Main;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Graphics.RoundedButton;
import Seat.Seat;

public class Main implements ActionListener {

	private JFrame frame;
	private Container container;
	private JPanel panel;
	private RoundedButton BtnSelect, BtnTime, BtnNewMember, button_2, button_3, BtnCoupon;
	private int a;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main(int a) {
		this.a = a;
		initialize();
		
		BtnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Seat();
				frame.dispose();
			}
		});
		BtnTime.addActionListener(this);
		BtnNewMember.addActionListener(this);
		BtnCoupon.addActionListener(this);
		
		frame.setResizable(false);
		frame.setVisible(true);
	}

	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("������ PC��");
		frame.getContentPane().setBackground(new Color(051, 051, 051));
//		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();

		// �ߴ� �� ����� ����
//		int x = screensize.width / 4;
//		int y = screensize.height / 4;
//		int width = screensize.width / 2;
//		int heigth = screensize.height / 2;
		frame.setBounds(120, 150, 1600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent Cevent) {
				if (panel != null) {
					panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());
				}
			}
		});

		container = frame.getContentPane();
		container.setLayout(null);

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

		button_2 = new RoundedButton("New button") {
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
		button_2.setBounds(630, 423, 300, 300);
		button_2.setFocusPainted(false);
		frame.add(button_2);

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
	}

	private void clearContainer() {
		container.removeAll();
		container.setVisible(false);
		container.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clearContainer();
		if (e.getSource() == BtnSelect) {
			new Seat();
			frame.dispose();
		} else if (e.getSource() == BtnTime) {

		} else if (e.getSource() == BtnNewMember) {

		} else if (e.getSource() == BtnCoupon) {

		} else if (e.getSource() == button_2) {

		} else if (e.getSource() == button_3) {

		}
	}
}