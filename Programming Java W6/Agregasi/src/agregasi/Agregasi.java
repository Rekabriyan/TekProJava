package agregasi;

import java.util.ArrayList;
import java.util.List;

public class Agregasi {

    public static void main(String[] args) {
        Siswa s1 = new Siswa("Siswa 1", "10 SMA");
        Siswa s2 = new Siswa("Siswa 2", "11 SMA");
        Siswa s3 = new Siswa("Siswa 3", "10 SMA");
        Siswa s4 = new Siswa("Siswa 4", "12 SMA");
        Siswa s5 = new Siswa("Siswa 5", "11 SMA");
        
        List<Siswa> ESport = new ArrayList<Siswa>();
        ESport.add(s1);
        ESport.add(s2);
        
        List<Siswa> Karate = new ArrayList<Siswa>();
        Karate.add(s3);
        Karate.add(s4);
        Karate.add(s5);
        
        Turnamen Tur1 = new Turnamen("Karate", Karate);
        Turnamen Tur2 = new Turnamen("E-Sport", ESport);
        
        System.out.println("Total siswa yang mengikuti Turnamen " + 
                Tur1.getNamaTurnamen() + " = " + Tur1.getTotalAnggotaTurnamen());
        System.out.println("Total siswa yang mengikuti Turnamen " + 
                Tur2.getNamaTurnamen() + " = " + Tur2.getTotalAnggotaTurnamen());
    }
    
    
}
