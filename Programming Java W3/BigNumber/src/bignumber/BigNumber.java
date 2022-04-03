/*
Nama    : Reka Briyan Cahya Heryana
Kelas   : D4 - 1A
Program : BigNumber
 */
package bignumber;
import java.util.Scanner;
import java.math.*;

public class BigNumber {

    public static void main(String[] args) {
        // inputan angka ke 1 dan 2
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        
        // operasi penjumlahan
         BigInteger penjumlahan = a.add(b);
        // operasi perkalian
         BigInteger perkalian = a.multiply(b);
        // menampilkan hasilnya
        System.out.println(penjumlahan+"\n"+perkalian);
    }
    
}
