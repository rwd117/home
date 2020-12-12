package State;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SeatState extends JFrame{

	private JFrame frame;
	String Title;
	

	public SeatState() {
	
	}
	
	public SeatState(String a) {
		this.Title=a;
		this.setTitle(Title+"¹ø ÀÚ¸®");
		this.setVisible(true);
		this.setBounds(800, 100, 450, 300);		
		
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
