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
public class Mago extends Atributos {
    int AP;
    int AD;

    public Mago(int AP,int AD,int HP, int Eficacia, int Critico, int Suerte, int Velocidad) {
        super(AP,AD,HP, Eficacia, Critico, Suerte, Velocidad);
        this.AP=AP;
        this.AD=AD;
    }

    
    public int getAP() {
        return AP;
    }

    public int getAD() {
        return AD;
    }

    
}
