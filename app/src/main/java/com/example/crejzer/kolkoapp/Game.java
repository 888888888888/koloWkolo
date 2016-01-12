package com.example.crejzer.kolkoapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by Crejzer on 2015-09-15.
 */
public class Game extends Activity {

    public static final String EXTRA_MESSAGE = "com.example.crejzer.kolkoapp.Menu";
    public static final String EXTRA_MESSAGE2 = "com.example.crejzer.kolkoapp.Menu2";

    private TreeMap<Integer, Combination> kolekcjaPoziom1 = new TreeMap<>();
    private TreeMap<Integer, Combination> kolekcjaPion1 = new TreeMap<>();

    private TreeMap<Integer, Combination> kolekcjaPoziom2 = new TreeMap<>();
    private TreeMap<Integer, Combination> kolekcjaPion2 = new TreeMap<>();

    private boolean nowyObiektPoziom = true;
    private boolean nowyObiektPion = true;

    private int tura = 0;

    //dodac do marge, gdy sie napisze algorytm optymalizacji wykorzystania pamieci
    // i wstawiania combinacji do kolekcji na puste miejsca
    private int puste = 999;

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

    private boolean buttonFlaga = false;
    private boolean button2Flaga = false;
    private boolean buttonAFlaga = false;
    private boolean buttonBFlaga = false;
    private boolean buttonCFlaga = false;
    private boolean buttonDFlaga = false;
    private boolean buttonEFlaga = false;
    private boolean button3Flaga = false;
    private boolean button4Flaga = false;
    private boolean button5Flaga = false;
    private boolean button6Flaga = false;
    private boolean button7Flaga = false;
    private boolean button8Flaga = false;
    private boolean button9Flaga = false;
    private boolean button10Flaga = false;
    private boolean button11Flaga = false;
    private boolean button12Flaga = false;
    private boolean button13Flaga = false;
    private boolean button14Flaga = false;
    private boolean button15Flaga = false;
    private boolean button36Flaga = false;
    private boolean button37Flaga = false;
    private boolean button38Flaga = false;
    private boolean button39Flaga = false;
    private boolean button40Flaga = false;

    ImageButton[][] plansza = null;


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

    //marge czasem zle dziala dla przypadku 2,1,3,4,5 i  3,2,4,5 czyli jedna wstecz i pozniej normalnie caly czas do przodu (liczy wtedy jedna mniej....)
    private void mergeCombination(TreeMap<Integer, Combination> kolekcjaPoziom,
                                         TreeMap<Integer, Combination> kolekcjaPion) throws NullPointerException {


        int x;
        int y;
        int xToCheck;
        int yToCheck;

        if (kolekcjaPoziom.size() > 0) {

            for (int i = 0; i <= kolekcjaPoziom.size(); i++) {

                Combination kombinacja = kolekcjaPoziom.get(i);

                for (int j = 0; j <= kolekcjaPoziom.size(); j++) {

                    puste = 999;

					/*trzeba wstawiac wartosc do kolekcji na puste miejsce*/
                    if(puste == 999){

                        if (i != j) {

                            try{
                                Combination kombinacjaToCheck = kolekcjaPoziom.get(j);
                                xToCheck = kombinacjaToCheck.getHeadX();
                                yToCheck = kombinacjaToCheck.getHeadY();
                                y = kombinacja.getKombinajca().get(xToCheck);
                            }catch(NullPointerException e){

                                y = 999;
                                xToCheck = 9999;
                                yToCheck = 9999;
                            }
                            if (y == yToCheck) {

                                Log.d("test", "MERGE! ->" + xToCheck + " " + yToCheck);

                                for (int ele = kombinacja.getHeadY(); ele <= y; ele++){
                                    kombinacja.sprawdzLiczbeKombinacji(xToCheck, ele);
                                }

                                kombinacja.reset();
                                kolekcjaPoziom.remove(j);
                                puste = j;
                            }
                        }
						/* trzeba zapisac do globala! */

                    }
                }
            }
        }

			/* wypisywanie */
        if (kolekcjaPoziom.size() > 0) {

            for (int i = 0; i <= kolekcjaPoziom.size(); i++) {

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

            for (int i = 0; i <= kolekcjaPion.size(); i++) {

                Combination kombinacja = kolekcjaPion.get(i);
                for (int j = 0; j <= kolekcjaPion.size(); j++) {

                    if (i != j) {

                        try {

                            Combination kombinacjaToCheck = kolekcjaPion.get(j);
                            xToCheck = kombinacjaToCheck.getHeadX();
                            yToCheck = kombinacjaToCheck.getHeadY();
                            x = kombinacja.getKombinajca().get(yToCheck);
                        } catch (NullPointerException e) {

                            x = 999;
                            xToCheck = 9999;
                            yToCheck = 9999;
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
            for (int i = 0; i <= kolekcjaPion.size(); i++) {

                Combination kombinacje = kolekcjaPion.get(i);
                try{
                    Log.d("test", (tura + 1) + "Pion: " + (i + 1) + "->" + kombinacje.getLiczbaKombinacji());
                } catch(NullPointerException e){

                    System.out.println("wolne miejsce na " + i);
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

        mergeCombination(kolekcjaPoziom, kolekcjaPion);

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
                if(!buttonFlaga) {

                    stworzObiekt(imageButton);
                    ruch(1, 1);
                    zmianiaTury();
                    buttonFlaga = true;
                } else {

                    int kierunek = sprawdzPunkty(1,1);
                    Log.d("test", "kierunek " + String.valueOf(kierunek));
                    usunButton(1, 1, suma, kierunek);
                    dodajPunkty(suma);
                    buttonFlaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton2:
                if(!button2Flaga) {
                    stworzObiekt(imageButton2);
                    ruch(0, 0);
                    zmianiaTury();
                    button2Flaga = true;
                } else {

                    int kierunek = sprawdzPunkty(0,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 0, suma, kierunek);
                    dodajPunkty(suma);
                    button2Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.a:
                if(!buttonAFlaga) {
                    stworzObiekt(imageButtonA);
                    ruch(1, 0);
                    zmianiaTury();
                    buttonAFlaga = true;
                } else {

                    int kierunek = sprawdzPunkty(1,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(1, 0, suma, kierunek);
                    dodajPunkty(suma);
                    buttonAFlaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.b:
                if(!buttonBFlaga) {
                    stworzObiekt(imageButtonB);
                    ruch(0, 1);
                    zmianiaTury();
                    buttonBFlaga = true;
                }else {

                    int kierunek = sprawdzPunkty(0,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 1, suma, kierunek);
                    dodajPunkty(suma);
                    buttonBFlaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.c:
                if(!buttonCFlaga) {
                    stworzObiekt(imageButtonC);
                    ruch(0, 2);
                    zmianiaTury();
                    buttonCFlaga = true;
                } else {

                    int kierunek = sprawdzPunkty(0,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 2, suma, kierunek);
                    dodajPunkty(suma);
                    buttonCFlaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.d:
                if(!buttonDFlaga) {
                    stworzObiekt(imageButtonD);
                    ruch(0, 3);
                    zmianiaTury();
                    buttonDFlaga = true;
                } else {

                    int kierunek = sprawdzPunkty(0,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 3, suma, kierunek);
                    dodajPunkty(suma);
                    buttonDFlaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.e:
                if(!buttonEFlaga) {
                    stworzObiekt(imageButtonE);
                    ruch(0, 4);
                    zmianiaTury();
                    buttonEFlaga = true;
                }else {

                    int kierunek = sprawdzPunkty(0,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(0, 4, suma, kierunek);
                    dodajPunkty(suma);
                    buttonEFlaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton3:
                if(!button3Flaga) {

                    stworzObiekt(imageButton3);
                    ruch(1, 2);
                    zmianiaTury();
                    button3Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(1,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(1, 2, suma, kierunek);
                    dodajPunkty(suma);
                    button3Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton4:
                if(!button4Flaga) {

                    stworzObiekt(imageButton4);
                    ruch(1, 3);
                    zmianiaTury();
                    button4Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(1,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(1, 3, suma, kierunek);
                    dodajPunkty(suma);
                    button4Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton5:
                if(!button5Flaga) {
                    stworzObiekt(imageButton5);
                    ruch(1, 4);
                    zmianiaTury();
                    button5Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(1,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(1, 4, suma, kierunek);
                    dodajPunkty(suma);
                    button5Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton6:
                if(!button6Flaga) {
                    stworzObiekt(imageButton6);
                    ruch(3, 0);
                    zmianiaTury();
                    button6Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(3,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 0, suma, kierunek);
                    dodajPunkty(suma);
                    button6Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton7:
                if(!button7Flaga) {
                    stworzObiekt(imageButton7);
                    ruch(3, 1);
                    zmianiaTury();
                    button7Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(3,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 1, suma, kierunek);
                    dodajPunkty(suma);
                    button7Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton8:
                if(!button8Flaga) {

                    stworzObiekt(imageButton8);
                    ruch(3, 2);
                    zmianiaTury();
                    button8Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(3,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 2, suma, kierunek);
                    dodajPunkty(suma);
                    button8Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton9:
                if(!button9Flaga) {
                    stworzObiekt(imageButton9);
                    ruch(3, 3);
                    zmianiaTury();
                    button9Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(3,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 3, suma, kierunek);
                    dodajPunkty(suma);
                    button9Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton10:
                if(!button10Flaga) {
                    stworzObiekt(imageButton10);
                    ruch(3, 4);
                    zmianiaTury();
                    button10Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(3,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(3, 4, suma, kierunek);
                    dodajPunkty(suma);
                    button10Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton11:
                if(!button11Flaga) {
                    stworzObiekt(imageButton11);
                    ruch(4, 0);
                    zmianiaTury();
                    button11Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(4,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 0, suma, kierunek);
                    dodajPunkty(suma);
                    button11Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton12:
                if(!button12Flaga) {
                    stworzObiekt(imageButton12);
                    ruch(4, 1);
                    zmianiaTury();
                    button12Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(4,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 1, suma, kierunek);
                    dodajPunkty(suma);
                    button12Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton13:
                if(!button13Flaga) {
                    stworzObiekt(imageButton13);
                    ruch(4, 2);
                    zmianiaTury();
                    button13Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(4,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 2, suma, kierunek);
                    dodajPunkty(suma);
                    button13Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton14:
                if(!button14Flaga) {
                    stworzObiekt(imageButton14);
                    ruch(4, 3);
                    zmianiaTury();
                    button14Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(4,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 3, suma, kierunek);
                    dodajPunkty(suma);
                    button14Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton15:
                if(!button15Flaga) {
                    stworzObiekt(imageButton15);
                    ruch(4, 4);
                    zmianiaTury();
                    button15Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(4,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(4, 4, suma, kierunek);
                    dodajPunkty(suma);
                    button15Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton36:
                if(!button36Flaga) {
                    stworzObiekt(imageButton36);
                    ruch(2, 0);
                    zmianiaTury();
                    button36Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(2,0);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2, 0, suma, kierunek);
                    dodajPunkty(suma);
                    button36Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton37:
                if(!button37Flaga) {
                    stworzObiekt(imageButton37);
                    ruch(2, 1);
                    zmianiaTury();
                    button37Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(2,1);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2, 1, suma, kierunek);
                    dodajPunkty(suma);
                    button37Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton38:
                if(!button38Flaga) {
                    stworzObiekt(imageButton38);
                    ruch(2, 2);
                    zmianiaTury();
                    button38Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(2,2);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2, 2, suma, kierunek);
                    dodajPunkty(suma);
                    button38Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton39:
                if(!button39Flaga) {
                    stworzObiekt(imageButton39);
                    ruch(2, 3);
                    zmianiaTury();
                    button39Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(2,3);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2, 3, suma, kierunek);
                    dodajPunkty(suma);
                    button39Flaga = false;
                    zmianiaTury();
                }
                break;
            case R.id.imageButton40:
                if(!button40Flaga) {
                    stworzObiekt(imageButton40);
                    ruch(2, 4);
                    zmianiaTury();
                    button40Flaga = true;
                }else {

                    int kierunek = sprawdzPunkty(2,4);
                    Log.d("test", "kierunek "+ String.valueOf(kierunek));
                    usunButton(2,4, suma, kierunek);
                    dodajPunkty(suma);
                    buttonFlaga = false;
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
                for (int i = 1; i <= suma - 1; i++) {
                    button = plansza[x][y+ i];
                    button.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        }
    }

    // marge psuje dodawanie pkt!!!! wysakuja nulle i przez to suma wychodzi 0
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
    private void dodajPunkty(int suma) {

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