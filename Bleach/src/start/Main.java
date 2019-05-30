package start;

import javax.swing.JOptionPane;

import view.login.Home;
import view.login.Resolucao;

public class Main {
	
	public static void main(String[] args) {
		
		Resolucao r = new Resolucao();
		int op = (JOptionPane.showConfirmDialog(null, "Executar em 600x800?"));
		
		if(op==0) {
			r.setWidth(800);
			r.setHeigth(600);
			
		}else if(op==1) {
			r.setWidth(1024);
			r.setHeigth(800);
		}
		
		Home h = new Home(r);
		h.setVisible(true);
	}
}
