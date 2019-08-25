package com.javarush.task.task08.task0816;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {

    public static Map<String, Date> createMap() throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);

        Map<String, Date> map = new HashMap<String, Date>();

        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));

        map.put("Сталлоне1", dateFormat.parse("MAY 2 2012"));
        map.put("Сталлоне2", dateFormat.parse("MAY 3 2012"));
        map.put("Сталлоне3", dateFormat.parse("MAY 4 2012"));
        map.put("Сталлоне4", dateFormat.parse("MAY 5 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 6 2012"));
        map.put("Сталлоне6", dateFormat.parse("MAY 7 2012"));
        map.put("Сталлоне7", dateFormat.parse("MAY 8 2012"));
        map.put("Сталлоне8", dateFormat.parse("MAY 9 2012"));
        map.put("Сталлоне9", dateFormat.parse("MAY 10 2012"));

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        /*
        int month;
        String name;
        Date born;
        for(Map.Entry<String, Date> entry: map.entrySet()) {
            born = entry.getValue();
            month = born.getMonth();
            if (month>=6 && month<=9) {
                name = entry.getKey();
                map.remove(name);
            }
        }
        */

        map.values().removeIf(item -> (item.getMonth() == 5 | item.getMonth() == 6 | item.getMonth() == 7));

    }

    public static void main(String[] args) {

        /*
        Map<String, Date> map;
        try {
            map = createMap();
            removeAllSummerPeople(map);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        */

    }
}
