/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class koneksi {
    private Connection koneksi;
    
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi berhasil");
        }catch(ClassNotFoundException ex){
            System.out.println("Koneksi gagal");
        }
        
        String url ="jdbc:mysql://localhost:3306/aplikasi_kepegawaian";
        try{
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("Koneksi database berhasil");
        }catch(SQLException ex){
            System.out.println("Koneksi database gagal"+ex);
        }
        return koneksi;
    }
}
