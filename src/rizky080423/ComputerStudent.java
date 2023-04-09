/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky080423;

/**
 *
 * @author ASUS
 */
import rizky010423.StudentRecord;
public class ComputerStudent extends StudentRecord{
    
    private double compGrade;
    private char letterGrade;
    public ComputerStudent(){
        super("Ali","Padang");
        System.out.println("Inside ComputerStudent Constructor");
    }
    
    public double getCompGrade(){
        return compGrade;
    }
    
    public void setCompGrade(double cGrade){
        this.compGrade = cGrade;
    }
    
    @Override
    public double getAverage(){
        return(getMathGrade() + getEnglishGrade() + getScienceGrade() + getCompGrade())/4;
    }


    //pemangggilan
    public static void main (String[] args){
        ComputerStudent siky = new ComputerStudent();
        siky.setName("Budi");
        siky.setCompGrade(80);
        siky.setEnglishGrade(86);
        siky.setMathGrade(90);
        siky.setScienceGrade(89);
        System.out.println("Nama         :   "+siky.getName());
        System.out.println("Rata-rata    :   "+siky.getAverage());
        System.out.println("Nilai        :   "+siky.NilaiHuruf());
    }
}