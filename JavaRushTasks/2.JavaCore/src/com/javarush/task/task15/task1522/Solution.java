package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
        //System.out.println(thePlanet);
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.isEmpty()){
            if (thePlanet != null){
                thePlanet = null;
            }
        } else if (str.equals(Planet.SUN)){
            if (thePlanet == null || !(thePlanet instanceof Sun) ){
                thePlanet = Sun.getInstance();
            }
        } else if (str.equals(Planet.EARTH)){
            if (thePlanet == null || !(thePlanet instanceof Earth) ){
                thePlanet = Earth.getInstance();
            }
        } else if (str.equals(Planet.MOON)){
            if (thePlanet == null || !(thePlanet instanceof Moon) ){
                thePlanet = Moon.getInstance();
            }
        } else {
            if (thePlanet != null){
                thePlanet = null;
            }
        }
        scan.close();


    }
}
