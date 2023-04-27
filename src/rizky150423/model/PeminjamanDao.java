/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rizky150423.model;

/**
 *
 * @author ASUS
 */
import java.util.List;
public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int index, Peminjaman peminjaman);
    void delete(int index);
    Peminjaman getPeminjaman (int index);
    List<Peminjaman> getAll();
}
