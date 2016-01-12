package com.example.crejzer.kolkoapp;

import android.util.Log;

/**
 * Created by Crejzer on 2015-12-06.
 */
public class CombinationVertical extends Combination {

    public CombinationVertical(int x, int y) {

        this.x = x;
        this.y = y;
        stworzKombinacje(this.x, this.y);
    }

    @Override
    public void stworzKombinacje(int x, int y) {

        wynik.put(y, x);
        kombinajca.put(y, x + 1);
        setHead(x, y);
        liczbaKombinacji += 1;
    }

    @Override
    public void sprawdzLiczbeKombinacji(int x, int y) {
        // TODO Auto-generated method stub

        try {

            if (wynik.get(y) == x) {

                combination = true;
            }
        } catch (NullPointerException e) {

        }

        try {
            // sprawdzanie poziomo
            if (kombinajca.get(y) == x && wynik.size() == 1) {

                wynik.put(y + 1, kombinajca.get(y));
                kombinajca.put(y, x + 1);
                liczbaKombinacji += 1;
                combination = true;

            } else if (kombinajca.get(y) == x && wynik.size() == 2) {

                wynik.put(y + 2, kombinajca.get(y));
                kombinajca.put(y, x + 1);
                liczbaKombinacji += 1;
                combination = true;
            } else if (kombinajca.get(y) == x && wynik.size() == 3) {

                wynik.put(y + 3, kombinajca.get(y));
                kombinajca.put(y, x + 1);
                liczbaKombinacji += 1;
                combination = true;
            } else if (kombinajca.get(y) == x && wynik.size() == 4) {

                wynik.put(y + 4, kombinajca.get(y));
                liczbaKombinacji += 1;
                combination = true;
            }

        } catch (NullPointerException e) {

        }
    }
}
