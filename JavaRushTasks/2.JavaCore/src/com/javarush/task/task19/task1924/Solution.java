package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }

    public static void main(String[] args) throws IOException {
        ///*
        BufferedReader consoleBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleBufferedReader.readLine();
        consoleBufferedReader.close();
        //*/
        //String fileName = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1924\\test.txt";

        String data[];
        String word;
        int iMax;
        String numStr;

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName));
        while (fileBufferedReader.ready()){

            data = fileBufferedReader.readLine().split(" ");
            iMax = data.length;

            for (int i = 0; i < iMax; i++) {

                word = data[i];
                if (i != 0)
                    System.out.print(" ");

                try {
                    numStr = map.get(Integer.parseInt(word));
                    if (numStr != null)
                        System.out.print(numStr);
                    else
                        System.out.print(word);

                } catch (Exception e) {
                    System.out.print(word);
                }
            }

            System.out.println();

        }

        fileBufferedReader.close();
    }
}
