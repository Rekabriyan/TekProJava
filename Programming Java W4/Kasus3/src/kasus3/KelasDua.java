/*
 Class ini akan menampilkan nomor pada classnya sendiri
dan nomor dari Class KelasSatu yang dipanggil menggunakan conctract
 */
package kasus3;

public class KelasDua {
    {
System.out.println(5); 
/* akan muncul pada urutan terakhir 
dan hanya dieksekusi jika Class KelasDua mendapatkan contructed*/ 
}
public static void main(String[] args){
System.out.println(6); // akan muncul pada urutan pertama
KelasSatu satu = new KelasSatu();// contruct object tanpa parameter
KelasSatu dua = new KelasSatu(10);// contruct object dengan parameter
}
}
