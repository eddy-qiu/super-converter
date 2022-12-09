import java.awt.event.*;
import javax.swing.*;

public class main extends JPanel implements ActionListener{
	JFrame frame;
	JPanel mainPanel,conversionPanel;
	JTextField input;
	
	private static void menuGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		main menu = new main();
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				menuGUI();
			}
		});
	}
}
