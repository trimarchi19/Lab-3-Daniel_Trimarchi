/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Random;

/**
 *
 * @author X
 */
public class Eoscuro extends Enemigos {
    static Random r=new Random();
    static int AD=30+r.nextInt(50);
    static int AP=0;
    static int HP=60+r.nextInt(120);
     static int Eficacia=50+r.nextInt(70);
    static int Critico=0+r.nextInt(100);
    static int Velocidad=20;
    /*
    HP: 60-120. AD: 30-50 Eficacia: 50-70 Probabilidad de Critico: 0-100 Velocidad: 20


    */
    public Eoscuro() {
        super(AD,AP,HP,Eficacia,Critico,Velocidad);
    }

    
    
    
    
}
