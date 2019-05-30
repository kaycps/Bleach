package models;

public class Account {
	
	private static Account account;
	
	public static synchronized Account getInstance() {
		if(account==null) {
			return account = new Account();
		}else {
			return account;
		}
	}
	
	private String login;
	private String senha;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isLogado() {
		return logado;
	}
	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	private boolean logado;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
