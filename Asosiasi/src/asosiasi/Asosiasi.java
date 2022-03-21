/*
Nama   : Reka Briyan Cahya Heryana
Kelas   : D4-1A Teknik Informatika
Program : Asosiasi

 */
package asosiasi;
import java.util.*;

public class Asosiasi {

       
    public static void main(String[] args) {
        Nama nama1 = new Nama();
        nama1.setNamaOrang("Orang Pertama");
        Nama nama2 = new Nama();
        nama2.setNamaOrang("Orang Kedua");
        
        
        Profesi pr1 = new Profesi();
        pr1.setNamaProfesi("Polisi");
        Profesi pr2 = new Profesi();
        pr2.setNamaProfesi("Programmer");
        
        List<Profesi> empList = new ArrayList<Profesi>();
        empList.add(pr1);
        empList.add(pr2);
        
        nama1.setDaftarProfesi(empList);
        System.out.println(nama1.getNamaOrang() + " memiliki profesi sebagai "
                + pr1.getNamaProfesi());
        nama2.setDaftarProfesi(empList);
        System.out.println(nama2.getNamaOrang() + " memiliki profesi sebagai "
                + pr2.getNamaProfesi());
       
    }
    }
    

