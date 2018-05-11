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
public class Orco extends Enemigos{
   static Random r=new Random();
    static int AD=30+r.nextInt(45);
    static int AP=0;
    static int HP=70+r.nextInt(90);
     static int Eficacia=20+r.nextInt(50);
    static int Critico=60;
    static int Velocidad=20;
    /*
    HP: 70-90. AD: 30-45 Eficacia: 20-50 Probabilidad de Critico: 60  Velocidad: 20 

    */
    public Orco() {
              super(AD,AP,HP,Eficacia,Critico,Velocidad);

    }

   
}
