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
public class Atributos {

    int HP;
    int Eficacia;
    int Critico;
    int Suerte;
    int Velocidad;

    public Atributos() {
    }

    public Atributos(int HP, int Eficacia, int Critico, int Suerte, int Velocidad) {
        this.HP = HP;

        this.Eficacia = Eficacia;
        this.Critico = Critico;
        this.Suerte = Suerte;
        this.Velocidad = Velocidad;
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

    public int getSuerte() {
        return Suerte;
    }

    public void setSuerte(int Suerte) {
        this.Suerte = Suerte;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    @Override
    public String toString() {
        return "Atributos{" + "HP=" + HP +", Eficacia=" + Eficacia + ", Critico=" + Critico + ", Suerte=" + Suerte + ", Velocidad=" + Velocidad + '}';
    }
    

}
