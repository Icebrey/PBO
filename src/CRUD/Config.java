/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager; //DriverManager mencoba untuk memilih driver yang sesuai dari set driver JDBC yang terdaftar
import java.sql.SQLException;
/**
 *
 * @author reisy
 */
public class Config {
    private static Connection MySQLConfig;
    
    public static Connection  configDB()throws SQLException{
        try{
         String url  = "jdbc:mysql://localhost:3306/perpustakaan";
         String user = "root";
         String pss  = "";
         
         DriverManager.registerDriver(new com.mysql.jdbc.Driver());
         MySQLConfig = DriverManager.getConnection(url,user,pss);
        }catch(SQLException e){
         System .out.println("Koneksi ke Databse Gagal" + e.getMessage());
        }
        return MySQLConfig;
    }
}
