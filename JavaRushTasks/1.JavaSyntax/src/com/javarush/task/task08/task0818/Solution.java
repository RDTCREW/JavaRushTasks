package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {

    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("Ivanov",100);
        map.put("Petrov",200);

        map.put("Ivanova",300);
        map.put("Petrova",400);

        map.put("Sidorov",500);
        map.put("Sidorova",600);

        map.put("Kuznetsov",700);
        map.put("Kuznetsova",800);

        map.put("Utemisheva",900);
        map.put("Utemishev",1000);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        /*
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if ( (int)pair.getValue() < 500 ) {
                map.remove(pair.getKey());
            }
        }
        */

        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if ((int)pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }

    }

    public static void main(String[] args) {

    }
}