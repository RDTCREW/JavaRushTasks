package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {


        BufferedReader consoleBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleBufferedReader.readLine();
        consoleBufferedReader.close();


        //String fileName = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1926\\test.txt";

        String line;

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName));
        while (fileBufferedReader.ready()){
            line = fileBufferedReader.readLine();
            line = new StringBuilder(line).reverse().toString();
            System.out.println(line);
        }

        fileBufferedReader.close();


    }
}
