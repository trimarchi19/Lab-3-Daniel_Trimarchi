/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author X
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Ppos=0;//jugador 1-4
        ArrayList players=new ArrayList<>();
        Scanner lea=new Scanner(System.in);
        Scanner lea2=new Scanner (System.in);
        int opt=1;
        String color="",Raza="";
        do{
        System.out.print("1)Creacion Del Personaje\n"
                + "2)Creacion Por Default\n"
                + "Que desea hacer:");
        opt=lea.nextInt();
        switch(opt){
            case 1:
                color="";
                Raza="";
                System.out.println("Ingrese El Nombre de su Personaje");
                String Nombre=lea2.nextLine();
                System.out.println("Ingrese la Edad");
                int edad=lea.nextInt();
                System.out.println("Ingrese la Estatura");
                int estatura=lea.nextInt();
                System.out.println("Ingrese el Peso");
                int peso=lea.nextInt();
                do{
                    System.out.println("Ingrese el Color de Pelo[negro/cafe/rubio]"); 
                    color=lea2.nextLine().toLowerCase();                   
                }while(!(color.equals("negro") || color.equals("cafe")||color.equals("rubio")));
                 do{
                    System.out.println("Ingrese la Raza [hobbit/elfo/humano/enano]"); 
                    Raza=lea2.nextLine().toLowerCase();                   
                }while(!(Raza.equals("hobbit") || Raza.equals("elfo")||Raza.equals("humano")||Raza.equals("enanos")));
                
                players.add(new Personajes(edad,Nombre,estatura,peso,Raza));
                break;
            default:
                break;
        }
        }while(opt!=5);
    }
    
}
