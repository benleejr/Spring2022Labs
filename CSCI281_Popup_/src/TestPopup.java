/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

public class TestPopup {
    
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("multi_seven.png");
        
        JOptionPane.showMessageDialog(null, "Love the sevens.",
                "Show you the seven - B. Lee", JOptionPane.ERROR_MESSAGE, icon);
    }
}
