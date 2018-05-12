/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author X
 */
public class Objetos {
    static Random r=new Random();
 static int armadura_blanca=10+r.nextInt(35);
 static int espada_maestra=30+r.nextInt(45);
 static int espada_celestial=15+r.nextInt(20);
 static int hylean_shield=25+r.nextInt(30);
 static int elixir_vida=20+r.nextInt(30);
 static int elixir_power=20+r.nextInt(30);
 static int veneno=7+r.nextInt(24);
 static int maldicion=10+r.nextInt(26);
 static int espada_dorada=20+r.nextInt(30);

  ArrayList armas=new ArrayList();
 

    public Objetos() {
        armas.add("armadura_blanca-"+armadura_blanca+"-inusual");
        armas.add("espada_maestra-"+espada_maestra+"-inusual");
        armas.add("espada_celestial-"+espada_celestial+"-usual");
        armas.add("hylean_shield-"+hylean_shield+"-inusual");
        armas.add("elixir_vida-"+elixir_vida+"-usual");
        armas.add("elixir_power-"+elixir_power+"-usual");
        armas.add("veneno-"+veneno+"-usual");
        armas.add("maldicion-"+maldicion+"-inusual");
        armas.add("espada_dorada-"+espada_dorada+"-usual");

        
    }

    public static Random getR() {
        return r;
    }

    public static int getArmadura_blanca() {
        return armadura_blanca;
    }

    public static int getEspada_maestra() {
        return espada_maestra;
    }

    public static int getEspada_celestial() {
        return espada_celestial;
    }

    public static int getHylean_shield() {
        return hylean_shield;
    }

    public static int getElixir_vida() {
        return elixir_vida;
    }

    public static int getElixir_power() {
        return elixir_power;
    }

    public static int getVeneno() {
        return veneno;
    }

    public static int getMaldicion() {
        return maldicion;
    }

    public static int getEspada_dorada() {
        return espada_dorada;
    }

  

    public ArrayList getArmas() {
        return armas;
    }
    
 
 
}
