/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky180323;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Latihan722 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int max = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            String input = JOptionPane.showInputDialog(null, "Masukkan angka ke-" + (i+1) + ":");
            
            try {
                int number = Integer.parseInt(input);
                numbers[i] = number;
                
                if (number > max) {
                    max = number;
                }
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input yang dimasukkan bukan bilangan bulat!");
                i--; // ulang kembali perulangan
            }
        }
        
        JOptionPane.showMessageDialog(null, "Angka terbesar yang kamu inputkan : " + max);
    }
}
