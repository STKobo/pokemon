package org.example.pojo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pokemon {
    // attribut
    private String prenom ;
    private List<Capacite> capacites;
    private Integer niveau;
    private Boolean isShiny;
    private String nature;

    // constructor
    public Pokemon(String prenom, List<Capacite> capacites, Integer niveau, Boolean isShiny, String nature) {
        this.prenom = prenom;
        this.capacites = capacites;
        this.niveau = niveau;
        this.isShiny = isShiny;
        this.nature = nature;
    }


    // On peut avoir d'autres constructeurs, mais le problème ici c'est que nous avons une liste
    // il faut donc initialiser la liste

    public Pokemon(){
        this.capacites = new ArrayList<>();
    }

    public void addCapacities (Capacite capacite){
        if (this.capacites != null && this.capacites.size() < 4){
            // size() commence à partir de 1.
            this.capacites.add(capacite);
        } else if(this.capacites != null) {
            this.menuForbiddenCapacitie(capacite);
        }
    }

    private void menuForbiddenCapacitie(Capacite capacite) {
        System.out.println("Vous connaissez déjà 4 capacités.");
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1 : oubliez une capacité");
        System.out.println("2 : ne rien faire");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre choix : ");
        int saisie = sc.nextInt();
        switch (saisie) {
            case 1:
                Random random = new Random();
                int randomInt = random.nextInt(capacites.size()-1);
                this.capacites.remove(randomInt);
                System.out.println("la capacite " + (randomInt+1) + " a été oubliée ! ");
                break;
            case 2:
                System.out.println("Aucune capacité a été oubliée ! ");
            default :
                System.out.println("Choix incorrect !");
        }
        sc.close();
    }


    public void addCapacites(Capacite capacite){

    }


    //accesseur et mutateur
    public String getPrenom(){
        return this.getPrenom();
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public List<Capacite> getCapacites(){
        return this.getCapacites();
    }
    public void setCapacites(List<Capacite> capacites){
        this.capacites = capacites;
    }

    public Integer getNiveau(){
        return this.getNiveau();
    }
    public void setNiveau(Integer niveau){
        this.niveau = niveau;
    }
    public Boolean getShiny(){
        return this.getShiny();
    }
    public void setShiny(Boolean isShiny){
        this.isShiny = isShiny;
    }
    public String getNature(){
        return this.getNature();
    }
    public void setNature(String nature){
        this.nature = nature;
    }

    @Override
    public String toString(){
        return "Bonjour, je m'appelle " + this.prenom + " et je possède " + this.capacites.size() + " capacités";
    }
}
