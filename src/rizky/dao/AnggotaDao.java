/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky.dao;
import java.util.List;
import rizky.model.Anggota;


/**
 *
 * @author ASUS
 */
public interface AnggotaDao {
    void insert (Anggota anggota) throws Exception;
    void update (String index, Anggota anggota)throws Exception;
    void delete (String index) throws Exception;
    Anggota getAnggota(String kode) throws Exception;
    List<Anggota> getAll() throws Exception;
}
