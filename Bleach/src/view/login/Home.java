package view.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.AccountDao;
import models.Account;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JTextField tfSenha;
	
	
	public Home(Resolucao r) {		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image home = new ImageIcon(this.getClass().getResource("/Home.jpg")).getImage();
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfLogin = new JTextField();
		tfLogin.setBounds(520, 237, 121, 20);
		panel.add(tfLogin);
		tfLogin.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setColumns(10);
		tfSenha.setBounds(520, 268, 121, 20);
		panel.add(tfSenha);
		
		JButton btnNewButton = new JButton("Logar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Account account = Account.getInstance();
				
				account.setLogin(tfLogin.getText());
				account.setSenha(tfSenha.getText());
				
				AccountDao dao = new AccountDao();
				
				if(dao.VerificarLogin(account)) {
					
					SelectCaracter caracter = new SelectCaracter();
					caracter.setVisible(true);
				}else {
					
					JOptionPane.showMessageDialog(null, "Usuario não encontrado ou inválido!");
				}
				
			}
		});
		btnNewButton.setBounds(665, 237, 68, 51);
		panel.add(btnNewButton);
		
		JLabel lblInscrevase = new JLabel("Clique aqui para se cadastrar");
		lblInscrevase.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				CreateAccount account = new CreateAccount();
				account.setVisible(true);
			}
		});
		lblInscrevase.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblInscrevase.setForeground(new Color(0, 51, 102));
		lblInscrevase.setBounds(520, 310, 176, 14);
		panel.add(lblInscrevase);
		
		JLabel imgHomeFundo = new JLabel("");
		imgHomeFundo.setForeground(new Color(0, 153, 153));
		imgHomeFundo.setBounds(0, 0, 784, 561);
		panel.add(imgHomeFundo);
		imgHomeFundo.setIcon(new ImageIcon(home));
		
	}
}
