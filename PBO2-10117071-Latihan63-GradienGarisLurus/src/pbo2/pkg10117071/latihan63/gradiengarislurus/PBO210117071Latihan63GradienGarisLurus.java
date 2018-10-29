/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan63.gradiengarislurus;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program menghitung Gradien Garis Lurus
 * menggunakan interface
 */
public class PBO210117071Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("Garis yang melalui titik ("+koordinat1.getX1()
                +","+koordinat1.getY1()+") dan ("+koordinat1.getX2()+","+koordinat1.getY2()
                +")"); 
        System.out.println("memiliki Gradien sebesar "+koordinat1.hitungGradien());
        
        System.out.println("Garis yang melalui titik ("+koordinat2.getX1()
                +","+koordinat2.getY1()+") dan ("+koordinat2.getX2()+","+koordinat2.getY2()
                +")"); 
        System.out.println("memiliki Gradien sebesar "+koordinat2.hitungGradien());
        
    }
    
}
