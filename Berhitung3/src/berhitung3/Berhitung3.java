/*
Nama    : Reka Briyan Cahya Heryana
Kelas   : D4 - 1A
Program : Berhitung
 */
package berhitung3;
import java.util.Scanner;
import java.io.*;

public class Berhitung3 {

    public static void main(String[] args) {
        // kamus data
        int angka1;
        int angka2;
        int hasil;
        char operasi;
        
        // membuat inputan untuk angka1, operasi, dan angka2
        Scanner input = new Scanner(System.in);
        angka1 = input.nextInt();
        operasi = input.next().charAt(0);
        angka2 = input.nextInt();
        // angka1 dan angka2 tidak boleh lebih dari 1000
        if((angka1 >= 1 && angka1 <= 1000)&&(angka2 >= 1 && angka2 <= 1000)){
        switch (operasi){
            // pertambahan
            case '+':
            hasil = angka1 + angka2;
            System.out.println(hasil);
            break;
            
            // pengurangan
            case '-':
            hasil = angka1 - angka2;
            System.out.println(hasil);
            break;
            
            // perkalian
            case '*':
            hasil = angka1 * angka2;
            System.out.println(hasil);
            break;
            
            // pembagian
            case '/':
            hasil = angka1 / angka2;
            System.out.println(hasil);
            break;
            
            // modulus
            case '%':
            hasil = angka1 % angka2;
            System.out.println(hasil);
            break;
            default:
               System.out.println("Operasi Salah Bestie!");
               break;
        }
            input.close();
        }else System.out.println("Masukin 1 sampai 1000 saja"); 
            
        
        
        
    }
    
}
