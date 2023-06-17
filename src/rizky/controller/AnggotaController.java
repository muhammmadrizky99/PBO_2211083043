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
public class AnggotaController {
    FormAnggota view;
    Anggota anggota;
    AnggotaDao dao;
    Connection connection;
    
    public AnggotaController(FormAnggota view){
        try {
            this.view = view;
            connection = DbHelper.getConnection();
            dao = new AnggotaDaoImpl(connection);
        } catch (Exception ex) {
        }
    }
    
    public void clearForm(){
        view.getTxtKodeAnggota().setText("");
        view.getTxtNamaAnggota().setText("");
        view.getTxtAlamat().setText("");
        view.getCboJenisKelamin().removeAllItems();
        view.getCboJenisKelamin().addItem("L");
        view.getCboJenisKelamin().addItem("P");
    }
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel)
                    view.getTabelAnggota().getModel();
            tabelModel.setRowCount(0);
            List<Anggota> list = dao.getAll();
            for (Anggota a : list) {
                Object[] row = {
                    a.getKodeanggota(),
                    a.getNamaanggota(),
                    a.getAlamat(),
                    a.getJeniskelamin(),
                };
                tabelModel.addRow(row);
                    
                }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(view, e);
        }
    }
    
    public void insert(){
        try {
            anggota = new Anggota();
            anggota.setKodeanggota(view.getTxtKodeAnggota().getText());
            anggota.setNamaanggota(view.getTxtNamaAnggota().getText());
            anggota.setAlamat(view.getTxtAlamat().getText());
            anggota.setJeniskelamin(view.getCboJenisKelamin().getSelectedItem().toString());
            dao.insert(anggota);
            JOptionPane.showMessageDialog(view, "Entri Data OK");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
            
        }
        
    }
    
    public void update(){
        try {
            String kode = view.getTxtKodeAnggota().getText();
            anggota = new Anggota();
            anggota.setKodeanggota(view.getTxtKodeAnggota().getText());
            anggota.setNamaanggota(view.getTxtNamaAnggota().getText());
            anggota.setAlamat(view.getTxtAlamat().getText());
            anggota.setJeniskelamin(view.getCboJenisKelamin().getSelectedItem().toString());
            dao.update(kode, anggota);
            JOptionPane.showMessageDialog(view, "Update Data OK");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(view, e);
        }
    }
    
    public void getAnggota(){
        try {
            String kode = view.getTabelAnggota().getValueAt(view.getTabelAnggota().getSelectedRow(), 0).toString();
            anggota = dao.getAnggota(kode);
            view.getTxtKodeAnggota().setText(anggota.getKodeanggota());
            view.getTxtNamaAnggota().setText(anggota.getNamaanggota());
            view.getTxtAlamat().setText(anggota.getAlamat());
            view.getCboJenisKelamin().setSelectedItem(anggota.getJeniskelamin());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e);
        }
    }
    
    public void delete(){
        try {
            String kode = view.getTabelAnggota().getValueAt(view.getTabelAnggota().getSelectedRow(), 0).toString();
            dao.delete(kode);
            JOptionPane.showMessageDialog(view, "Berhasil Menghapus data!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e);
        }
    }
}
