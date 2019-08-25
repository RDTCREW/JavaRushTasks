package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        /*
        Удалить и вставить
        1. Создай список строк.
        2. Добавь в него 5 строк с клавиатуры.
        3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
        4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.


        Требования:
        1. Объяви переменную типа список строк и сразу проинициализируй ee.
        2. Программа должна считывать 5 строк с клавиатуры.
        3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
        4. Программа должна выводить список на экран, каждое значение с новой строки.
        */

        ArrayList<String> list = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
        }

        String str;
        for (int i = 0; i < 13; i++) {
            str = list.get(4);
            list.add(0, str);
            list.remove(5);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
