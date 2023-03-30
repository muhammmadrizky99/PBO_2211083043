/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky300323;

import static rizky300323.Aritmatika.prima;

/**
 *
 * @author ASUS
 */
class Aritmatika {

    private static Object prima;

   public static int tambah(int a, int b){
       return a + b;
   }
   
   public static boolean ganjil(int a){
       if (a % 2 != 0){
           return true;
       }
       else{
           return false;
       }
   }
   public static int[] ambilganjil(int a){
       int[] ganjil = new int[a];
       int bilangan = 1;
       for (int i = 0; i < a; i++){
           ganjil[i] = bilangan;
           bilangan += 2;     
       }
       return ganjil;
   }
   public static boolean prima(int a){
       if (a <= 1){
           return false;
       }
       for (int i = 2; i <= Math.sqrt(a); i++){
           if (a % i == 0){
               return false;
           }
       }
       return true;
   }
   public static int[] ambilprima(int a){
       int[] prima = new int[a];
       int bilangan = 2;
       int jumlahPrima = 0;
       while (jumlahPrima < a){
           if (prima(bilangan)){
               prima[jumlahPrima] = bilangan;
               jumlahPrima++;
           }
           bilangan++;
       }
       return prima;
   }
}
 