/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky080423;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI*radius*radius;   
    }
    
    @Override
    public String getName(){
        return "Lingkaran";
    }
    
    public double getRadius(){
        return radius;
    }
    
}
