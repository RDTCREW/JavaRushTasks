package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {

        int maxJ = array.length;
        int maxI = maxJ-1;
        int el_I;

        for (int i = 0; i<maxI; i++){
            for (int j = i+1; j<maxJ; j++){
                if (array[i]>array[j]){
                    el_I = array[i];
                    array[i]=array[j];
                    array[j]=el_I;
                }
            }
        }
        /*
        int el;
        for (int i = array.length/2; i>=0; i--){
            el = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = el;
        }
        */

    }
}
