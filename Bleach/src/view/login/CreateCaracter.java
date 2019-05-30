package view.login;


import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class CreateCaracter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCaracter frame = new CreateCaracter();
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
	public CreateCaracter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Classe", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(59, 197, 121, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JRadioButton rdbtnShinigamy = new JRadioButton("Shinigami");
		rdbtnShinigamy.setBounds(6, 16, 109, 23);
		panel.add(rdbtnShinigamy);
		
		JRadioButton rdbtnNewQuincy = new JRadioButton("Quincy");
		rdbtnNewQuincy.setBounds(6, 42, 109, 23);
		panel.add(rdbtnNewQuincy);
		
		JRadioButton rdbtnNewRyoka = new JRadioButton("Ryoka");
		rdbtnNewRyoka.setBounds(6, 68, 109, 23);
		panel.add(rdbtnNewRyoka);
		
		JRadioButton rdbtnArrankar = new JRadioButton("Arrankar");
		rdbtnArrankar.setBounds(6, 94, 109, 23);
		panel.add(rdbtnArrankar);
		
		JLabel imgBackground = new JLabel("");
		imgBackground.setBounds(0, 0, 784, 561);
		contentPane.add(imgBackground);
		
		
		
	}
	
}
