package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int count1 = 0;
        int count2 = 0;

        if (a<0)
            count1 += 1;
        if (b<0)
            count1 += 1;
        if (c<0)
            count1 += 1;
        System.out.println("количество отрицательных чисел: " + count1);

        if (a>0)
            count2 += 1;
        if (b>0)
            count2 += 1;
        if (c>0)
            count2 += 1;
        System.out.println("количество положительных чисел: "+count2);
    }
}
