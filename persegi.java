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
public class persegi  extends bangunDatar{
  float sisi;     
  
  @Override
  float luas(){
      float luas = sisi*sisi;
      System.out.println("luas persegi adalah ="+luas);
      return luas;
  }
  @Override
   float keliling(){
      float keliling = 4*sisi;
      System.out.println("keliling persegi adalah ="+keliling);
      System.out.println("");
      return keliling;
}
}
