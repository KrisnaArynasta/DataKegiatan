/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dk.controller;

/**
 *
 * @author user
 */

import com.dk.entities.dao.kegiatanDAO;
import com.dk.entities.model.kegiatanModel;
import java.util.ArrayList;


public class kegiatanController {
    
    private kegiatanDAO dao = new kegiatanDAO();
    
       public boolean insert(kegiatanModel k){
        return dao.insert(k);    
    }
       
    public ArrayList<kegiatanModel> getAll(){
        return dao.getAll();
    } 
    
    public kegiatanModel getByNama(String nama){
        return dao.getByNama(nama);
    }
    
     public kegiatanModel getById(int id){
        return dao.getById(id);
    }
}
