
package komposisi;
import java.io.*;
import java.util.*;


public class Komposisi {

    public static void main(String[] args) {
        // TODO code application logic here
        Buah B1 = new Buah ("Mangga ", "Kuning");
        Buah B2 = new Buah("Durian", "Kuning");
        Buah B3 = new Buah("Melon", "Hijau");
        Buah B4 = new Buah("Semangka", "Hijau");
        
        List<Buah> Buahnya = new ArrayList<Buah>();
        Buahnya.add(B1);
        Buahnya.add(B2);
        Buahnya.add(B3);
        Buahnya.add(B4);
      
        
        WarnaBuah Buah = new WarnaBuah(Buahnya);
        
        List<Buah> wrn = Buah.getTotalBuah();
        for(Buah Bl : wrn) {
            System.out.println("Nama Buah : " + Bl.getNamaBuah());
            System.out.println("Warna Buah : " + Bl.getWarnaBuah());
            System.out.println();
           
        }
    }
    
}