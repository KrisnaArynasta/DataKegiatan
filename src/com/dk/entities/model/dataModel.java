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
public class dataModel {

    
    protected int id;
    protected kegiatanModel id_kegiatan;
    protected String data;
    protected String jenis;
    protected int jumlah;
    protected String tgl;
    
    public dataModel(int id, kegiatanModel id_kegiatan, String data, String jenis, int jumlah, String tgl){
        this.id = id;
        this.id_kegiatan = id_kegiatan;
        this.data  = data;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.tgl = tgl;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId_kegiatan(kegiatanModel id_kegiatan){
        this.id_kegiatan=id_kegiatan;
    }
    
    public kegiatanModel getId_kegiatan(){
        return id_kegiatan;
    }
    
    public void setData (String data){
        this.data=data;
    }
    
    public String getData(){
        return data;
    }
    
    public void setJenis(String jenis){
        this.jenis=jenis;
    }
    
    public String getJenis(){
        return jenis;
    }

    public void setJumlah(int jumlah){
        this.jumlah=jumlah;
    }
    
    public int getJumlah(){
        return jumlah;
    }    

    public void setTgl(String tgl){
        this.tgl=tgl;
    }
    
    public String getTgl(){
        return tgl;
    }    

}
