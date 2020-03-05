package Khanal.Vidhan.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField Denominator;
	private JTextField Numerator;

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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Denominator = new JTextField();
		Denominator.setBounds(77, 81, 130, 26);
		frame.getContentPane().add(Denominator);
		Denominator.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Denominator");
		lblNewLabel.setBounds(81, 63, 82, 16);
		frame.getContentPane().add(lblNewLabel);
		
		Numerator = new JTextField();
		Numerator.setBounds(79, 36, 130, 26);
		frame.getContentPane().add(Numerator);
		Numerator.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numerator");
		lblNewLabel_1.setBounds(85, 20, 89, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel Result = new JLabel("");
		Result.setBounds(86, 122, 108, 34);
		frame.getContentPane().add(Result);
		
		JButton Calculate = new JButton("Calculate");
		
		Calculate.setBounds(259, 48, 117, 29);
		frame.getContentPane().add(Calculate);
		
		Calculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double numerator = Double.parseDouble(Numerator.getText());
				double denominator = Double.parseDouble(Denominator.getText());
				
		       try {
		    	SimpleMath math = new SimpleMath();
				double result = math.divide(numerator, denominator); 
					Result.setText(String.format("%f", result));}
		       catch (ArithmeticException f) {Result.setText("Can't Divide by 0");}
		      
			  
			  }
		});
		
		
		
	}
}
