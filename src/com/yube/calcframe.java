package com.yube;

import java.awt.BorderLayout;
import java.awt.Desktop.Action;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class calcframe extends JFrame {

	private JPanel content;
	protected JTextField procscreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcframe frame = new calcframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calcframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 337);
		content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(content);
		content.setLayout(null);

		procscreen = new JTextField();
		procscreen.setBounds(10, 11, 238, 33);
		procscreen.setHorizontalAlignment(JTextField.RIGHT);

		content.add(procscreen);

		JButton btn7 = new JButton("7");
		btn7.setBounds(20, 56, 47, 48);
		content.add(btn7);
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn7.getText());

			}
		});

		JButton btn8 = new JButton("8");
		btn8.setBounds(77, 56, 47, 48);
		content.add(btn8);
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn8.getText());

			}
		});

		JButton btn9 = new JButton("9");
		btn9.setBounds(134, 56, 47, 48);
		content.add(btn9);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn9.getText());

			}
		});

		JButton btn4 = new JButton("4");
		btn4.setBounds(20, 115, 47, 48);
		content.add(btn4);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn4.getText());

			}
		});

		JButton btn5 = new JButton("5");
		btn5.setBounds(77, 115, 47, 48);
		content.add(btn5);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn5.getText());

			}
		});

		JButton btn6 = new JButton("6");
		btn6.setBounds(134, 115, 47, 48);
		content.add(btn6);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn6.getText());

			}
		});

		JButton btnbl = new JButton("/");
		btnbl.setBounds(191, 55, 47, 48);
		content.add(btnbl);
		btnbl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btnbl.getText());

			}
		});

		JButton btncp = new JButton("*");
		btncp.setBounds(191, 115, 47, 48);
		content.add(btncp);
		btncp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btncp.getText());

			}
		});

		JButton btnes = new JButton("-");
		btnes.setBounds(191, 234, 47, 48);
		content.add(btnes);
		btnes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btnes.getText());

			}
		});

		JButton btneq = new JButton("=");
		btneq.setBounds(134, 234, 47, 48);
		content.add(btneq);
		btneq.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btneq.getText());

			}
		});

		JButton btn3 = new JButton("3");
		btn3.setBounds(134, 175, 47, 48);
		content.add(btn3);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn3.getText());

			}
		});

		JButton btntl = new JButton("+");
		btntl.setBounds(191, 174, 47, 48);
		content.add(btntl);
		btntl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btntl.getText());

			}
		});

		JButton btn2 = new JButton("2");
		btn2.setBounds(77, 175, 47, 48);
		content.add(btn2);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn2.getText());

			}
		});

		JButton btn1 = new JButton("1");
		btn1.setBounds(20, 175, 47, 48);
		content.add(btn1);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn1.getText());

			}
		});

		JButton btnvr = new JButton(",");
		btnvr.setBounds(20, 234, 47, 48);
		content.add(btnvr);
		btnvr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btnvr.getText());

			}
		});

		JButton btn0 = new JButton("0");
		btn0.setBounds(77, 234, 47, 48);
		content.add(btn0);
		btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				procscreen.setText(procscreen.getText() + btn0.getText());

			}
		});

	}

}
