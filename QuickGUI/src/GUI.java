import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private static JButton button;
	
	public GUI() {
		frame = new JFrame();
		
		JButton button = new JButton("Click Me");
		label = new JLabel("Number of Clicks: 0");
		button.addActionListener(this );
		
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("The Clicky Button");
		frame.pack();
		frame.setVisible(true);
		
//		JFrame.setIconImage(new ImageIcon(getClass().getClassLoader().getResource("Desktop/TNT_Revision_2")));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Number of Clicks: " + count);
		
		
	
	
	if (count == 10) {
		
		count++;
		System.out.println("Count 10+");
		label.setText("10++ Achived");

		
	}
	
	if (count == 20) {
		
		count++;
		System.out.println("Count 20+");
		label.setText("20++ Achived");

		
	}
	
	if (count == 30) {
		
		count++;
		System.out.println("Count 30+");
		label.setText("30++ Achived");

		
	}
	
	if (count == 40) {
		
		count++;
		System.out.println("Count 40+");
		label.setText("40++ Achived");

		
	}
	
	}

}
