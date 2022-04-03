/*
Nama    : Reka Briyan Cahya Heryana
Kelas   : D4 - 1A Teknik Informatika
Program : Buka Tutup Jalan
 */
package bukatutupjalan;
import java.util.Scanner;

public class BukaTutupJalan {

    public static void main(String[] args) {
        
        //input plat nomor 4 mobil
        Scanner input = new Scanner(System.in);
		
        String platNomor = input.nextLine();
        String[] a = platNomor.split(" ");
        String result = "";
        
        for (String x : a){
            result += x;
        }

        long plat = Long.parseLong(result);

        if ((plat - 999999)%5 == 0){
        	System.out.println("berhenti");
        }
        else {
        	System.out.println("jalan");
        }
        input.close();
    }
}

       
        
    
    

