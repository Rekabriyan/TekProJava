/*
Class ini merupakan inti(main) serta mendefinisikan objek dan menunjukkan objek
yang telah dibuat. Class ini juga menambahkan stok baru ke stok sebelumnya
 */
package kasus1;

public class Inventori {
Barang[] barangs;

void initBarang() {
barangs = new Barang[2]; //membuat dua array untuk menampung dua barang
barangs[0] = new Barang("001", "Baju", 10); // barang pertama
barangs[1] = new Barang("002", "Celana", 20); // barang kedua
}
void showBarang() {
    /*
    untuk menampilkan barang 1 dan barang 2 serta menampilkan kuantitas
    stok baru setelah menambahkan dengan stok baru di setStok
    */
System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
}
void pengadaan() {
initBarang();
/*menambah stocks*/
barangs[0].setStok(10); /* menambah 10 stock*/
barangs[0].setStok(20); /* menambah 20 stock*/
barangs[0].setStok(25); /* menambah 25 stock*/ 	
showBarang(); /* menampilkan nomor dan nama setelah menambahkan stock baru*/
}

public static void main(String[] args) {
       Inventori beli = new Inventori(); // untuk memanggil class inventori
       beli.pengadaan(); // untuk memanggil void pengadaan dan penambahan stok
    }
}

