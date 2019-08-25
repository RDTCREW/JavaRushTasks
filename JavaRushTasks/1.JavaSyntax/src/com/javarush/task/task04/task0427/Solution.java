package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/
import java.io.*;
import java.util.Scanner;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if ( n > 0 && n <= 999 ) {

            if (n % 2 == 0) {
                System.out.print("четное");
            } else {
                System.out.print("нечетное");
            }

            if (n > 0 && n <= 9) {
                System.out.print(" однозначное");
            } else if (n >= 10 && n <= 99) {
                System.out.print(" двузначное");
            } else if (n >= 100 && n <= 999) {
                System.out.print(" трехзначное");
            }
            System.out.println(" число");
        }
    }
}
