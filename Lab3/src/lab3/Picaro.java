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
public class Picaro extends Atributos {
    int AD;

    public Picaro() {
    }

    public Picaro(int AD) {
        this.AD = AD;
    }

    public Picaro(int AD, int HP, int Eficacia, int Critico, int Suerte, int Velocidad) {
        super(HP, Eficacia, Critico, Suerte, Velocidad);
        this.AD = AD;
    }
    
    
}
