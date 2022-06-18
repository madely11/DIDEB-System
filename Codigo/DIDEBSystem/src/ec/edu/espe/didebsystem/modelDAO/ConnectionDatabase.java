/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.didebsystem.modelDAO;
import java.sql.*;


/**
 *
 * @author madel
 */
public class ConnectionDatabase {
    private static ConnectionDatabase instance;
    
    private final String host = "uyu7j8yohcwo35j3.cbetxkdyhwsb.us-east-1.rds.amazonaws.com";
    private final String username = "iu3thdede1e6xoy7";
    private final String password = "pvhwl7f85bdv0rzl";
    private final String port = "3306";
    private final String database = "a61d5ju0iboxmqu7";
    private final String conn = "jdbc:mariadb://"+host+":"+port+"/"+database+"?user="+username+"&password="+password;
    private Connection conBD;    
    
    public static ConnectionDatabase getInstance(){
        if(instance == null) instance = new ConnectionDatabase();
        return instance;
    }
    
    private ConnectionDatabase(){
        
    }
   
    public Connection getConnection(){
        //cargar el jdbc
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conBD = (Connection) DriverManager.getConnection(conn);
        } catch (ClassNotFoundException error) {
            System.out.println("Error al cargar el driver JDBC de MySQL: " + error.getMessage());
        } catch (SQLException error) {
            System.out.println("Error al conectar con el servidor MySQL/MariaDB: " + error.getMessage());
        }
        return conBD;
    }
}
