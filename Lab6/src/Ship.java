/* Purpose: Practicing using Object Oriented Programming to scan values from a 
 * .csv file and adding them to an arraylist that uses the Ship class to organize
 * the values. Implementing a UML diagram into a programming environment. Printing
 * the values from an arrayList using a for loop and String accumulator.
 *
 * This program will scan values off a csv file, store the values in an arrayList,
 * and print the values stored into a popup window using JOptionPane.
 *
 * Cameron Boddie & Benedict Lee
 * 
 * 11 April 2022
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hales
 */
public class Ship {
        
        private String name;
        private int year;
        private String country;
        
        public Ship (String nam, int yr, String ctry) {
        
            name = nam;
            year = yr;
            country = ctry;    
               
    }
        
        @Override
        public String toString() {
            return "Name: "+name+ ", Year: "+year+", Country: "+country+"\n";
            
        }
                
        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @return the year
         */
        public int getYear() {
            return year;
        }

        /**
         * @return the country
         */
        public String getCountry() {
            return country;
        }            
        
        public static void main(String[] args) {
        
        ArrayList<Ship> shipList = new ArrayList<>();
        
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


    
