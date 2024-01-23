/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author MOLKET012
 */
public class lingkaran extends bangunDatar{
 
    
    // jari-jari lingkaran
    float jari;
    
    @Override
    float luas(){
        float luas = jari*jari*22/7;
        System.out.println("");
        System.out.println("luas lingkaran adalah "+luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = 2*jari*22/7;
        System.out.println("keliling lingkaran adalah "+keliling);
        System.out.println("");
        return keliling;

}
}
