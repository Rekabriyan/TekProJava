/*
Nama   : Reka Briyan Cahya Heryana
Kelas   : D4 - 1A Teknik Informatika 
Program : Nama Class
 */
package asosiasi;
import java.util.*;
import java.util.List; 

public class Nama {
    private String NamaOrang;
    private List <Profesi> DaftarProfesi;


public String getNamaOrang(){
    return NamaOrang;
}

 public void setNamaOrang(String NamaOrang){
    this.NamaOrang = NamaOrang;
    
}
 public List<Profesi> getDaftarProfesi(){
     return DaftarProfesi;
 }
 
 public void setDaftarProfesi(List<Profesi> DaftarProfesi){
     this.DaftarProfesi = DaftarProfesi;
 }
}
