package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String fileName1 = scan.nextLine();
        String fileName2 = scan.nextLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        byte[] buff1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buff1);
        fileInputStream1.close();

        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        byte[] buff2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buff2);
        fileInputStream2.close();

        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
        fileOutputStream1.write(buff2);
        fileOutputStream1.write(buff1);
        fileOutputStream1.close();
    }
}
