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
public class Arquero extends Atributos{
    int AD;

    public Arquero(int AD, int HP, int Eficacia, int Critico, int Suerte, int Velocidad) {
        super(HP, Eficacia, Critico, Suerte, Velocidad);
        this.AD = AD;
    }

    public int getAD() {
        return AD;
    }
          
    
}
