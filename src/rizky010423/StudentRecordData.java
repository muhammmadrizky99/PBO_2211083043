/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky010423;

/**
 *
 * @author ASUS
 */
public class StudentRecordData {
    public static void main(String[] args){
        StudentRecord dataSiswa[] = new StudentRecord[100];
        StudentRecord d1 = new StudentRecord();
        d1.setName("Ani");
        d1.setAddress("Padang");
        d1.setAge(20);
        dataSiswa[0] = d1;
        
        System.out.println("Nama    [0]"+ dataSiswa[0].getName());
        
        dataSiswa[0].setName("");
        dataSiswa[0].setAddress("");
        dataSiswa[0].setAge(0);
        
        
    }
}