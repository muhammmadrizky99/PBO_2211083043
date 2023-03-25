/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky180323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author ASUS
 */
public class Latihan721 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];
        int max = 0;
        
        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Masukkan angka ke-" + (i+1) + ": ");
                numbers[i] = Integer.parseInt(br.readLine());
                
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            
            System.out.println("Angka terbesar yang kamu masukkan adalah " + max);
            
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam membaca input!");
        } catch (NumberFormatException e) {
            System.out.println("Input yang dimasukkan bukan bilangan bulat!");
        }
    }
}

