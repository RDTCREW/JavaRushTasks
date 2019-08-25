package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException {

        //C:\Users\vladimir\Desktop\asterisk.txt

        Scanner scan = new Scanner(System.in);
        String fileName;
        ArrayList<FileInputStream> inputStreams = new ArrayList<>();

        try {
            while (true) {
                fileName = scan.nextLine();
                FileInputStream inputStream = new FileInputStream(fileName);
                inputStreams.add(inputStream);
                if (inputStream.available() < 1000) {
                    break;
                }
            }
        } catch (Exception e) {

        }

        for (FileInputStream inputStream : inputStreams) {
            try {
                inputStream.close();
            } catch (Exception e) {

            }
        }
        throw new DownloadException();

    }

    public static class DownloadException extends Exception {

    }
}
