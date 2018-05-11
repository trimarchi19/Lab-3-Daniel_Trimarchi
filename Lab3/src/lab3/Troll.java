/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Random;
import static lab3.Bruja.AD;

/**
 *
 * @author X
 */
public class Troll extends Enemigos{
    static Random r=new Random();
    static int AD=5+r.nextInt(10);
    static int AP=0;
    static int HP=60+r.nextInt(80);
     static int Eficacia=10+r.nextInt(30);
    static int Critico=1;
    static int Velocidad=3+r.nextInt(7);

    public Troll() {
        super(AD,AP,HP,Eficacia,Critico,Velocidad);
    }
   
    
    
    
}
