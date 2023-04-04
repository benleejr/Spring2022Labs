/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hales
 */
public class Digits_from_number {
    public static void main(String[] args) {
        int workNum = 20499;
        int unitPlace = workNum%10;
        workNum = workNum/10;
        
        int tensPlace = workNum%10;
        workNum = workNum/10;
        
        int hundredthPlace = workNum%10;
        workNum = workNum/10;
        
        int thousandthPlace = workNum%10;
        workNum = workNum/10;
        
        int tenThousandthPlace = workNum%10;
        workNum = workNum/10;
        
        System.out.println(unitPlace);
        System.out.println(tensPlace);
        System.out.println(hundredthPlace);
        System.out.println(thousandthPlace);
        System.out.println(tenThousandthPlace);
    }
}
