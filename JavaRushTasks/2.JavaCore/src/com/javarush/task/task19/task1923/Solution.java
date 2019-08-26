package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        String fileName1 = args[0];
        //String fileName1 = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1923\\test1.txt";

        String fileName2 = args[1];
        //String fileName2 = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1923\\test2.txt";

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileBufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        String data[];
        String word;
        int i;
        int iMax;
        String pattern = "(.*)[0-9](.*)";

        while (fileBufferedReader.ready()){

            data = fileBufferedReader.readLine().split(" ");
            iMax = data.length;

            for (i = 0; i < iMax; i++) {
                word = data[i];
                if (word.matches(pattern)) {
                    //System.out.print(word+" ");
                    fileBufferedWriter.write(word+" ");
                }
            }


        }

        fileBufferedReader.close();
        fileBufferedWriter.close();
    }
}
