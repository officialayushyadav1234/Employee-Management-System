package com.jdbc_Employee_Management_System;

    import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.sql.*;

	public class Login extends JFrame implements ActionListener {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		JTextField tfusername, tfpassword; // global variable declaration

	    Login() {

	        getContentPane().setBackground(Color.WHITE);
	        setLayout(null);
	        setVisible(true);

	        // For Username statement
	        JLabel lblusername = new JLabel("Username");
	        lblusername.setBounds(40, 20, 100, 30);
	        add(lblusername);

	        tfusername = new JTextField(); // For Box Username
	        tfusername.setBounds(150, 20, 150, 30);
	        add(tfusername);

	        // For Password Statement
	        JLabel lblpassword = new JLabel("Password");
	        lblpassword.setBounds(40, 70, 100, 30);
	        add(lblpassword);

	        tfpassword = new JTextField(); // For Box password
	        tfpassword.setBounds(150, 70, 150, 30);
	        add(tfpassword);

	        // For Button
	        JButton login = new JButton("Login");
	        login.setBounds(150, 140, 150, 30);
	        login.setBackground(Color.BLACK);
	        login.setForeground(Color.white);
	        login.addActionListener(this); // for Action perform login key
	        add(login);

	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("second.jpg"));
	        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel image = new JLabel(i3);
	        image.setBounds(350, 0, 200, 200);
	        add(image);

	        // For Frame
	        setSize(600, 300);
	        setLocation(450, 200);
	        setVisible(true);

	    }

	    public void actionPerformed(ActionEvent ae) {

	        try {

	            String username = tfusername.getText();
	            String password = tfpassword.getText();

	            DatabaseConn c = new DatabaseConn(); // for use execute query

	            String query = "select * from login where username = '" + username + "' and password = '" + password + "'";

	            ResultSet rs = c.s.executeQuery(query);
	            if (rs.next()) {

	                setVisible(false);
	                new Home(); // new class

	            } else {
	                JOptionPane.showMessageDialog(null, "Invalid username or password");
	                setVisible(false);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }

	
	
	public static void main(String[] args) {
		
		new Login();
	}
}
