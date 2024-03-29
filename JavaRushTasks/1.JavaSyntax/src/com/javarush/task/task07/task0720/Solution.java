package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Требования:
        //1. Объяви переменную типа список строк и сразу проинициализируй ee.
        //2. Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
        //3. Переставить M первых строк в конец списка.
        //4. Выведи список на экран, каждое значение с новой строки.

        ArrayList<String> list = new ArrayList<String>();

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int i=0; i<n; i++) {
            list.add(reader.readLine());
        }

        String str;
        for (int i=0; i<m; i++) {
            str = list.get(0);
            list.remove(0);
            list.add(str);
        }

        for (int i=0; i<n; i++) {
            System.out.println(list.get(i));
        }


    }
}
