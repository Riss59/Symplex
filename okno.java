import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;
	private JTextField textField_2;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JTextField textField_3;
	private JLabel label_5;
	private JTextField textField_4;
	private JLabel label_6;
	private JTextField textField_5;
	private JLabel label_7;
	private JTextField textField_6;
	private JLabel label_8;
	private JTextField textField_7;
	private JLabel label_9;
	private JTextField textField_8;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel lblX_2;
	private JLabel lblNewLabel;
	private JLabel label_15;
	private JLabel lblX_1;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPodajFunkcjCelu = new JLabel("Podaj funkcj celu:");
		lblPodajFunkcjCelu.setBounds(10, 11, 91, 14);
		frame.getContentPane().add(lblPodajFunkcjCelu);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(10, 36, 24, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblX = new JLabel("X1 + ");
		lblX.setBounds(40, 39, 31, 14);
		frame.getContentPane().add(lblX);
		
		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(70, 36, 24, 20);
		frame.getContentPane().add(textField_1);
		
		label = new JLabel("X1 + ");
		label.setBounds(97, 39, 31, 14);
		frame.getContentPane().add(label);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.setBounds(123, 36, 24, 20);
		frame.getContentPane().add(textField_2);
		
		label_1 = new JLabel("X3");
		label_1.setBounds(150, 39, 16, 14);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("->");
		label_2.setBounds(176, 39, 16, 14);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("max");
		label_3.setBounds(202, 39, 31, 14);
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("Rownania:");
		label_4.setBounds(10, 67, 91, 14);
		frame.getContentPane().add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(10, 92, 24, 20);
		frame.getContentPane().add(textField_3);
		
		label_5 = new JLabel("X1 + ");
		label_5.setBounds(40, 95, 31, 14);
		frame.getContentPane().add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(70, 92, 24, 20);
		frame.getContentPane().add(textField_4);
		
		label_6 = new JLabel("X2 + ");
		label_6.setBounds(97, 95, 31, 14);
		frame.getContentPane().add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setColumns(10);
		textField_5.setBounds(123, 92, 24, 20);
		frame.getContentPane().add(textField_5);
		
		label_7 = new JLabel("X3");
		label_7.setBounds(150, 95, 16, 14);
		frame.getContentPane().add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(10, 123, 24, 20);
		frame.getContentPane().add(textField_6);
		
		label_8 = new JLabel("X1 + ");
		label_8.setBounds(40, 126, 31, 14);
		frame.getContentPane().add(label_8);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(70, 123, 24, 20);
		frame.getContentPane().add(textField_7);
		
		label_9 = new JLabel("X2 + ");
		label_9.setBounds(97, 126, 31, 14);
		frame.getContentPane().add(label_9);
		
		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setColumns(10);
		textField_8.setBounds(123, 123, 24, 20);
		frame.getContentPane().add(textField_8);
		
		label_10 = new JLabel("X3");
		label_10.setBounds(150, 126, 16, 14);
		frame.getContentPane().add(label_10);
		
		label_11 = new JLabel("Ograniczenia:");
		label_11.setBounds(10, 157, 91, 14);
		frame.getContentPane().add(label_11);
		
		lblX_2 = new JLabel("X1>=0, X2>=0, X3>=0");
		lblX_2.setBounds(10, 182, 137, 14);
		frame.getContentPane().add(lblX_2);
		
		JButton btnNewButton = new JButton("Zaladuj dane");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("2");
				textField_1.setText("5");
				textField_2.setText("4");
				textField_3.setText("5");
				textField_4.setText("3");
				textField_5.setText("2");
				textField_6.setText("1");
				textField_7.setText("1");
				textField_8.setText("4");
				textField_9.setText("12000");
				textField_10.setText("8000");
				
			}
		});
		btnNewButton.setBounds(5, 225, 106, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Wyczysc dane");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			    Component[] components = frame.getContentPane().getComponents();
			    for (Component component : components) {
			        if (component instanceof JTextField) {
			            JTextComponent specificObject = (JTextComponent) component;
			            specificObject.setText("");
			        }
			    }
			}
		});
		button.setBounds(123, 225, 110, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Rozwiaz");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String [] ArrayName = {"X0","X0","X0","X0","X0"};
				System.out.println(ArrayName[1]);
				
			}
		});
		button_1.setBounds(243, 225, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Kolejny krok");
		button_2.setBounds(345, 225, 108, 23);
		frame.getContentPane().add(button_2);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.white);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(254, 39, 199, 96);
		frame.getContentPane().add(lblNewLabel);
		
		label_15 = new JLabel("<=");
		label_15.setBounds(170, 95, 16, 14);
		frame.getContentPane().add(label_15);
		
		lblX_1 = new JLabel(" <=");
		lblX_1.setBounds(168, 126, 24, 14);
		frame.getContentPane().add(lblX_1);
		
		textField_9 = new JTextField();
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(196, 92, 37, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(196, 123, 37, 20);
		frame.getContentPane().add(textField_10);
		
		table = new JTable();
		table.setBounds(348, 181, 77, -38);
		frame.getContentPane().add(table);
	}
}
