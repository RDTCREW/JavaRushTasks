package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        /*
        1. В методе initializeArray():
        1.1. Создайте массив на 20 чисел
        1.2. Считайте с консоли 20 чисел и заполните ими массив

        1. Метод initializeArray должен создавать массив из 20 целых чисел.
        2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
        */

        int[] array = new int[20];

        Scanner scan = new Scanner(System.in);
        for (int i = 0 ; i < 20 ; i++ ){
            array[i] = scan.nextInt();
        }

        return array;
    }

    public static int max(int[] array) {

        //2. Метод max(int[] array) должен находить максимальное число из элементов массива
        //3. Метод max должен возвращать максимальный элемент из переданного массива.

        int x = array[0];
        int max = x;

        for (int i = 1; i<20 ; i++) {
            x = array[i];
            if (max < x)
                max = x;
        }

        return max;
    }
}
