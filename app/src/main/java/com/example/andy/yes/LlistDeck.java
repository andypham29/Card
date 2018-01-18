package com.example.andy.yes;

import java.util.LinkedList;

/**
 * Created by Andy on 2017-12-30.
 */

public class LlistDeck extends MainActivity {

    LinkedList<Card> deck = new LinkedList<>();

    public void addToDeck(Card c){
        deck.add(c);
    }
    public void displayDeck(){
        for (Card c : deck){

        }
    }
}
