package controller;

import model.Task;
import util.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskController {
	
	public void save(Task task) {
		String sql = "INSERT INTO tasks (idProject, "
				+ "name,"
		         + "description,"
		         + "completed,"
		         +"notes,"
		         + "deadline,"
		        + "createdAt,"
		        +" updatedAt) VALUES(?,?,?,?,?,?,?,?)" ;
		
		Connection connection = null;
		PreparedStatement statement = null;
		  try {
			  
			  ////Estabelencendo a conexão com o banco de dados
		      connection = ConnectionFactory.getConnection();
		      
		      //Preparando a query
		      statement = connection.prepareStatement(sql);
		      
		      //Stando os valores
		      statement.setInt(1, task.getIdProject());
		      statement.setString (2, task.getName ());
		      statement.setString(3, task.getDescription());
		      statement.setBoolean(4, task.isCompleted());
		      statement.setString (5, task.getNotes ());
		     statement.setDate(6, new Date(task.getDeadline() .getTime()));
		     statement.setDate(6, new Date(task.getCreatedAt() .getTime()));
		     statement.setDate(7, new Date(task.getUpdatedAt() .getTime()));
		     
		     //Executando a query
		     statement.execute();
		  }catch(Exception ex){
				throw new RuntimeException("Erro ao salvar a tarefa" +ex.getMessage(),ex);
			}finally {
				ConnectionFactory.closeConnection(connection,statement);
				
			}

		
	}
	public void upadate(Task task) {
		String sql = "UPDATE tasks SET (idProject = ?, "
				+ "name = ?,"
		         + "description = ?,"
		         + "completed = ?,"
		         +"notes = ?,"
		         + "deadline = ?,"
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
			statement.setInt(1, task.getIdProject());
		    statement.setString (2, task.getName ());
		    statement.setString(3, task.getDescription());
		    statement.setBoolean(4, task.isCompleted());
		    statement.setString (5, task.getNotes ());
		    statement.setDate(6, new Date(task.getDeadline() .getTime()));
		    statement.setDate(7, new Date(task.getCreatedAt() .getTime()));
		    statement.setDate(8, new Date(task.getUpdatedAt() .getTime()));
		    statement.setInt(9, task.getId());
		    
		    //Executando a query
		    statement.execute();
		 }catch(Exception ex){
				throw new RuntimeException("Erro ao atualizar a tarefa" +ex.getMessage(),ex);
		 }finally {
			ConnectionFactory.closeConnection(connection, statement);
		 }
		
	}
	
	public void removeById(int  taskId) throws SQLException {
		String sql = "DELETE FROM tasks WHERE id = ?";
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			
			//Criação da conexão com o banco de dados
			connection = ConnectionFactory.getConnection();
			
			//Preparando a query
			statement = connection.prepareStatement(sql);
			
			//Setando os valores
			statement.setInt(1, taskId);
			
			//Executando a query
			statement.execute() ;
		 }catch(Exception ex){
				throw new RuntimeException("Erro ao deletar a tarefa" +ex.getMessage(),ex);
		}finally {
			ConnectionFactory.closeConnection(connection, statement);
		}
		
		
	}
	public List<Task> getAll(int idProject) {
		String sql = "SELECT * FROM tasks WHERE idProject = ?";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet  = null;
		
		//Lista de tarefas que será devolvida quando a chamada do método acontecer.
		List<Task> tasks= new ArrayList<Task>();
		
		try {
			
			//Criação da conexão
			connection = ConnectionFactory.getConnection();
			
			//Setando o valor que corresponde ao filtro de busca
			statement = connection.prepareStatement(sql);
			statement.setInt(1, idProject);
			resultSet= statement.executeQuery() ;
			
			//Eqnaunto houverem valores a serem percorridos no meu resultSet
			while (resultSet.next()) {
				Task task = new Task();
				task.setId(resultSet.getInt("id"));
				task.setIdProject(resultSet.getInt("idProject"));
				task.setName(resultSet.getString("name"));
				task.setDescription(resultSet.getString("description"));
				task.setNotes(resultSet.getString("notes"));
				task.setCompleted(resultSet.getBoolean("copletd"));
				task.setDeadline(resultSet.getDate("deadline"));
				task.setCreatedAt(resultSet.getDate("createdAt"));
				task.setUpdateAt(resultSet.getDate("createdAt"));
				
				tasks.add(task);
				
			}
		 }catch(Exception ex){
				throw new RuntimeException("Erro ao inserir a tarefa" +ex.getMessage(),ex);
		}finally {
			ConnectionFactory.closeConnection(connection, statement, resultSet);
		}
		
		//Lista de tarefas de que foi criada e carregada no banco de dados
		return tasks;
	}
	

}
