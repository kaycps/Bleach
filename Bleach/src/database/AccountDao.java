package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Account;
import models.Personagem;

public class AccountDao {
	
	private Connection connection;

	public AccountDao() {
		
		this.connection =new ConnectionFactoy().getConnection();
	}
	
	
	public boolean salvar(Account account) {
		
		String slq="insert into accounts" + "(login,password)" + "values(?,?)";
		
		try {
			PreparedStatement statement = connection.prepareStatement(slq);
			
			statement.setString(1,account.getLogin());
			statement.setString(2, account.getSenha());
			statement.executeUpdate();
			
			
			statement.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	public Boolean VerificarLogin(Account account)  {
			
			
			String sql = "select * from accounts where login = ? and password = ? ";		
			 
			try {	
				
				//prepara o statement para inserção 			
				PreparedStatement	stmt = connection.prepareStatement(sql);
				stmt.setString(1,account.getLogin());
				stmt.setString(2, account.getSenha());
				
				ResultSet rs = stmt.executeQuery();	
				
				if(rs.next()) {
					
					if(rs.getString("login").equals(account.getLogin())&&rs.getString("password").equals(account.getSenha())) {
						
						Account account2 = Account.getInstance();
						account2.setId(rs.getInt("idaccounts"));
						rs.close();
						stmt.close();
						return true;
						
					}
				}			
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;	
			
			
		}
	
	public List<Personagem> listarPersonagens(int id){
		
		String sql="select *from personagens where accounts_idaccounts = ?";
		
		List<Personagem>personagems = new ArrayList<Personagem>();
		
		try {
			PreparedStatement statement = this.connection.prepareStatement(sql);
			statement.setInt(1, id);
			
			ResultSet set = statement.executeQuery();
			
			while(set.next()) {
				
				Personagem p = new Personagem();
				p.setId(set.getInt("idpersonagens"));
				p.setNome(set.getString("nome"));
				personagems.add(p);
			}
			set.close();
			statement.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return personagems;
		
	}

}
