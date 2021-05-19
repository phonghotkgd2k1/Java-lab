/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.sql.*;
    /**
/**
 *
 * @author phong
 */
public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("ba");
        DatabaseConnect dc = new DatabaseConnect("localhost","project1oop","root","");
        
        try {
            
            Connection connection = dc.getConnection();
            
            Statement statement = connection.createStatement();
            
            String sql = "SELECT * FROM employees";
            
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("email"));
            }
            
            
        } catch (SQLException e) {
            System.out.print("aa");
        } finally {
            // close connections,...
        }
        
    }
    
}
