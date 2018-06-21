import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTextPane;
import javax.swing.text.JTextComponent;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagConstraints;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import java.awt.Font;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;
	private JTextField textField_2;
	private JLabel label_1;
	private JLabel label_2;
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
	private JLabel label_15;
	private JLabel lblX_1;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private int krok;
	private JLabel lblNewLabel_1;

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
		
		Sympleks symplex = new Sympleks(2,5);
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 11));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 562, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPodajFunkcjCelu = new JLabel("Podaj funkcj celu:");
		lblPodajFunkcjCelu.setBounds(10, 11, 156, 14);
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
		
		label_2 = new JLabel("- >");
		label_2.setBounds(176, 39, 16, 14);
		frame.getContentPane().add(label_2);
		
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
		

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(267, 146, 225, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(267, 171, 162, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnMin = new JRadioButton(" min");
		rdbtnMin.setBounds(172, 22, 61, 14);
		frame.getContentPane().add(rdbtnMin);
		
		JRadioButton rdbtnMax = new JRadioButton("max");
		rdbtnMax.setBounds(173, 60, 60, 14);
		frame.getContentPane().add(rdbtnMax);
		
		rdbtnMax.setSelected(true);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnMin);
		group.add(rdbtnMax);
		
		//headers for the table
        String[] columns = new String[] {
            "X1", "X2", "X3", "U1","U2","h"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {0, 0, 0, 0, 0,0 },
            {0, 0, 0, 0, 0,0 },
            {0, 0, 0, 0, 0,0 },
        };
		DefaultTableModel model = new DefaultTableModel(data, columns);
		DecimalFormat decimalFormat = new DecimalFormat("#.#");
		
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
		
		JButton button = new JButton("Wyczysc");
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
			    setKrok(0);
			    lblNewLabel.setText("");
			    lblNewLabel_1.setText("");
			}
		});
		button.setBounds(123, 225, 110, 23);
		frame.getContentPane().add(button);
		
        //create table with data	
		table_3 = new JTable(model);
		table_3.setForeground(Color.BLACK);
		table_3.setBackground(Color.WHITE);
		table_3.setBounds(316, 69, 185, 110);
		JScrollPane scrollPane = new JScrollPane(table_3);
		scrollPane.setSize(293, 72);
		scrollPane.setLocation(243, 33);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		frame.getContentPane().add(scrollPane);
		
		
		
		
		JButton button_1 = new JButton("Rozwiaz");
		
		float[][] dataWprowadzone=new float[3][6];
		
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int wynik=0;
				test(dataWprowadzone,rdbtnMax.isSelected());
				symplex.wypelnijTabele(dataWprowadzone);
				
				
				boolean quit=false;
				
				while(!quit){
		        	wynik = symplex.oblicz();

		            if(wynik == 1){
		                quit = true;
		            }
		            else if(wynik == 2){
		                quit = true;
		            }
		        }
		        for(int i=0;i<=2;i+=1) {
		        	for(int j=0;j<=5;j+=1) {
		        		model.setValueAt(decimalFormat.format(symplex.getTable()[i][j]), i, j);
		        	}
		        }
		        setKrok(0);
		        
		        if(wynik==1){
		        float[] wartosci=new float[3];
		        for(int i=0;i<=2;i+=1) {
		        	if(i==symplex.getWspolczynniki()[0]) {
		        		wartosci[i]=symplex.getTable()[0][5];
		        	}
		        	else if(i==symplex.getWspolczynniki()[1]) {
		        		wartosci[i]=symplex.getTable()[1][5];
		        	}
		        	else {
		        		wartosci[i]=0;
		        	}
		        }
		        lblNewLabel.setText(("[X1,X2,X3] ="+Arrays.toString(wartosci)));
		        lblNewLabel_1.setText("Funkcja celu = "+symplex.getTable()[2][5]);
		}
				
			}
		});
		button_1.setBounds(243, 225, 89, 23);
		frame.getContentPane().add(button_1);

		setKrok(0);
		JButton button_2 = new JButton("Kolejny krok");
		button_2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
					if(getKrok()==0) {
						test(dataWprowadzone,rdbtnMax.isSelected());
						symplex.wypelnijTabele(dataWprowadzone);
						setKrok(1);
					}else {
					int wynik= symplex.oblicz();
					}
			        for(int i=0;i<=2;i+=1) {
			        	for(int j=0;j<=5;j+=1) {
			        		model.setValueAt(decimalFormat.format(symplex.getTable()[i][j]), i, j);
			        	}
			        }
		}
		});
		button_2.setBounds(345, 225, 108, 23);
		frame.getContentPane().add(button_2);
		
		label_15 = new JLabel("<=");
		label_15.setBounds(170, 95, 16, 14);
		frame.getContentPane().add(label_15);
		
		lblX_1 = new JLabel(" <=");
		lblX_1.setBounds(168, 126, 24, 14);
		frame.getContentPane().add(lblX_1);
		
		textField_9 = new JTextField();
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(196, 92, 47, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(196, 123, 47, 20);
		frame.getContentPane().add(textField_10);
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("USA");
		listModel.addElement("India");
		JList<String> countryList = new JList<>(listModel);
		countryList.setForeground(Color.WHITE);
		countryList.setBounds(225, 10, -23, 15);
		frame.getContentPane().add(new JScrollPane(countryList));
		

		

		

		
	}
	
	public void test(float[][] dataWprowadzone,boolean typ) {
		dataWprowadzone[0][0]=Float.parseFloat(textField_3.getText());
		dataWprowadzone[0][1]=Float.parseFloat(textField_4.getText());
		dataWprowadzone[0][2]=Float.parseFloat(textField_5.getText());
		dataWprowadzone[0][3]=0;
		dataWprowadzone[0][4]=0;
		dataWprowadzone[0][5]=Float.parseFloat(textField_9.getText());
		
		dataWprowadzone[1][0]=Float.parseFloat(textField_6.getText());
		dataWprowadzone[1][1]=Float.parseFloat(textField_7.getText());
		dataWprowadzone[1][2]=Float.parseFloat(textField_8.getText());
		dataWprowadzone[1][3]=0;
		dataWprowadzone[1][4]=0;
		dataWprowadzone[1][5]=Float.parseFloat(textField_10.getText());
		
		if(typ==false) {
		dataWprowadzone[2][0]=Float.parseFloat(textField.getText());
		dataWprowadzone[2][1]=Float.parseFloat(textField_1.getText());
		dataWprowadzone[2][2]=Float.parseFloat(textField_2.getText());			
		dataWprowadzone[2][3]=0;
		dataWprowadzone[2][4]=0;
		dataWprowadzone[2][5]=0;
		}
		else {
			dataWprowadzone[2][0]=-Float.parseFloat(textField.getText());
			dataWprowadzone[2][1]=-Float.parseFloat(textField_1.getText());
			dataWprowadzone[2][2]=-Float.parseFloat(textField_2.getText());			
			dataWprowadzone[2][3]=0;
			dataWprowadzone[2][4]=0;
			dataWprowadzone[2][5]=0;	
		}
	}

	public void setKrok(int liczba) {
		this.krok = liczba;
	}
	public int getKrok() {
		return this.krok ;
	}
}
