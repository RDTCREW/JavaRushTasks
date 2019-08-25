package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int data;
        int count = 0;
        int count32 = 0;

        while(fileInputStream.available() > 0){
            data = fileInputStream.read();
            count++;
            if (data == 32)
                count32++;
        }

        fileInputStream.close();

        double result = new BigDecimal((double)count32 / (double)count * 100).setScale(2, RoundingMode.UP).doubleValue();

        System.out.println(result);

    }
}
