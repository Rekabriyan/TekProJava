package agregasi;

import java.util.List;

public class Turnamen {
    private String namaTurnamen;
    private List<Siswa> daftarAnggota;
    
    // Constructor
    public Turnamen(String namaTurnamen, List<Siswa> daftarAnggota) {
        this.namaTurnamen = namaTurnamen;
        this.daftarAnggota = daftarAnggota;
    }
    
    // Methods
    public String getNamaTurnamen() {
        return this.namaTurnamen;
    }
    
    public int getTotalAnggotaTurnamen() {
        int jumlahSiswa=0;
        
        for(Siswa s : daftarAnggota) {
            jumlahSiswa++;
        }
        return jumlahSiswa;
    }
}

