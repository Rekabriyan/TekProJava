/*
Nama   : Reka Briyan Cahya Heryana
Kelas   : D4-1A Teknik Informatika
Program : Profesi Nama
 */
package asosiasi;
import java.util.List;

public class Profesi{
    private String NamaProfesi;
    
    public String getNamaProfesi(){
        return NamaProfesi;
    }
    
    public void setNamaProfesi(String NamaProfesi){
        this.NamaProfesi = NamaProfesi;
    }
    
    @Override
    public String toString(){
        return NamaProfesi;
    }
    }
  
