/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dk.entities.model;

/**
 *
 * @author user
 */
public class kegiatanModel {
   
    private int id;
    private String nama;
    
    public kegiatanModel(int id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
}

    

