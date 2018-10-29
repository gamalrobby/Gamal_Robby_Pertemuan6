/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan61.bangunruang;

/**
 *
 * @author Destroy Eyes
 * NAMA     : A Gamal Robby Abdulkarim
 * KELAS    : PBO2
 * NIM      : 10117071
 * Deskripsi Program : Program ini berisi Program menghitung volume bangun ruang
 * menggunakan pewarisan dan abstraksi
 */
public class PBO210117071Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabung tbg = new Tabung();
        Bola bola = new Bola();
        Kerucut krct = new Kerucut();
        
        bola.setJari(7);
        tbg.setJari(10);
        tbg.setTinggi(21);
        krct.setJari(14);
        krct.setTinggi(9);
        
        System.out.println("Jari-Jari        : "+bola.getJari());
        System.out.printf("Voluem Bola      : %12.1f%n", bola.volume()," cm3");
        
        System.out.println("");
        
        System.out.println("Jari-Jari        : "+tbg.getJari());
        System.out.println("Tinggi           : "+tbg.getTinggi());
        System.out.printf("Voluem Tabung    : %12.1f%n", tbg.volume()," cm3");
        
        System.out.println("");
        
        System.out.println("Jari-Jari        : "+krct.getJari());
        System.out.println("Tinggi           : "+krct.getTinggi());
        System.out.printf("Voluem Kerucut   : %,12.1f%n", krct.volume()," cm3");
    }
    
}
