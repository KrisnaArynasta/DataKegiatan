/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dk.controller;

import com.dk.entities.dao.dataDAO;
import com.dk.entities.model.dataModel;
import com.dk.entities.model.kegiatanModel;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class dataController {
   
    private dataDAO dao = new dataDAO();
    
        public boolean insert(dataModel d){
        return dao.insert(d);
    }
        
    public ArrayList<dataModel> getAll(){
        return dao.getAll();
    }
    
    public ArrayList<dataModel> getById(int id){
        return dao.getById(id);
    }
}
