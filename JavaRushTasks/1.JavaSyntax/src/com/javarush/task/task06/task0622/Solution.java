package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Числа по возрастанию
*/

public class Solution {

    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        for (int i = 0; i < 5; i++) {
            numbers.add((Integer)Integer.parseInt(reader.readLine()));
        }


        for (int i = 0; i < 5; i++) {

            int size = numbers.size();

            int position = 0;
            int min = numbers.get(position);

            for (int j = 1; j < size; j++) {
                if (min >  numbers.get(j)){
                    min = numbers.get(j);
                    position = j;
                }
            }
            numbers.remove(position);

            System.out.println(min);

        }

    }
}
