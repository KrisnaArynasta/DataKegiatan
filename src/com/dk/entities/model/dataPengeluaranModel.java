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
public class dataPengeluaranModel extends dataModel {
    
        public dataPengeluaranModel(
            int id, 
            kegiatanModel id_kegiatan, 
            String data, 
            String jenis, 
            int jumlah, String tgl) 
    {
        super(id, id_kegiatan, data, jenis, jumlah, tgl);
    }
    
    @Override
        public void setJenis(String jenis){
        this.jenis="Pengeluaran";
    }  
    
}
