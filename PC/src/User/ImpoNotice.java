package User;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import Main.Main;

public class ImpoNotice extends JFrame{

	private JFrame frame = new JFrame();
	private JScrollPane scrollPane;
	private JTextArea TA;
	private String Time,Name;

	/**
	 * Create the application.
	 */
	public ImpoNotice() {
		initialize();
	}
	
	public ImpoNotice(String Time,String Name) {
		this.Time=Time;
		this.Name=Name;
		
		initialize();
		
		TA.setText("ȸ�� �̸� : "+Name+"\n"+"�߰� �ð� : " + Time + "\n" + "���� �ð� : " +Time + " �Դϴ�");
		
		Time();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setBounds(120, 150, 1600, 800);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		Border lineBorder = BorderFactory.createLineBorder(new Color(000, 153, 255), 3);

		Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(514, 180, 683, 435);
		scrollPane.setViewportBorder(null);
		scrollPane.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		frame.getContentPane().add(scrollPane);
		
		TA = new JTextArea();
		TA.setEnabled(false);
		TA.setFont(new Font("Monospaced", Font.BOLD, 30));
		TA.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		scrollPane.setViewportView(TA);
	
	
	}
	
	private void Time() {
		Timer time= new Timer();
		TimerTask timet=new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Main(1);
				frame.dispose();
				
			}
			
		};
		
		time.schedule(timet, 5000);
		
	}
}
