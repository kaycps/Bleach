package view.login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import database.AccountDao;
import models.Account;
import models.Personagem;
import java.awt.ScrollPane;
import java.awt.Button;

public class SelectCaracter extends JFrame {

	private JPanel contentPane;

	
	public SelectCaracter() {
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
		
		Image img = new ImageIcon(this.getClass().getResource("/CreateCaracter.jpg")).getImage();
		
		JPanel panelListaPersonagens = new JPanel();
		panelListaPersonagens.setBounds(299, 158, 235, 214);
		panel.add(panelListaPersonagens);
		panelListaPersonagens.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 215, 134);
		panelListaPersonagens.add(scrollPane);
		
		JLabel imgBackground = new JLabel("");
		imgBackground.setBounds(0, 0, 794, 572);
		panel.add(imgBackground);
		imgBackground.setIcon(new ImageIcon(img));
		
		Account conta = Account.getInstance();
		
		AccountDao dao = new AccountDao();
		List<Personagem> personagems = dao.listarPersonagens(conta.getId());	
		//Criação da Table
				String coluna[]= {"Id","Nick","Level"};
				DefaultTableModel tableModel = new DefaultTableModel(coluna,0);
				JTable table = new JTable(tableModel);
				
				//Transformando arrayList em Object
				for(int i = 0; i<personagems.size();i++) {
					
					int id = personagems.get(i).getId();
					String nome = personagems.get(i).getNome();
					int level = personagems.get(i).getLevel();								
					
					
					Object data[]= {id,nome,level};			
					tableModel.addRow(data);
				}	
				
				
		scrollPane.setViewportView(table);		
		
		Button btnLogar = new Button("Logar");
		btnLogar.setBounds(136, 157, 89, 30);
		panelListaPersonagens.add(btnLogar);
		
		Button btnVoltar = new Button("Voltar");
		btnVoltar.setBounds(10, 157, 89, 30);
		panelListaPersonagens.add(btnVoltar);
		
		
	}
}
