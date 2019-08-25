package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int summ  = 0;
        String text;

        Scanner scan = new Scanner(System.in);

        while (true) {

            text = scan.nextLine();
            if (text.equals("сумма"))
                break;
            else
                summ += Integer.parseInt(text);
        }
        System.out.println(summ);


    }
}
