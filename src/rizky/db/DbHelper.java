/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky.db;
import java.sql.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import rizky.dao.*;
import rizky.model.*;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class DbHelper {
        
    private static Connection cn;

    public static Connection getConnection() throws SQLException {
        if (cn == null) {
            String databaseURL = "jdbc:mysql://localhost/pbo_2211083043";
            String username = "root";
            String password = "";
            cn = DriverManager.getConnection(databaseURL, username, password);
            System.out.println("berhasil");
        }
        return cn;
    }
}
//    public static void main(String[] args){
//        try {
//            connection = DbHelper.getConnection();
//            AnggotaDao dao = new AnggotaDaoImpl(connection);
//            Anggota anggota = new Anggota("A001", "Ali", "Padang", "L");
//            dao.insert(anggota);
//            JOptionPane.showMessageDialog(null, "Entri data Ok");
//        } catch(Exception ex){
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
//    }

