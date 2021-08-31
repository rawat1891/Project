package com.swing;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
public class MyFrame extends JFrame{
	// Creating Clock window
	JLabel timeLabel;//To display time
	JLabel dateLabel;
	// SimpleDateFormat--->	Defined in java.text package 
	SimpleDateFormat simpleFormat;
	String time;
	String date;
	MyFrame()
	{/*this keyword means holding current class address/reference, 
		By using 'this'keyword we can the members of same class(MyFrame) or its superclass(JFrame)		*/
		// Setting up window
		setVisible(true);//Either u can use this or directly you can call JFrame methods
		this.setSize(500,400);// setting window size, width and height.
		this.setTitle("Clock");
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close the window
		ImageIcon imgIcon = new ImageIcon("astro2.jpg");//// To give your own icon to window
		this.setIconImage(imgIcon.getImage());
		this.getContentPane().setBackground(Color.cyan);
		timeLabel = new JLabel();
		timeLabel.setBounds(150,30,200,30);//x-axis ,y axis, width,height
		timeLabel.setFont(new Font("stencil",Font.BOLD,30));
		//timeLabel.setBackground(Color.gray);
		// need to call following method in order to refelect component background
		//timeLabel.setOpaque(true);
		dateLabel = new JLabel();
		dateLabel.setBounds(100,80,300,30);//x-axis ,y axis, width,height
		dateLabel.setFont(new Font("stencil",Font.BOLD,30));
		dateLabel.setBackground(Color.orange);
		// need to call following method in order to refelect component background
		dateLabel.setOpaque(true);
		// setting up time format
//		simpleFormat = new SimpleDateFormat("hh:mm:ss a");
//		// Calendar.getInstance().getTime() --> return current system time/date
//		time = simpleFormat.format(Calendar.getInstance().getTime());
//		timeLabel.setText(time);
		//add() method used to add components(Jlabel,JButton,JtextField) to window
		add(timeLabel);
		add(dateLabel);
		setDate();
		setTime();// calling setTime() must be at end statement inside constructor
		// statements --> wont reach
		}
	private void setDate() {
		simpleFormat = new SimpleDateFormat("EEEE MMM,d yyyy");
		date = simpleFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);	
	}
	private void setTime() {
		while(true) {
		simpleFormat = new SimpleDateFormat("hh:mm:ss a");
		// Calendar.getInstance().getTime() --> return current system time/date
		time = simpleFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		}	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		/*		 Swing
		 -----
		 Swing is a GUI(Graphical User Interface) widget toolkit for java.
		 By using swing you can create program which allow user to interact with application.
		 Swing has predefined components like JButton, JTextField, JPasswordField, JLabel...
		 
		 How to create window?
		 --------------------
		 1. Your class must extends JFrame class(predefined class)
		 2. By using JFrame components we can create window / Frame
		 3. JFrame class defined in javax.swing;
		 4. must import javax.swing.*;
		 */
		
		// creating simple window
		
	
		
		

	}

}
