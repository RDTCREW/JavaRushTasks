package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan =new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a<=b && a>=c) || (a>=b && a<=c)) {
            System.out.println(a);
        } else if ((b<=c && b>=a) || (b>=c && b<=a)) {
            System.out.println(b);
        } else if ((c<=a && c>=b) || (c>=a && c<=b)) {
            System.out.println(c);
        }


    }
}
