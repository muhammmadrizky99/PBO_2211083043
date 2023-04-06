/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rizky010423;

/**
 *
 * @author ASUS
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord anna = new StudentRecord();
        StudentRecord cris = new StudentRecord();
        StudentRecord ali = new StudentRecord();
        
        //isi data
        anna.setName("Anna");
        anna.setAddress("Padang");
        anna.setAge(18);
        anna.setMathGrade(90);
        anna.setEnglishGrade(84);
        anna.setScienceGrade(89);

        cris.setName("Kris");
        cris.setAddress("Bukittinggi");
        cris.setAge(20);
        
        ali.setName("Ali");
        ali.setAddress("Batipuh Selatan");
        ali.setAge(19);
        
        //menampilkan
        System.out.println("Data objek Anna");
        System.out.println("---------------");
        System.out.println("Nama          : " + anna.getName());
        System.out.println("Alamat        : " + anna.getAddress());
        System.out.println("Umur          : " + anna.getAge());
        System.out.println("Math grade    : " + anna.getMathGrade());
        System.out.println("English grade : " + anna.getEnglishGrade());
        System.out.println("Science grade : " + anna.getScienceGrade());
        System.out.println("Math grade    : " + anna.getMathGrade());
        System.out.println("Average       : " +anna.getAverage());
        System.out.println("Nilai huruf   : " +anna.NilaiHuruf());
        
        
        System.out.println();
        
        //memanggil method print
        System.out.println("Data objek cris");
        System.out.println("---------------");
        cris.print("");
        cris.print(70, 80, 90);
        
        System.out.println(); 
        
        System.out.println("Data objek ali");
        System.out.println("--------------");
        ali.print("");
        ali.print(25,68,100);
        
        System.out.println();
        
        //Menampilkan jumlah siswa
        System.out.println("Count         : " +StudentRecord.getStudentCount());
        
    }
}
