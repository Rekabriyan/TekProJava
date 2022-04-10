
package anothertypeofemployee;
/**
 *
 * @author hp
 */
public class Hourly extends Employee {
    private int hoursWorked;
    
    //-----
    // Sets up this hourly employee using the spesified information.
    //-----
    
   public Hourly (String eName, String eAddress, String ePhone, String sosSecNumber, double rate){
       super (eName, eAddress, ePhone, sosSecNumber, rate);
       
       hoursWorked = 0;
   }
   //---
   // adds the specified number of hiurs to this employee's
   // accumulated hours.
   //---
   public void addHours (int moreHours){
       hoursWorked += moreHours;
   }
   
   //---
   //Computes and return the pay for this hourly employee as a string
   //---
   public String toString(){
       String result = super.toString();
       result += "\nCurrent hours : " + hoursWorked;
       return result;
   }
}
