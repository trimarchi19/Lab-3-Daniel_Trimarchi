/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author X
 */
public class Enemigos {
       int AD;
    int AP;
    int HP;
    int Eficacia;
    int Critico;
    int Velocidad;

    public Enemigos(int AD, int AP, int HP, int Eficacia, int Critico,int Velocidad) {
        this.AD = AD;
        this.AP = AP;
        this.HP = HP;
        this.Eficacia = Eficacia;
        this.Critico = Critico;
        
        this.Velocidad = Velocidad;
    }

    public Enemigos() {
    }

    public int getAD() {
        return AD;
    }

    public void setAD(int AD) {
        this.AD = AD;
    }

    public int getAP() {
        return AP;
    }

    public void setAP(int AP) {
        this.AP = AP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getEficacia() {
        return Eficacia;
    }

    public void setEficacia(int Eficacia) {
        this.Eficacia = Eficacia;
    }

    public int getCritico() {
        return Critico;
    }

    public void setCritico(int Critico) {
        this.Critico = Critico;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return "Enemigos{" + "AD=" + AD + ", AP=" + AP + ", HP=" + HP + ", Eficacia=" + Eficacia + ", Critico=" + Critico + ", Velocidad=" + Velocidad + '}';
    }
    
}
