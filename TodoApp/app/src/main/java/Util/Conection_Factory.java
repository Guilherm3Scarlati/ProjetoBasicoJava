
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Conection_Factory {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp";
    public static final String USER = "root";
    public static final String PASS = "";

    public static Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch(Exception ex){
            throw new RuntimeException("Erro na conexão com o banco de dados", ex);
        }
    }
    
    public static void CloseConnection(Connection connection){
        try{
            if(connection != null){
                connection.close();
            }
        } catch (Exception ex){
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }
    
    public static void CloseConnection(Connection connection, PreparedStatement statement){
        try{
            if(connection != null){
                connection.close();
            }
            
            if(statement != null){
                statement.close();
            }
        } catch (Exception ex){
            throw new RuntimeException("Erro ao fechar a conexão com o banco de dados", ex);
        }
    }
}
