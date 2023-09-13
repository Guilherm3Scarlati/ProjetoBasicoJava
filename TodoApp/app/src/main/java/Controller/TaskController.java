
package Controller;

import Model.Task;
import java.sql.PreparedStatement;
import java.util.List;
import Util.Conection_Factory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

public class TaskController {
    
    public void save(Task task){
        String sql = "INSERT INTO tasks (IDPROJECTS, NAME, DESCRIPTION, "
                + "COMPLETED, NOTES, DEADLINE, CREATED_AT, UPDATED_AT) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection con = null;
        PreparedStatement statement = null;
        
        try {
            con = Conection_Factory.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, task.getId_project());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isIs_completed());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new Date(task.getDeadline().getTime()));
            statement.setDate(7, new Date(task.getCreated_at().getTime()));
            statement.setDate(8, new Date(task.getUpdated_at().getTime()));
            statement.execute();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a tarefa!" +
                    e.getMessage(), e);
        } finally {
            Conection_Factory.CloseConnection(con, statement);
            
        }
    }
        
    
    
    public void update(Task task){
        String sql = "UPDATE tasks SET IDPROJECT = ?, "
                + "NAME = ?, DESCRIPTION = ?, NOTES = ?, "
                + "DEADLINE = ?, COMPLETED = ?, CREATED_AT = ?, "
                + "UPDATED_AT = ? WHERE ID = ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        
        try {
            con = Conection_Factory.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, task.getId_project());
            statement.setString(1, task.getName());
            statement.setString(1, task.getDescription());
            statement.setBoolean(1, task.isIs_completed());
            statement.setString(1, task.getNotes());
            statement.setDate(1, new Date(task.getDeadline().getTime()));
            statement.setDate(1, new Date(task.getCreated_at().getTime()));
            statement.setDate(1, new Date(task.getUpdated_at().getTime()));
            statement.execute();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a tarefa!" 
                    + e.getMessage(), e);
        } finally {
            Conection_Factory.CloseConnection(con, statement);
        }
    }
    
    public void delete_by_id(int task_id) throws SQLException{
        String sql = "DELETE FROM tasks WHERE ID = ?";
        
        Connection con = null;
        PreparedStatement statement = null;
        
        try {
            con = Conection_Factory.getConnection();
            statement = con.prepareStatement(sql);
            statement.setInt(1, task_id);
            statement.execute();
            
        } catch (Exception e) {
            throw  new RuntimeException("Erro ao deletar a tarefa");
        } finally {
            Conection_Factory.CloseConnection(con, statement);
        }
    }
    
    public List<Task> get_all(int id_project){
        return null;
    }
}
