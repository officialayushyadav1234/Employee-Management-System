package com.jdbc_Employee_Management_System;



import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //  For ActionListerner Interface

import javax.swing.*;

public class Slash extends JFrame implements ActionListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Slash() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM"); // for use write statement on frame
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading); // for show the frame

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this); // For Click the button to close the page
        image.add(clickhere);

        setSize(1170, 650);
        setLocation(150, 50);
        setVisible(true);

        while (true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }

            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }

    }

    // For the Next Page Login Page (Method Override)
    public void actionPerformed(ActionEvent ae) {

        setVisible(false); // For close current page
        new Login(); // for open Login page

    }
	
	public static void main(String[] args) {
		
	  new	Slash();
	}
}
