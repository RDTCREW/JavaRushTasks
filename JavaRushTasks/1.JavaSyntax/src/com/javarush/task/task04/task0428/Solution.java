package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int count = 0;

        if (a>0)
            count += 1;
        if (b>0)
            count += 1;
        if (c>0)
            count += 1;
        System.out.println(count);
    }
}
