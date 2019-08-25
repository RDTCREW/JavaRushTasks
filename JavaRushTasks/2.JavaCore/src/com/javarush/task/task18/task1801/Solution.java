package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        int maxByte = 0;

        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            if (data > maxByte)
                maxByte = data;
        }

        inputStream.close(); // закрываем поток



        System.out.println(maxByte);

    }
}
