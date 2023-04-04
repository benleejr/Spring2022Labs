/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hales
 */
public class Digits_from_number_left_to_right {
    public static void main(String[] args) {
        int workNum = 20499;
        
        int tenThousandthPlace = workNum / 10000;
        workNum = workNum%10000;
        
        int thousandthPlace = workNum / 1000;
        workNum = workNum % 1000;
        
        int hundredthPlace = workNum / 100;
        workNum = workNum % 100;
        
        int tenthPlace = workNum / 10;
        workNum = workNum % 10;
        
        int unitPlace = workNum % 10;
        
        System.out.println(tenThousandthPlace);
        System.out.println(thousandthPlace);
        System.out.println(hundredthPlace);
        System.out.println(tenthPlace);
        System.out.println(unitPlace);
        
    }
}
