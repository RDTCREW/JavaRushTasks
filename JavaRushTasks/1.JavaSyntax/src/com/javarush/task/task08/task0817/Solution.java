package com.javarush.task.task08.task0817;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<String, String>();

        map.put("Ivanov","Ivan");
        map.put("Petrov","Petr");

        map.put("Ivanova","Ivanna");
        map.put("Petrova","Petra");

        map.put("Sidorov","Sidor");
        map.put("Sidorova","Dusia");

        map.put("Kuznetsov","Nik");
        map.put("Kuznetsova","Nik");

        map.put("Utemisheva","Irina");
        map.put("Utemishev","Tolia");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {



        Map<String, Integer> newMap = new HashMap<>();
        for (String value : map.values()) {
            if (newMap.containsKey(value)) {
                newMap.put(value,newMap.get(value)+1);
            } else {
                newMap.put(value,1);
            }
        }

        for (Map.Entry<String, Integer> pairNewMap : newMap.entrySet()) {
            if ( pairNewMap.getValue() > 1 ) {

                removeItemFromMapByValue( map, pairNewMap.getKey());

            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
