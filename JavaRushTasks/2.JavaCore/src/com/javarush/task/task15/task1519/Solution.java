package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        while (!"exit".equals(str)) {

            if (!str.isEmpty()) {
                //содержит точку '.', то вызвать метод print для Double;
                try {
                    if (str.indexOf(".") != -1) {
                        Double strDouble = Double.parseDouble(str);
                        //System.out.println(strDouble);
                        print(strDouble);
                        str = scan.nextLine();
                        continue;
                    }
                } catch (RuntimeException e) {
                    //System.out.println(e);
                }

                //меньше либо равно нулю или больше либо равно 128, то вызвать метод print для Integer;
                try {
                    Integer strInteger = Integer.parseInt(str);
                    if (strInteger <= 0 || strInteger >= 128) {
                        //System.out.println("ok");
                        print(strInteger);
                        str = scan.nextLine();
                        continue;
                    }
                } catch (RuntimeException e) {
                    //System.out.println(e);
                }

                //больше нуля, но меньше 128, то вызвать метод print для short;
                try {
                    short strShort = Short.parseShort(str);
                    if (strShort > 0 || strShort < 128) {
                        print(strShort);
                        str = scan.nextLine();
                        continue;
                    }
                } catch (RuntimeException e) {
                    //System.out.println(e);
                }
            }




            print(str);
            str = scan.nextLine();

        }

        scan.close();


    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
