package controller;

import model.Project;
import util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjectCrontroller {
	
	public void save(Project project) {
		String sql = "INSERT INTO projects (name,"
		         + "description,"
		        + "createdAt,"
		        +" updatedAt) VALUES(?,?,?,?)" ;
		
		Connection connection = null;
		PreparedStatement statement = null;
		  try {
			  
			  ////Estabelencendo a conexão com o banco de dados
		      connection = ConnectionFactory.getConnection();
		      
		      //Preparando a query
		      statement = connection.prepareStatement(sql);
		      
		      //Setando os valore
		      statement.setString (1, project.getName ());
		      statement.setString(2, project.getDescription());
		     statement.setDate(3, new Date(project.getCreatedAt() .getTime()));
		     statement.setDate(4, new Date(project.getUpdatedAt() .getTime()));
		     
		     //Executando a query
		     statement.execute();
		  }catch(Exception ex){
				throw new RuntimeException("Erro ao salvar a tarefa" +ex.getMessage(),ex);
			}finally {
				ConnectionFactory.closeConnection(connection,statement);
				
			}

		
	}
	public void upadate(Project project) {
		String sql = "UPDATE projects SET (name = ?,"
		         + "description = ?,"
		        + "createdAt = ?,"
		        +" updatedAt= ?"
		        + "WHERW ID = ?" ;
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			//Estabelencendo a conexão com o banco de dados
			connection = ConnectionFactory.getConnection();
			
			//Preparando a query
			statement = connection.prepareStatement(sql);
			
			//Setando os campos de valores do statement
		    statement.setString (1, project.getName ());
		    statement.setString(2, project.getDescription());
		    statement.setDate(3, new Date(project.getCreatedAt() .getTime()));
		    statement.setDate(4, new Date(project.getUpdatedAt() .getTime()));
		    statement.setInt(5, project.getId());
		    
		    //Executando a query
		    statement.execute();
		 }catch(Exception ex){
				throw new RuntimeException("Erro ao atualizar a tarefa" +ex.getMessage(),ex);
		 }finally {
			ConnectionFactory.closeConnection(connection, statement);
		 }
		
	}

		
	public List<Project> getAll(){
		String sql = "SELECT * FROM projects";
		
		
		//Lista de tarefas que será devolvida quando a chamada do método acontecer.
		List<Project> projects= new ArrayList<Project>();
		
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet  = null;
		try {
			
			//Criação da conexão
			connection = ConnectionFactory.getConnection();
			statement = connection.prepareStatement(sql);
			
			resultSet= statement.executeQuery();
			
			//Enqnaunto houverem valores a serem percorridos no meu resultSet
			while (resultSet.next()) {
				Project project = new Project();
				project.setId(resultSet.getInt("id"));
				project.setName(resultSet.getString("name"));
				project.setDescription(resultSet.getString("description"));
				project.setCreatedAt(resultSet.getDate("createdAt"));
				project.setUpdateAt(resultSet.getDate("updateAt"));
				
				projects.add(project);
				
			}
		 }catch(Exception ex){
				throw new RuntimeException("Erro ao inserir a tarefa" +ex.getMessage(),ex);
		}finally {
			ConnectionFactory.closeConnection(connection, statement, resultSet);
		}
		
		//Lista de tarefas de que foi criada e carregada no banco de dados
		return projects;
	}
	
	
	public void removeById(int  idProject) throws SQLException {
		String sql = "DELETE FROM projects WHERE id = ?";
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			
			//Criação da conexão com o banco de dados
			connection = ConnectionFactory.getConnection();
			
			//Preparando a query
			statement = connection.prepareStatement(sql);
			
			//Setando os valores
			statement.setInt(1, idProject);
			
			//Executando a query
			statement.execute() ;
		 }catch(Exception ex){
				throw new RuntimeException("Erro ao deletar a tarefa" +ex.getMessage(),ex);
		}finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
		

}
}
