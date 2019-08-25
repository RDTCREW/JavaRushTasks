package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int summa = 0;
        while (true) {
            int number = scan.nextInt();
            summa += number;
            if (number == -1)
                break;
        }
        System.out.println(summa);
    }
}
