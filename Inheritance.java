/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Scanner;

/**
 *
 * @author MOLKET012
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // membuat objek bangun datar
          Scanner input = new Scanner (System.in);
      System.out.print("Masukkan sisi persegi : ");
      int sisi =input.nextInt();
      System.out.print("Masukkan jari-jari lingkaran : ");
      int jari =input.nextInt();
      System.out.print("Masukkan panjang persegi panjang : ");
      int panjang =input.nextInt();
      System.out.print("Masukkan lebar persegi panjang : ");
      int lebar =input.nextInt(); 
      System.out.print("Masukkan tinggi segitiga : ");
      int tinggi =input.nextInt();
      System.out.print("Masukkan alas segitiga : ");
      int alas =input.nextInt();
      

        bangunDatar bangunDatar = new bangunDatar();
        
        // membuat objek persegi dan mengisi nilai properti
        persegi persegi = new persegi();
        persegi.sisi = sisi;
        
        // membuat objek Lingkaran dan mengisi nilai properti
        lingkaran lingkaran = new lingkaran();
        lingkaran.jari = jari;
      
        // membuat objek Persegi Panjang dan mengisi nilai properti
        persegiPanjang persegiPanjang = new persegiPanjang();
        persegiPanjang.panjang = panjang;
        persegiPanjang.lebar = lebar;
        
        // membuat objek Segitiga dan mengisi nilai properti
        segitiga Segitiga = new segitiga();
        Segitiga.alas = alas;
        Segitiga.tinggi = tinggi;
        
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        Segitiga.luas();
        Segitiga.keliling();
    }
}
    
   
