package com.example.crejzer.kolkoapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.TreeMap;

/**
 * Created by Crejzer on 2015-09-15.
 */
public class Game extends Activity {

    private static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Player";
    private static final String EXTRA_MESSAGE2 = "com.example.crejzer.kolkoapp.Player2";

    private TreeMap<Integer, Combination> kolekcjaPoziom1 = new TreeMap<>();
    private TreeMap<Integer, Combination> kolekcjaPion1 = new TreeMap<>();

    private TreeMap<Integer, Combination> kolekcjaPoziom2 = new TreeMap<>();
    private TreeMap<Integer, Combination> kolekcjaPion2 = new TreeMap<>();

    private boolean nowyObiektPoziom = true;
    private boolean nowyObiektPion = true;

    private int tura = 0;

    Intent intent = null;
    TextView textView = null;
    ImageButton imageButton2 = null;
    ImageButton imageButtonA = null;
    ImageButton imageButtonB = null;
    ImageButton imageButtonC = null;
    ImageButton imageButtonD = null;
    ImageButton imageButtonE = null;
    ImageButton imageButton3 = null;
    ImageButton imageButton4 = null;
    ImageButton imageButton5 = null;
    ImageButton imageButton6 = null;
    ImageButton imageButton7 = null;
    ImageButton imageButton8 = null;
    ImageButton imageButton9 = null;
    ImageButton imageButton10 = null;
    ImageButton imageButton11 = null;
    ImageButton imageButton12 = null;
    ImageButton imageButton13 = null;
    ImageButton imageButton14 = null;
    ImageButton imageButton15 = null;
    ImageButton imageButton36 = null;
    ImageButton imageButton37 = null;
    ImageButton imageButton38 = null;
    ImageButton imageButton39 = null;
    ImageButton imageButton40 = null;
    ImageButton imageButton = null;

    private int counterPion1;
    private int counterPoziom1;
    private int counterPion2;
    private int counterPoziom2;

    private int suma = 0;

    ImageButton[][] plansza = null;
    boolean[][] buttonFlags = null;

    public void buttonCreater(){

        textView = (TextView) findViewById(R.id.nickGracza);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setVisibility(View.VISIBLE);
        imageButton.setBackgroundColor(Color.TRANSPARENT);

        imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        imageButton2.setVisibility(View.VISIBLE);
        imageButton2.setBackgroundColor(Color.TRANSPARENT);

        imageButtonA = (ImageButton) findViewById(R.id.a);
        imageButtonA.setVisibility(View.VISIBLE);
        imageButtonA.setBackgroundColor(Color.TRANSPARENT);

        imageButtonB = (ImageButton) findViewById(R.id.b);
        imageButtonB.setVisibility(View.VISIBLE);
        imageButtonB.setBackgroundColor(Color.TRANSPARENT);

        imageButtonC = (ImageButton) findViewById(R.id.c);
        imageButtonC.setVisibility(View.VISIBLE);
        imageButtonC.setBackgroundColor(Color.TRANSPARENT);

        imageButtonD = (ImageButton) findViewById(R.id.d);
        imageButtonD.setVisibility(View.VISIBLE);
        imageButtonD.setBackgroundColor(Color.TRANSPARENT);

        imageButtonE = (ImageButton) findViewById(R.id.e);
        imageButtonE.setVisibility(View.VISIBLE);
        imageButtonE.setBackgroundColor(Color.TRANSPARENT);

        imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        imageButton3.setVisibility(View.VISIBLE);
        imageButton3.setBackgroundColor(Color.TRANSPARENT);

        imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        imageButton4.setVisibility(View.VISIBLE);
        imageButton4.setBackgroundColor(Color.TRANSPARENT);

        imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        imageButton5.setVisibility(View.VISIBLE);
        imageButton5.setBackgroundColor(Color.TRANSPARENT);

        imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        imageButton6.setVisibility(View.VISIBLE);
        imageButton6.setBackgroundColor(Color.TRANSPARENT);

        imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        imageButton7.setVisibility(View.VISIBLE);
        imageButton7.setBackgroundColor(Color.TRANSPARENT);

        imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        imageButton8.setVisibility(View.VISIBLE);
        imageButton8.setBackgroundColor(Color.TRANSPARENT);

        imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        imageButton9.setVisibility(View.VISIBLE);
        imageButton9.setBackgroundColor(Color.TRANSPARENT);

        imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        imageButton10.setVisibility(View.VISIBLE);
        imageButton10.setBackgroundColor(Color.TRANSPARENT);

        imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
        imageButton11.setVisibility(View.VISIBLE);
        imageButton11.setBackgroundColor(Color.TRANSPARENT);

        imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
        imageButton12.setVisibility(View.VISIBLE);
        imageButton12.setBackgroundColor(Color.TRANSPARENT);

        imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
        imageButton13.setVisibility(View.VISIBLE);
        imageButton13.setBackgroundColor(Color.TRANSPARENT);

        imageButton14 = (ImageButton) findViewById(R.id.imageButton14);
        imageButton14.setVisibility(View.VISIBLE);
        imageButton14.setBackgroundColor(Color.TRANSPARENT);

        imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
        imageButton15.setVisibility(View.VISIBLE);
        imageButton15.setBackgroundColor(Color.TRANSPARENT);

        imageButton36 = (ImageButton) findViewById(R.id.imageButton36);
        imageButton36.setVisibility(View.VISIBLE);
        imageButton36.setBackgroundColor(Color.TRANSPARENT);

        imageButton37 = (ImageButton) findViewById(R.id.imageButton37);
        imageButton37.setVisibility(View.VISIBLE);
        imageButton37.setBackgroundColor(Color.TRANSPARENT);

        imageButton38 = (ImageButton) findViewById(R.id.imageButton38);
        imageButton38.setVisibility(View.VISIBLE);
        imageButton38.setBackgroundColor(Color.TRANSPARENT);

        imageButton39 = (ImageButton) findViewById(R.id.imageButton39);
        imageButton39.setVisibility(View.VISIBLE);
        imageButton39.setBackgroundColor(Color.TRANSPARENT);

        imageButton40 = (ImageButton) findViewById(R.id.imageButton40);
        imageButton40.setVisibility(View.VISIBLE);
        imageButton40.setBackgroundColor(Color.TRANSPARENT);

        plansza = new ImageButton[][] {{imageButton2,imageButtonB,imageButtonC,imageButtonD,imageButtonE},{imageButtonA,imageButton,imageButton3,imageButton4,imageButton5},{imageButton36,imageButton37,imageButton38,imageButton39,imageButton40},{imageButton6,imageButton7,imageButton8,imageButton9,imageButton10},{imageButton11,imageButton12,imageButton13,imageButton14,imageButton15}};
        buttonFlags = new boolean[][] {{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false},{false,false,false,false,false}};
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        buttonCreater();
        intent = getIntent();
        wyswietlGracza();
    }

    private void zmianiaTury(){

        if (tura == 1){

            tura = 0;
        }else {

            tura = 1;
        }
    }

    private void mergeCombination(TreeMap<Integer, Combination> kolekcjaPoziom,
                                         TreeMap<Integer, Combination> kolekcjaPion, int counterPoziom, int counterPion) throws NullPointerException {

        int x;
        int y;
        int xToCheck;
        int yToCheck;

        if (kolekcjaPoziom.size() > 0) {

            for (int i = 0; i <= counterPoziom; i++) {

                Combination kombinacja = kolekcjaPoziom.get(i);

                if(kombinacja == null){
                    continue;
                }

                for (int j = 0; j <= counterPoziom; j++) {

                        if (i != j) {

                            try{
                                Combination kombinacjaToCheck = kolekcjaPoziom.get(j);
                                if(kombinacjaToCheck == null){
                                    continue;
                                }
                                xToCheck = kombinacjaToCheck.getHeadX();
                                yToCheck = kombinacjaToCheck.getHeadY();
                                y = kombinacja.getKombinajca().get(xToCheck);
                            }catch(NullPointerException e){

                               continue;
                            }
                            if (y == yToCheck) {

                                Log.d("test", "MERGE! ->" + xToCheck + " " + yToCheck);

                                for (int ele = kombinacja.getHeadY(); ele <= y; ele++){
                                    kombinacja.sprawdzLiczbeKombinacji(xToCheck, ele);
                                }

                                kombinacja.reset();
                                kolekcjaPoziom.remove(j);
                            }
                        }
                }
            }
        }

        /* wypisywanie uwaga mozliwe bledy*/
        if (kolekcjaPoziom.size() > 0) {

            for (int i = 0; i <= counterPion; i++) {

                Combination kombinacje = kolekcjaPoziom.get(i);

                try {
                    Log.d("test", (tura + 1) + "Poziom: " + (i + 1) + "->" + kombinacje.getLiczbaKombinacji());
                } catch (NullPointerException e) {
                    // TODO: handle exception
//						System.out.println("wolne miejsce na " + puste);
                }
            }
        }

        if (kolekcjaPion.size() > 0) {

            for (int i = 0; i <= counterPion; i++) {

                Combination kombinacja = kolekcjaPion.get(i);
                if(kombinacja == null){
                    continue;
                }

                for (int j = 0; j <= counterPion; j++) {

                    if (i != j) {

                        try {
                            Combination kombinacjaToCheck = kolekcjaPion.get(j);
                            if(kombinacjaToCheck == null){
                                continue;
                            }
                            xToCheck = kombinacjaToCheck.getHeadX();
                            yToCheck = kombinacjaToCheck.getHeadY();
                            x = kombinacja.getKombinajca().get(yToCheck);

                        } catch (NullPointerException e) {
                            continue;
                        }
                        if (x == xToCheck) {

                            Log.d("test", "MERGE! ->" + xToCheck + " " + yToCheck);

                            for (int ele = kombinacja.getHeadX(); ele <= x; ele++) {
                                kombinacja.sprawdzLiczbeKombinacji(ele, yToCheck);
                            }

                            kombinacja.reset();
                            kolekcjaPion.remove(j);
                        }
                    }
                }
            }
        }

        if (kolekcjaPion.size() > 0) {
            for (int i = 0; i <= counterPion; i++) {

                Combination kombinacje = kolekcjaPion.get(i);
                try{
                    Log.d("test", (tura + 1) + "Pion: " + (i + 1) + "->" + kombinacje.getLiczbaKombinacji());
                } catch(NullPointerException e){

                }
            }
        }

        if (tura == 1) {

            kolekcjaPoziom1 = kolekcjaPoziom;
            kolekcjaPion1 = kolekcjaPion;
        } else {

            kolekcjaPoziom2 = kolekcjaPoziom;
            kolekcjaPion2 = kolekcjaPion;
        }
    }

    private void sprawdzPlansze(int x, int y, TreeMap<Integer, Combination> kolekcjaPoziom,
                                       TreeMap<Integer, Combination> kolekcjaPion, int counterPoziom, int counterPion)
            throws NullPointerException{

        Log.d("test","Dotyk->"+x+" "+y);

        if (kolekcjaPoziom.isEmpty() && kolekcjaPion.isEmpty()) {

            Combination kombinacje = new CombinationHorizontal(x, y);
            kolekcjaPoziom.put(counterPoziom, kombinacje);

            kombinacje = new CombinationVertical(x, y);
            kolekcjaPion.put(counterPion, kombinacje);

            counterPion++;
            counterPoziom++;

            nowyObiektPoziom = false;
            nowyObiektPion = false;
        } else {

            for (int i = 0; i < kolekcjaPoziom.size(); i++) {

                Combination kombinacje = kolekcjaPoziom.get(i);
                if(kombinacje != null){
                    kombinacje.sprawdzLiczbeKombinacji(x, y);

                    if (kombinacje.isCombination()) {

                        nowyObiektPoziom = false;
                        kombinacje.reset();
                    }
                }
            }

            for (int i = 0; i < kolekcjaPion.size(); i++) {

                Combination kombinacje = kolekcjaPion.get(i);
                if(kombinacje != null){
                    kombinacje.sprawdzLiczbeKombinacji(x, y);

                    if (kombinacje.isCombination()) {

                        nowyObiektPion = false;
                        kombinacje.reset();
                    }
                }
            }
        }
        if (nowyObiektPoziom) {

            Combination kombinacje = new CombinationHorizontal(x, y);
            kolekcjaPoziom.put(counterPoziom, kombinacje);

            counterPoziom++;
        }

        if (nowyObiektPion) {

            Combination kombinacje = new CombinationVertical(x, y);
            kolekcjaPion.put(counterPion, kombinacje);

            counterPion++;
        }

        mergeCombination(kolekcjaPoziom, kolekcjaPion, counterPoziom, counterPion);

		/*
		 * zpisywanie wartosci lokalnych do wartosci globalnych aby poczas
		 * nastepnej iteracji nie stracic wartosci licznikow
		 */
        if (tura == 1) {

            counterPion1 = counterPion;
            counterPoziom1 = counterPoziom;
            kolekcjaPoziom1 = kolekcjaPoziom;
            kolekcjaPion1 = kolekcjaPion;
        } else {

            counterPion2 = counterPion;
            counterPoziom2 = counterPoziom;
            kolekcjaPoziom2 = kolekcjaPoziom;
            kolekcjaPion2 = kolekcjaPion;
        }
    }

    private void ruch(int x, int y){

        if(tura == 1){
            sprawdzPlansze(x, y, kolekcjaPoziom1, kolekcjaPion1, counterPoziom1, counterPion1);
        } else {
            sprawdzPlansze(x, y, kolekcjaPoziom2, kolekcjaPion2, counterPoziom2, counterPion2);
        }
    }

    private  void stworzObiekt(ImageButton button){
        if(tura == 1){
            button.setBackgroundResource(R.drawable.red_circle);
        }else {
            button.setBackgroundResource(R.drawable.blue_circle);
        }
    }

    public void buttonLisiner(View v){
        switch(v.getId()) {
            case R.id.imageButton:
                if(!buttonFlags[1][1]) {

                    stworzObiekt(imageButton);
                    ruch(1, 1);
                    zmianiaTury();
                    buttonFlags[1][1] = true;
                } else {

                    int kierunek = sprawdzPunkty(1,1);
                    Log.d("test", "kierunek " + String.valueOf(kierunek));
                    usunButton(1, 1, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[1][1] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton2:
                if(!buttonFlags[0][0]) {
                    stworzObiekt(imageButton2);
                    ruch(0, 0);
                    zmianiaTury();
                    buttonFlags[0][0] = true;
                } else {

                    int kierunek = sprawdzPunkty(0,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 0, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[0][0] = false;
                    zmianiaTury();
                }
                break;
            case R.id.a:
                if(!buttonFlags[1][0]) {
                    stworzObiekt(imageButtonA);
                    ruch(1, 0);
                    zmianiaTury();
                    buttonFlags[1][0] = true;
                } else {

                    int kierunek = sprawdzPunkty(1,0);
                    Log.d("test", "kierunek " + String.valueOf(kierunek));
                    usunButton(1, 0, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[1][0]= false;
                    zmianiaTury();
                }
                break;
            case R.id.b:
                if(!buttonFlags[0][1]) {
                    stworzObiekt(imageButtonB);
                    ruch(0, 1);
                    zmianiaTury();
                    buttonFlags[0][1] = true;
                }else {

                    int kierunek = sprawdzPunkty(0,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 1, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[0][1] = false;
                    zmianiaTury();
                }
                break;
            case R.id.c:
                if(!buttonFlags[0][2]) {
                    stworzObiekt(imageButtonC);
                    ruch(0, 2);
                    zmianiaTury();
                    buttonFlags[0][2] = true;
                } else {

                    int kierunek = sprawdzPunkty(0,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 2, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[0][2] = false;
                    zmianiaTury();
                }
                break;
            case R.id.d:
                if(!buttonFlags[0][3]) {
                    stworzObiekt(imageButtonD);
                    ruch(0, 3);
                    zmianiaTury();
                    buttonFlags[0][3] = true;
                } else {

                    int kierunek = sprawdzPunkty(0,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 3, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[0][3] = false;
                    zmianiaTury();
                }
                break;
            case R.id.e:
                if(!buttonFlags[0][4]) {
                    stworzObiekt(imageButtonE);
                    ruch(0, 4);
                    zmianiaTury();
                    buttonFlags[0][4] = true;
                }else {

                    int kierunek = sprawdzPunkty(0,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 4, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[0][4] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton3:
                if(!buttonFlags[1][2]) {

                    stworzObiekt(imageButton3);
                    ruch(1, 2);
                    zmianiaTury();
                    buttonFlags[1][2] = true;
                }else {

                    int kierunek = sprawdzPunkty(1,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(1, 2, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[1][2] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton4:
                if(!buttonFlags[1][3]) {

                    stworzObiekt(imageButton4);
                    ruch(1, 3);
                    zmianiaTury();
                    buttonFlags[1][3]= true;
                }else {

                    int kierunek = sprawdzPunkty(1,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(1, 3, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[1][3] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton5:
                if(!buttonFlags[1][4]) {
                    stworzObiekt(imageButton5);
                    ruch(1, 4);
                    zmianiaTury();
                    buttonFlags[1][4] = true;
                }else {

                    int kierunek = sprawdzPunkty(1,4);
                    Log.d("test", "kierunek " + String.valueOf(kierunek));
                    usunButton(1, 4, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[1][4]= false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton6:
                if(!buttonFlags[3][0]) {
                    stworzObiekt(imageButton6);
                    ruch(3, 0);
                    zmianiaTury();
                    buttonFlags[3][0] = true;
                }else {

                    int kierunek = sprawdzPunkty(3,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 0, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[3][0] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton7:
                if(!buttonFlags[3][1]) {
                    stworzObiekt(imageButton7);
                    ruch(3, 1);
                    zmianiaTury();
                    buttonFlags[3][1] = true;
                }else {

                    int kierunek = sprawdzPunkty(3,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 1, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[3][1] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton8:
                if(!buttonFlags[3][2]) {

                    stworzObiekt(imageButton8);
                    ruch(3, 2);
                    zmianiaTury();
                    buttonFlags[3][2] = true;
                }else {

                    int kierunek = sprawdzPunkty(3,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 2, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[3][2] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton9:
                if(!buttonFlags[3][3]) {
                    stworzObiekt(imageButton9);
                    ruch(3, 3);
                    zmianiaTury();
                    buttonFlags[3][3] = true;
                }else {

                    int kierunek = sprawdzPunkty(3,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 3, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[3][3] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton10:
                if(!buttonFlags[3][4]) {
                    stworzObiekt(imageButton10);
                    ruch(3, 4);
                    zmianiaTury();
                    buttonFlags[3][4] = true;
                }else {

                    int kierunek = sprawdzPunkty(3,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 4, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[3][4] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton11:
                if(!buttonFlags[4][0]) {
                    stworzObiekt(imageButton11);
                    ruch(4, 0);
                    zmianiaTury();
                    buttonFlags[4][0] = true;
                }else {

                    int kierunek = sprawdzPunkty(4,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 0, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[4][0] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton12:
                if(!buttonFlags[4][1]) {
                    stworzObiekt(imageButton12);
                    ruch(4, 1);
                    zmianiaTury();
                    buttonFlags[4][1] = true;
                }else {

                    int kierunek = sprawdzPunkty(4,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 1, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[4][1] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton13:
                if(!buttonFlags[4][2]) {
                    stworzObiekt(imageButton13);
                    ruch(4, 2);
                    zmianiaTury();
                    buttonFlags[4][2] = true;
                }else {

                    int kierunek = sprawdzPunkty(4,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 2, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[4][2] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton14:
                if(!buttonFlags[4][3]) {
                    stworzObiekt(imageButton14);
                    ruch(4, 3);
                    zmianiaTury();
                    buttonFlags[4][3] = true;
                }else {

                    int kierunek = sprawdzPunkty(4,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 3, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[4][3] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton15:
                if(!buttonFlags[4][4]) {
                    stworzObiekt(imageButton15);
                    ruch(4, 4);
                    zmianiaTury();
                    buttonFlags[4][4] = true;
                }else {

                    int kierunek = sprawdzPunkty(4,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 4, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[4][4] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton36:
                if(!buttonFlags[2][0]) {
                    stworzObiekt(imageButton36);
                    ruch(2, 0);
                    zmianiaTury();
                    buttonFlags[2][0] = true;
                }else {

                    int kierunek = sprawdzPunkty(2,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2, 0, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[2][0] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton37:
                if(!buttonFlags[2][1]) {
                    stworzObiekt(imageButton37);
                    ruch(2, 1);
                    zmianiaTury();
                    buttonFlags[2][1] = true;
                }else {

                    int kierunek = sprawdzPunkty(2,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2, 1, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[2][1] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton38:
                if(!buttonFlags[2][2]) {
                    stworzObiekt(imageButton38);
                    ruch(2, 2);
                    zmianiaTury();
                    buttonFlags[2][2] = true;
                }else {

                    int kierunek = sprawdzPunkty(2,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2, 2, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[2][2] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton39:
                if(!buttonFlags[2][3]) {
                    stworzObiekt(imageButton39);
                    ruch(2, 3);
                    zmianiaTury();
                    buttonFlags[2][3] = true;
                }else {

                    int kierunek = sprawdzPunkty(2,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2, 3, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[2][3] = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton40:
                if(!buttonFlags[2][4]) {
                    stworzObiekt(imageButton40);
                    ruch(2, 4);
                    zmianiaTury();
                    buttonFlags[2][4] = true;
                }else {

                    int kierunek = sprawdzPunkty(2,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2,4, suma, kierunek);
                    dodajPunkty();
                    buttonFlags[2][4] = false;
                    zmianiaTury();
                }
                break;
        }
    }

    private void usunButton(int x, int y, int suma, int kierunek) {

        ImageButton button = plansza[x][y];
        button.setBackgroundColor(Color.TRANSPARENT);

        if (suma > 1){
            if(kierunek == 0) {

                usunKolekcjePoziom(x, y);
                for (int i = 1; i <= suma - 1; i++) {
                    button = plansza[x][y+ i];
                    buttonFlags[x][y+i] = false;
                    button.setBackgroundColor(Color.TRANSPARENT);
                }
            } else {

                usunKolekcjePion(x,y);
                for (int j = 1; j <= suma - 1; j++){

                    button = plansza[x+j][y];
                    buttonFlags[x+j][y] = false;
                    button.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        }
    }

    private void usunKolekcjePoziom(int x, int y) {

        Combination kolekcja;
        Combination kolekcjaPionToCheck;

        if(tura == 1) {

            for (int i = 0; i < counterPoziom1; i++) {

                try {

                    kolekcja = kolekcjaPoziom1.get(i);
                    if (kolekcja.getHeadX() == x) {
                        if (kolekcja.getHeadY() == y) {

                            for(int j = 0; j < counterPion1; j++) {

                                kolekcjaPionToCheck = kolekcjaPion1.get(j);
                                Log.d("test", "Kolekcja y = " + kolekcjaPionToCheck.getHeadY());
                                if(kolekcjaPionToCheck.getHeadX() == x){
                                    for(int k = 0; k < suma; k++) {
                                        Log.d("test", "Sprawdzam head = " + (y+k));
                                        if (kolekcjaPionToCheck.getHeadY() == (y+k)) {
                                            kolekcjaPion1.remove(j);
                                            Log.d("test", (tura + 1) + " Usuneto kolekcje poion " + i);
                                            break;
                                        }
                                    }
                                }
                            }

                            kolekcjaPoziom1.remove(i);
                            Log.d("test", (tura + 1) + " Usuneto kolekcje poziom " + i);
                        }
                    }

                } catch (NullPointerException e) {

                }
            }
        } else {

            for(int i = 0; i < counterPoziom2; i++) {

                try{

                    kolekcja = kolekcjaPoziom2.get(i);
                    if(kolekcja.getHeadX() == x){
                        if(kolekcja.getHeadY() == y){
                            for(int j = 0; j < counterPion2; j++) {

                                kolekcjaPionToCheck = kolekcjaPion2.get(j);
                                Log.d("test", "Kolekcja y = " + kolekcjaPionToCheck.getHeadY());
                                if(kolekcjaPionToCheck.getHeadX() == x){
                                    for(int k = 0; k < suma; k++) {
                                        Log.d("test", "Sprawdzam head = " + (y+k));
                                        if (kolekcjaPionToCheck.getHeadY() == (y+k)) {
                                            kolekcjaPion2.remove(j);
                                            Log.d("test", (tura + 1) + " Usuneto kolekcje poion " + i);
                                            break;
                                        }
                                    }
                                }
                            }

                            kolekcjaPoziom2.remove(i);
                            Log.d("test", (tura + 1) + " Usuneto kolekcje poziom " + i);
                        }
                    }

                }catch (NullPointerException e){

                }
            }
        }
    }

    private void usunKolekcjePion(int x, int y) {

        Combination kolekcja;
        Combination kolekcjaPoziomToCheck;

        if(tura == 1) {

            for (int i = 0; i <= kolekcjaPion1.size(); i++) {

                try {

                    kolekcja = kolekcjaPion1.get(i);
                    if (kolekcja.getHeadX() == x) {
                        if (kolekcja.getHeadY() == y) {

                            for(int j = 0; j < counterPoziom1; j++) {

                                kolekcjaPoziomToCheck = kolekcjaPoziom1.get(j);
                                Log.d("test", "Kolekcja x = " + kolekcjaPoziomToCheck.getHeadX());
                                if(kolekcjaPoziomToCheck.getHeadY() == y){
                                    for(int k = 0; k < suma; k++) {
                                        Log.d("test", "Sprawdzam head = " + (x+k));
                                        if (kolekcjaPoziomToCheck.getHeadX() == (x+k)) {
                                            kolekcjaPoziom1.remove(j);
                                            Log.d("test", (tura + 1) + " Usuneto kolekcje poziom " + i);
                                            break;
                                        }
                                    }
                                }
                            }

                            kolekcjaPion1.remove(i);
                            Log.d("test", (tura + 1) + " Usuneto kolekcje pion " + i);
                        }
                    }

                } catch (NullPointerException e) {

                }
            }
        } else {

            for(int i = 0; i <= kolekcjaPion2.size(); i++) {

                try{

                    kolekcja = kolekcjaPion2.get(i);
                    if(kolekcja.getHeadX() == x){
                        if(kolekcja.getHeadY() == y){

                            for(int j = 0; j < counterPoziom2; j++) {

                                kolekcjaPoziomToCheck = kolekcjaPoziom2.get(j);
                                Log.d("test", "Kolekcja x = " + kolekcjaPoziomToCheck.getHeadX());
                                if(kolekcjaPoziomToCheck.getHeadY() == y){
                                    for(int k = 0; k < suma; k++) {
                                        Log.d("test", "Sprawdzam head = " + (x+k));
                                        if (kolekcjaPoziomToCheck.getHeadX() == (x+k)) {
                                            kolekcjaPoziom2.remove(j);
                                            Log.d("test", (tura + 1) + " Usuneto kolekcje poziom " + i);
                                            break;
                                        }
                                    }
                                }
                            }

                            kolekcjaPion2.remove(i);
                            Log.d("test", (tura + 1) + " Usuneto kolekcje pion " + i);
                        }
                    }

                }catch (NullPointerException e){

                }
            }
        }
    }

    private int sprawdzPunkty(int x, int y) {

        int sumaPoziomo = 0;
        int sumaPionowo = 0;
        this.suma = 0;

        if(tura == 1) {

            for(int i = 0; i <= kolekcjaPoziom1.size(); i++) {

                try{

                    Combination kolekcja = kolekcjaPoziom1.get(i);
                    if(kolekcja.getHeadX() == x){
                        if(kolekcja.getHeadY() == y){

                            sumaPoziomo = kolekcja.getLiczbaKombinacji();
                            Log.d("test", (tura+1)+" dla x ="+x+" y="+y+" liczba kom poziomo to "+ sumaPoziomo);
                        }
                    }

                }catch (NullPointerException e){

                }
            }

            for(int i = 0; i <= kolekcjaPion1.size(); i++) {

                try{

                    Combination kolekcja = kolekcjaPion1.get(i);
                    if(kolekcja.getHeadX() == x){
                        if(kolekcja.getHeadY() == y){

                            sumaPionowo = kolekcja.getLiczbaKombinacji();
                            Log.d("test", (tura+1)+" dla x ="+x+" y="+y+" liczba kom pionowo to "+sumaPionowo);
                        }
                    }

                }catch (NullPointerException e){

                }
            }

            suma = (sumaPoziomo >= sumaPionowo) ? sumaPoziomo:sumaPionowo;
            Log.d("test", "suma" + String.valueOf(suma));

            return (sumaPoziomo >= sumaPionowo) ? 0:1;
        } else {

            for(int i = 0; i <= kolekcjaPoziom2.size(); i++) {

                try{

                    Combination kolekcja = kolekcjaPoziom2.get(i);
                    if(kolekcja.getHeadX() == x){
                        if(kolekcja.getHeadY() == y){
                            sumaPoziomo = kolekcja.getLiczbaKombinacji();
                            Log.d("test", (tura+1)+" dla x ="+x+" y="+y+" liczba kom poziomo to "+ sumaPoziomo);
                        }
                    }

                }catch (NullPointerException e){

                }
            }

            for(int i = 0; i <= kolekcjaPion2.size(); i++) {

                try{

                    Combination kolekcja = kolekcjaPion2.get(i);
                    if(kolekcja.getHeadX() == x){
                        if(kolekcja.getHeadY() == y){
                            sumaPionowo = kolekcja.getLiczbaKombinacji();
                            Log.d("test", (tura+1)+" dla x ="+x+" y="+y+" liczba kom pionowo to "+sumaPionowo);
                        }
                    }

                }catch (NullPointerException e){

                }
            }

            suma = (sumaPoziomo >= sumaPionowo) ? sumaPoziomo:sumaPionowo;
            Log.d("test", String.valueOf(suma));

            return (sumaPoziomo >= sumaPionowo) ? 0:1;
        }
    }

    //ogarnac sume na fibonaciego!!!
    private void dodajPunkty() {

        TextView wynik;

        if(tura == 1){

            wynik = (TextView) findViewById(R.id.wynik2);

            try {

                int tmpSuma = Integer.valueOf(String.valueOf(wynik.getText()));
                this.suma += tmpSuma;
            } catch (NumberFormatException e){

            }

            wynik.setText(String.valueOf(this.suma));
        } else {

            wynik = (TextView) findViewById(R.id.wynik1);

            try {

                int tmpSuma = Integer.valueOf(String.valueOf(wynik.getText()));
                this.suma += tmpSuma;
            }catch (NumberFormatException e){

            }

            wynik.setText(String.valueOf(this.suma));
        }
    }

    public void wyswietlGracza(){

        String player1 = intent.getStringExtra(EXTRA_MESSAGE);
        String player2 = intent.getStringExtra(EXTRA_MESSAGE2);

        if (tura == 1){

            textView.setText(player2);
        } else {

            textView.setText(player1);
        }
    }

    public void drawItem(View view) {

        nowyObiektPoziom = true;
        nowyObiektPion = true;

        buttonLisiner(view);
        wyswietlGracza();
    }
}