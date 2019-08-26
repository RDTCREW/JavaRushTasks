package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        //String fileName1 = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1925\\test1.txt";

        String fileName2 = args[1];
        //String fileName2 = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1925\\test2.txt";

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileBufferedWriter = new BufferedWriter(new FileWriter(fileName2));

        String data[];
        String word;
        int iMax;
        String separator = "";
        String separatorComa = ",";

        while (fileBufferedReader.ready()) {
                data = fileBufferedReader.readLine().split(" ");
                iMax = data.length;

                for (int i = 0; i < iMax; i++) {
                    word = data[i];
                    if (word.length() > 6) {
                        fileBufferedWriter.write(separator + word);
                        separator = separatorComa;
                    }
                }
        }

        fileBufferedReader.close();
        fileBufferedWriter.close();

    }
}
