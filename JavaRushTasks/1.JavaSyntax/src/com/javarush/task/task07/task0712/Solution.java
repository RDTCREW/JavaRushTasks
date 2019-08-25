package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        /*
        Самые-самые
        1. Создай список строк.
        2. Добавь в него 10 строчек с клавиатуры.
        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
        Если таких строк несколько, то должны быть учтены самые первые из них.
        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.


        Требования:
        1. Объяви переменную типа список строк и сразу проинициализируй ee.
        2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
        3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
        4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
        5. Должна быть выведена только одна строка.
        */

        ArrayList<String> list = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<10 ; i++) {
            list.add(scan.nextLine());
        }

        int length = list.get(0).length();
        int max = length;
        int min = length;
        int indmax = 0;
        int indmin = 0;

        for (int i = 1; i<10 ; i++) {
            length = list.get(i).length();
            if (max < length) {
                max = length;
                indmax = i;
            }
            if (min > length) {
                min = length;
                indmin = i;
            }
        }


        if (indmin < indmax) {
            System.out.println(list.get(indmin));
        } else if (indmax < indmin) {
            System.out.println(list.get(indmax));
        }

    }
}
