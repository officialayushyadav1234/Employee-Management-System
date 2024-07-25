package com.jdbc_Employee_Management_System;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;
import com.toedter.calendar.*;

public class AddEmployee extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Random ran = new Random();
    int number = ran.nextInt(999999);

    // Global Declaration
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfsalary, tfeducation, tfdesignation, tfadhar, tfid;
    JDateChooser dcob;
    JButton add, back;

    AddEmployee() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Add Employee Deatails");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        // For Name
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);

        // For Text Name Field
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        // For Father's Name
        JLabel labelfname = new JLabel("Father's Name");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelfname);

        // For Text Name Field
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);

        // For Date Of Birth
        JLabel labeldob = new JLabel("Date Of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);

        dcob = new JDateChooser();
        dcob.setBounds(200, 200, 150, 30);
        add(dcob);

        // For Salary
        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(400, 200, 150, 30);
        labelsalary.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelsalary);

        // For Text Name Field
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 200, 150, 30);
        add(tfsalary);

        // For Address
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);

        // For Text Name Field
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);

        // For Phone
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);

        // For Text Name Field
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);

        // For Email
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);

        // For Text Name Field
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);

        // For Education
        JLabel labeleducation = new JLabel("Highest Education");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeleducation);

        // For Text Name Field
        tfeducation = new JTextField();
        tfeducation.setBounds(600, 300, 150, 30);
        add(tfeducation);

        // For Designation
        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldesignation);

        // For Text Name Field
        tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 350, 150, 30);
        add(tfdesignation);

        // For Adhar Number
        JLabel labeladhdar = new JLabel("Adhar Number");
        labeladhdar.setBounds(400, 350, 150, 30);
        labeladhdar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladhdar);

        // For Text Name Field
        tfadhar = new JTextField();
        tfadhar.setBounds(600, 350, 150, 30);
        add(tfadhar);

        // For Employee ID
        JLabel labelemployeeid = new JLabel("Employye Id");
        labelemployeeid.setBounds(50, 400, 150, 30);
        labelemployeeid.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemployeeid);

        // For Text Name Field
        tfid = new JTextField("" + number);
        tfid.setBounds(200, 400, 150, 30);
        add(tfid);

        // FOR BUTTON
        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);

        // FOR BUTTON
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        add.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);

        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == add) {

            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            String adhar = tfadhar.getText();
            String empId = tfid.getText();

            try {
                DatabaseConn conn = new DatabaseConn();
                String query = "insert into employee values('" + name + "', '" + fname + "', '" + dob + "', '" + salary
                        + "', '" + address + "', '" + phone + "', '" + email + "', '" + education + "', '" + designation
                        + "', '" + adhar + "', '" + empId + "' )";

                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Added succesfully");
                setVisible(false);
                new Home();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }
    
    public static void main(String[] args) {
    	
    	new AddEmployee();
    }
}
