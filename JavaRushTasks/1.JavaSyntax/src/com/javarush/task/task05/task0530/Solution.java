package com.javarush.task.task05.task0530;

//import java.io.*;
import java.util.Scanner;

/* 
Шеф, что-то не пашет
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //int a = reader.read();
        //int b = reader.read();

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
