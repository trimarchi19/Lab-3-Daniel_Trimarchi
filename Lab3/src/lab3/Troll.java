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
    static int AD=30+r.nextInt(50);
    static int AP=0;
    static int HP=50+r.nextInt(80);
     static int Eficacia=50+r.nextInt(65);
    static int Critico=15+r.nextInt(20);
    static int Velocidad=10;
    public Troll() {
        super(AD,AP,HP,Eficacia,Critico,Velocidad);
    }
   
    
    
    
}
