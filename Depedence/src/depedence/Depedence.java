
package depedence;

/**
 *
 * @author hp
 */
public class Depedence {

    public static void main(String[] args) {
        Liverpool lfc = new Liverpool();
        ManCity mc = new ManCity();
        PosisiKlasemen PK = new PosisiKlasemen();
        
        PK.setKlasemen(mc);
        PK.getKlasemen();
        
        PK.setKlasemen(lfc);
        PK.getKlasemen();
        
        
       
    }
    
}
