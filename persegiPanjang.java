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
public class persegiPanjang extends bangunDatar{
  float panjang;
    float lebar;  
    
    @Override
    float luas(){
        float luas= 2*panjang*lebar;
        System.out.println("luas persegi panjang adalah "+luas);
        return luas;
    }
    @Override
     float keliling(){
        float keliling= 2*(panjang+lebar);
        System.out.println("keliling persegi panjang adalah "+keliling);
        System.out.println("");
        return keliling;
    }
}

