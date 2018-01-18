package com.example.andy.yes;

/**
 * Created by Andy on 2017-12-30.
 */

public class Card extends LlistDeck{

    String type;
    String effect;
    String rarety;


    public Card() {
        this.type = "none";
        this.effect = "none";
        this.rarety = "none";
    }

    public Card(String type, String effect, String rarety) {
        this.type = type;
        this.effect = effect;
        this.rarety = rarety;
    }
    public String toString() {
        return(type + "\t| " + effect + " | " + rarety);
    }
}
