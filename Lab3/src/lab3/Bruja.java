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
public class Bruja extends Enemigos {
    static Random r=new Random();
    static int AD=5+r.nextInt(10);
    static int AP=20+r.nextInt(40);
    static int HP=60+r.nextInt(80);
     static int Eficacia=10+r.nextInt(30);
    static int Critico=1;
    static int Velocidad=3+r.nextInt(7);
/*
    Bruja: HP: 60-80. AP: 20-40 AD: 5-10 Eficacia: 10-30 Probabilidad de Critico: 1  Velocidad: 3-7 

    */
    public Bruja() {
        super(AD,AP,HP,Eficacia,Critico,Velocidad);
        
    }

  
}
