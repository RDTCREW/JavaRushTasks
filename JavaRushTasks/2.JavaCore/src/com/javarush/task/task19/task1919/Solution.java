package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName));


        String data[];
        String name;
        Double value;

        HashMap<String,Double> map = new HashMap<>();

        while (fileBufferedReader.ready()){

            data = fileBufferedReader.readLine().split(" ");

            name = data[0];
            value = Double.parseDouble(data[1]);

            if (map.containsKey(name)) {
                value += map.get(name);
            }

            map.put(name,value);
        }

        fileBufferedReader.close();


        ArrayList<String> arraylist = new ArrayList<String>(map.keySet());
        Collections.sort(arraylist);

        for (int i = 0; i< arraylist.size(); i++){
            name = arraylist.get(i);
            System.out.println(name + " " + map.get(name));
        }


    }
}
