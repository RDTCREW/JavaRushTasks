package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {

    public static Map<String, String> createMap() {

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Ivanov","Ivan");
        map.put("Petrov","Petr");

        map.put("Ivanova","Ivanna");
        map.put("Petrova","Petra");

        map.put("Sidorov","Sidor");
        map.put("Sidorova","Dusia");

        map.put("Kuznetsov","Nik");
        map.put("Kuznetsova","Nikkita");

        map.put("Utemisheva","Irina");
        map.put("Utemishev","Tolia");

        return map;

    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count=0;
        for (String value : map.values()) {
            if (name.equals(value)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count=0;
        for (String key : map.keySet()) {
            if (lastName.equals(key)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println("111");

    }
}
