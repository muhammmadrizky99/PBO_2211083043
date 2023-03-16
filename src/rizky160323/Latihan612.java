/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky160323;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Latihan612 {
    public static void main( String[] args ){
        
        String nilai1String = JOptionPane.showInputDialog("Masukkan nilai ujian 1: ");
        int nilai1 = Integer.parseInt(nilai1String);

        String nilai2String = JOptionPane.showInputDialog("Masukkan nilai ujian 2: ");
        int nilai2 = Integer.parseInt(nilai2String);

        String nilai3String = JOptionPane.showInputDialog("Masukkan nilai ujian 3: ");
        int nilai3 = Integer.parseInt(nilai3String);

        double rataRata = (double)(nilai1 + nilai2 + nilai3) / 3;
        JOptionPane.showMessageDialog(null, "Rata-rata nilai ujian: " + rataRata);

        if (rataRata >= 60) {
            JOptionPane.showMessageDialog(null, ":)");
        } else {
            JOptionPane.showMessageDialog(null, ":(");
        }
    }
}
