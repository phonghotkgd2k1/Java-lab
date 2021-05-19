/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.*;
import java.util.Properties;
/**
 *
 * @author KhanhKyo
 */
public class DatabaseConnect {
    private final String url;
    private final Properties properties;

    public DatabaseConnect(String host, String databaseName, String username, String password) {
        this.url = "jdbc:mysql://" + host + "/" + databaseName;
        
        this.properties = new Properties();
        properties.setProperty("user", username);
        properties.setProperty("password", password);
    }
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.properties);
    }
    
    
}
