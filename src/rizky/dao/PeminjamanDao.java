/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rizky.dao;
import java.util.List;
import rizky.model.Peminjaman;
/**
 *
 * @author ASUS
 */
public interface PeminjamanDao {
    void insert (Peminjaman peminjaman) throws Exception;
    void update (String index, Peminjaman peminjaman)throws Exception;
    void delete (String index) throws Exception;
    Peminjaman getPeminjaman(String kode) throws Exception;
    List<Peminjaman> getAll() throws Exception;
}
