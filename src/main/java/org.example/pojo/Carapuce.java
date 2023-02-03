package org.example.pojo;

import org.example.stateType.Type;

public class Carapuce extends Pokemon {



    //Attributs
    private Type type;

    //Constructeur
    public Carapuce (Type type){
        super();
        this.type = type;
    }

    //Accesseur et mutateur
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
