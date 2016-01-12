package com.example.crejzer.kolkoapp;

import java.util.HashMap;

/**
 * Created by Crejzer on 2015-12-06.
 */
public abstract class Combination {

    protected  HashMap<Integer, Integer> wynik = new HashMap<Integer, Integer>();
    protected  HashMap<Integer, Integer> kombinajca = new HashMap<Integer, Integer>();

    protected  int head[] = new int [2];
    protected int x;
    protected  int y;
    protected  int liczbaKombinacji = 0;

    protected boolean combination = false;

    public HashMap<Integer, Integer> getKombinajca() {
        return kombinajca;
    }

    public void setKombinajca(HashMap<Integer, Integer> kombinajca) {
        this.kombinajca = kombinajca;
    }

    public int getHeadX() {

        return head[0];
    }

    public int getHeadY(){

        return head[1];
    }

    public void setHead(int x, int y) {
        int[] head = new int[2];

        for (int i = 0; i < head.length; i++){

            if(i == 0){

                head[i] = x;
            } else {

                head[i] = y;
            }
        }

        this.head = head;
    }

    public int getLiczbaKombinacji() {
        return liczbaKombinacji;
    }

    public boolean isCombination() {
        return combination;
    }

    public void setCombination(boolean combination) {
        this.combination = combination;
    }

    public void reset() {

        setCombination(false);
    }


    public abstract void stworzKombinacje(int x, int y);

    public abstract void sprawdzLiczbeKombinacji(int x, int y);

}
