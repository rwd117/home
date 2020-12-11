package Seat;

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

import Graphics.RoundedButton;
import Main.Main;

public class Seat extends JFrame implements ActionListener{
	private JFrame frame =new JFrame();
	private RoundedButton Btn1, Btn2, Btn3, Btn4, Btn5, Btn6, Btn7, Btn8, Btn9, Btn10;
	private RoundedButton Btn11, Btn12, Btn13, Btn14, Btn15, Btn16, Btn17, Btn18, Btn19, Btn20;
	private RoundedButton Btn21, Btn22, Btn23, Btn24, Btn25, Btn26, Btn27, Btn28, Btn29, Btn30;
	private RoundedButton Btn31, Btn32, Btn33, Btn34, Btn35, Btn36, Btn37, Btn38, Btn39, Btn40;
	private RoundedButton Btn41, Btn42, Btn43, Btn44, Btn45, Btn46, Btn47, Btn48;
	private RoundedButton BtnEx,BtnEx2;
	private JButton BtnBack;
	/**
	 * Create the application.
	 */
	public Seat() {
		initialize();
	}
	
	public static void main(String[] args) {
		new Seat();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(051, 051, 051));
		frame.setBounds(120, 150, 1600, 800);
		frame.setVisible(true);

		Btn1 = new RoundedButton("1") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn1.setBounds(164, 163, 98, 98);
		Btn1.setBackground(new Color(153, 204, 255));
		frame.add(Btn1);

		Btn2 = new RoundedButton("2") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn2.setBounds(263, 163, 98, 98);
		Btn2.setBackground(new Color(153, 204, 255));
		frame.add(Btn2);

		Btn3 = new RoundedButton("3") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn3.setBounds(362, 163, 98, 98);
		Btn3.setBackground(new Color(153, 204, 255));
		frame.add(Btn3);

		Btn4 = new RoundedButton("4") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn4.setBounds(461, 163, 98, 98);
		Btn4.setBackground(new Color(153, 204, 255));
		frame.add(Btn4);

		Btn5 = new RoundedButton("5") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn5.setBounds(560, 163, 98, 98);
		Btn5.setBackground(new Color(153, 204, 255));
		frame.add(Btn5);

		Btn6 = new RoundedButton("6") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn6.setBounds(164, 270, 98, 98);
		Btn6.setBackground(new Color(153, 204, 255));
		frame.add(Btn6);

		Btn7 = new RoundedButton("7") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn7.setBounds(263, 270, 98, 98);
		Btn7.setBackground(new Color(153, 204, 255));
		frame.add(Btn7);

		Btn8 = new RoundedButton("8") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn8.setBounds(362, 270, 98, 98);
		Btn8.setBackground(new Color(153, 204, 255));
		frame.add(Btn8);

		Btn9 = new RoundedButton("9") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn9.setBounds(461, 270, 98, 98);
		Btn9.setBackground(new Color(153, 204, 255));
		frame.add(Btn9);

		Btn10 = new RoundedButton("10") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn10.setBounds(560, 270, 98, 98);
		Btn10.setBackground(new Color(153, 204, 255));
		frame.add(Btn10);

		Btn11 = new RoundedButton("11") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn11.setBounds(164, 468, 98, 98);
		Btn11.setBackground(new Color(153, 204, 255));
		frame.add(Btn11);

		Btn12 = new RoundedButton("12") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn12.setBounds(263, 468, 98, 98);
		Btn12.setBackground(new Color(153, 204, 255));
		frame.add(Btn12);

		Btn13 = new RoundedButton("13") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn13.setBounds(362, 468, 98, 98);
		Btn13.setBackground(new Color(153, 204, 255));
		frame.add(Btn13);

		Btn14 = new RoundedButton("14") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn14.setBounds(461, 468, 98, 98);
		Btn14.setBackground(new Color(153, 204, 255));
		frame.add(Btn14);

		Btn15 = new RoundedButton("15") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn15.setBounds(560, 468, 98, 98);
		Btn15.setBackground(new Color(153, 204, 255));
		frame.add(Btn15);

		Btn16 = new RoundedButton("16") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn16.setBounds(164, 575, 98, 98);
		Btn16.setBackground(new Color(153, 204, 255));
		frame.add(Btn16);

		Btn17 = new RoundedButton("17") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn17.setBounds(263, 575, 98, 98);
		Btn17.setBackground(new Color(153, 204, 255));
		frame.add(Btn17);

		Btn18 = new RoundedButton("18") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn18.setBounds(362, 575, 98, 98);
		Btn18.setBackground(new Color(153, 204, 255));
		frame.add(Btn18);

		Btn19 = new RoundedButton("19") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn19.setBounds(461, 575, 98, 98);
		Btn19.setBackground(new Color(153, 204, 255));
		frame.add(Btn19);

		Btn20 = new RoundedButton("20") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn20.setBounds(560, 575, 98, 98);
		Btn20.setBackground(new Color(153, 204, 255));
		frame.add(Btn20);

		Btn21 = new RoundedButton("21") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn21.setBounds(836, 60, 98, 98);
		Btn21.setBackground(new Color(153, 204, 255));
		frame.add(Btn21);

		Btn22 = new RoundedButton("22") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn22.setBounds(836, 160, 98, 98);
		Btn22.setBackground(new Color(153, 204, 255));
		frame.add(Btn22);

		Btn23 = new RoundedButton("23") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn23.setBounds(836, 260, 98, 98);

		Btn23.setBackground(new Color(153, 204, 255));
		frame.add(Btn23);

		Btn24 = new RoundedButton("24") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn24.setBounds(836, 360, 98, 98);

		Btn24.setBackground(new Color(153, 204, 255));
		frame.add(Btn24);
		Btn25 = new RoundedButton("25") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn25.setBounds(836, 460, 98, 98);

		Btn25.setBackground(new Color(153, 204, 255));
		frame.add(Btn25);
		Btn26 = new RoundedButton("26") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn26.setBounds(836, 560, 98, 98);

		Btn26.setBackground(new Color(153, 204, 255));
		frame.add(Btn26);
		Btn27 = new RoundedButton("27") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn27.setBounds(836, 660, 98, 98);

		Btn27.setBackground(new Color(153, 204, 255));
		frame.add(Btn27);
		Btn28 = new RoundedButton("28") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn28.setBounds(943, 60, 98, 98);

		Btn28.setBackground(new Color(153, 204, 255));
		frame.add(Btn28);
		Btn29 = new RoundedButton("29") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn29.setBounds(943, 160, 98, 98);

		Btn29.setBackground(new Color(153, 204, 255));
		frame.add(Btn29);
		Btn30 = new RoundedButton("30") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn30.setBounds(943, 260, 98, 98);

		Btn30.setBackground(new Color(153, 204, 255));
		frame.add(Btn30);
		Btn31 = new RoundedButton("31") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn31.setBounds(943, 360, 98, 98);

		Btn31.setBackground(new Color(153, 204, 255));
		frame.add(Btn31);
		Btn32 = new RoundedButton("32") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn32.setBounds(943, 460, 98, 98);

		Btn32.setBackground(new Color(153, 204, 255));
		frame.add(Btn32);
		Btn33 = new RoundedButton("33") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn33.setBounds(943, 560, 98, 98);

		Btn33.setBackground(new Color(153, 204, 255));
		frame.add(Btn33);
		Btn34 = new RoundedButton("34") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn34.setBounds(943, 660, 98, 98);

		Btn34.setBackground(new Color(153, 204, 255));
		frame.add(Btn34);
		Btn35 = new RoundedButton("35") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn35.setBounds(1169, 60, 98, 98);

		Btn35.setBackground(new Color(153, 204, 255));
		frame.add(Btn35);
		Btn36 = new RoundedButton("36") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn36.setBounds(1169, 160, 98, 98);

		Btn36.setBackground(new Color(153, 204, 255));
		frame.add(Btn36);
		Btn37 = new RoundedButton("37") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn37.setBounds(1169, 260, 98, 98);

		Btn37.setBackground(new Color(153, 204, 255));
		frame.add(Btn37);
		Btn38 = new RoundedButton("38") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn38.setBounds(1169, 360, 98, 98);

		Btn38.setBackground(new Color(153, 204, 255));
		frame.add(Btn38);
		Btn39 = new RoundedButton("39") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn39.setBounds(1169, 460, 98, 98);

		Btn39.setBackground(new Color(153, 204, 255));
		frame.add(Btn39);
		Btn40 = new RoundedButton("40") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn40.setBounds(1169, 560, 98, 98);

		Btn40.setBackground(new Color(153, 204, 255));
		frame.add(Btn40);
		Btn41 = new RoundedButton("41") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn41.setBounds(1169, 660, 98, 98);

		Btn41.setBackground(new Color(153, 204, 255));
		frame.add(Btn41);
		Btn42 = new RoundedButton("42") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn42.setBounds(1275, 60, 98, 98);

		Btn42.setBackground(new Color(153, 204, 255));
		frame.add(Btn42);
		Btn43 = new RoundedButton("43") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn43.setBounds(1275, 160, 98, 98);

		Btn43.setBackground(new Color(153, 204, 255));
		frame.add(Btn43);
		Btn44 = new RoundedButton("44") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn44.setBounds(1275, 260, 98, 98);

		Btn44.setBackground(new Color(153, 204, 255));
		frame.add(Btn44);
		Btn45 = new RoundedButton("45") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn45.setBounds(1275, 360, 98, 98);

		Btn45.setBackground(new Color(153, 204, 255));
		frame.add(Btn45);
		Btn46 = new RoundedButton("46") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn46.setBounds(1275, 460, 98, 98);

		Btn46.setBackground(new Color(153, 204, 255));
		frame.add(Btn46);
		Btn47 = new RoundedButton("47") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn47.setBounds(1275, 560, 98, 98);

		Btn47.setBackground(new Color(153, 204, 255));
		frame.add(Btn47);
		Btn48 = new RoundedButton("48") {
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
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		Btn48.setBounds(1275, 660, 98, 98);

		Btn48.setBackground(new Color(153, 204, 255));
		frame.add(Btn48);
		
		RoundedButton  BtnEx = new RoundedButton (""){
			@Override
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;

				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				
				graphics.setColor(getBackground());
				
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		BtnEx.setBounds(14, 12, 50, 50);
		BtnEx.setBackground(new Color(153,204,255));
		frame.add(BtnEx);
		
		RoundedButton  BtnEx2 = new RoundedButton (""){
			@Override
			public void paintComponent(Graphics g) {
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;

				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				
				graphics.setColor(getBackground());
				
				graphics.fillRoundRect(0, 0, width, height, 10, 10);

				FontMetrics fontMetrics = graphics.getFontMetrics();
				Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();

				int textX = (width - stringBounds.width) / 2;
				int textY = (width - stringBounds.width) / 2 + fontMetrics.getAscent() * 3;

				graphics.setColor(getForeground());

				graphics.setFont(getFont());

				graphics.drawString(getText(), textX, textY);
				graphics.dispose();

				super.paintComponent(g);
			}
		};
		BtnEx2.setBounds(14, 88, 50, 50);
		frame.add(BtnEx2);
		
		JLabel lblNewLabel = new JLabel("\uC0AC\uC6A9 \uAC00\uB2A5 ");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(110, 28, 127, 18);
		frame.add(lblNewLabel);
		
		JLabel label = new JLabel("\uC0AC\uC6A9 \uC911 \uD639\uC740 \uC0AC\uC6A9 \uBD88\uAC00");
		label.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		label.setForeground(Color.WHITE);
		label.setBounds(89, 106, 250, 18);
		frame.add(label);
		
		BtnBack = new JButton("È¨");
		BtnBack.setBounds(1501, 28, 75, 75);
		frame.add(BtnBack);
		
		BtnBack.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("È¨")) {
			new Main(1);
			frame.dispose();
			
		}
	}
}
