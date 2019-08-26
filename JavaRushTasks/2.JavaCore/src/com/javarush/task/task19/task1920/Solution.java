package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        //String fileName = "C:\\JavaRush\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task19\\task1920\\test.txt";

        BufferedReader fileBufferedReader = new BufferedReader(new FileReader(fileName));


        String data[];
        String name;
        double value;
        double valueMax = -Double.MAX_VALUE;

        HashMap<String,Double> map = new HashMap<>();

        while (fileBufferedReader.ready()){
            data = fileBufferedReader.readLine().split(" ");
            name = data[0];
            value = Double.parseDouble(data[1]);
            if (map.containsKey(name)) {
                value += map.get(name);
            }
            //System.out.println("name="+name+", value="+value);
            map.put(name,value);

            if (valueMax < value) {
                valueMax = value;
            }
        }

        fileBufferedReader.close();
        //System.out.println("    valueMax="+valueMax);


        ArrayList<String> arraylist = new ArrayList<String>(map.keySet());
        Collections.sort(arraylist);

        for (int i = 0; i< arraylist.size(); i++){
            name = arraylist.get(i);
            value = map.get(name);
            //System.out.println("name="+name+", value="+value);
            if (valueMax == value) {
                //System.out.println("    value="+value);
                System.out.println(name);
            }
        }

    }
}
