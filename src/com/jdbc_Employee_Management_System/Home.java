package com.jdbc_Employee_Management_System;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class Home extends JFrame implements ActionListener {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		JButton add, view, update, remove;

	    Home() {

	        setLayout(null);

	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("home.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(0, 0, 1120, 630); // for image size
	        add(image);

	        // FOR HEADING
	        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
	        heading.setBounds(630, 20, 400, 40);
	        image.add(heading); // for use heading on image
	        heading.setFont(new Font("TAHOMA", Font.BOLD, 20));

	        // FOR BUTTON
	        add = new JButton("Add Employee");
	        add.setBounds(650, 80, 150, 40);
	        add.addActionListener(this);
	        image.add(add);

	        view = new JButton("View Employee's");
	        view.setBounds(820, 80, 150, 40);
	        view.addActionListener(this); // for click button Action perform
	        image.add(view);

	        update = new JButton("Update Employee");
	        update.setBounds(650, 140, 150, 40);
	        update.addActionListener(this);
	        image.add(update);

	        remove = new JButton("Remove Employee");
	        remove.setBounds(820, 140, 150, 40);
	        remove.addActionListener(this);
	        image.add(remove);

	        setSize(1120, 630);
	        setLocation(250, 100);
	        setVisible(true);

	    }

	    // FOR Click to Action button -- override method
	    public void actionPerformed(ActionEvent ae) {

	        if (ae.getSource() == add) {

	            setVisible(false);
	            new AddEmployee();

	        } else if (ae.getSource() == view) {
	            setVisible(false);
	            new ViewEmployee();

	        } else if (ae.getSource() == update) {

	        } else {

	        }

	    }

	
	public static void main(String[] args) {
		
		new Home();
	}
}
