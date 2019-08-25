package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int i = scan.nextInt();
        while (i > 0) {
            i -= 1;
            System.out.println(text);
        }

    }
}
