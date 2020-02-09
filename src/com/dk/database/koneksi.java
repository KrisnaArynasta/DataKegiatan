/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dk.database;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi;
    
    public static Connection getkoneksi(){
        if(koneksi==null){
            try{
                String url = "jdbc:mysql://localhost:3306/db_data_kegiatan";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
            }
            catch(SQLException e){
                System.out.println("ERROR KONEKSI");
            }
        }
        return koneksi;
    }
}
