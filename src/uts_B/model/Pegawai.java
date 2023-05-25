/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_B.model;

/**
 *
 * @author ASUS
 */
public class Pegawai {
   
    private String nip;
    private String nama;
    private String alamat;
    
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNip() {
        return nip;
    }
    public void setNip(String nip) {
        this.nip = nip;
    }
    public String getNama(String nama){
        return nama;
    }
     public void setNama(String nama) {
        this.nama = nama;
     }
    public String getAlamat() {
        return alamat;
    }
     public void setAlamat(String alamat) {
        this.alamat = alamat;
     }
}

class Gaji {
    private Pegawai pegawai;
    private String golongan;
    private String tanggal;
    private double gajipokok;
    private double tunjanganistri;
    private double tunjangananak;
    
    public Gaji(Pegawai pegawai, String golongan, String tanggal) {
        this.pegawai = pegawai;
        this.golongan = golongan;
        this.tanggal = tanggal;
        this.gajipokok = hitungGajiPokok(golongan);
        this.tunjanganistri = hitungTunjanganIstri();
        this.tunjangananak = hitungTunjanganAnak();
    }
    
    private double hitungGajiPokok(String golongan) {
        if (golongan.equals("IIIA")) {
            return 1000000;
        } else if (golongan.equals("IIIB")) {
            return 2000000;
        } else if (golongan.equals("IIIC")) {
            return 3000000;
        } else {
            return 0;
        }
    }
    
    private double hitungTunjanganIstri() {
        return 0.05 * gajipokok;
    }
    
    private double hitungTunjanganAnak() {
        return 0.05 * gajipokok;
    }
    
    public double hitungGajiBersih() {
        return gajipokok + tunjanganistri + tunjangananak;
    }
    
    public Pegawai getPegawai() {
        return pegawai;
    }
    
    public String getGolongan() {
        return golongan;
    }
    
    public String getTanggal() {
        return tanggal;
    }
    
    public double getGajipokok() {
        return gajipokok;
    }
    
    public double getTunjanganistri() {
        return tunjanganistri;
    }
    
    public double getTunjangananak() {
        return tunjangananak;
    }
}

