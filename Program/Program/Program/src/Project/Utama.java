/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** 
 *
 * @author HP
 */
public class Utama {
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/datadosen";
            String user = "root";
            String pass = "";
            
            MySQLConfig = DriverManager.getConnection(url,user,pass);        
        }catch(SQLException e){
            System.out.println("Koneksi ke Database gagal" + e.getMessage());
        }
        return MySQLConfig;
    }
    public static void main(String[]args){
        new formlogin().setVisible(true);
    }
}