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
public class Bola extends BangunRuang{

    @Override
    public void setJari(double jari) {
        super.setJari(jari); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getJari() {
        return super.getJari(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public double volume() {
        return (4*22* this.getJari() * this.getJari() * this.getJari())/7/3 ;
    }
    
}
