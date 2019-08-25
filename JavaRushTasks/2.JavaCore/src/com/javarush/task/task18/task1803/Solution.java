package com.javarush.task.task18.task1803;

import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.Scanner;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();

        FileInputStream inputStream = new FileInputStream(fileName);

        int count = 256;
        int dataCount [] = new int [ count ];

        int data;

        while(inputStream.available() > 0){
            data = inputStream.read();
            dataCount[data]++;
        }
        inputStream.close();

        data = 0;
        for (int i = 0; i < count; i++){
            if (dataCount[i] > data) {
                data = dataCount[i];
            }
        }

        for (int i = 0; i < count; i++){
            if (dataCount[i] == data) {
                System.out.print(i);

                i++;
                while (i < count){
                    if (dataCount[i] == data) {
                        System.out.print(" ");
                        System.out.print(i);
                    }
                    i++;
                }

                System.out.println("");
                break;
            }
        }


    }
}
