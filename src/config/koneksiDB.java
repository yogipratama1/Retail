/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author YOGI
 */

public class koneksiDB {
    static Connection con;
    
    public static Connection getConnection(){
        
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_kasir","root","");
//            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
        
    }
//  public static void main(String[]args){
//      Statement st;
//    java.sql.Connection con = koneksiDB.getConnection();
//      System.out.println(con);
//  }
    
}
