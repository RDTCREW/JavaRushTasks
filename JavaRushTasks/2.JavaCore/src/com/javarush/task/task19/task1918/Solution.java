package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {

    private static StringBuilder sb = new StringBuilder();
    private static String tag;

    public static void main(String[] args) throws IOException {

        tag = args[0];

        BufferedReader consoleBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleBufferedReader.readLine();
        consoleBufferedReader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader fileBufferedReader = new BufferedReader(fileReader);
        while (fileBufferedReader.ready()){
            sb.append(fileBufferedReader.readLine());
        }
        fileBufferedReader.close();
        fileReader.close();


        viewTags(tagsInList(tag, sb.toString()));

    }


    private static void viewTags(Map<Integer, Boolean> map){
        List<Integer> sortedKeys = new ArrayList(map.keySet());
        Collections.sort(sortedKeys);

        for (int i = 0; i < sortedKeys.size(); i++) {
            int key = sortedKeys.get(i);

            if (map.get(key)){
                int count = 1;
                for (int j = i + 1; j < map.size(); j++) {

                    if (map.get(sortedKeys.get(j))) count++;
                    else count--;

                    if (count == 0){
                        System.out.println(sb.substring(key, sortedKeys.get(j) + tag.length() + 3));
                        break;
                    }
                }
            }

        }

    }

    private static Map<Integer, Boolean> tagsInList(String tag, String text){
        String openTag = "<" + tag;
        String closeTag = "</" + tag + ">";

        Map<Integer, Boolean> map = new HashMap<>();
        int pos = 0;
        while ((pos = text.indexOf(openTag, pos)) > -1){
            map.put(pos, true);
            pos += openTag.length();
        }

        pos = 0;
        while ((pos = text.indexOf(closeTag, pos)) > -1){
            map.put(pos, false);
            pos += closeTag.length();
        }
        return map;
    }


}
