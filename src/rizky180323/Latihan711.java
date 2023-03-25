/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky180323;

/**
 *
 * @author ASUS
 */
public class Latihan711 {
    public static void main(String[] args) {
        // Inisialisasi array dengan 7 hari dalam seminggu  
            String days[] = {
            "Monday", 
            "Tuesday", 
            "Wednesday", 
            "Thursday", 
            "Friday", 
            "Saturday", 
            "Sunday"};

        // while-loop untuk mencetak nilai array
        System.out.println("Menggunakan while-loop:");
        int i = 0;
        while (i < days.length) {
            System.out.println(days[i]);
            i++;
        }

        // do-while loop untuk mencetak nilai array
        System.out.println("\nMenggunakan do-while loop:");
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);

        // for-loop untuk mencetak nilai array
        System.out.println("\nMenggunakan for-loop:");
        for (int k = 0; k < days.length; k++) {
            System.out.println(days[k]);
        }
    }
}