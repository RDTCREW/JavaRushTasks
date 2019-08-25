package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;


public class Solution {
    public static void main(String[] args) throws Exception {

        String fileName = args[0];

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int data;
        int count = 0;

        while(fileInputStream.available() > 0){
            data = fileInputStream.read();
            if ((data >= 65 && data <= 90) || (data >= 97 && data <= 122))
                count++;
        }

        fileInputStream.close();

        System.out.println(count);

    }
}
