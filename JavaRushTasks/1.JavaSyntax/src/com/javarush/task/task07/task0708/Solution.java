package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        /*
        Самая длинная строка
        1. Создай список строк.
        2. Считай с клавиатуры 5 строк и добавь в список.
        3. Используя цикл, найди самую длинную строку в списке.
        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


        Требования:
        1. Инициализируй существующее поле strings класса Solution новым ArrayList<>
        2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
        3. Программа должна выводить самую длинную строку на экран.
        4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
         */

        strings = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i<5; i++) {
            strings.add(scan.nextLine());
        }

        int max = 0;
        int length;
        for (int i = 0; i<5; i++) {
            length = strings.get(i).length();
            if (max < length)
                max = length;
        }

        for (int i = 0; i<5; i++) {
            length = strings.get(i).length();
            if (max == length)
                System.out.println(strings.get(i));
        }




    }
}
