package com.endv.game.ultimatedarkness;

/**
 * Created by dwm07 on 2/24/2018.
 */

public class Hero extends Player {
    private final int STARTLP = 20;

    Hero () {
        setLifePoint(STARTLP);
    }

    public int getDefence(){
        return defence;
    }
    public int getAttck(){
        return attack;
    }
    public int getRestore(){
        return restore;
    }
    public int getLifePoint(){
        return lifePoint;
    }
    public int setDefence(){
        return defence = RanPointGen();
    }
    public int setAttck(){
        return attack = RanPointGen();
    }
    public int setRestore(){
        return restore = RanPointGen();
    }
    public int setLifePoint(int l){
        return lifePoint = l;
    }
}
