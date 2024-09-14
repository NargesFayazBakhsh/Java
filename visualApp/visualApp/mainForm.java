package visualApp;

//     narges fayazbakhsh
//     9815091026

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import visualApp.RadioButtonFrame.RadioButtonHandler;

//
//
import javax.swing.*;
import java.awt.event.*;
import java.awt.SystemColor;
import java.awt.Graphics;
import java.util.ArrayList;

public class mainForm extends JPanel{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JPasswordField password;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainForm window = new mainForm();
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
	public mainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 10));
		frame.setBounds(100, 100, 1253, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setForeground(Color.WHITE);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(1002, 11, 170, 150);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton additionBtn = new JButton("\u062C\u0645\u0639 \u0639\u062F\u062F\u0647\u0627");
		additionBtn.setBounds(14, 9, 129, 23);
		panel.add(additionBtn);
		
		JButton labelBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0628\u0631\u0686\u0633\u0628");
		labelBtn.setBounds(14, 43, 129, 23);
		panel.add(labelBtn);
		
		JButton btnBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u062F\u06A9\u0645\u0647");
		btnBtn.setBounds(14, 77, 129, 23);
		panel.add(btnBtn);
		
		JButton keyBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u06A9\u0644\u06CC\u062F");
		keyBtn.setBounds(14, 111, 129, 23);
		panel.add(keyBtn);
		keyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KeyDemo key = new KeyDemo();
				key.main(null);
			}
			
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 127, 80));
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(528, 13, 170, 148);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton txtBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u062C\u0639\u0628\u0647 \u0645\u062A\u0646");
		txtBtn.setBounds(13, 46, 138, 20);
		panel_1.add(txtBtn);
		
		JButton txt2Btn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0646\u0627\u062D\u06CC\u0647 \u0645\u062A\u0646\u06CC");
		txt2Btn.setBounds(13, 13, 138, 20);
		panel_1.add(txt2Btn);
		
		JButton lstBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0644\u06CC\u0633\u062A");
		lstBtn.setBounds(13, 79, 138, 20);
		panel_1.add(lstBtn);
		
		JButton multiBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0627\u0646\u062A\u062E\u0627\u0628 \u0686\u0646\u062F\u062A\u0627\u06CC\u06CC");
		multiBtn.setBounds(12, 112, 139, 20);
		panel_1.add(multiBtn);
		multiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultipleSelectionTest mlt = new MultipleSelectionTest();
				mlt.main(null);
			}
		});
		lstBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListTest lst = new ListTest();
				lst.main(null);
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 0));
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(293, 11, 170, 150);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton chkBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0686\u06A9 \u0628\u0627\u06A9\u0633");
		chkBtn.setBounds(10, 11, 141, 23);
		panel_2.add(chkBtn);
		
		JButton rdBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u062F\u06A9\u0645\u0647 \u0631\u0627\u062F\u06CC\u0648\u06CC\u06CC");
		rdBtn.setBounds(10, 45, 141, 23);
		panel_2.add(rdBtn);
		
		JButton comboBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u06A9\u0648\u0645\u0628\u0648 \u0628\u0627\u06A9\u0633");
		comboBtn.setBounds(10, 79, 141, 23);
		panel_2.add(comboBtn);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 204));
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(765, 13, 170, 150);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton mouseBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0645\u0627\u0648\u0633");
		mouseBtn.setBounds(10, 44, 141, 23);
		panel_3.add(mouseBtn);
		
		JButton mouse2Btn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u062C\u0632\u0626\u06CC\u0627\u062A \u0645\u0627\u0648\u0633");
		mouse2Btn.setBounds(10, 78, 141, 23);
		panel_3.add(mouse2Btn);
		
		JButton paintBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0646\u0642\u0627\u0634\u06CC");
		paintBtn.setBounds(10, 11, 141, 23);
		panel_3.add(paintBtn);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 255, 102));
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(51, 11, 170, 150);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton layBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0635\u0641\u062D\u0647 \u0628\u0646\u062F\u06CC");
		layBtn.setBounds(15, 11, 126, 23);
		panel_4.add(layBtn);
		
		JButton layout3Btn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0635\u0641\u062D\u0647 \u0628\u0646\u062F\u06CC 3");
		layout3Btn.setBounds(15, 79, 126, 23);
		panel_4.add(layout3Btn);
		
		JButton borderBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u0635\u0641\u062D\u0647 \u0628\u0646\u062F\u06CC 2");
		borderBtn.setBounds(15, 45, 126, 23);
		panel_4.add(borderBtn);
		
		JButton panelBtn = new JButton("\u0645\u0648\u0644\u0641\u0647 \u067E\u0646\u0644");
		panelBtn.setBounds(15, 113, 126, 23);
		panel_4.add(panelBtn);
		
		JPanel panel_sum = new JPanel();
		panel_sum.setBounds(986, 184, 204, 150);
		frame.getContentPane().add(panel_sum);
		panel_sum.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("first int");
		lblNewLabel.setBounds(12, 13, 40, 16);
		panel_sum.add(lblNewLabel);
		
		JLabel lblNextInt = new JLabel("next int");
		lblNextInt.setBounds(12, 53, 52, 16);
		panel_sum.add(lblNextInt);
		
		t1 = new JTextField();
		t1.setBounds(73, 10, 116, 22);
		panel_sum.add(t1);
		t1.setColumns(10);
		panel_sum.add(t1);   
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(73, 50, 116, 22);
		panel_sum.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(73, 85, 116, 22);
		panel_sum.add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("result");
		lblNewLabel_1.setBounds(12, 88, 56, 16);
		panel_sum.add(lblNewLabel_1);
		
		JButton btn_1 = new JButton("+");
		JButton btn_2 = new JButton("-");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String s1 = t1.getText();                  
				String s2 = t2.getText();
				int a = Integer.parseInt(s1);
				int b = Integer.parseInt(s2);
				int c = 0;
				if(event.getSource() == btn_2)
					c=a-b;
				String result = String.valueOf(c);
				t3.setText(result);
			}
		});
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			String s1 = t1.getText();                  
			String s2 = t2.getText();
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = 0;
			if(event.getSource() == btn_1)
			   c = a+b;
			if(event.getSource() == btn_2)
				c=a-b;
			String result = String.valueOf(c);
			t3.setText(result);
			}
		});
		btn_1.setBounds(150, 120, 52, 25);
		panel_sum.add(btn_1);
	
		btn_2.setBounds(83, 120, 52, 25);
		panel_sum.add(btn_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setToolTipText("");
		JTextPane t4 = new JTextPane();
		t4.setBounds(12, 113, 117, 22);
		panel_5.add(t4);
		
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent event) {
		         t4.setText(String.format("Pressed at [%d, %d]", 
		 	            event.getX(), event.getY()));
			}
			@Override
			public void mouseEntered(MouseEvent event) {
		         t4.setText(String.format("Mouse entered at [%d, %d]", 
		 	            event.getX(), event.getY()));
		 	         panel_5.setBackground(Color.PINK);
			}
			@Override
			public void mouseClicked(MouseEvent event) {
		         t4.setText(String.format("Clicked at [%d, %d]", 
		 	            event.getX(), event.getY()));
			}
		    // handle event when mouse released 
			@Override
			public void mouseReleased(MouseEvent event) {
		         t4.setText(String.format("Released at [%d, %d]", 
		 	            event.getX(), event.getY()));
			}
			// handle event when mouse exits area
			@Override
			public void mouseExited(MouseEvent arg0) {
		         t4.setText("Mouse outside JPanel");
		         panel_5.setBackground(Color.WHITE);
			}
		});

		panel_5.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved (MouseEvent event) {
			    t4.setText(String.format("Moved at [%d, %d]",event.getX(),event.getY()));
			}
		      // MouseMotionListener event handlers
		      // handle event when user drags mouse with button pressed
			@Override
			public void mouseDragged(MouseEvent event) {
		         t4.setText(String.format("Dragged at [%d, %d]", 
		 	            event.getX(), event.getY()));
			}
		});
		panel_5.setBounds(748, 347, 204, 148);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBounds(748, 512, 204, 148);
		frame.getContentPane().add(panel_6);
		
		JTextPane t5 = new JTextPane();
		t5.setBackground(SystemColor.menu);
		t5.setBounds(0, 113, 373, 22);
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent event) {
				t5.setBackground(Color.white);
				String details;
		         int xPos = event.getX(); // get x-position of mouse
		         int yPos = event.getY(); // get y-position of mouse

		         details = String.format("Clicked %d time(s)", 
		            event.getClickCount());
		      
		         if (event.isMetaDown()) // right mouse button   
		            details += " with right mouse button";
		         else if (event.isAltDown()) // middle mouse button
		            details += " with center mouse button";
		         else // left mouse button                       
		            details += " with left mouse button";

		         t5.setText(details); 
			}
		});
		panel_6.add(t5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setToolTipText("");
		panel_7.setBounds(507, 512, 204, 148);
		frame.getContentPane().add(panel_7);
		
		String[] colorNames = {"Black", "Blue", "Cyan","Dark Gray", "Gray", "Green", "Light Gray", "Magenta","Orange", "Pink", "Red", "White", "Yellow"};
		Color[] colors = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
		JComboBox cBox1 = new JComboBox(colorNames);
		cBox1.setBackground(Color.WHITE);
		cBox1.setForeground(Color.BLACK);
		cBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_7.setBackground(colors[cBox1.getSelectedIndex()]);
			}
			
		});

		cBox1.setBounds(37, 36, 89, 22);
		panel_7.add(cBox1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setToolTipText("");
		panel_8.setBounds(277, 347, 204, 148);
		frame.getContentPane().add(panel_8);
		
		JLabel lb2 = new JLabel("Watch the font stayle change");
		lb2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb2.setBounds(0, 0, 204, 41);
		panel_8.add(lb2);
		
		JRadioButton r1 = new JRadioButton("Plain");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lb2.setFont(new Font ("Tahoma",Font.PLAIN,13));
			}
		});
		r1.setSelected(true);
		r1.setBounds(0, 37, 127, 25);
		panel_8.add(r1);// add plain button to JFrame
		
		JRadioButton r2 = new JRadioButton("Bold");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lb2.setFont(new Font ("Tahoma",Font.BOLD,13));
			}
		});
		r2.setBounds(0, 64, 127, 25);
		panel_8.add(r2); // add bold button to JFrame
		
		JRadioButton r3 = new JRadioButton("Italic");
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lb2.setFont(new Font ("Tahoma",Font.ITALIC,13));
			}
		});
		r3.setBounds(0, 94, 127, 25);
		panel_8.add(r3);// add italic button to JFrame
		
		JRadioButton r4 = new JRadioButton("Bold/Italic");
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lb2.setFont(new Font ("Tahoma",Font.BOLD+Font.ITALIC,13));
			}
		});
		r4.setBounds(0, 124, 127, 25);
		panel_8.add(r4);// add bold and italic button
		
		// for choose one JRadionButton / create logical relationship between JRadioButtons
		ButtonGroup bg = new ButtonGroup();// create ButtonGroup
		bg.add(r1);// add plain to group
		bg.add(r2);// add bold to group
		bg.add(r3);// add italic to group
		bg.add(r4);// add bold and italic
			
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setToolTipText("");
		panel_9.setBounds(507, 676, 204, 148);
		frame.getContentPane().add(panel_9);
		
		JList list = new JList(colorNames);
		list.setBackground(SystemColor.menu);
		JList list2 = new JList();
		
		JButton btnNewButton = new JButton("copy");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				(list2).setListData(
						list.getSelectedValuesList().toArray(new String[0]));
			}
		});
		btnNewButton.setBounds(44, 123, 69, 25);
		panel_9.add(btnNewButton);
		
		list.setFont(new Font("Tahoma", Font.PLAIN, 7));
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setBounds(0, 0, 44, 148);
		panel_9.add(list);
		
		list2.setBackground(SystemColor.menu);
		list2.setBounds(125, 0, 79, 148);
		panel_9.add(list2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBounds(986, 347, 204, 150);
		frame.getContentPane().add(panel_10);
		
		JLabel lb_2 = new JLabel("label with text");
		lb_2.setBounds(54, 0, 121, 36);
		panel_10.add(lb_2);
		
		JLabel lb_3 = new JLabel("label with text and icon");
		lb_3.setBounds(12, 28, 180, 36);
		panel_10.add(lb_3);
		lb_3.setIcon(new ImageIcon(getClass().getResource("img/bug1.gif")));
		
		JLabel lb_4 = new JLabel("label with icon and text at bottom");
		lb_4.setBounds(12, 68, 180, 82);
		panel_10.add(lb_4);
		lb_4.setIcon(new ImageIcon(getClass().getResource("img/bug1.gif")));
	    lb_4.setHorizontalTextPosition(SwingConstants.CENTER);
	    lb_4.setVerticalTextPosition(SwingConstants.BOTTOM);
	    lb_4.setToolTipText("This is label3");
		
		JPanel panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setToolTipText("");
		panel_11.setBounds(277, 186, 204, 148);
		frame.getContentPane().add(panel_11);
		
		JLabel lb3 = new JLabel("Watch the font stayle change");
		lb3.setBackground(Color.WHITE);
		lb3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb3.setBounds(0, 0, 204, 41);
		panel_11.add(lb3);
		
		JCheckBox ch1 = new JCheckBox("Bold");
		JCheckBox ch2 = new JCheckBox("Italic");
		ch1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ch1.isSelected()==true && ch2.isSelected()==true)
				    lb3.setFont(new Font ("Tahoma",Font.BOLD+Font.ITALIC,13));
				if(ch1.isSelected()==true && ch2.isSelected()==false)
					lb3.setFont(new Font ("Tahoma",Font.BOLD,13));
				if(ch1.isSelected()==false && ch2.isSelected()==true)
				    lb3.setFont(new Font ("Tahoma",Font.ITALIC,13));
				if(ch1.isSelected()==false && ch2.isSelected()==false)
					lb3.setFont(new Font ("Tahoma",Font.PLAIN,13));
			}

		});
		ch1.setBounds(10, 50, 113, 25);
		panel_11.add(ch1);
		
		ch2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ch1.isSelected()==true && ch2.isSelected()==true)
				    lb3.setFont(new Font ("Tahoma",Font.BOLD+Font.ITALIC,13));
				if(ch1.isSelected()==true && ch2.isSelected()==false)
					lb3.setFont(new Font ("Tahoma",Font.BOLD,13));
				if(ch1.isSelected()==false && ch2.isSelected()==true)
				    lb3.setFont(new Font ("Tahoma",Font.ITALIC,13));
				if(ch1.isSelected()==false && ch2.isSelected()==false)
					lb3.setFont(new Font ("Tahoma",Font.PLAIN,13));
			}
		});
		
		ch2.setBounds(10, 80, 113, 25);
		panel_11.add(ch2);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setToolTipText("");
		panel_12.setBounds(277, 512, 204, 148);
		frame.getContentPane().add(panel_12);
		
		String [] names = {"img/bug1.gif", "img/bug2.gif", "img/travelbug.gif", "img/buganim.gif"};
		JComboBox cbox1 = new JComboBox();

		cbox1.setModel(new DefaultComboBoxModel(new String[] {"img/bug1.gif", "img/bug2.gif", "img/travelbug.gif", "img/buganim.gif"}));
		cbox1.setBounds(12, 88, 132, 22);
		panel_12.add(cbox1);
		
		JLabel lb4 = new JLabel("");
		lb4.setBounds(104, 0, 100, 100);
		panel_12.add(lb4);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBounds(986, 512, 204, 148);
		frame.getContentPane().add(panel_13);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(20, 110, 167, 29);
		panel_13.add(lbl1);
		
		JButton btn1 = new JButton("plain button");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl1.setText("you pressed: plain button");
			}
		});
		btn1.setBounds(51, 24, 108, 25);
		panel_13.add(btn1);
		
		JButton btn2 = new JButton("fancy button");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl1.setText("you pressed: fancy button");
			}
		});
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btn2.setIcon(new ImageIcon(getClass().getResource("img/bug2.gif")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btn2.setIcon(new ImageIcon(getClass().getResource("img/bug1.gif")));
			}
			
		});
		btn2.setBounds(25, 61, 155, 52);
		panel_13.add(btn2);
		btn2.setIcon(new ImageIcon(getClass().getResource("img/bug1.gif")));
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setToolTipText("");
		panel_14.setBounds(986, 676, 204, 148);
		frame.getContentPane().add(panel_14);
		
		final String line1 = ""; // first line of text area
		final String line2 = ""; // second line of text area
		final String line3 = ""; // third line of text area
		
		JTextArea txtrPressAnyKey = new JTextArea();
		txtrPressAnyKey.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent event) {
				 String line1 = String.format("Key pressed: %s",KeyEvent.getKeyText(event.getKeyCode()));
				 String line2 = String.format("This key is %san action key",(event.isActionKey()?"" : "not"));
				 String temp = KeyEvent.getKeyModifiersText(event.getModifiers());		
				 String line3 = String.format("Modifier keys pressed: %s",(temp.equals("") ? "none" : temp)); // output modifiers
				
				 txtrPressAnyKey.setText(String.format("%s\n%s\n%s\n",line1, line2, line3)); // output three lines of text
			}
		
			@Override
			public void keyReleased(KeyEvent event) {
				 String line1 = String.format("key released: %s", KeyEvent.getKeyText(event.getKeyCode()));
				 String line2 = String.format("This key is %san action key",(event.isActionKey()?"" : "not"));
				 String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
				
				 String line3 = String.format("Modifier keys pressed: %s",(temp.equals("") ? "none" : temp)); // output modifiers
				
				 txtrPressAnyKey.setText(String.format("%s\n%s\n%s\n",line1, line2, line3)); // output three lines of text
			}
				
			@Override
			public void keyTyped(KeyEvent event) {
				 String line1 = String.format("key typed: %s", KeyEvent.getKeyText(event.getKeyChar()));
				 String line2 = String.format("This key is %san action key",(event.isActionKey()?"" : "not"));
				 String temp = KeyEvent.getKeyModifiersText(event.getModifiers());
				
				 String line3 = String.format("Modifier keys pressed: %s",(temp.equals("") ? "none" : temp)); // output modifiers
				
				 txtrPressAnyKey.setText(String.format("%s\n%s\n%s\n",line1, line2, line3)); // output three lines of text
			}
		});
		
		txtrPressAnyKey.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtrPressAnyKey.setText("press any key on the keyboard...");
		txtrPressAnyKey.setBackground(SystemColor.menu);
		txtrPressAnyKey.setBounds(0, 0, 204, 148);
		panel_14.add(txtrPressAnyKey);
		
		JPanel panel_15 = new JPanel();
		ArrayList<Point> points = new ArrayList<>();
		//PaintPanel paintPanel = new PaintPanel();
		JLabel lbl2 = new JLabel("");
		panel_15.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged (MouseEvent event) {
				Painter p = new Painter();
				p.main(null);
			}
		});
		PaintPanel paintPanel = new PaintPanel();
		lbl2.add(paintPanel, BorderLayout.CENTER);
	    lbl2.add(new JLabel("Drag the mouse to draw"),
			         BorderLayout.SOUTH);

	    //  lbl2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    lbl2.setSize(400, 200); 
	    lbl2.setVisible(true); 				

		panel_15.setLayout(null);
		panel_15.setToolTipText("");
		panel_15.setBounds(748, 186, 204, 148);
		frame.getContentPane().add(panel_15);
		
		JLabel lb1 = new JLabel("drag the mouse to draw");
		lb1.setBounds(0, 120, 192, 28);
		panel_15.add(lb1);

		lbl2.setBounds(0, 0, 204, 148);
		panel_15.add(lbl2);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setToolTipText("");
		panel_16.setBounds(507, 347, 204, 148);
		frame.getContentPane().add(panel_16);
		
		password = new JPasswordField();
		password.setBounds(86, 40, 106, 22);
		panel_16.add(password);
		
		text = new JTextField();
		text.setBounds(86, 13, 106, 22);
		panel_16.add(text);
		text.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("user name :");
		lblNewLabel_2.setBounds(12, 13, 70, 22);
		panel_16.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("password :");
		lblNewLabel_2_1.setBounds(12, 40, 92, 22);
		panel_16.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1 = new JButton("enter");
		JTextArea textArea = new JTextArea();
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String user = text.getText();
				String pass = password.getText();
				textArea.setText(" welcom "+user+"\n password is: "+pass);
			}
		});
		btnNewButton_1.setBounds(56, 72, 97, 25);
		panel_16.add(btnNewButton_1);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setToolTipText("");
		panel_17.setBounds(507, 186, 204, 148);
		frame.getContentPane().add(panel_17);
		
		JTextArea txtA_1 = new JTextArea();
		txtA_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtA_1.setText(" This is a demo string to illustrate \n" +
		" copying text from one textarea to \n" +
		" another textarea using an external\n event\n");
		txtA_1.setBackground(SystemColor.menu);
		txtA_1.setBounds(0, 0, 204, 60);
		panel_17.add(txtA_1);
		
		JButton btn3 = new JButton("copy");
		JTextArea txtA_2 = new JTextArea();
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtA_2.setText(txtA_1.getSelectedText());
			}
		});
		btn3.setBounds(52, 60, 97, 25);
		panel_17.add(btn3);
		txtA_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtA_2.setBackground(SystemColor.menu);
		txtA_2.setBounds(0, 83, 204, 65);
		panel_17.add(txtA_2);
		
		textArea.setBounds(507, 442, 204, 52);
		frame.getContentPane().add(textArea);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBounds(47, 676, 204, 148);
		frame.getContentPane().add(panel_18);
		
		JButton btnNewButton_2 = new JButton("button 1");
		btnNewButton_2.setBounds(12, 13, 180, 25);
		panel_18.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("button 5");
		btnNewButton_2_1.setBounds(12, 123, 180, 25);
		panel_18.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("button 2");
		btnNewButton_2_2.setBounds(12, 42, 180, 25);
		panel_18.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("button 3");
		btnNewButton_2_3.setBounds(12, 69, 180, 25);
		panel_18.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("button 4");
		btnNewButton_2_4.setBounds(12, 95, 180, 25);
		panel_18.add(btnNewButton_2_4);	
		
	    final Icon[] icons = { 
		     new ImageIcon(getClass().getResource(names[0])),
			 new ImageIcon(getClass().getResource(names[1])), 
			 new ImageIcon(getClass().getResource(names[2])),
			 new ImageIcon(getClass().getResource(names[3]))
			 };
		cbox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                lb4.setIcon(icons[cbox1.getSelectedIndex()]);
			}
		});
		
		borderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorderLayoutDemo border = new BorderLayoutDemo();
				border.main(null);
			}
		});
		layout3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GridLayoutDemo layout3 = new GridLayoutDemo();
				layout3.main(null);
			}
		});
		layBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlowLayoutDemo lay = new FlowLayoutDemo();
				lay.main(null);
			}
		});
		paintBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Painter p = new Painter();
				p.main(null);
			}
		});
		mouse2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseDetails mouse2 = new MouseDetails();
				mouse2.main(null);
			}
			
		});
		mouseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MouseTracker mouse = new MouseTracker();
				mouse.main(null);
			}
		});
		comboBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ComboBoxTest combo = new ComboBoxTest();
				combo.main(null);
			}
		});
		rdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RadioButtonTest rd = new RadioButtonTest();
				rd.main(null);
			}
		});
		chkBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckBoxTest chk = new CheckBoxTest();
				chk.main(null);
			}
		});
		txt2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextAreaDemo txt = new TextAreaDemo();
				txt.main(null);
			}
		});
		txtBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextFieldTest txt = new TextFieldTest();
				txt.main(null);
			}
		});
		btnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonTest btnTest = new ButtonTest();
				btnTest.main(null);
			}
		});
		labelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LabelTest lbl = new LabelTest();
				lbl.main(null);
			}
		});
		additionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Addition addition = new Addition();
				addition.main(null);
			}
		});
	}
}
