package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int i = 1;
        int j;

        while (i<=10){

            j = 1;
            while (j<10){
                System.out.print(j*i);
                System.out.print(" ");
                j += 1;
            }
            System.out.println(j*i);

            i += 1;
        }
    }
}
