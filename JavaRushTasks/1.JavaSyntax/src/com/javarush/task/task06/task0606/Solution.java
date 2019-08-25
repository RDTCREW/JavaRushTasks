package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int namber = scan.nextInt();
        int a;

        while (namber > 0) {
            a = namber%10;
            namber = namber/10;

            if( a % 2 == 0 )
                even++;
            else
                odd++;
        }


        System.out.println("Even: " + Solution.even + " Odd: " + Solution.odd);
    }
}
