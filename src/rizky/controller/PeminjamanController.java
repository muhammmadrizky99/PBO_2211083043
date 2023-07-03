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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rizky.db.DbHelper;
/**
 *
 * @author ASUS
 */
public class PeminjamanController {
    private FormPeminjaman view;
    private Peminjaman peminjaman;
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    private PeminjamanDao dao;
    private Connection connection;
    
    public PeminjamanController(FormPeminjaman view) {
    try {
        this.view = view;
        connection = DbHelper.getConnection();
        anggotaDao = new AnggotaDaoImpl(connection);
        bukuDao = new BukuDaoImpl(connection);
        dao = new PeminjamanDaoImpl(connection);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}

public void clearForm() {
    
   
        try {
            view.getTxtTglpinjam().setText("");
            view.getTxtTglkembali().setText("");
            
            List<Anggota> listAnggota = anggotaDao.getAll();
            view.getCboAnggota().removeAllItems();
            for (Anggota anggota : listAnggota){
                view.getCboAnggota().addItem(anggota.getKodeanggota());
            } 
            
            List<Buku> listBuku = bukuDao.getAll();
            view.getCboBuku().removeAllItems();
            for (Buku buku : listBuku){
                view.getCboBuku().addItem(buku.getKodebuku());
            }  
            
            
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
}

        
    
    public void tampil(){
        try {
            DefaultTableModel tabelModel = (DefaultTableModel)
                    view.getTabelPeminjaman().getModel();
            tabelModel.setRowCount(0);
            List<Peminjaman> list = dao.getAll();
            for (Peminjaman a : list) {
                Object[] row = {
                    a.getKodeanggota(),
                    a.getKodebuku(),
                    a.getTglpinjam(),
                    a.getTglkembali(),
                };
                tabelModel.addRow(row);
                    
                }
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(view, e);
        }
    }
    
    public void insert() {
    try {
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setKodeanggota(view.getCboAnggota().getSelectedItem().toString());
        peminjaman.setKodebuku(view.getCboBuku().getSelectedItem().toString());
        peminjaman.setTglpinjam(view.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(view.getTxtTglkembali().getText());

        dao.insert(peminjaman);
        JOptionPane.showMessageDialog(view, "Entri Data OK");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(view, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public void update(){
        try {
            String kode = view.getCboAnggota().getSelectedItem().toString();
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(view.getCboAnggota().getSelectedItem().toString());
            peminjaman.setKodebuku(view.getCboBuku().getSelectedItem().toString());
            peminjaman.setTglpinjam(view.getTxtTglpinjam().getText());
            peminjaman.setTglkembali(view.getTxtTglkembali().getText());
            
            dao.update(kode, peminjaman);
            JOptionPane.showMessageDialog(view, "Update Data OK");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(view, e);
        }
    }
    
    public void getPeminjaman(){
        try {
            String kode = view.getTabelPeminjaman().getValueAt(view.getTabelPeminjaman().getSelectedRow(), 0).toString();
            peminjaman = dao.getPeminjaman(kode);
            view.getCboAnggota().setSelectedItem(peminjaman.getKodeanggota());
            view.getCboBuku().setSelectedItem(peminjaman.getKodebuku());          
            view.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            view.getTxtTglkembali().setText(peminjaman.getTglkembali());
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e);
        }
    }
    
    public void delete(){
        try {
            String kode = view.getTabelPeminjaman().getValueAt(view.getTabelPeminjaman().getSelectedRow(), 0).toString();
            dao.delete(kode);
            JOptionPane.showMessageDialog(view, "Berhasil Menghapus data!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e);
        }
    }
}


