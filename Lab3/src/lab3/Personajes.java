/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;

/**
 *
 * @author X
 */
public class Personajes {
    int edad;
    String Nombre;
    int estatura;
    int peso;
    String raza;
    ArrayList<Objetos> armas=new ArrayList();
    ArrayList<Atributos> atributos=new ArrayList();
      Atributos atri;
    public Personajes() {
        
        
    }

    public Personajes(int edad, String Nombre, int estatura, int peso, String raza) {
        this.edad = edad;
        this.Nombre = Nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.raza = raza;
    }

    public Atributos getAtri() {
        return atri;
    }

    public void setAtri(Atributos atri) {
        this.atri = atri;
    }
    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public ArrayList getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList atributos) {
        this.atributos = atributos;
    }

    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getRaza1() {
        return raza;
    }

    public void setRaza1(String raza) {
        this.raza = raza;
    }

    public ArrayList<Objetos> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Objetos> armas) {
        this.armas = armas;
    }

    @Override
    public String toString() {
        return "Personajes{" + "edad=" + edad + ", Nombre=" + Nombre + ", estatura=" + estatura + ", peso=" + peso + ", raza=" + raza + ",\n armas=" + armas + "\nAtributos"+atri+'}';
    }
    
    
    
}
