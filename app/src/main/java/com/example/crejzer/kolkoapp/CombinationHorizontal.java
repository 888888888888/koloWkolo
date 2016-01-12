package com.example.crejzer.kolkoapp;

import android.util.Log;

/**
 * Created by Crejzer on 2015-12-06.
 */
public class CombinationHorizontal extends Combination {


    public CombinationHorizontal(int x, int y) {
        this.x = x;
        this.y = y;
        stworzKombinacje(this.x, this.y);
    }

    @Override
    public void stworzKombinacje(int x, int y) {

        wynik.put(x, y);
        kombinajca.put(x, y + 1);
        setHead(x, y);
        liczbaKombinacji += 1;
    }

    @Override
    public void sprawdzLiczbeKombinacji(int x, int y) {

        try {

            if (wynik.get(x) == y) {

                combination = true;
            }
        } catch (NullPointerException e) {

        }

        try {
            // sprawdzanie poziomo
            if (kombinajca.get(x) == y && wynik.size() == 1) {

                wynik.put(x+1, kombinajca.get(x));
                kombinajca.put(x, y+1);
                liczbaKombinacji += 1;
                combination = true;

            }
            else if (kombinajca.get(x) == y && wynik.size() == 2) {

                wynik.put(x+2, kombinajca.get(x));
                kombinajca.put(x, y+1);
                liczbaKombinacji += 1;
                combination = true;
            } else if (kombinajca.get(x) == y && wynik.size() == 3) {

                wynik.put(x+3, kombinajca.get(x));
                kombinajca.put(x, y+1);
                liczbaKombinacji += 1;
                combination = true;
            } else if (kombinajca.get(x) == y && wynik.size() == 4) {

                wynik.put(x+4, kombinajca.get(x));
                kombinajca.put(x, y+1);
                liczbaKombinacji += 1;
                combination = true;
            }

        } catch (NullPointerException e) {

        }
    }
}
