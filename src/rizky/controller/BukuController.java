/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky.controller;

import rizky.model.*;
import rizky.dao.*;
import rizky.view.*;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rizky.db.DbHelper;
/**
 *
 * @author ASUS
 */
public class BukuController {
    
    FormBuku view;
    Connection cn;
    Buku bu;
    BukuDao dao;

    public BukuController(FormBuku view){
        try {
            this.view = view;
            cn = DbHelper.getConnection();
            dao = new BukuDaoImpl(cn);
        } catch (Exception ex) {
        }
        
    }
    
    public void clearForm(){
        view.getTxtKodeBuku().setText("");
        view.getTxtJudulBuku().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
    }
    
     public void tampil(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel)
                    view.getTabelBuku().getModel();
            tabelModel.setRowCount(0);
            List<Buku> list = dao.getAll();
            for (Buku b : list) {
                Object[] row = {
                    b.getKodebuku(),
                    b.getJudulbuku(),
                    b.getPengarang(),
                    b.getPenerbit(),
                };
                tabelModel.addRow(row);
                    
                }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(view, e);
        }
    }
    public void insert(){
        try {
            bu = new Buku();
            bu.setKodebuku(view.getTxtKodeBuku().getText());
            bu.setJudulbuku(view.getTxtJudulBuku().getText());
            bu.setPengarang(view.getTxtPengarang().getText());
            bu.setPenerbit(view.getTxtPenerbit().getText());
            dao.insert(bu);
            JOptionPane.showMessageDialog(view, "Entri Data OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
            
        }
        
    }
    
    public void update() {
    try {
        Buku bu = new Buku();
        bu.setKodebuku(view.getTxtKodeBuku().getText());
        bu.setJudulbuku(view.getTxtJudulBuku().getText());
        bu.setPengarang(view.getTxtPengarang().getText());
        bu.setPenerbit(view.getTxtPenerbit().getText());
        dao.update(bu);
        JOptionPane.showMessageDialog(view, "Update Data OK");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(view, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public void delete(){
        try {
           
            dao.delete(bu);
            JOptionPane.showMessageDialog(view, "Delete Data OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e);
        }
    }

    
     public void getBuku(){
        try {
            String kode = view.getTabelBuku().getValueAt(view.getTabelBuku().getSelectedRow(), 0).toString();
            bu = dao.getBuku(kode);
            view.getTxtKodeBuku().setText(bu.getKodebuku());
            view.getTxtJudulBuku().setText(bu.getJudulbuku());
            view.getTxtPengarang().setText(bu.getPengarang());
            view.getTxtPenerbit().setText(bu.getPenerbit());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e);
        }
     }
}

