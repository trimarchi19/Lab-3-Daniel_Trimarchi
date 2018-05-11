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
        int pos=0;//jugador 1-4
        ArrayList<Integer> stats=new ArrayList<>(); 
        ArrayList players=new ArrayList<>();       
        Scanner lea=new Scanner(System.in);
        Scanner lea2=new Scanner (System.in);
        int opt=1;
        String color="",Raza="",estilo="";
        do{
        System.out.print("1)Creacion Del Personaje\n"
                + "2)Creacion Por Default\n"
                + "Que desea hacer:");
        opt=lea.nextInt();
        switch(opt){
            case 1:
                Atributos m=new Atributos();
                estilo="";
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
                  
                 do{
                    System.out.println("Ingrese El Estilo de Combate: [mago/arquero/berzerk/picaro]"); 
                    estilo=lea2.nextLine().toLowerCase();                   
                }while(!( estilo.equals("mago") ||  estilo.equals("arquero")|| estilo.equals("berzerk")|| estilo.equals("picaro"))); 
                players.add(new Personajes(edad,Nombre,estatura,peso,Raza));
                if(estilo.equals("mago")){
                 //  Mago mag=new Mago(50,20,120,70,2,20,10);
                      ((Personajes) players.get(pos)).setAtri(new Mago(50,20,120,70,2,20,10));
                }else if(estilo.equals("arquero")){
                 //   Arquero arq=new Arquero(50,150,85,60,20,15);
                    ((Personajes) players.get(pos)).setAtri(new Arquero(0,50,150,85,60,20,15));
                }else if(estilo.equals("berzerk")){
                  //  Berzerk ber=new Berzerk(80,190,80,30,15,20);
                   ((Personajes) players.get(pos)).setAtri(new Berzerk(0,80,190,80,30,15,20));
                }else if(estilo.equals("picaro")){
                    //Picaro pc=new Picaro(55,150,85,60,50,30);
                      ((Personajes) players.get(pos)).setAtri(new Picaro(0,55,150,85,60,50,30));
                }
               pos+=1;
                break;
            
            case 4:
                for (Object player : players) {
                    System.out.println(players.indexOf(player)+") "+player);
                    
                }
                break;
                default:
                    break;
        }
        }while(opt!=5);
    }
    
}
