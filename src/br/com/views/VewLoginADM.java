package br.com.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.SwingConstants;

public class VewLoginADM {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtPasswor;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VewLoginADM window = new VewLoginADM();
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
	public VewLoginADM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBounds(108, 58, 45, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha: ");
		lblNewLabel_1.setBounds(108, 110, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(108, 81, 214, 19);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		txtPasswor = new JPasswordField();
		txtPasswor.setBounds(108, 133, 214, 19);
		frame.getContentPane().add(txtPasswor);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEntrar.setBounds(108, 162, 106, 21);
		frame.getContentPane().add(btnEntrar);
		
		btnNewButton = new JButton("Cadastrar-se");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(224, 162, 98, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Esqueceu a Senha?");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(137, 193, 164, 21);
		frame.getContentPane().add(btnNewButton_1);
	}
}
