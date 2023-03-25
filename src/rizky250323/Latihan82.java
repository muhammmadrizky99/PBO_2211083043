/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky250323;

/**
 *
 * @author ASUS
 */
public class Latihan82 {
    public static void main(String[] args) {
        // Memeriksa jumlah argumen yang benar telah diberikan
        if (args.length != 2) {
            System.out.println("Usage: java MathOperations <number1> <number2>");
            return;
        }
        
        // Mengonversi argumen ke tipe data numerik
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        
        // Melakukan operasi matematika sederhana
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        
        // Mencetak hasilnya ke layar
        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
    }
}

