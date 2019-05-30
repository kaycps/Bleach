package view.personagem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class CharacterScreen extends JFrame {

	private JPanel contentPane;
	private JTextField inputTextChat;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton btnSair;
	private JPanel mapa;

	
	public CharacterScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(102, 102, 102)));
		panel.setBounds(0, 426, 618, 135);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea showMessageChat = new JTextArea();
		showMessageChat.setBounds(6, 11, 599, 97);
		panel.add(showMessageChat);
		showMessageChat.setBackground(new Color(204, 204, 204));
		showMessageChat.setEditable(false);
		
		inputTextChat = new JTextField();
		inputTextChat.setBounds(6, 107, 599, 20);
		panel.add(inputTextChat);
		inputTextChat.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 255));
		panel_1.setBounds(615, 0, 169, 561);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnNewButton = new JButton("Invent\u00E1rio");
		btnNewButton.setBounds(0, 68, 79, 23);
		panel_1.add(btnNewButton);
		
		button = new JButton("New button");
		button.setBounds(0, 102, 89, 23);
		panel_1.add(button);
		
		button_1 = new JButton("New button");
		button_1.setBounds(89, 68, 80, 23);
		panel_1.add(button_1);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(80, 538, 89, 23);
		panel_1.add(btnSair);
		
		mapa = new JPanel();
		mapa.setBounds(0, 0, 618, 428);
		contentPane.add(mapa);
	}
}
