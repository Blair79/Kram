package string_detox_method;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Detox {

	private JFrame frmReplace;
	public static JTextField textField=new JTextField("");
	private static String[][] UMLAUT_REPLACEMENTS = { { new String("Ä"), "Ae" }, { new String("Ü"), "Ue" }, { new String("Ö"), "Oe" }, { new String("ä"), "ae" }, { new String("ü"), "ue" }, { new String("ö"), "oe" }, { new String("ß"), "ss" } };
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Detox window = new Detox();
					window.frmReplace.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Detox() {
		initialize();
	}
	
	public static void detoxing(){
		String Str = textField.getText();
		Str=replaceUmlaute(Str);
		textField.setText(Str.replace(' ', '_').toLowerCase());
	}
	
	public static String replaceUmlaute(String orig) {
	    String result = orig;

	    for (int i = 0; i < UMLAUT_REPLACEMENTS.length; i++) {
	        result = result.replace(UMLAUT_REPLACEMENTS[i][0], UMLAUT_REPLACEMENTS[i][1]);
	    }

	    return result;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmReplace = new JFrame();
		frmReplace.setAlwaysOnTop(true);
		frmReplace.setTitle("Detox");
		frmReplace.setResizable(false);
		frmReplace.setBounds(100, 100, 615, 71);
		frmReplace.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReplace.getContentPane().setLayout(new GridLayout(0, 2, 0, 0));
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detoxing();
			}
		});
		
		
		frmReplace.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				detoxing();
			}
		});
		frmReplace.getContentPane().add(btnNewButton);
	}
	
}
