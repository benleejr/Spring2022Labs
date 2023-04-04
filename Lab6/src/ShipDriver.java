
import java.util.*;
import java.io.*;
import javax.swing.*;

public class ShipDriver {
    
    public static void main(String[] args) {
        
        ArrayList<Ship> shipList = new ArrayList<Ship>();
        
        File shipFile = new File("justShips.csv");        
        
        if(!shipFile.exists()) {
            String errorMessage = "THE FILE "+shipFile+"IS NOT PRESENT.";
            
            JOptionPane.showMessageDialog(null, errorMessage,"FILE IS MISSING",2); 
        }
        
        String message = "Can see the file: "+shipFile+".";
        JOptionPane.showMessageDialog(null, message, "FILE FOUND", 1);
                      
        try {
                        
        Scanner inScan = new Scanner(shipFile).useDelimiter("[,\n]");
                
        while(inScan.hasNext()) {
            String tempName = inScan.next();
            int tempYear = inScan.nextInt();
            String tempCountry = inScan.next();
            
            shipList.add(new Ship(tempName, tempYear, tempCountry));
            
        }     
        
        inScan.close();  
        
        }                                    
              
        catch (IOException ioe) {
            
            String errorMessage = "FILE "+shipFile+" CANNOT BE OPENED.";
            JOptionPane.showMessageDialog(null, errorMessage, "ERROR", 2);
           System.exit(0);
        }               
        String accumulator = ""; 
        
        for (Ship s : shipList) {                                
                         
            accumulator += String.format("%2d",shipList.indexOf(s))+": "+
                    s.toString();
                      
           
        }
        
        JOptionPane.showMessageDialog(null, accumulator, "List of Ships", 1);      
    
    }
}

