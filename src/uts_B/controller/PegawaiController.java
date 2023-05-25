/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_B.controller;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uts_B.model.Pegawai;
import uts_B.model.PegawaiDao;
import uts_B.model.PegawaiDaoImpl;
import uts_B.view.FormPegawai;
/**
 *
 * @author ASUS
 */
public class PegawaiController {
    private FormPegawai formPegawai;
    private Pegawai pegawai;
    private PegawaiDao pegawaiDao;
    
    public PegawaiController(FormPegawai formPegawai){
        this.formPegawai = formPegawai;
        pegawaiDao = new PegawaiDaoImpl();
    }
    public void bersihForm(){
        formPegawai.getTxtNip().setText("");
        formPegawai.getTxtNama().setText("");
        formPegawai.getTxtAlamat().setText("");
        formPegawai.getTxtGolongan().setText("");
        formPegawai.getTxtTanggal().setText("");
        formPegawai.getTxtGajipokok().setText("");
        formPegawai.getTxtTunjangananak().setText("");
        formPegawai.getTxtTunjanganistri().setText("");
       
    }
   public void savePesanan() {
    pegawai = new Pegawai();
    pegawai.setNip(formPegawai.getTxtNip().getText());
    pegawai.setNama(formPegawai.getTxtNama().getText());
    pegawai.setAlamat(formPegawai.getTxtAlamat().getText());
    pegawai.setGolongan(formPegawai.getTxtGolongan().getText());
    pegawai.setTanggal(formPegawai.getTxtTanggal().getText());
    pegawai.setGajipokok(formPegawai.getTxtGajipokok().getText());
    pegawai.setTunjangananak(formPegawai.getTxtTunjangananak().getText());
    pegawai.setTunjanganistri(formPegawai.getTxtTunjanganistri().getText());

    // Menghitung total belanja
    
    double total = harga + ongkosKirim;

    // Mengecek apakah total belanja melebihi 100.000
    if (total > 100000) {
        // Menghitung diskon sebesar 2%
        
        pesanan.setDiskon("2%");
    } else {
        pesanan.setDiskon("0%"); // Tidak ada diskon
    }

    pesananDao.save(pesanan);
    JOptionPane.showMessageDialog(formPesanan, "Insert Ok");
}

    public void updatePesanan(){
        int index = formPesanan.getTblPesanan().getSelectedRow();
        pesanan = new Pesanan();
        pesanan.setKodePesanan(formPesanan.getTxtKodePesanan().getText());
        pesanan.setNamaPesanan(formPesanan.getTxtNamaPesanan().getText());
        pesanan.setTglPesan(formPesanan.getTxtTglPesan().getText());
        pesanan.setHarga(formPesanan.getTxtHarga().getText());
        pesanan.setOngkosKirim(formPesanan.getTxtOngkosKirim().getText());
        
            // Menghitung total belanja
        double harga = Double.parseDouble(formPesanan.getTxtHarga().getText());
        double ongkosKirim = Double.parseDouble(formPesanan.getTxtOngkosKirim().getText());
        double total = harga + ongkosKirim;

            // Mengecek apakah total belanja melebihi 100.000
        if (total > 100000) {
            // Menghitung diskon sebesar 2%
                pesanan.setDiskon("2%");
            } else {
                 pesanan.setDiskon("0%"); // Tidak ada diskon
         }
        pesananDao.update(index,pesanan);
        JOptionPane.showMessageDialog(formPesanan, "Update Ok");
    }
    public void getPesanan(){
         int index = formPesanan.getTblPesanan().getSelectedRow();
        pesanan = pesananDao.getPesanan(index);
        if(pesanan != null){
            formPesanan.getTxtKodePesanan().setText(pesanan.getKodePesanan());
            formPesanan.getTxtNamaPesanan().setText(pesanan.getNamaPesanan());
            formPesanan.getTxtTglPesan().setText(pesanan.getTglPesan());
            formPesanan.getTxtHarga().setText(pesanan.getHarga());
            formPesanan.getTxtOngkosKirim().setText(pesanan.getOngkosKirim());
            formPesanan.getTxtDiskon().setText(pesanan.getDiskon());
        }
    }
    public void delete(){
         int index = formPesanan.getTblPesanan().getSelectedRow();
         pesananDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPesanan,"Delete Ok");
    }
    public void tampil(){
        DefaultTableModel tabelModel = 
                (DefaultTableModel) formPesanan.getTblPesanan().getModel();
        tabelModel.setRowCount(0);
        List<Pesanan> list = pesananDao.getAllPesanan();
        for(Pesanan pesanan1 : list){
            Object row[] = {
               pesanan1.getKodePesanan(),
               pesanan1.getNamaPesanan(),
               pesanan1.getTglPesan(),
               pesanan1.getHarga(),
               pesanan1.getOngkosKirim(),
               pesanan1.getDiskon(),
            };
            tabelModel.addRow(row);
        }
    }
}

}
