/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky080423;

/**
 *
 * @author ASUS
 */
public class Square extends Shape {
    private double side;
    
    public Square (double side){
        this.side = side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public String getName(){
        return "Persegi";
    }
    
    public double getSide(){
        return side;
    }
    
    
    //Menampilkan
    
    public static void main (String[] args){
        Circle lingkaran = new Circle(5);
        System.out.println("Luas " +lingkaran.getName()+ " dengan jari-jari " +lingkaran.getRadius()+ " adalah   : " +lingkaran.getArea());
        
        Square persegi = new Square(4);
        System.out.println("Luas " +persegi.getName()+ " dengan sisi " +persegi.getSide()+ " adalah          : " +persegi.getArea());
    }
    
}
