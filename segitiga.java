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
public class segitiga extends bangunDatar{
    float alas;
    float tinggi;
    
    @Override
    float luas(){
        float luas= alas*tinggi*1/2;
        System.out.println("luas segitiga adalah "+luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling= alas*tinggi*tinggi;
        System.out.println("keliling segitiga adalah "+keliling);
        return keliling;
}
}
