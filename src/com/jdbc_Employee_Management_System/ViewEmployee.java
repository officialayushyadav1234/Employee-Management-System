package com.jdbc_Employee_Management_System;

import java.awt.Choice;
import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ViewEmployee extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTable table;
    Choice cemployeeId; // Initialize Choice Box Global side

    ViewEmployee() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel searchlbl = new JLabel("Search by employee Id");
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl);

        // For Choice BOX
        cemployeeId = new Choice();
        cemployeeId.setBounds(180, 20, 150, 20);
        add(cemployeeId);

        // For Choice EmpId
        try {

            DatabaseConn c = new DatabaseConn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            while (rs.next()) {
                cemployeeId.add(rs.getString("empId"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        table = new JTable();

        try {

            DatabaseConn c = new DatabaseConn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);

        setSize(900, 700);
        setLocation(300, 100);
        setVisible(true);

    }

    public static void main(String[] args) {

        new ViewEmployee();

    }

}
