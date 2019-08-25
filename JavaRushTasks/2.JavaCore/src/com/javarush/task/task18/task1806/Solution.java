package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");
        //FileInputStream inputStream = new FileInputStream("C:\\Users\\vladimir\\Desktop\\asterisk.txt");
        //FileOutputStream outputStream = new FileOutputStream("C:\\Users\\vladimir\\Desktop\\result.txt");

        if (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int ind = inputStream.read(buffer);
            outputStream.write(buffer,0,ind);
        }

        inputStream.close();
        outputStream.close();
    }
}
