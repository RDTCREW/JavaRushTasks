package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String fileName1 = scan.nextLine();
        String fileName2 = scan.nextLine();
        String fileName3 = scan.nextLine();

        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);

        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        byte[] buff2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buff2);
        fileOutputStream1.write(buff2);

        FileInputStream fileInputStream3 = new FileInputStream(fileName3);
        byte[] buff3 = new byte[fileInputStream3.available()];
        fileInputStream3.read(buff3);
        fileOutputStream1.write(buff3);

        fileInputStream2.close();
        fileInputStream3.close();
        fileOutputStream1.close();

    }
}
