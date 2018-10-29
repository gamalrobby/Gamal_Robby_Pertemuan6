/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117071.latihan61.bangunruang;

/**
 *
 * @author Destroy Eyes
 */
public class Tabung extends BangunRuang{

    @Override
    public void setJari(double jari) {
        super.setJari(jari); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getJari() {
        return super.getJari(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTinggi(double tinggi) {
        super.setTinggi(tinggi); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTinggi() {
        return super.getTinggi(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public double volume() {
        return (22*this.getJari()*this.getJari()*this.getTinggi())/7;
    }
    
    
    
}
