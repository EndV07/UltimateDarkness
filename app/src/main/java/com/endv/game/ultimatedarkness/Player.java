package com.endv.game.ultimatedarkness;

/**
 * Created by dwm07 on 2/24/2018.
 */

public class Player {
    private final int POINTS= 5;

    int lifePoint;
    int attack;
    int defence;
    int restore;

    protected int RanPointGen(){
        return (int) (Math.random()* POINTS);
    }

}
