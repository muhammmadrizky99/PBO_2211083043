/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky080423;

/**
 *
 * @author ASUS
 */
public class Manusia extends LivingThing {
    
    @Override
    public void berjalan(){
        System.out.println("Berjalan manusia");
        
    }
    public static void main(String[] args){
        Manusia m = new Manusia();
        m.bernafas();
        m.makan();
        m.berjalan();
    }
}
