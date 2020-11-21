package sw;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo extends JFrame implements ActionListener {
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public ButtonDemo() {
		setSize(WIDTH, HEIGHT);
		setTitle("Button Demo");
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.blue);
		contentPane.setLayout(new FlowLayout());

		JButton stopButton = new JButton("RED");
		stopButton.addActionListener(this);
		contentPane.add(stopButton);
		JButton goButton = new JButton("GREEN");
		goButton.addActionListener(this);
		contentPane.add(goButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Container contentPane = getContentPane();
		if (e.getActionCommand().contentEquals("RED"))
			contentPane.setBackground(Color.red);
		else if (e.getActionCommand().contentEquals("GREEN"))
			contentPane.setBackground(Color.GREEN);
		else
			System.out.println("error in button interface");
	}

	public static void main(String[] args) {
		ButtonDemo buttonGui = new ButtonDemo();
		buttonGui.setVisible(true);
	}
}
