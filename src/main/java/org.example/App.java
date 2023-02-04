package org.example;


import org.example.pojo.Capacite;
import org.example.pojo.Carapuce;
import org.example.pojo.Pokemon;
import org.example.stateType.Type;

import java.util.*;

public class App {
    public static void main(String[] args)
    {
        /*
        String maString = "toto";
        //String maString = new String("toto");
        List<Capacite> mesCapacites = new ArrayList<>(Arrays.asList(
                "Hydrocanon",
                "Surf",
                "Hydroblast"
        ));

         */
        /*
        Pokemon monPokemon = new Pokemon("Tortank", new ArrayList<Capacite>(), 100, false, "combatif");
        System.out.println(monPokemon);

        Map<String, Capacite> ctCapacite = new LinkedHashMap<>();
        ctCapacite.put("1", new Capacite("Balle ombre", 100, 100, Type.SPECTRE));
        System.out.println(ctCapacite);
        for (String i : ctCapacite.keySet()){
            System.out.println ("La ct " + i + " contient : " + ctCapacite.get(i));
        }
         * 
         */
        
         int saisie = 0;
        while (saisie != 4) {
            System.out.println("Que souhaitez-vous faire ? ");
            System.out.println("1: Capturez un Pokemon ");
            System.out.println("2: Attendre ");
            System.out.println("3: Afficher les Pokemon ");
            System.out.println("4: Quitter ");
            Scanner sc = new Scanner(System.in);
            try {
                    saisie = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Vous n'avez pas saisie un numéro ! Retour au menu !");
                } catch (Exception e){
                    System.out.println("Exception non connue");
            }

            Pokemon monPokemon = null;
            switch (saisie) {
                case 1 :
                    monPokemon = new Pokemon();
                    monDresseur.capturerPokemon(monPokemon);
                    pokemonDao.addPokemon(monPokemon);
                    break;
                case 2:
                    continue;
                case 3:
                    System.out.println(pokemonDao.getAllPokemon());
                    break;
                case 4:
                    System.out.println("Merci de votre choix");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez recommencer");
            }
        }

    }
}