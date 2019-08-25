package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] strChar = str.toCharArray();
        char charI;
        char charSpase = ' ';


        ArrayList<Character> listVowel = new ArrayList<>();
        ArrayList<Character> listDontVowel = new ArrayList<>();

        for (int i = 0; i < strChar.length; i++){
            charI = strChar[i];
            if (charI == charSpase)
                continue;
            else if (isVowel(charI))
                listVowel.add(charI);
            else
                listDontVowel.add(charI);
        }

        if (listVowel.size()>0) {
            System.out.print(listVowel.get(0));
            for (int i = 1; i < listVowel.size(); i++){
                System.out.print(" ");
                System.out.print(listVowel.get(i));
            }
            System.out.println(" ");
        };

        if (listDontVowel.size()>0) {
            System.out.print(listDontVowel.get(0));
            for (int i = 1; i < listDontVowel.size(); i++){
                System.out.print(" ");
                System.out.print(listDontVowel.get(i));
            }
            System.out.println(" ");
        };

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}