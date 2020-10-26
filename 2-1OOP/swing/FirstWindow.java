package sw;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * A simple window class.
 */
public class FirstWindow extends JFrame {
	public class WindowDestroyer extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			JOptionPane.showMessageDialog(null, "Window is closing", "Message", JOptionPane.INFORMATION_MESSAGE);
			super.windowClosing(e);
		}
	}
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public FirstWindow() {
		super();
		setSize(WIDTH, HEIGHT);
		JLabel myLabel = new JLabel("Please dont click that button!");
		getContentPane().add(myLabel);
		WindowDestroyer listener = new WindowDestroyer();
		addWindowListener(listener);
	}
}
