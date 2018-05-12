/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import static lab3.Objetos.r;

/**
 *
 * @author X
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        // TODO code application logic here
        //Edad, Nombre (Que será el mismo que el de su clase), Estatura, Peso
        int juego = 0;
        ArrayList ene = new ArrayList();
        Objetos o = new Objetos();
        int pos = 0;//jugador 1-4
        int dif = -1;
        ArrayList<Integer> stats = new ArrayList<>();
        ArrayList players = new ArrayList<>();
        Scanner lea = new Scanner(System.in);
        Scanner lea2 = new Scanner(System.in);
        int opt = 1;

        String color = "", Raza = "", estilo = "";
        System.out.print("1)Creacion Del Personaje\n"
                + "2)Inicio del Juego\n"
                + "Que desea hacer:");
        opt = lea.nextInt();
        switch (opt) {
            case 1:
                Atributos m = new Atributos();
                estilo = "";
                color = "";
                Raza = "";
                System.out.println("Ingrese El Nombre de su Personaje");
                String Nombre = lea2.nextLine();
                System.out.println("Ingrese la Edad");
                int edad = lea.nextInt();
                System.out.println("Ingrese la Estatura");
                int estatura = lea.nextInt();
                System.out.println("Ingrese el Peso");
                int peso = lea.nextInt();
                do {
                    System.out.println("Ingrese el Color de Pelo[negro/cafe/rubio]");
                    color = lea2.nextLine().toLowerCase();
                } while (!(color.equals("negro") || color.equals("cafe") || color.equals("rubio")));
                do {
                    System.out.println("Ingrese la Raza [hobbit/elfo/humano/enano]");
                    Raza = lea2.nextLine().toLowerCase();
                } while (!(Raza.equals("hobbit") || Raza.equals("elfo") || Raza.equals("humano") || Raza.equals("enanos")));

                do {
                    System.out.println("Ingrese El Estilo de Combate: [mago/arquero/berzerk/picaro]");
                    estilo = lea2.nextLine().toLowerCase();
                } while (!(estilo.equals("mago") || estilo.equals("arquero") || estilo.equals("berzerk") || estilo.equals("picaro")));
                players.add(new Personajes(edad, Nombre, estatura, peso, Raza));
                if (estilo.equals("mago")) {
                    //  Mago mag=new Mago(50,20,120,70,2,20,10);
                    ((Personajes) players.get(pos)).setAtri(new Mago(50, 20, 120, 70, 2, 20, 10));
                } else if (estilo.equals("arquero")) {
                    //   Arquero arq=new Arquero(50,150,85,60,20,15);
                    ((Personajes) players.get(pos)).setAtri(new Arquero(0, 50, 150, 85, 60, 20, 15));
                } else if (estilo.equals("berzerk")) {
                    //  Berzerk ber=new Berzerk(80,190,80,30,15,20);
                    ((Personajes) players.get(pos)).setAtri(new Berzerk(0, 80, 190, 80, 30, 15, 20));
                } else if (estilo.equals("picaro")) {
                    //Picaro pc=new Picaro(55,150,85,60,50,30);
                    ((Personajes) players.get(pos)).setAtri(new Picaro(0, 55, 150, 85, 60, 50, 30));
                }

                pos = 1;
                break;
            case 2:

                System.out.println("1)Facil\n"
                        + "2)Intermedio\n"
                        + "3)Dificil\n"
                        + "Seleccion dificultas:");
                dif = lea.nextInt();
                for (int i = 0; i < 10; i++) {
                    Collections.shuffle(o.armas);

                }

                switch (dif) {
                    case 1:
                        for (int i = 0; i < 5; i++) {
                            int h = 1 + r.nextInt(5);
                            if (h == 1) {
                                Bruja br = new Bruja();
                                ene.add("Bruja" + br);
                            } else if (h == 2) {
                                Eoscuro eo = new Eoscuro();
                                ene.add("Duende Oscuro-" + eo);
                            } else if (h == 3) {
                                Troll tr = new Troll();
                                ene.add("Troll" + tr);
                            } else if (h == 4) {
                                Orco or = new Orco();
                                ene.add("Orco-" + or);
                            }
                        }
                        do {

                            int dado1 = r.nextInt(20);
                            System.out.println("*************AVANZA:" + dado1 + "***************");
                            juego += dado1;
                            int dado2 = r.nextInt(20);
                            if (dado2 < (((Personajes) players.get(pos)).getAtri().Suerte)) {
                                int objet = 1 + r.nextInt(10);
                                ((Personajes) players.get(pos)).getArmas().add(o.armas.get(objet));
                                System.out.println("**********Te encontratste:" + o.armas.get(objet));
                                String a = o.armas.get(objet).toString();

                                if (o.armas.get(objet).toString().contains("armadura_blanca")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(10 + r.nextInt(35));

                                } else if (o.armas.get(objet).toString().contains("espada_maestra")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(30 + r.nextInt(45));

                                } else if (o.armas.get(objet).toString().contains("espada_celestial")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(15 + r.nextInt(20));
                                } else if (o.armas.get(objet).toString().contains("hylean_shield")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(25 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("eelixir_vida")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(20 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("elixir_power")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(20 + r.nextInt(30));
                                    ((Personajes) players.get(pos)).getAtri().setAP(20 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("veneno")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - (7 + r.nextInt(24)));

                                } else if (o.armas.get(objet).toString().contains("maldicion")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - (10 + r.nextInt(26)));

                                } else if (o.armas.get(objet).toString().contains("spada_dorada")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(20 + r.nextInt(30));
                                }

                            } else {
                                System.out.println("*****************HORA DE LA PELEA*****************");
                                int e = 1 + r.nextInt(ene.size());
                                System.out.println(ene.get(e));
                                int dado3 = r.nextInt(20);

                                if (((Personajes) players.get(pos)).getAtri() instanceof Mago) {
                                    if (((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico() > dado3) {
                                        int h = 1 + r.nextInt(5);
                                        if (e == 1) {
                                            Bruja br = new Bruja();
                                            ene.add("Bruja" + br);
                                            br.setHP(br.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (br.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - br.getAP());
                                            }
                                        } else if (e == 2) {
                                            Eoscuro eo = new Eoscuro();
                                            ene.add("Duende Oscuro-" + eo);

                                            eo.setHP(eo.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (eo.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - eo.getAP());
                                            }
                                        } else if (e == 3) {
                                            Troll tr = new Troll();
                                            ene.add("Troll" + tr);
                                            tr.setHP(tr.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (tr.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - tr.getAP());
                                            }
                                        } else if (e == 4) {
                                            Orco or = new Orco();
                                            ene.add("Orco-" + or);
                                            or.setHP(or.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (or.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - or.getAP());
                                            }
                                        }

                                    }
                                } else {
                                    if (((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico() > dado3) {
                                        int h = 1 + r.nextInt(5);
                                        if (e == 1) {
                                            Bruja br = new Bruja();
                                            ene.add("Bruja" + br);
                                            br.setHP(br.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (br.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - br.getAP());
                                            }
                                        } else if (e == 2) {
                                            Eoscuro eo = new Eoscuro();
                                            ene.add("Duende Oscuro-" + eo);

                                            eo.setHP(eo.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (eo.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - eo.getAP());
                                            }
                                        } else if (e == 3) {
                                            Troll tr = new Troll();
                                            ene.add("Troll" + tr);
                                            tr.setHP(tr.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (tr.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - tr.getAP());
                                            }
                                        } else if (e == 4) {
                                            Orco or = new Orco();
                                            ene.add("Orco-" + or);
                                            or.setHP(or.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (or.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - or.getAP());
                                            }
                                        }

                                    }
                                }

                            }
                        } while (juego < 50 &&((Personajes) players.get(pos)).getAtri().getHP()>0);
                        break;
                    case 2:
                        for (int i = 0; i < 5; i++) {
                            int h = 1 + r.nextInt(5);
                            if (h == 1) {
                                Bruja br = new Bruja();
                                ene.add("Bruja" + br);
                            } else if (h == 2) {
                                Eoscuro eo = new Eoscuro();
                                ene.add("Duende Oscuro-" + eo);
                            } else if (h == 3) {
                                Troll tr = new Troll();
                                ene.add("Troll" + tr);
                            } else if (h == 4) {
                                Orco or = new Orco();
                                ene.add("Orco-" + or);
                            }
                        }
                        do {

                            int dado1 = r.nextInt(20);
                            System.out.println("*************AVANZA:" + dado1 + "***************");
                            juego += dado1;
                            int dado2 = r.nextInt(20);
                            if (dado2 < (((Personajes) players.get(pos)).getAtri().Suerte)) {
                                int objet = 1 + r.nextInt(10);
                                ((Personajes) players.get(pos)).getArmas().add(o.armas.get(objet));
                                System.out.println("**********Te encontratste:" + o.armas.get(objet));
                                String a = o.armas.get(objet).toString();

                                if (o.armas.get(objet).toString().contains("armadura_blanca")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(10 + r.nextInt(35));

                                } else if (o.armas.get(objet).toString().contains("espada_maestra")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(30 + r.nextInt(45));

                                } else if (o.armas.get(objet).toString().contains("espada_celestial")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(15 + r.nextInt(20));
                                } else if (o.armas.get(objet).toString().contains("hylean_shield")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(25 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("eelixir_vida")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(20 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("elixir_power")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(20 + r.nextInt(30));
                                    ((Personajes) players.get(pos)).getAtri().setAP(20 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("veneno")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - (7 + r.nextInt(24)));

                                } else if (o.armas.get(objet).toString().contains("maldicion")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - (10 + r.nextInt(26)));

                                } else if (o.armas.get(objet).toString().contains("spada_dorada")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(20 + r.nextInt(30));
                                }

                            } else {
                                System.out.println("*****************HORA DE LA PELEA*****************");
                                int e = 1 + r.nextInt(ene.size());
                                System.out.println(ene.get(e));
                                int dado3 = r.nextInt(20);

                                if (((Personajes) players.get(pos)).getAtri() instanceof Mago) {
                                    if (((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico() > dado3) {
                                        int h = 1 + r.nextInt(5);
                                        if (e == 1) {
                                            Bruja br = new Bruja();
                                            ene.add("Bruja" + br);
                                            br.setHP(br.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (br.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - br.getAP());
                                            }
                                        } else if (e == 2) {
                                            Eoscuro eo = new Eoscuro();
                                            ene.add("Duende Oscuro-" + eo);

                                            eo.setHP(eo.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (eo.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - eo.getAP());
                                            }
                                        } else if (e == 3) {
                                            Troll tr = new Troll();
                                            ene.add("Troll" + tr);
                                            tr.setHP(tr.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (tr.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - tr.getAP());
                                            }
                                        } else if (e == 4) {
                                            Orco or = new Orco();
                                            ene.add("Orco-" + or);
                                            or.setHP(or.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (or.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - or.getAP());
                                            }
                                        }

                                    }
                                } else {
                                    if (((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico() > dado3) {
                                        int h = 1 + r.nextInt(5);
                                        if (e == 1) {
                                            Bruja br = new Bruja();
                                            ene.add("Bruja" + br);
                                            br.setHP(br.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (br.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - br.getAP());
                                            }
                                        } else if (e == 2) {
                                            Eoscuro eo = new Eoscuro();
                                            ene.add("Duende Oscuro-" + eo);

                                            eo.setHP(eo.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (eo.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - eo.getAP());
                                            }
                                        } else if (e == 3) {
                                            Troll tr = new Troll();
                                            ene.add("Troll" + tr);
                                            tr.setHP(tr.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (tr.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - tr.getAP());
                                            }
                                        } else if (e == 4) {
                                            Orco or = new Orco();
                                            ene.add("Orco-" + or);
                                            or.setHP(or.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (or.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - or.getAP());
                                            }
                                        }

                                    }
                                }

                            }
                        } while (juego < 100 &&((Personajes) players.get(pos)).getAtri().getHP()>0);
                        break;
                    case 3:
                        for (int i = 0; i < 5; i++) {
                            int h = 1 + r.nextInt(5);
                            if (h == 1) {
                                Bruja br = new Bruja();
                                ene.add("Bruja" + br);
                            } else if (h == 2) {
                                Eoscuro eo = new Eoscuro();
                                ene.add("Duende Oscuro-" + eo);
                            } else if (h == 3) {
                                Troll tr = new Troll();
                                ene.add("Troll" + tr);
                            } else if (h == 4) {
                                Orco or = new Orco();
                                ene.add("Orco-" + or);
                            }
                        }
                        do {

                            int dado1 = r.nextInt(20);
                            System.out.println("*************AVANZA:" + dado1 + "***************");
                            juego += dado1;
                            int dado2 = r.nextInt(20);
                            if (dado2 < (((Personajes) players.get(pos)).getAtri().Suerte)) {
                                int objet = 1 + r.nextInt(10);
                                ((Personajes) players.get(pos)).getArmas().add(o.armas.get(objet));
                                System.out.println("**********Te encontratste:" + o.armas.get(objet));
                                String a = o.armas.get(objet).toString();

                                if (o.armas.get(objet).toString().contains("armadura_blanca")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(10 + r.nextInt(35));

                                } else if (o.armas.get(objet).toString().contains("espada_maestra")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(30 + r.nextInt(45));

                                } else if (o.armas.get(objet).toString().contains("espada_celestial")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(15 + r.nextInt(20));
                                } else if (o.armas.get(objet).toString().contains("hylean_shield")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(25 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("eelixir_vida")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(20 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("elixir_power")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(20 + r.nextInt(30));
                                    ((Personajes) players.get(pos)).getAtri().setAP(20 + r.nextInt(30));
                                } else if (o.armas.get(objet).toString().contains("veneno")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - (7 + r.nextInt(24)));

                                } else if (o.armas.get(objet).toString().contains("maldicion")) {
                                    ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - (10 + r.nextInt(26)));

                                } else if (o.armas.get(objet).toString().contains("spada_dorada")) {
                                    ((Personajes) players.get(pos)).getAtri().setAD(20 + r.nextInt(30));
                                }

                            } else {
                                System.out.println("*****************HORA DE LA PELEA*****************");
                                int e = 1 + r.nextInt(ene.size());
                                System.out.println(ene.get(e));
                                int dado3 = r.nextInt(20);

                                if (((Personajes) players.get(pos)).getAtri() instanceof Mago) {
                                    if (((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico() > dado3) {
                                        int h = 1 + r.nextInt(5);
                                        if (e == 1) {
                                            Bruja br = new Bruja();
                                            ene.add("Bruja" + br);
                                            br.setHP(br.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (br.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - br.getAP());
                                            }
                                        } else if (e == 2) {
                                            Eoscuro eo = new Eoscuro();
                                            ene.add("Duende Oscuro-" + eo);

                                            eo.setHP(eo.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (eo.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - eo.getAP());
                                            }
                                        } else if (e == 3) {
                                            Troll tr = new Troll();
                                            ene.add("Troll" + tr);
                                            tr.setHP(tr.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (tr.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - tr.getAP());
                                            }
                                        } else if (e == 4) {
                                            Orco or = new Orco();
                                            ene.add("Orco-" + or);
                                            or.setHP(or.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (or.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - or.getAP());
                                            }
                                        }

                                    }
                                } else {
                                    if (((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico() > dado3) {
                                        int h = 1 + r.nextInt(5);
                                        if (e == 1) {
                                            Bruja br = new Bruja();
                                            ene.add("Bruja" + br);
                                            br.setHP(br.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (br.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - br.getAP());
                                            }
                                        } else if (e == 2) {
                                            Eoscuro eo = new Eoscuro();
                                            ene.add("Duende Oscuro-" + eo);

                                            eo.setHP(eo.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (eo.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - eo.getAP());
                                            }
                                        } else if (e == 3) {
                                            Troll tr = new Troll();
                                            ene.add("Troll" + tr);
                                            tr.setHP(tr.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (tr.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - tr.getAP());
                                            }
                                        } else if (e == 4) {
                                            Orco or = new Orco();
                                            ene.add("Orco-" + or);
                                            or.setHP(or.getHP() - ((Personajes) players.get(pos)).getAtri().getAP() + ((Personajes) players.get(pos)).getAtri().getCritico());
                                            if (or.getHP() > 0) {
                                                ((Personajes) players.get(pos)).getAtri().setHP(((Personajes) players.get(pos)).getAtri().getHP() - or.getAP());
                                            }
                                        }

                                    }
                                }

                            }
                        } while (juego < 50 &&((Personajes) players.get(pos)).getAtri().getHP()>0);
                        break;
                }
                if(((Personajes) players.get(pos)).getAtri().getHP()>0){
                        System.out.println("HAS GANADO");
                        
                }else{
                    System.out.println("HAS PERDIDO");
                }
        }
    }

}
