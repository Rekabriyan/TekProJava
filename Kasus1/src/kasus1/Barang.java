/*
Class ini digunakan untuk mendefinisikan struktur data yang digunakan
oleh objek tersebut
 */
package kasus1;

public class Barang {
String kode_barang;
String nama_barang;
/*
stok akan dienkapsulasi dengan menggunakan
variabel privat untuk melarang penggunaan
operasi matematika lain selain tambah 
*/

private int stok;
    

public int getStok(){
    return stok; //untuk mendapatkan stok setelah menambahkan kuantitas
}

public void setStok(int stok){
    this.stok += stok; //untuk mengatur stok dengan menambahkan kuantitas
}

public Barang(String kode, String nama, int stk) {
kode_barang = kode;
nama_barang = nama;
stok = stk;
}
}

