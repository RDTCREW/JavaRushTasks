package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("ноль");
        } else {
            if (n < 0) {
                System.out.print("отрицательное");
            } else if (n > 0) {
                System.out.print("положительное");
            }
            if (n % 2 == 0) {
                System.out.print(" четное");
            } else {
                System.out.print(" нечетное");
            }
            System.out.println(" число");

        }


    }
}
