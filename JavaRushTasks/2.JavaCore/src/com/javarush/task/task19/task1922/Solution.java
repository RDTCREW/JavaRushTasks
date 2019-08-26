package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {


        BufferedReader consoleBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleBufferedReader.readLine();
        consoleBufferedReader.close();

        //String fileName = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1922\\test.txt";


        String line;
        String data[];
        String word;
        int iMax;
        int count;

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName));
        while (fileBufferedReader.ready()){

            line = fileBufferedReader.readLine();
            data = line.split(" ");
            iMax = data.length;
            count = 0;
            for (int i = 0; i < iMax; i++) {
                word = data[i];
                if (words.contains(word)) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(line);
            }

        }

        fileBufferedReader.close();


    }
}
