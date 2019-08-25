package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //1. Объяви переменную типа список целых чисел и сразу проинициализируй ee.
        //2. Считай 10 целых чисел с клавиатуры и добавь их в список.
        //3. Выведи числа в обратном порядке.
        //4. Используй цикл for.

        ArrayList<Integer> num = new ArrayList<Integer>();
        for ( int i=0 ; i<10; i++) {
            num.add(Integer.parseInt(reader.readLine()));
        }

        for ( int i=num.size()-1; i>=0; i--) {
            System.out.println(num.get(i));
        }


    }
}
