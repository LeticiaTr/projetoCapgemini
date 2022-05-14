package util;
import java.sql.*;



public class ConnectionFactory {
	
	
	
	public Connection getConnection(){ 
		   try{ 
		        String url = "jdbc:mysql://localhost:3312/todoapp"; 
		        String usuario = "root"; 
		        String senha = ""; 
		       
		        return DriverManager.getConnection(url,  
                        usuario, 
                        senha);  
		      }catch(SQLException e){ 
		          throw new RuntimeException(); 
		      } 
		} 
	
	
	public static void closeConnection (Connection connection){
	    try{
	        if (connection!= null)
	             connection.close();
	     }catch (Exception ex){
	        throw new RuntimeException ("Erro ao fecharaconexão comobanco de dados");
		}
	
	}
	
	
	
	public static void main(String[] args) {
		ConnectionFactory teste = new ConnectionFactory(); 
		   teste.getConnection(); 
		   System.out.println("Conectou ao Banco de Dados!"); 

	}
}
