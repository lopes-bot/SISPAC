package br.com.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VewInicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VewInicio window = new VewInicio();
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
	public VewInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SISTEMA PARA GERENCIAMENTO DE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(113, 28, 206, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PALESTRAS, ATIVIDADES E CURSOS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(113, 53, 206, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		Component glue = Box.createGlue();
		glue.setBounds(208, 42, 1, 1);
		frame.getContentPane().add(glue);
		
		JButton btnLoginADM = new JButton("Login ADM");
		btnLoginADM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLoginADM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLoginADM.setBounds(108, 123, 101, 40);
		frame.getContentPane().add(btnLoginADM);
		
		JButton btnNewButton = new JButton("Login ALUNO");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(219, 123, 100, 40);
		frame.getContentPane().add(btnNewButton);
	}
}
