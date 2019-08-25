package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        int minByte = 256;
        int cursorByte;

        while (inputStream.available() > 0){
            cursorByte = inputStream.read();
            if (cursorByte<minByte)
                minByte = cursorByte;
        }

        inputStream.close();

        System.out.println(minByte);

    }
}
