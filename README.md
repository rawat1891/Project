package swing;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
/* by using swing we can create user interface GUI.
 * SWING is a toolkit in java
 * SWING has predefined components like JButton , JTextfield , JPasswordfield , JLabel.....
 * by this we can create a application or program to interact with the user
 
 
 	How to create a Window?
 	
 	1. Your class must extend the JFrame class(Predefined Class)
 	2. By using JFrame components we can create window / Frame.
 	3. JFrame class defined in javax.swing
 	4. must import javax.swing*;
 	
 	#Creating simple window
 */
import java.util.*;
import javax.swing.*;

 public class my_frame extends JFrame{
	
	 // Creating clock window;
	 JLabel timeLable;
	 JLabel dateLable;
	 // simple date format ....designed in java.text,SimpleDateFormat / java.text package;
	 SimpleDateFormat format;
	 String time;
	 String date;
	 
	 my_frame()
	 {
		// this keyword means holding current class address or reference.
		 
		 // setting up the window
		 this.setVisible(true); //makes the frame appear on the screen 
		 
		 //setting window size(width,Height)
		 this.setSize(500,400);
		 
		 this.setTitle("Clock");
		 this.setLayout(null);
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to close the window.
		 
		 ImageIcon imgIcon = new ImageIcon("pankaj.jpg");//to give your icon for the window.
		 
		 this.setIconImage(imgIcon.getImage());
		 
		 this.getContentPane().setBackground(Color.BLUE);
		 
		  timeLable = new JLabel();
		 
		 timeLable.setBounds(150, 30, 200, 30);
		 timeLable.setFont(new Font("stencil",Font.BOLD,30));
		 
		 dateLable = new JLabel();
		 
		 dateLable.setBounds(100,80,300,80);
		 dateLable.setFont(new Font("stencil",Font.BOLD,30));
		 dateLable.setBackground(Color.ORANGE);
		 dateLable.setOpaque(true);
		 
		 format = new SimpleDateFormat("hh:mm: a");
		 Calendar.getInstance().getTime();
		 time = format.format(Calendar.getInstance().getTime());
		 timeLable.setText(time);
		 
		 add(timeLable);
		 add(dateLable);
		 setdate();
		 settime();
		 
		 
	 }
	 
	 private void setdate()
	 {
		 format = new SimpleDateFormat("EEEE MM,d,");
		 date = format.format(Calendar.getInstance().getTime());
		 dateLable.setText(date);
		 
	 }
	 private void settime()
	 {
		 while(true)
		 {
			 format = new SimpleDateFormat("hh:mm:ss a");
			 Calendar.getInstance().getTime();
			 time = format.format(Calendar.getInstance().getTime());
			 timeLable.setText(time);
		 }
	 }
	 
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		my_frame s1 = new my_frame();
		
	 System.out.println(s1);
	}

}
 
