package sw;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecondWindow extends JFrame {
	public class WindowDestroyer extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Window is closing", "Message", JOptionPane.INFORMATION_MESSAGE);
			super.windowClosing(e);
		}
	}
	public static final int WIDTH = 200;
	public static final int HEIGHT = 200;

	public SecondWindow(Color customColor) {
		super();
		setSize(WIDTH, HEIGHT);
		Container contentPane = getContentPane();
		JLabel label = new JLabel("Now available in color!");
		contentPane.add(label);
		setTitle("Second Window");
		contentPane.setBackground(customColor);
		addWindowListener(new WindowDestroyer());
	}

	public SecondWindow() {
		this(Color.BLUE);
	}
}