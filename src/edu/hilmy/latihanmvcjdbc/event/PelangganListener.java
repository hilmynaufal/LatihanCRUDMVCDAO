/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hilmy.latihanmvcjdbc.event;

import edu.hilmy.latihanmvcjdbc.entity.Pelanggan;
import edu.hilmy.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * 
 * Nama : M. Hilmy Naufal
 * Kelas : IF2
 * NIM : 10118046
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onUpdate(Pelanggan pelanggan);
    
    public void onDelete();
}
