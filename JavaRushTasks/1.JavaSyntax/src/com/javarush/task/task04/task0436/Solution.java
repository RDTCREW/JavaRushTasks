package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = m; i > 0; i--){
            for (int j = n; j > 0; j--){
                System.out.print("8");
            }
            System.out.println();
        }


    }
}
