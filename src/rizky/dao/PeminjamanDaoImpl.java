/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky.dao;
import rizky.model.Peminjaman;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
     private Connection connection;
    
    public PeminjamanDaoImpl (Connection connection ){
        this.connection=connection;
    }
    public void insert (Peminjaman peminjaman) throws Exception {
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
        ps.close();
    }  
    public void update (String index, Peminjaman peminjaman)throws Exception{
        String sql = "update peminjaman set kodeanggota = ?, kodebuku = ?, tglpinjam = ?, tglkembali = ? where kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getKodeanggota());
        ps.setString(2, peminjaman.getKodebuku());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.setString(5, index );
        ps.executeUpdate();
        ps.close();
    }
    public  void delete (String index) throws Exception{
        String sql = "delete from peminjaman where kodeanggota = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, index);
        ps.executeUpdate();
        ps.close();
    }
    
    public Peminjaman getPeminjaman(String kodepeminjaman) throws Exception {
        String sql = "Select * FROM peminjaman WHERE kodeanggota =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodepeminjaman);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }
    
    public List<Peminjaman> getAll() throws Exception{
        String sql = "Select * FROM peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman;
        List<Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setKodeanggota(rs.getString(1));
            peminjaman.setKodebuku(rs.getString(2));
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
        
    }
}
