package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int summ=0;
        int count=0;
        int number;
        Scanner scan = new Scanner(System.in);

        while (true) {
            number = scan.nextInt();
            if (number == -1)
                break;

            summ += number;
            count += 1;
        }

        System.out.println((double)summ / (double)count);


    }
}

