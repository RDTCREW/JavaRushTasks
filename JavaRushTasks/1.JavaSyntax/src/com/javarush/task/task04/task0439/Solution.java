package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        for (int i = 10; i>0 ; i--) {
            System.out.println(name + " любит меня.");
        }

    }
}
