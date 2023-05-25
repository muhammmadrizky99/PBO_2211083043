/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_B.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class PegawaiDaoImpl implements PegawaiDao {
    List<Pegawai> data = new ArrayList<>();
    
    public PegawaiDaoImpl(){
        data.add(new Pegawai("Jagung", "20-03-2023", "120000", calculateDiscount(150000)));
        
    }


    public void save(Pegawai pegawai) {
       data.add(pegawai);
    }

    
    public void update(int index, Pegawai pegawai) {
       data.set(index, pegawai);
    }

    
    public void delete(int index) {
        data.remove(index);
    }

    
    public Pegawai getPegawai(int index) {
      return data.get(index);
    }

    
    public List<Pegawai> getAllPegawai() {
        return data;
    }

    @Override
    public List<Pegawai> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


