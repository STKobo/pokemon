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
        Pokemon monPokemon = new Pokemon("Tortank", new ArrayList<Capacite>(), 100, false, "combatif");
        System.out.println(monPokemon);

        Map<String, Capacite> ctCapacite = new LinkedHashMap<>();
        ctCapacite.put("1", new Capacite("Balle ombre", 100, 100, Type.SPECTRE));
        System.out.println(ctCapacite);
        for (String i : ctCapacite.keySet()){
            System.out.println ("La ct " + i + " contient : " + ctCapacite.get(i));
        }
    }
}