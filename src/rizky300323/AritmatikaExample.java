/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky300323;

/**
 *
 * @author ASUS
 */
import rizky300323.Aritmatika;
import static rizky300323.Aritmatika.ambilprima;
public class AritmatikaExample {
     
     public static void main(String[] args) {
         
         int tambah1 = Aritmatika.tambah(1,4);
         boolean ganjil = Aritmatika.ganjil(tambah1);
         System.out.println("Hasil penjumlahan = " +tambah1);
         System.out.println("Ganjil kah ? "+ganjil);   
         
         int[] ambilganjil = Aritmatika.ambilganjil(tambah1);
         System.out.print("Bilangan ganjil : ");
         for ( int i = 0; i < ambilganjil.length; i++){
             int bilanganganjil = ambilganjil[i];
             System.out.print(bilanganganjil + " ");
         }
         System.out.println();
         int[] bilanganPrima = ambilprima(5); // Ambil 10 bilangan prima
       System.out.print("Bilangan prima : ");
       for (int i = 0; i < bilanganPrima.length; i++){
           System.out.print(bilanganPrima[i] + " ");
       }
   }
}
