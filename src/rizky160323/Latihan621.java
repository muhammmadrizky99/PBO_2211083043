/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky160323;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Latihan621 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number >= 1 && number <= 10) {
            if (number == 1) {
                System.out.println("Satu");
            } else if (number == 2) {
                System.out.println("Dua");
            } else if (number == 3) {
                System.out.println("Tiga");
            } else if (number == 4) {
                System.out.println("Empat");
            } else if (number == 5) {
                System.out.println("Lima");
            } else if (number == 6) {
                System.out.println("Enam");
            } else if (number == 7) {
                System.out.println("Tujuh");
            } else if (number == 8) {
                System.out.println("Delapan");
            } else if (number == 9) {
                System.out.println("Sembilan");
            } else if (number == 10) {
                System.out.println("Sepuluh");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}
