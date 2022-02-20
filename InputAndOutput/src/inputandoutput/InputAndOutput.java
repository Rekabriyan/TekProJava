/*
Nama    : Reka Briyan Cahya Heryana
Kelas   : D4 - 1A
Program : Input dan Output(1)
*/
package inputandoutput;
import java.io.*;
import java.util.Scanner;

public class InputAndOutput {
    static int n;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // memisahkan string dari karakter tersebut
        String[] temp = s.split("[! , . ? _ ' @]+");
        n = temp.length;
        // print n
        System.out.println(n);
        // print split string
        for (int i=0;i<temp.length;i++ ){
            System.out.println(temp[i]);
        }
    }
    
}
