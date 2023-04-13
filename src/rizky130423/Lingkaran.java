/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky130423;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
     private double r;
   
    public Lingkaran(double r){
        this.r = r;  
    }
      public double luas() {
        double luas = 3.14*r*r;
        return luas;
    }
   
    public static void main(String[] args){
        Lingkaran line1 = new Lingkaran(7);
        Lingkaran line2 = new Lingkaran(5);
        Relation  bdg = new MyDouble();
        
        System.out.println(" Line 1 > Line 2: " + bdg.isGreater(line1.luas(),line2.luas()));
        System.out.println(" Line 1 < Line 2: " + bdg.isLess(line1.luas(),line2.luas()));
        System.out.println(" Line 1 = Line 2: " + bdg.isEqual(line1.luas(),line2.luas()));
    }
}