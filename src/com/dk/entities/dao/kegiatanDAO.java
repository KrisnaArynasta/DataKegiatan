/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dk.entities.dao;

/**
 *
 * @author user
 */

import com.dk.entities.model.kegiatanModel;
import com.dk.database.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class kegiatanDAO {
    
    
        public boolean insert(kegiatanModel k){
        try {
            String sql = "insert into tbl_kegiatan values(?,?)";
            PreparedStatement p = com.dk.database.koneksi.getkoneksi().prepareStatement(sql);
            
            p.setInt(1, k.getId());
            p.setString(2, k.getNama());
            
            p.executeUpdate();
            
            p.close();
            
            return true;
        } catch(SQLException e) {
            return false;
        }
    }
        
    public ArrayList<kegiatanModel> getAll(){
        ArrayList<kegiatanModel> data = new ArrayList<>();
        kegiatanModel kategori = null;
        try{
            Statement s = com.dk.database.koneksi.getkoneksi().createStatement();
            
            String sql = "SELECT * FROM tbl_kegiatan";
            
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                kategori = new kegiatanModel(r.getInt(1), r.getString(2));
                data.add(kategori);
            }
        }catch(SQLException e){
            System.out.println("ERROR");
        } finally {
            return data;
        }
    }   

    public kegiatanModel getByNama(String nama){
        kegiatanModel kegiatan = null;
        try{
            Statement s = com.dk.database.koneksi.getkoneksi().createStatement();
            
            String sql = "SELECT * FROM tbl_kegiatan WHERE nm_kegiatan = '"+ nama+"'";
            
            ResultSet r = s.executeQuery(sql);
            
            if(r.next()){
                kegiatan = new kegiatanModel(r.getInt(1), r.getString(2));
            }
            
        }catch(SQLException e){
            System.out.println("ERRORR");
        } finally {
            return kegiatan;
        }
    }

    public kegiatanModel getById(int id){
        kegiatanModel kegiatan = null;
        try{
            Statement s = com.dk.database.koneksi.getkoneksi().createStatement();
            
            String sql = "SELECT * FROM tbl_kegiatan WHERE id_kegiatan = '"+ id+"'";
            
            ResultSet r = s.executeQuery(sql);
            
            if(r.next()){
                kegiatan = new kegiatanModel(r.getInt(1), r.getString(2));
            }
            
        }catch(SQLException e){
            System.out.println("ERRORR");
        } finally {
            return kegiatan;
        }
    }
    
    
}

