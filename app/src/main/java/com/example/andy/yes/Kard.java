package com.example.andy.yes;

/**
 * Created by Andy on 2018-01-05.
 */

public class Kard {

//    String[] type = {"spade", "heart", "club", "diamond"};
//    int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};

    String type;
    int value;


    public Kard(){
        this.type = "none";
        this.value = 0;
    }

    public Kard(String type, int value){
        this.type = type;
        this.value = value;
    }

    public void setType(String type){
        this.type = type;
    }
    public void setValue(int value){
        this.value = value;
    }

    public String getType(){
        return this.type;
    }
    public int getValue(){
        return this.value;
    }



}
