package view.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.AccountDao;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import models.Account;
public class CreateAccount extends JFrame {

	private JPanel contentPane;
	private JTextField tfLogin;
	private JTextField tfSenha;

	
	public CreateAccount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Image Account = new ImageIcon(this.getClass().getResource("/CreateAccount.jpg")).getImage();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(256, 190, 276, 114);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDadosDaConta = new JLabel("Dados da Conta");
		lblDadosDaConta.setBounds(0, 0, 152, 14);
		panel_1.add(lblDadosDaConta);
		lblDadosDaConta.setForeground(new Color(51, 153, 51));
		lblDadosDaConta.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblNome = new JLabel("Login:");
		lblNome.setBounds(0, 38, 152, 14);
		panel_1.add(lblNome);
		lblNome.setForeground(new Color(153, 204, 0));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(0, 72, 152, 14);
		panel_1.add(lblSenha);
		lblSenha.setForeground(new Color(153, 204, 0));
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		tfLogin = new JTextField();
		tfLogin.setBounds(56, 36, 86, 20);
		panel_1.add(tfLogin);
		tfLogin.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setBounds(56, 63, 86, 20);
		panel_1.add(tfSenha);
		tfSenha.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Account account = new Account();
				account.setLogin(tfLogin.getText());
				account.setSenha(tfSenha.getText());
				
				AccountDao dao = new AccountDao();
				
				if(dao.salvar(account)) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
				}	
				
				
			}
		});
		btnCadastrar.setBounds(152, 35, 114, 51);
		panel_1.add(btnCadastrar);
		
		JLabel imgAccount = new JLabel("");
		imgAccount.setBounds(0, 0, 784, 561);
		panel.add(imgAccount);
		imgAccount.setIcon(new ImageIcon(Account));
		
		
	}

}
