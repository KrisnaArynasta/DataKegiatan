/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dk.entities.dao;

import com.dk.entities.model.dataModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class dataDAO {
 
       private kegiatanDAO dao = new kegiatanDAO();
       
        public boolean insert(dataModel d){
        try {
            String sql = "INSERT INTO tbl_data_keuangan VALUES(?,?,?,?,?,?)";
            PreparedStatement p = com.dk.database.koneksi.getkoneksi().prepareStatement(sql);
            
            p.setInt(1, d.getId());
            p.setInt(2, d.getId_kegiatan().getId());            
            p.setString(3, d.getData());
            p.setString(4, d.getJenis());
            p.setInt(5, d.getJumlah());
            p.setString(6, d.getTgl());
            
            p.executeUpdate();
            
            p.close();
            
            return true;
        } catch(SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
     public ArrayList<dataModel> getAll(){
        ArrayList<dataModel> data = new ArrayList<>();
        dataModel Mdata = null;
        try{
            Connection c = com.dk.database.koneksi.getkoneksi();
            Statement s= c.createStatement();
            String sql = "select * from tbl_data_keuangan";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                Mdata = new dataModel(
                        r.getInt(1),
                        dao.getById(r.getInt(2)),  
                        r.getString(3),
                        r.getString(4),
                        r.getInt(5),
                        r.getString(6)
                        
                );
                data.add(Mdata);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            return data;
        }
    }
     
    public ArrayList<dataModel> getById(int id){
        ArrayList<dataModel> data = new ArrayList<>();
        dataModel Mdata = null;
        try{
            Connection c = com.dk.database.koneksi.getkoneksi();
            Statement s= c.createStatement();
            String sql = "select * from tbl_data_keuangan where id_kegiatan = '"+ id+"'";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                Mdata = new dataModel(
                        r.getInt(1),
                        dao.getById(r.getInt(2)),  
                        r.getString(3),
                        r.getString(4),
                        r.getInt(5),
                        r.getString(6)
                        
                );
                data.add(Mdata);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            return data;
        }
    }
   
}
